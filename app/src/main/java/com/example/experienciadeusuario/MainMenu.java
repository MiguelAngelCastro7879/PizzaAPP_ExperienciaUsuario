package com.example.experienciadeusuario;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.experienciadeusuario.Adapter.ItemAdapter;
import com.example.experienciadeusuario.Model.Item;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends AppCompatActivity {

    RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        recycler = findViewById(R.id.rv_pizzas);
        List<Item> imagenes = new ArrayList<>();
        ItemAdapter ia = new ItemAdapter(imagenes);
        imagenes.add(new Item("1",String.valueOf(R.drawable.item)));
        imagenes.add(new Item("2",String.valueOf(R.drawable.item)));
        imagenes.add(new Item("3",String.valueOf(R.drawable.item)));
        imagenes.add(new Item("4",String.valueOf(R.drawable.item)));
        imagenes.add(new Item("5",String.valueOf(R.drawable.item)));
        imagenes.add(new Item("6",String.valueOf(R.drawable.item)));
        imagenes.add(new Item("7",String.valueOf(R.drawable.item)));
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new GridLayoutManager(this, 2));
        recycler.setAdapter(ia);
    }
}