package com.example.app_administra_turmas_v1.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.app_administra_turmas_v1.queries.DbQueries.CREATE_TURMA;
import static com.example.app_administra_turmas_v1.queries.DbQueries.CREATE_USUARIO;


public class Banco extends SQLiteOpenHelper {
    final static String NAME_PROJECT = "AppAdmistraTurmas";
    final static int VERSION = 1;

    public Banco(Context context){
        super(context, NAME_PROJECT,null, VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_USUARIO);
        db.execSQL(CREATE_TURMA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
