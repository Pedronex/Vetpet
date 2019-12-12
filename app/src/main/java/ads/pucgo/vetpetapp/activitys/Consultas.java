package ads.pucgo.vetpetapp.activitys;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import ads.pucgo.vetpetapp.R;
import ads.pucgo.vetpetapp.entidade.Pet;

public class Consultas  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listar_consultas);

        ListView listaConsultas = findViewById(R.id.lista);
        List<Pet> pets = new ArrayList<>();
        listaConsultas.setAdapter(new PetAdapter(getApplicationContext(),R.id.lista,pets));
    }
}
