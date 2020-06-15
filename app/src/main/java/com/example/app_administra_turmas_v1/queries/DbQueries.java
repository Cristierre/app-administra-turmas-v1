package com.example.app_administra_turmas_v1.queries;

public class DbQueries {

    public static String CREATE_USUARIO = "CREATE TABLE IF NOT EXISTS usuario (" +
                                        "id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                                        "nome VARCHAR(15)," +
                                        "password VARCHAR(15))";

    public static String CREATE_TURMA =  "CREATE TABLE IF NOT EXISTS turma (" +
                                        "id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                                        "turma VARCHAR(15)," +
                                        "sala VARCHAR(15)," +
                                        "professor VARCHAR(15))";

    public static String SELECT_TURMA = "SELECT * FROM TURMA";

    public static String SELECT_USUARIO = "SELECT * FROM USUARIO";

    public static String SELECT_NOME_SENHA = "SELECT * FROM USUARIO " +
                                             "WHERE NOME = '<NOME>'" +
                                             "AND PASSWORD = '<PASSWORD>'";
}
