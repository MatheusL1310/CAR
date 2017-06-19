package com.lanfranchi.aula.car.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by matheus on 6/19/2017.
 */

public class BdHelper extends SQLiteOpenHelper{

    public static final int versao = 1;
    public static final String nome = "meu_bd";

    public BdHelper(Context context){
        super(context, nome, null, versao);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE my_table (" +
                "id integer primary key," +
                "km double," +
                "litros double," +
                "data text," +
                "posto text" +
                ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE my_table;");
        this.onCreate(db);
    }
}
