package com.example.app_administra_turmas_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;

import com.example.app_administra_turmas_v1.adapter.AdapterTurma;
import com.example.app_administra_turmas_v1.dao.TurmaDAO;
import com.example.app_administra_turmas_v1.entities.Turma;

import java.util.List;

import static com.example.app_administra_turmas_v1.dao.TurmaDAO.inserir;
import static com.example.app_administra_turmas_v1.dao.TurmaDAO.listar;

public class Turmas extends AppCompatActivity {

    private ListView lvLista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turmas);

        lvLista = findViewById(R.id.lvListaTurmas);

        carregarTurmas();

    }
    private void carregarTurmas () {
        List<Turma> listaTurmas = TurmaDAO.listar(this);
        AdapterTurma adapter = new AdapterTurma(this, R.layout.support_simple_spinner_dropdown_item, listaTurmas);
        lvLista.setAdapter(adapter);

    }

}
