package com.example.app_administra_turmas_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.app_administra_turmas_v1.activity.TurmasActivity;

public class Menu extends AppCompatActivity {
    private Button btnTurmas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnTurmas = findViewById(R.id.btnTurmas);

        btnTurmas.setOnClickListener(v -> {
            Intent intent = new Intent(this, TurmasActivity.class);
            startActivity(intent);
        });

    }
}
