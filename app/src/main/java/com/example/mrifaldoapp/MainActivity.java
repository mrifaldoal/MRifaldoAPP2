package com.example.mrifaldoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_menu);
    }

    public void clickRS(View view) {
        //klik gambar rumah sakit
        Intent i = new Intent(this,RS.class);
        startActivity(i);
    }
    public void clickPOLICE(View view){
        //klik gambar police
        Intent i = new Intent(this,POLICE.class);
        startActivity(i);
    }

    public void clickSUPERMARKET(View view) {
        //klik gambar SUPERMARKET
        Intent i = new Intent(this,SUPERMARKET.class);
        startActivity(i);
    }

    public void clickSEKOLAH(View view) {
        //klik gambar sekolah
        Intent i = new Intent(this,SEKOLAH.class);
        startActivity(i);
    }
}