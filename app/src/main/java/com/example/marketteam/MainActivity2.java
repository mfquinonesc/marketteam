package com.example.marketteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private EditText nombre,apellido,direccion1,direccion2,empresa,alias,telefono1,telefono2;
    private Button btn_guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.alias=(EditText) findViewById(R.id.alias);
        this.apellido= (EditText) findViewById(R.id.apellido);
        this.nombre = (EditText) findViewById(R.id.nombre);
        this.telefono1=(EditText) findViewById(R.id.telefono1);
        this.telefono2=(EditText) findViewById(R.id.telefono2);
        this.direccion1= (EditText) findViewById(R.id.direccion1);
        this.direccion2= (EditText) findViewById(R.id.direccion2);
        this.btn_guardar = (Button) findViewById(R.id.btn3);

        this.btn_guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Id registro: ",Toast.LENGTH_SHORT).show();

            }
        });

    }

    private void registrar(){
        ConexionSqLite con = new ConexionSqLite(this,"sqlite",null,1);
        SQLiteDatabase db = con.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Utilidades.NOMBRE,this.nombre.getText().toString());
        values.put(Utilidades.APELLIDO,this.apellido.getText().toString());
        values.put(Utilidades.NICKNAME,this.alias.getText().toString());
        values.put(Utilidades.TELEFONO1,this.telefono1.getText().toString());
        values.put(Utilidades.TELEFONO2,this.telefono2.getText().toString());
        values.put(Utilidades.DIRECCION1,this.direccion1.getText().toString());
        values.put(Utilidades.DIRECCION2,this.direccion2.getText().toString());
        long idResultando = db.insert(Utilidades.NOMBRE_TABLA,Utilidades.ID_REGISTRO,values);
    }


}