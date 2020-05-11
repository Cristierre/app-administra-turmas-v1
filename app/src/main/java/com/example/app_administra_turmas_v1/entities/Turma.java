package com.example.app_administra_turmas_v1.entities;

public class Turma {
    private int id;
    private String turma;
    private String professor;
    private String sala;
    private String onOf;

    public Turma( String turma, String professor, String sala) {
        this.turma = turma;
        this.professor = professor;
        this.sala = sala;
        this.onOf = "ON";
    }
    public Turma( int id, String turma, String professor, String sala) {
        this.id = id;
        this.turma = turma;
        this.professor = professor;
        this.sala = sala;
        this.onOf = "ON";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getOnOf() {
        return onOf;
    }

    public void setOnOf(String onOf) {
        this.onOf = onOf;
    }
}
