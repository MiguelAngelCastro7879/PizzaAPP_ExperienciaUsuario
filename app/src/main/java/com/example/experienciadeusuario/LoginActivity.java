package com.example.experienciadeusuario;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText edit_user = findViewById(R.id.edit_user);
        EditText edit_pass = findViewById(R.id.edit_pass);
        findViewById(R.id.txt_registro).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, Register.class));
            }
        });
        findViewById(R.id.redes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(LoginActivity.this)
                        .setTitle("Pizza APP")
                        .setMessage("Este modulo no está disponible en estos momentos")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        }).show().create();
            }
        });

        findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit_pass.getText().toString().matches("") || edit_user.getText().toString().matches("")){
                    new AlertDialog.Builder(LoginActivity.this)
                            .setTitle("Pizza APP")
                            .setMessage("Favor de llenar todos los campos")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            }).show().create();
                }
                else{
                    startActivity(new Intent(LoginActivity.this, MainMenu.class));
                }
            }
        });
    }
}