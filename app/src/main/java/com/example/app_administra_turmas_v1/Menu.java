package com.example.app_administra_turmas_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import com.example.app_administra_turmas_v1.adapter.AdapterTurma;
import com.example.app_administra_turmas_v1.dao.TurmaDAO;
import com.example.app_administra_turmas_v1.entities.Turma;

import java.util.List;

public class Menu extends AppCompatActivity {
    private Button btnTurmas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnTurmas = findViewById(R.id.btnTurmas);

        btnTurmas.setOnClickListener(v -> {
            Intent intent = new Intent(this, Turmas.class);
            startActivity(intent);
        });

    }
}
