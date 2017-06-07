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
    private int Km;
    private double Litros;
    private Image bandeira;

    public Abastecimento (String data, int Km, double Litros){
        this.data = data;
        this.Km = Km;
        this.Litros = Litros;
    }
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public int getKm() {
        return Km;
    }

    public void setKm(int km) {
        Km = km;
    }

    public double getLitros() {
        return Litros;
    }

    public void setLitros(double litros) {
        Litros = litros;
    }
    public Image getBandeira() {
        return bandeira;
    }

    public void setBandeira(Image bandeira) {
        this.bandeira = bandeira;
    }
}
