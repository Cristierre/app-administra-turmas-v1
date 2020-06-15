package com.example.app_administra_turmas_v1.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.app_administra_turmas_v1.CadastroTurmas;
import com.example.app_administra_turmas_v1.R;
import com.example.app_administra_turmas_v1.dao.TurmaDAO;
import com.example.app_administra_turmas_v1.entities.Turma;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class TurmasActivity extends AppCompatActivity {

    private ListView lvLista;
    private ArrayAdapter<Turma> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turmas);

        lvLista = findViewById(R.id.lvListaTurmas);

        FloatingActionButton fab = findViewById(R.id.btnAddTurma);

        fab.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TurmasActivity.this, CadastroTurmas.class);
                startActivity(intent);
                carregarTurmas();
            }
        }));
    }

    @Override
    protected void onResume() {
        super.onResume();
        carregarTurmas();
    }

    private void carregarTurmas () {

        List<Turma> listaTurmas = TurmaDAO.listarTurmas(this);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println(listaTurmas);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        adapter = new ArrayAdapter<>(TurmasActivity.this, android.R.layout.simple_list_item_1, listaTurmas);
            lvLista.setAdapter(adapter);


    }

}
