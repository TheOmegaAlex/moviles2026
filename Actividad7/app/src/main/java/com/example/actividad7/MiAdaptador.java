package com.example.actividad7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

// <-- IMPORTA GLIDE
import com.bumptech.glide.Glide;

public class MiAdaptador extends RecyclerView.Adapter<MiViewHolder> {

    private ArrayList<Personaje> localDataSet;

    public MiAdaptador(ArrayList<Personaje> dataSet) {
        localDataSet = dataSet;
    }

    @Override
    public MiViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.text_row_item, viewGroup, false);
        return new MiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MiViewHolder viewHolder, int position) {
        Personaje p = localDataSet.get(position);

        // 1. Pones el texto (esto ya lo tenías)
        viewHolder.getTextView().setText(p.getName());

        // 2. Aquí "jalas" la imagen del server usando Glide
        String urlImagen = p.getPhoto();

        Glide.with(viewHolder.itemView.getContext())
                .load(urlImagen)
                .into(viewHolder.getImageView());
    }

    @Override
    public int getItemCount() {
        return localDataSet.size();
    }

    public void addElemento(Personaje newElement) {
        localDataSet.add(newElement);
        notifyItemInserted(localDataSet.size() - 1);
    }
}