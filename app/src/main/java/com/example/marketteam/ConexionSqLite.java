package com.example.marketteam;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConexionSqLite extends SQLiteOpenHelper {

    private final String crear_tabla="CREATE TABLE sqlite (id SERIAL PRIMARY KEY NOT NULL,imageurl VARCHAR(100),nombre VARCHAR(10), apellido VARCHAR(10),  telefono1 INTEGER,  telefono2 INTEGER, direccion1 VARCHAR(10), direccion2 VARCHAR(10),empresa VARCHAR(10),nickname VARCHAR(10));";

    public ConexionSqLite(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(crear_tabla);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS sqlite;");
        this.onCreate(db);
    }
}
