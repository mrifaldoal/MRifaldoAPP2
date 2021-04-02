package com.example.mrifaldoapp;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSTabrani extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listAct= new String[]{"Call Center", "SMS Center", "Driving Diregtion"
                , "Website", "Info di Google","Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listAct));
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
            if (pilhan.equals("Call Center")){
                String nomortel ="tel:( 0761 ) 35467";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));

            } else if (pilhan.equals("SMS Center"))
            {
                String smsText = "(RS TABRANI M.RIFALDO AL MAGRIBI/L ";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:( 0761 ) 35467"));
                a.putExtra("sms_body",smsText);

            } else if (pilhan.equals("Driving Direction"))
            {
                String lokasirs = "https://goo.gl/maps/DeXUF5r9Pi6o1zcH7";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(lokasirs));

            } else if (pilhan.equals("Website"))
            {
                String web = "http://rstabrani.co.id/";
                a = new Intent( Intent.ACTION_VIEW,Uri.parse(web));

            } else if (pilhan.equals("Info di Google"))
            {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"Rumah Sakit Tabrani");

            }else if (pilhan.equals("Exit"))
            {
                a = new Intent(this,RS.class);
            }

            startActivity(a);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
