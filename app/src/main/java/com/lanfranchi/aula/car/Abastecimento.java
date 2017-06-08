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
    private double kmTotal = 0.0;
    private double totalLitros = 0.0;
    private double autonomia = 0.0;

    public Abastecimento (String data, double Km, double Litros, String posto){
        this.data = data;
        this.Km = Km;
        this.Litros = Litros;
        this.posto = posto;
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
        Km = km;
    }

    public double getLitros() {
        return Litros;
    }

    public void setLitros(double litros) {
        Litros = litros;
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

    public double getKmTotal() {
        return kmTotal;
    }

    public void setKmTotal(double kmTotal) {
        this.kmTotal = kmTotal;
    }

    public double getTotalLitros() {
        return totalLitros;
    }

    public void setTotalLitros(double totalLitros) {
        this.totalLitros = totalLitros;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

}
