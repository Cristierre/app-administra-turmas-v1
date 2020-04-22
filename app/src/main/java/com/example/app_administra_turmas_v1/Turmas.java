package com.example.app_administra_turmas_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class Turmas extends AppCompatActivity {

    private EditText etDisciplina1, etDisciplina2, etDisciplina3, etTurno1, etTurno2, etTurno3;
    private Switch sSwitch1, sSwitch2, sSwitch3;
    private Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turmas);

        etDisciplina1 = findViewById(R.id.etDisciplina1);
        etDisciplina2 = findViewById(R.id.etDisciplina2);
        etDisciplina3 = findViewById(R.id.etDisciplina3);

        etTurno1 = findViewById(R.id.etTurno1);
        etTurno2 = findViewById(R.id.etTurno2);
        etTurno3 = findViewById(R.id.etTurno3);

        sSwitch1 = findViewById(R.id.sSwitch1);
        sSwitch2 = findViewById(R.id.sSwitch2);
        sSwitch3 = findViewById(R.id.sSwitch3);

        btnSalvar = findViewById(R.id.btnSalvar);


    }
}
