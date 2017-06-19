package com.lanfranchi.aula.car;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.Image;

import com.lanfranchi.aula.car.storage.BdHelper;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by matheus on 6/3/2017.
 */

public class Abastecimento implements Serializable {

    public static ArrayList<Abastecimento> listaAbastecimentos;
    private String data;
    private double Km;
    private double Litros;
    private String posto;
    private static double kmTotal = 0.0;
    private static double totalLitros = 0.0;
    private static double autonomia = 0.0;



    public static ArrayList<Abastecimento> obterListaAbastecimentos(Context context){
        if(listaAbastecimentos == null){
            listaAbastecimentos = new ArrayList<>();
        }
        BdHelper bdHelper = new BdHelper(context);
        SQLiteDatabase db = bdHelper.getReadableDatabase();

        String[] projecao = {
                "Km",
                "Litros",
                "data",
                "posto"};

        String orderBy = "id ASC";

        Cursor cursor = db.query(
                "my_table",
                projecao,
                null,
                null,
                null,
                null,
                orderBy
        );

        if(cursor.moveToFirst()){
            do{
                Abastecimento a = new Abastecimento();
                a.setKm(cursor.getDouble(0));
                a.setLitros(cursor.getDouble(1));
                a.setData(cursor.getString(2));
                a.setPosto(cursor.getString(3));
                listaAbastecimentos.add(a);
            } while (cursor.moveToNext());
        }

        return listaAbastecimentos;
    }

    public static void salvar(Context context, Abastecimento a){
        //conecta no banco e adiciona no bd
        BdHelper bdHelper = new BdHelper(context);
        SQLiteDatabase db = bdHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("km", a.getKm());
        values.put("litros", a.getLitros());
        values.put("data", a.getData());
        values.put("posto", a.getPosto());

        db.insert("my_table", null, values);
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getKm() {
        return Km;
    }

    public void setKm(double km) {
        this.Km = km;
    }

    public double getLitros() {
        return Litros;
    }

    public void setLitros(double litros) {
        this.Litros = litros;
    }


    public String getPosto() {
        return posto;
    }

    public void setPosto(String posto) {
        this.posto = posto;
    }

    public static double getKmTotal() {
        return kmTotal;
    }

    public static void setKmTotal(double kmTotal) {
        Abastecimento.kmTotal = kmTotal;
    }

    public static double getTotalLitros() {
        return totalLitros;
    }

    public static void setTotalLitros(double totalLitros) {
        Abastecimento.totalLitros = totalLitros;
    }

    public static double getAutonomia() {
        return autonomia;
    }

    public static void setAutonomia(double autonomia) {
        Abastecimento.autonomia = autonomia;
    }

}
