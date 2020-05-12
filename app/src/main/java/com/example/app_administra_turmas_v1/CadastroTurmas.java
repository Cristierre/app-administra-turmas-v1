package com.example.app_administra_turmas_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.app_administra_turmas_v1.entities.Turma;

import static com.example.app_administra_turmas_v1.dao.TurmaDAO.inserir;


public class CadastroTurmas extends AppCompatActivity {

    private EditText etNomeTurma, etProfessor, etSala;
    private Button btnCadastraTurmas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_turmas);

        etNomeTurma = findViewById(R.id.etNomeTurma);
        etProfessor = findViewById(R.id.etProfessor);
        etSala = findViewById(R.id.etSala);

        btnCadastraTurmas = findViewById(R.id.btnCadastrarTurma);

        btnCadastraTurmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvarTurma();
            }
        });


    }

    public void salvarTurma(){
        String turma = etNomeTurma.getText().toString();
        String professor = etProfessor.getText().toString();
        String sala = etSala.getText().toString();

        if(turma.isEmpty()){
            Toast.makeText(this, "Você deve informar a turma!",Toast.LENGTH_LONG).show();
        }else if(professor.isEmpty()){
            Toast.makeText(this, "Você deve informar o professor!",Toast.LENGTH_LONG).show();
        }else if(sala.isEmpty()){
            Toast.makeText(this, "Você deve informar a sala!",Toast.LENGTH_LONG).show();
        }else{
            inserir(this, new Turma(turma,professor,sala));
            Toast.makeText(this, "Turma salva com sucesso!",Toast.LENGTH_LONG).show();
            etNomeTurma.clearComposingText();
            etProfessor.clearComposingText();
            etSala.clearComposingText();
            finish();
        }
    }
}
