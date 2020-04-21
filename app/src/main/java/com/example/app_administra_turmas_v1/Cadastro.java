package com.example.app_administra_turmas_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.app_administra_turmas_v1.entities.Usuario;

import static com.example.app_administra_turmas_v1.dao.UsuarioDAO.inserir;

public class Cadastro extends AppCompatActivity {
    private EditText etNome, etSenha, etSenha2;
    private Button btnCadatrar;
    private String acao;
    private Usuario usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        etNome = findViewById(R.id.etNome);
        etSenha = findViewById(R.id.etSenha);
        etSenha2 = findViewById(R.id.etSenha2);
        btnCadatrar = findViewById(R.id.btnCadastrar);


        btnCadatrar.setOnClickListener((v)-> salvarTurma());
    }

    private void salvarTurma(){
        String nome = etNome.getText().toString();
        String senha = etSenha.getText().toString();
        String senha2 = etSenha2.getText().toString();

        if(nome.isEmpty()){
            Toast.makeText(this, "Você deve informar o nome!",Toast.LENGTH_LONG).show();
        }else if(senha.isEmpty()){
            Toast.makeText(this, "Você deve informar uma senha!",Toast.LENGTH_LONG).show();
        }else if(senha2.isEmpty()){
            Toast.makeText(this, "Você deve informar a senha novamente!",Toast.LENGTH_LONG).show();
        }else if (!senha.equals(senha2)){
            Toast.makeText(this, "Senhas não são a mesma!",Toast.LENGTH_LONG).show();
        }else{
            inserir(this, new Usuario(nome, senha));
        }
    }
}
