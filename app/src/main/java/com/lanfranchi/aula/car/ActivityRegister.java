package com.lanfranchi.aula.car;

import android.support.v7.app.AppCompatActivity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.Button;
import android.content.Intent;

public class ActivityRegister extends AppCompatActivity {

    private EditText etKmAtual;
    private EditText etLAbast;
    private EditText etData;
    private Spinner spPostos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etKmAtual = (EditText) findViewById(R.id.etKmAtual);
        etLAbast = (EditText) findViewById(R.id.etLAbast);
        etData = (EditText) findViewById(R.id.etData);
        spPostos = (Spinner) findViewById(R.id.spPostos);

        ArrayAdapter arrayAdapter = ArrayAdapter.createFromResource(this,R.array.postos , android.R.layout.simple_spinner_item);
        spPostos.setAdapter(arrayAdapter);

    }

    public void cliqueAdicionarAbastecimento(View v){
        Abastecimento novoAbast = new Abastecimento();
        double km = Double.parseDouble(etKmAtual.getText().toString());
        double litros = Double.parseDouble(etLAbast.getText().toString());

        if(km <= Abastecimento.getKmTotal()){
            Toast.makeText(this.getApplicationContext(),"Km menor que atual!", Toast.LENGTH_LONG).show();
            return;
        }else{
            novoAbast.setKmTotal(km);
        }
        if(litros <= 0.0){
            Toast.makeText(this.getApplicationContext(),"Valor tem que ser positivo!", Toast.LENGTH_LONG).show();
            return;
        }else{
            Abastecimento.setTotalLitros(Abastecimento.getTotalLitros()+litros);
        }
        Abastecimento.setAutonomia(km/Abastecimento.getTotalLitros());

        novoAbast.setLitros(litros);
        novoAbast.setData(etData.getText().toString());
        novoAbast.setPosto(spPostos.getSelectedItem().toString());

        Abastecimento.salvar(ActivityRegister.this, novoAbast);
        finish();
    }
}
