package com.example.app_administra_turmas_v1.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.app_administra_turmas_v1.database.Banco;
import com.example.app_administra_turmas_v1.entities.Turma;

import java.util.ArrayList;
import java.util.List;

import static com.example.app_administra_turmas_v1.queries.DbQueries.SELECT_TURMA;

public class TurmaDAO {
    public static void inserir(Context cont, Turma turma){

        Banco banco = new Banco(cont);

        ContentValues contentValues = new ContentValues();

        contentValues.put("turma", turma.getTurma());
        contentValues.put("professor", turma.getProfessor());
        contentValues.put("sala", turma.getSala());

        SQLiteDatabase db = banco.getWritableDatabase();

        db.insert("TURMA", null, contentValues);
    }

    public static List<Turma> listarTurmas(Context cont) {
        List<Turma> turmas = new ArrayList<>();

        Banco banco = new Banco(cont);
        SQLiteDatabase db = banco.getReadableDatabase();
        try {
            Cursor cursor = db.rawQuery(SELECT_TURMA, null);
            if (cursor.getCount() > 0) {
                cursor.moveToFirst();
                do {
                    turmas.add(new Turma(
                            cursor.getInt(0),
                            cursor.getString(1),
                            cursor.getString(2),
                            cursor.getString(3)
                    ));
                } while (cursor.moveToNext());
            }
        } catch (Error e) {
            System.out.println("Erro ao buscar turmas: " + e.getMessage());
        }
        return turmas;
    }
}
