package com.example.actividad1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView miTexto;
    TextView Grupo;

    TextView miGrupo;
    Button miButton;

    String[][] nombres = {
            {"Cristian", "Pedro", "Pablo", "Mauricio"}, // 2291
            {"Kenia", "Paulina", "Giselle", "Alicia", "Claudia"} // 2292
    };

    String[] grupos = {"2291", "2292"};

    int indice = 0;
    int indiceGrupo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miButton = findViewById(R.id.btnMiBoton);
        miTexto = findViewById(R.id.txvMiTexto);
        miGrupo = findViewById(R.id.txvGrupo);

        miButton.setOnClickListener(this);

        miGrupo.setText(grupos[indiceGrupo]); // quitamos Grupo, solo usamos miGrupo
        miTexto.setText(nombres[indiceGrupo][indice]);
    }

    private void renderizaAlumnos() {
        indice += 1;
        if (indice >= nombres[indiceGrupo].length) {
            indice = 0;
            indiceGrupo ++;
            renderizaGrupo();
        }
        miTexto.setText(nombres[indiceGrupo][indice]);
    }

    private void renderizaGrupo() {
        if (indiceGrupo >= grupos.length) { // pregunta ANTES de acceder
            indiceGrupo = 0;
        }
        miGrupo.setText(grupos[indiceGrupo]);

    }

    @Override
    public void onClick(View v) {
        renderizaAlumnos();

    }


}