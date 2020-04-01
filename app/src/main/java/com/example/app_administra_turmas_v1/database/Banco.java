package com.example.app_administra_turmas_v1.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class Banco extends SQLiteOpenHelper {
    final static String NAME_PROJECT = "AppAdmistraTurmas";
    final static int VERSION = 1;

    public Banco(Context context){
        super(context, NAME_PROJECT,null, VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS USUARIO (" +
                "id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                "nome VARCHAR(15)," +
                "password VARCHAR(15))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
