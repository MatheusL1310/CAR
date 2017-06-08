package com.lanfranchi.aula.car;

import android.media.Image;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by matheus on 6/3/2017.
 */

public class Abastecimento implements Serializable {

    public static ArrayList<Abastecimento> listaAbastecimentos;

    public static ArrayList<Abastecimento> obterListaAbastecimentos(){
        return Abastecimento.listaAbastecimentos;
    }

    private String data;
    private double Km;
    private double Litros;
    private String posto;
    private static double kmTotal = 0.0;
    private static double totalLitros = 0.0;
    private static double autonomia = 0.0;

    public Abastecimento (String data, double Km, double Litros, String posto){
        this.setData(data);
        this.setKm(Km);
        this.setLitros(Litros);
        this.setPosto(posto);
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

    public static ArrayList<Abastecimento> getListaAbastecimentos() {
        return listaAbastecimentos;
    }

    public static void setListaAbastecimentos(ArrayList<Abastecimento> listaAbastecimentos) {
        Abastecimento.listaAbastecimentos = listaAbastecimentos;
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
