package com.example.actividad7;

import android.view.View;
import android.widget.ImageView; // <-- No olvides importar esta clase
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class MiViewHolder extends RecyclerView.ViewHolder {
    private final TextView textView;
    private final ImageView imageView; // <-- 1. Declaras la variable para la imagen

    public MiViewHolder(View view) {
        super(view);

        // 2. Aquí haces el puente entre el XML y Java usando los IDs
        textView = (TextView) view.findViewById(R.id.textView);
        imageView = (ImageView) view.findViewById(R.id.imageView); // <-- Atrapas la imagen
    }

    public TextView getTextView() {
        return textView;
    }

    // 3. Agregas este método por si luego necesitas cambiar la imagen desde el Adaptador
    public ImageView getImageView() {
        return imageView;
    }
}