package com.ecomida.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ecomida.R;
import com.ecomida.model.CategoriaCardModel;

import java.util.ArrayList;

public class ListaCategoriaAdapter extends RecyclerView.Adapter<ListaCategoriaAdapter.ListaCategoriaViewHolder> {

    private Context context;
    private ArrayList<CategoriaCardModel> categorias;

    public ListaCategoriaAdapter(Context context, ArrayList<CategoriaCardModel> categorias) {
        this.context = context;
        this.categorias = categorias;
    }

    @NonNull
    @Override
    public ListaCategoriaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ListaCategoriaViewHolder
                (LayoutInflater.from(context)
                        .inflate(R.layout.categoria_cardview, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull ListaCategoriaViewHolder holder, int position) {
        holder.itemNome.setText(categorias.get(position).getTitulo());
        holder.itemImage.setImageResource(categorias.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return categorias.size();
    }

    public class ListaCategoriaViewHolder extends RecyclerView.ViewHolder {

        private ImageView itemImage;
        private TextView itemNome;

        public ListaCategoriaViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.item_categoria_imagem);
            itemNome = itemView.findViewById(R.id.item_categoria_nome);
        }
    }
}
