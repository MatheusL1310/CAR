package com.lanfranchi.aula.car;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView tvValorAuto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvValorAuto = (TextView)findViewById(R.id.tvValorAuto);
        tvValorAuto.setText(String.valueOf(Abastecimento.getAutonomia()));

    }

    public void cliqueAdicAbast(View v){
        Intent intent = new Intent(this, ActivityRegister.class);
        startActivity(intent);
    }

    public void cliqueVisualAbast(View v){
        Intent intent = new Intent(this, ActivityRecyclerView.class);
        startActivity(intent);
    }

    @Override
    protected void onResume(){
        tvValorAuto.setText(String.valueOf(String.format("%.2f",Abastecimento.getAutonomia())));
        super.onResume();
    }
}
