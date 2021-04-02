package com.example.mrifaldoapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SUPERMARKET extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listSM = new String[]{"GIANT", "JUMBO MART", "Planet Swalayan"
                , "Global Swalayan", "Naga Swalayan"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listSM));
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
            if (pilhan.equals("GIANT")){
                a = new Intent(this, GIANT.class);


            } else if (pilhan.equals("JUMBO MART")) {
                a = new Intent(this, JUMBO.class);

            } else if (pilhan.equals("Planet Swalayan")) {
                a = new Intent(this, PS.class);

            } else if (pilhan.equals("Global Swalayan")) {
                a = new Intent(this, GS.class);

            } else if (pilhan.equals("Naga Swalayan")) {
                a = new Intent(this, NS.class);
            }
            startActivity(a);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
