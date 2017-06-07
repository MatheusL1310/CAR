package com.lanfranchi.aula.car;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by matheus on 6/3/2017.
 */

public class AbastecimentoHolder extends RecyclerView.ViewHolder {

    private TextView tvData;
    private TextView tvKm;
    private TextView tvLitros;
    private ImageView ivBandeira;

    private Abastecimento abastecimentoDaGaveta;

    public AbastecimentoHolder(View itemView) {
        super(itemView);
        tvData = (TextView) itemView.findViewById(R.id.tvData);
        tvKm = (TextView) itemView.findViewById(R.id.tvKm);
        tvLitros = (TextView) itemView.findViewById(R.id.tvLitros);
        ivBandeira = (ImageView) itemView.findViewById(R.id.ivBandeira);
    }

    public void atualizarInfoGaveta(Abastecimento abastecimentoParaColocarNaGaveta){
        tvData.setText( String.valueOf( abastecimentoParaColocarNaGaveta.getData() ) );
        tvKm.setText( abastecimentoParaColocarNaGaveta.getKm() );
        tvLitros.setText( String.valueOf(abastecimentoParaColocarNaGaveta.getLitros()) );
        abastecimentoDaGaveta = abastecimentoParaColocarNaGaveta;

    }

}
