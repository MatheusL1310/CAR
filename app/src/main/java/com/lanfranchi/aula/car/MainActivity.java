package com.lanfranchi.aula.car;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cliqueAdicAbast(View v){
        Intent intent = new Intent(this, ActivityRegister.class);
        startActivity(intent);
    }

    public void cliqueVisualAbast(View v){
        Intent intent = new Intent(this, ActivityRecyclerView.class);
        startActivity(intent);
    }
}
