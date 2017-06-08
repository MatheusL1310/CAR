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

public class AbastecimentoAdapter extends RecyclerView.Adapter<AbastecimentoHolder> {

    private List<Abastecimento> listaAbastecimentos;

    public void setListaAbastecimentos(List<Abastecimento> lista) {
        this.listaAbastecimentos = lista;
    }

    public List<Abastecimento> getListaAbastecimentos(){
        return this.listaAbastecimentos;
    }

    @Override
    public AbastecimentoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.gaveta_abastecimento, parent, false);
        AbastecimentoHolder gaveta = new AbastecimentoHolder(v);
        return gaveta;
    }

    @Override
    public void onBindViewHolder(AbastecimentoHolder holder, int position) {
        Abastecimento abast = listaAbastecimentos.get(position);
        holder.atualizarInfoGaveta(abast);
    }

    @Override
    public int getItemCount() {
        return listaAbastecimentos.size();
    }
}
