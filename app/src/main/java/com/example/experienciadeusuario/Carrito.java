package com.example.experienciadeusuario;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Carrito extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);
        ImageView moreItems = findViewById(R.id.more);
        ImageView lessItems = findViewById(R.id.less);
        TextView quantity = findViewById(R.id.quantity);
        moreItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cantidad;
                cantidad = Integer.parseInt(String.valueOf(quantity.getText()));
                quantity.setText(String.valueOf(cantidad + 1));
            }
        });
        lessItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cantidad;
                cantidad = Integer.parseInt(String.valueOf(quantity.getText()));
                if (cantidad > 0){
                    quantity.setText(String.valueOf(cantidad - 1));
                    return;
                }
                new AlertDialog.Builder(v.getContext())
                        .setTitle("Pizza APP")
                        .setMessage("Favor de ingresar cantidades validas")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        }).show().create();
            }
        });


    }
}