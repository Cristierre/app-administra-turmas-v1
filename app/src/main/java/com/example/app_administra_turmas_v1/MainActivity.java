package com.example.app_administra_turmas_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.app_administra_turmas_v1.entities.Usuario;

import static com.example.app_administra_turmas_v1.dao.UsuarioDAO.buscaPorNomeESenha;

public class MainActivity extends AppCompatActivity {
    private EditText etNome, etSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNome = findViewById(R.id.etUsuario);
        etSenha = findViewById(R.id.etProfessor);


        Button btnCadastrar = findViewById(R.id.btnCadastrarTurma);
        Button btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> {
            boolean valido = validar();
            if(valido){
               Intent intent = new Intent(this, Menu.class);

                startActivity(intent);
           }else{
               Toast.makeText(this, "Usuário e ou senha inválido!",Toast.LENGTH_LONG).show();

               etNome.getText().clear();
               etSenha.getText().clear();
           }
        });

        btnCadastrar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Cadastro.class);
            startActivity(intent);
        });
    }

    public boolean validar() {
        String nome = etNome.getText().toString();
        String senha = etSenha.getText().toString();

        Usuario usuario = buscaPorNomeESenha(this, nome, senha);
        if (usuario == null){

        }else if(usuario.getUsername().contains(nome) && usuario.getPassword().contains(senha)){
            return true;
        }
        return false;
    }
}
