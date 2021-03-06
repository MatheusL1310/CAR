package com.lanfranchi.aula.car;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.widget.Spinner;
import org.w3c.dom.Text;

/**
 * Created by matheus on 6/3/2017.
 */

public class AbastecimentoHolder extends RecyclerView.ViewHolder {


    private final Context context;
    private TextView tvData;
    private TextView tvKm;
    private TextView tvLitros;
    private ImageView ivBandeira;

    private Abastecimento abastecimentoDaGaveta;

    public AbastecimentoHolder(View itemView) {
        super(itemView);
        context = itemView.getContext();
        tvData = (TextView) itemView.findViewById(R.id.tvData);
        tvKm = (TextView) itemView.findViewById(R.id.tvKm);
        tvLitros = (TextView) itemView.findViewById(R.id.tvLitros);
        ivBandeira = (ImageView) itemView.findViewById(R.id.ivBandeira);
    }

    public void atualizarInfoGaveta(Abastecimento abastecimentoParaColocarNaGaveta){
        this.tvData.setText( abastecimentoParaColocarNaGaveta.getData() );
        this.tvKm.setText( abastecimentoParaColocarNaGaveta.getKm()+" Km");
        this.tvLitros.setText( abastecimentoParaColocarNaGaveta.getLitros()+" L");


        String posto = abastecimentoParaColocarNaGaveta.getPosto();
        switch (posto){
            case "Texaco":
                ivBandeira.setImageResource(R.drawable.texaco);
                break;
            case "Shell":
                ivBandeira.setImageResource(R.drawable.shell);
                break;
            case "Petrobras":
                ivBandeira.setImageResource(R.drawable.petrobras);
                break;
            case "Ipiranga":
                ivBandeira.setImageResource(R.drawable.ipiranga);
                break;
            case "Outros":
                ivBandeira.setImageResource(R.drawable.postooutros);
                break;
        }

        abastecimentoDaGaveta = abastecimentoParaColocarNaGaveta;

    }

}
