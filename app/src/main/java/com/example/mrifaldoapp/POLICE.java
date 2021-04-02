package com.example.mrifaldoapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class POLICE extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listPOL = new String[]{"Polsek Bangkinang Kota", "Polsek Tampan", "Polsek Tenayan Raya"
                , "Polsek Mandau", "Polsek Bukit Raya"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPOL));
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
            if (pilhan.equals("Polsek Bangkinang Kota")){
                a = new Intent(this, PolsekBKN.class);


            } else if (pilhan.equals("Polsek Tampan")) {
                a = new Intent(this, PolsekTMPN.class);

            } else if (pilhan.equals("Polsek Tenayan Raya")) {
                a = new Intent(this, PolsekTR.class);

            } else if (pilhan.equals("Polsek Mandau")) {
                a = new Intent(this, PolsekMDAU.class);

            } else if (pilhan.equals("Polsek Bukit Raya")) {
                a = new Intent(this, PolsekBKTRYA.class);
            }
            startActivity(a);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

