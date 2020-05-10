package com.example.app_administra_turmas_v1.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.app_administra_turmas_v1.database.Banco;
import com.example.app_administra_turmas_v1.entities.Usuario;

import java.util.ArrayList;
import java.util.List;

import static com.example.app_administra_turmas_v1.queries.DbQueries.SELECT_NOME_SENHA;
import static com.example.app_administra_turmas_v1.queries.DbQueries.SELECT_TURMA;
import static com.example.app_administra_turmas_v1.queries.DbQueries.SELECT_USUARIO;

public class UsuarioDAO {

    public static void inserir(Context cont, Usuario usuario){

        Banco banco = new Banco(cont);

        ContentValues contentValues = new ContentValues();

        contentValues.put("nome", usuario.getUsername());
        contentValues.put("password", usuario.getPassword());

        SQLiteDatabase db = banco.getWritableDatabase();

        db.insert("USUARIO", null, contentValues);
    }

    public static List<Usuario> listar(Context cont) {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario;
        Banco banco = new Banco(cont);
        SQLiteDatabase db = banco.getReadableDatabase();

        Cursor cursor = db.rawQuery(SELECT_USUARIO, null);

        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            do {
                usuario = new Usuario(
                        cursor.getString(1),
                        cursor.getString(2));
                usuario.setId(cursor.getInt(0));

                usuarios.add(usuario);
            } while (cursor.moveToNext());
        }
        return usuarios;
    }

    public static Usuario buscaPorNomeESenha(Context cont, String nome, String senha){
        Usuario usuario = null;
        Banco banco = new Banco(cont);
        SQLiteDatabase db = banco.getReadableDatabase();
        try{
            Cursor cursor = db.rawQuery(SELECT_NOME_SENHA.replace("<NOME>", nome)
                    .replace("<PASSWORD>", senha), null);

            if (cursor.getCount() > 0) {
                cursor.moveToFirst();
                do {
                    System.out.println(cursor.getString(1));
                    usuario = new Usuario(
                            cursor.getString(1),
                            cursor.getString(2)
                    );
                    usuario.setId(cursor.getInt(0));

                } while (cursor.moveToNext());

            }
        }catch (Error e){
            System.out.println("Erro ao validar usuário: "+ e.getMessage());
        }

        return usuario;

    }
}
