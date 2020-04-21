package com.example.app_administra_turmas_v1.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.app_administra_turmas_v1.database.Banco;
import com.example.app_administra_turmas_v1.entities.Turma;

public class TurmaDAO {
    public static void cadastrarTurma(Context cont, Turma turma){
        Banco banco = new Banco(cont);

        ContentValues contentValues = new ContentValues();

        contentValues.put("turma", turma.getTurma());
        contentValues.put("professor", turma.getProfessor());
        contentValues.put("sala", turma.getSala());

        SQLiteDatabase db = banco.getWritableDatabase();

        db.insert("TURMA",null,contentValues);

    }
}
