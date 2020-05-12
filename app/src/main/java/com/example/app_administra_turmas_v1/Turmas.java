package com.example.app_administra_turmas_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.app_administra_turmas_v1.adapter.AdapterTurma;
import com.example.app_administra_turmas_v1.dao.TurmaDAO;
import com.example.app_administra_turmas_v1.entities.Turma;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class Turmas extends AppCompatActivity {

    private ListView lvLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turmas);

        lvLista = findViewById(R.id.lvListaTurmas);

        carregarTurmas();

        FloatingActionButton fab = findViewById(R.id.btnAddTurma);

        fab.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Turmas.this,CadastroTurmas.class);
                startActivity(intent);
                carregarTurmas();
            }
        }));
    }
    private void carregarTurmas () {

        List<Turma> listaTurmas = TurmaDAO.listar(this);

            AdapterTurma adapter = new AdapterTurma(this, listaTurmas);
            lvLista.setAdapter(adapter);


    }

}
