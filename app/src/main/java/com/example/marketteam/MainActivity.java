package com.example.marketteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_registro;
    Button btn_lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_registro= (Button) findViewById(R.id.btn1);
        btn_lista = (Button) findViewById(R.id.btn2);

        ConexionSqLite con =new ConexionSqLite(this,"sqlite",null,1);


        btn_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MainActivity.this,MainActivity2.class);
                MainActivity.this.startActivity(intent);
            }
        });

        btn_lista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MainActivity.this,MainActivity3.class);
                MainActivity.this.startActivity(intent);
            }
        });

    }







}