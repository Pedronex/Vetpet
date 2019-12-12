package ads.pucgo.vetpetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ads.pucgo.vetpetapp.entidade.Pet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Pet pet = new Pet();
        Gson conversor = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
        conversor.toJson(pet);
    }
}
