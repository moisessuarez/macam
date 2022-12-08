package com.example.intenciones;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MascotasAdapter extends RecyclerView.Adapter<MascotasAdapter.ViewHolder> {
    private List<Mascotas> mascotasList;
    public MascotasAdapter(List<Mascotas> mascotasList) {
        this.mascotasList = mascotasList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_mascotas, parent, false);
        return new ViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtNombreMascotaCard.setText(mascotasList.get(position).getNombre());
        holder.txtEdadMascotaCard.setText(mascotasList.get(position).getEdad());
        holder.txtRazaMascotaCard.setText(mascotasList.get(position).getRaza());
        holder.imMascotaCard.setImageResource(mascotasList.get(position).getIdImagen());
        holder.position=holder.getAdapterPosition();
    }
    @Override
    public int getItemCount() {
        return mascotasList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imMascotaCard;
        private TextView txtNombreMascotaCard, txtRazaMascotaCard, txtEdadMascotaCard;
        private int position;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imMascotaCard = itemView.findViewById(R.id.imageButton2);
            txtNombreMascotaCard = itemView.findViewById(R.id.txtNombreMascotaCard);
            txtRazaMascotaCard = itemView.findViewById(R.id.txtRazaMascotaCard);
            txtEdadMascotaCard = itemView.findViewById(R.id.txtEdadMascotaCard);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), InfoMascotaActivity.class);
                    intent.putExtra("nombre", mascotasList.get(position).getNombre());
                    intent.putExtra("edad", mascotasList.get(position).getEdad());
                    intent.putExtra("numero", mascotasList.get(position).getNumero());
                    intent.putExtra("raza", mascotasList.get(position).getRaza());
                    intent.putExtra("idImagen", mascotasList.get(position).getIdImagen());
                    view.getContext().startActivity(intent);
                }
            });
        }
    }
}