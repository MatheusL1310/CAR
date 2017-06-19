package com.lanfranchi.aula.car;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


/**
 * Created by matheus on 6/6/2017.
 */

public class ActivityRecyclerView extends AppCompatActivity{

    private AbastecimentoAdapter abastecimentoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);


        RecyclerView rvLista = (RecyclerView)findViewById(R.id.rvLista);
        rvLista.setLayoutManager(new LinearLayoutManager(this.getApplicationContext()));
        abastecimentoAdapter = new AbastecimentoAdapter();
        abastecimentoAdapter.setListaAbastecimentos(Abastecimento.obterListaAbastecimentos(ActivityRecyclerView.this));
        rvLista.setAdapter(abastecimentoAdapter);

    }
    @Override
    public void onResume(){
        super.onResume();
        if(abastecimentoAdapter != null) {
            abastecimentoAdapter.notifyDataSetChanged();
        }
    }
}
