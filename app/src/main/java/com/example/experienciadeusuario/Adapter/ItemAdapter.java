package com.example.experienciadeusuario.Adapter;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.experienciadeusuario.LoginActivity;
import com.example.experienciadeusuario.MainMenu;
import com.example.experienciadeusuario.Model.Item;
import com.example.experienciadeusuario.ProductDetails;
import com.example.experienciadeusuario.R;

import java.util.List;
import java.util.Objects;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    private final List<Item> lista;

    public ItemAdapter(List<Item> lista) {
        this.lista = lista;
    }

    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from((parent.getContext())).inflate(R.layout.item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position) {
        Item image = lista.get(position);
        holder.llenar(image);
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView favorito;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            favorito = itemView.findViewById(R.id.btn_fav);
            favorito.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    favorito.setImageResource(R.drawable.fav_relleno);
                }
            });
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemView.getContext().startActivity(new Intent(itemView.getContext(), ProductDetails.class));
                }
            });
        }
        public void llenar(Item image) {
        }

    }
}
