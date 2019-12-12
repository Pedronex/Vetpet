package ads.pucgo.vetpetapp.activitys;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import ads.pucgo.vetpetapp.R;
import ads.pucgo.vetpetapp.entidade.Pet;

public class PetAdapter extends ArrayAdapter {
    Context context;
    private List<Pet> pets;
    public PetAdapter(@NonNull Context context, int resource, @NonNull List<Pet> pets) {
        super(context, resource);
        this.context = context;
        this.pets = pets;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        @SuppressLint("ViewHolder") View componente = inflater.inflate(R.layout.listar_consultas,parent,false);
        return componente;

    }
}
