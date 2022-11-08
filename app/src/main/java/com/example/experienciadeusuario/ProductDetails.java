package com.example.experienciadeusuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ProductDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        ImageView add_carrito = findViewById(R.id.agregar_al_carro);
        add_carrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProductDetails.this.startActivity(new Intent(ProductDetails.this, Carrito.class));
            }
        });
    }
}