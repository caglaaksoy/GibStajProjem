package com.caglaaksoy.gibgib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class IletisimActivity extends AppCompatActivity {
    private String[] iletisimler =
            {       "Dikmen Hizmet Binası",
                    "Adres : Gelir İdaresi Başkanlığı Devlet Mahallesi Merasim Cad. No:9/1 Çankaya/ANKARA",
                    "Telefon: +90 312 415 30 00 / +90 312 415 29 00",
                    "Faks: +90 312 415 28 21-22","Ek Hizmet Binası",
                    "Adres : Yeni Ziraat Mahallesi Etlik Cad. No: 16 06110 Dışkapı/ANKARA",
                    "Telefon: +90 312 302 17 00",
                    "Faks: +90 312 302 15 39"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iletisim);
        //listView'i tasarımdakiyle bağlıyoruz.
        ListView listView = (ListView) findViewById(R.id.listView);

        //ArrayAdapter'i hazırlıyoruz.
        ArrayAdapter<String> adapter = new  ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, iletisimler);

        //listView için hazırladığımız adapter'i ayarlıyoruz.
        listView.setAdapter(adapter);

        //Burada liste aşağıya doğru kayıyor animasyon şeklinde.
        //listView.animate().translationY(100).setDuration(1000).setStartDelay(800);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),iletisimler[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}