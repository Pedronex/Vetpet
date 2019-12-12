package ads.pucgo.vetpetapp.activitys;

import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import ads.pucgo.vetpetapp.R;

public class CriarConsulta extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.criar_consulta);

        Button btnCancelar = findViewById(R.id.btnCancelar);
        btnCancelar.setOnClickListener(v -> finish());

        Button btnGravar = findViewById(R.id.btnGravar);
        btnGravar.setOnClickListener(v -> {
            // Função gravar
        });
    }
}
