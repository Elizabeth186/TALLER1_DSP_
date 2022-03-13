package com.example.desafio1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class FeedReaderDbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "record_db";

    public FeedReaderDbHelper(Context context) {
        super(context, "record_db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table users(txtUsers TEXT PRIMARY KEY, txtPasword TEXT )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP Table if exists users");
    }

    public Boolean insertdb(String txtUsers, String txtPasword) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("txtUsers", txtUsers);
        contentValues.put("txtPasword", txtPasword);
        long end = db.insert("users", null, contentValues);
        if (end == -1) return false;
        else
            return true;
    }

    /*Comprobando existencia de usuario*/
    public Boolean usersexist(String txtUsers) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM users WHERE txtUsers = ?", new String[]{txtUsers});
        if (cursor.getCount() > 0)
            return true;
        else
            return false;
    }

    public Boolean userspaswordexist(String txtUsers, String txtPasword) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM users WHERE txtUsers  = ? AND txtPasword = ?", new String[]{txtUsers, txtPasword});
        if (cursor.getCount() > 0)
            return true;
        else
            return false;
    }
}
