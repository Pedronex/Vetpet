package ads.pucgo.vetpetapp.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ads.pucgo.vetpetapp.R;
import ads.pucgo.vetpetapp.entidade.Pet;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        ImageButton btnNovaConsulta = findViewById(R.id.btnInserir);
        ImageButton btnConsultas = findViewById(R.id.btnListar);
        ImageButton btnModificarConsultas = findViewById(R.id.btnAlterar);
        ImageButton btnSair = findViewById(R.id.btnSair);

        btnNovaConsulta.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(), CriarConsulta.class);
            startActivity(i);
        });
        btnConsultas.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(),Consultas.class);
            startActivity(i);
        });
        btnModificarConsultas.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(),ModificarConsultas.class);
            startActivity(i);
        });
        btnSair.setOnClickListener(v -> finish());
    }
}
