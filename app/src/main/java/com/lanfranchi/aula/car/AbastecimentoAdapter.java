package com.lanfranchi.aula.car;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by matheus on 6/3/2017.
 */

public class AbastecimentoAdapter extends RecyclerView.Adapter {

    private List<Abastecimento> listaAbastecimentos;

    public void setListaAbastecimentos(List<Abastecimento> lista) {
        this.listaAbastecimentos = lista;
    }

    public List<Abastecimento> getListaAbastecimentos(){
        return this.listaAbastecimentos;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.gaveta_abastecimento, parent, false);
        AbastecimentoHolder gaveta = new AbastecimentoHolder(v);
        return gaveta;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
