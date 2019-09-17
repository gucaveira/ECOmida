package com.ecomida.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ecomida.R;
import com.ecomida.model.CategoriaCardModel;
import com.ecomida.ui.adapter.ListaCategoriaAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNagation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNagation =  findViewById(R.id.navigationView);

        ArrayList<CategoriaCardModel> categorias = new ArrayList<>();
        ListaCategoriaAdapter adapter = new ListaCategoriaAdapter(this, categorias);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager( new LinearLayoutManager(
                this, LinearLayoutManager.HORIZONTAL, false));

        recyclerView.setAdapter(adapter);

        for (int i = 0; i <10; i++){
            categorias.add( new CategoriaCardModel(R.drawable.fruta, "TEst" + i));
            adapter.notifyDataSetChanged();
        }
    }
}
