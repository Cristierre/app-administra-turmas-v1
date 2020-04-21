package com.example.app_administra_turmas_v1.queries;

public class DbQueries {

    public static String CREATE_USUARIO = "CREATE TABLE IF NOT EXISTS USUARIO (" +
                                        "id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                                        "nome VARCHAR(15)," +
                                        "password VARCHAR(15))";
    public static String CREATE_TURMA = "CREATE TABLE IF NOT EXISTS USUARIO (" +
                                        "id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                                        "turma VARCHAR(15)," +
                                        "sala VARCHAR(15)," +
                                        "professor VARCHAR(15)," +
                                        "sala VARCHAR(10))";
}
