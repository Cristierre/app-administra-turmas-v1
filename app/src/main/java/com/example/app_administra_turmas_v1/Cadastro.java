package com.example.app_administra_turmas_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.app_administra_turmas_v1.entities.Usuario;

public class Cadastro extends AppCompatActivity {
    private EditText etNome, etSenha, etSenha2;
    private Button btnCadatrar;
    private String acao;
    private Usuario usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);


    }

    private void salvarTurma(){

    }
}
