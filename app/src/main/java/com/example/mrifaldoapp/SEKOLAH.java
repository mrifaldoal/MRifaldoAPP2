package com.example.mrifaldoapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SEKOLAH extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listSKLH = new String[]{"SMA 1 BANGKINANG KOTA", "SMA 2 BAGNKINANG KOTA", "SMK 1 BANGKINANG KOTA"
                , "SMA 1 SALO", "SMA MUHAMADIYAH BANGKINANG"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listSKLH));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilhan = o.toString();
        tampilkanpilhan(pilhan);
    }

    private void tampilkanpilhan(String pilhan) {
        try {
            Intent a = null;
            if (pilhan.equals("SMA 1 BANGKINANG KOTA")){
                a = new Intent(this, SMA1BKN.class);


            } else if (pilhan.equals("SMA 2 BAGNKINANG KOTA")) {
                a = new Intent(this, PolsekTMPN.class);

            } else if (pilhan.equals("SMK 1 BANGKINANG KOTA")) {
                a = new Intent(this, PolsekTR.class);

            } else if (pilhan.equals("SMA 1 SALO")) {
                a = new Intent(this, PolsekMDAU.class);

            } else if (pilhan.equals("PSMA MUHAMADIYAH BANGKINANG")) {
                a = new Intent(this, PolsekBKTRYA.class);
            }
            startActivity(a);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
