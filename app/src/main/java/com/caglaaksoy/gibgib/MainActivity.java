package com.caglaaksoy.gibgib;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView yazi;
    Switch sw;
    TextView txt_unuttum;

    public Button btn_Giris;
    public Button btn_Kayit;
    public TextView iletisimText;


    //ExpandableListView expandableListView;
    //ExpandableListAdapter expandableListAdapter;
    //List<String> expandableListTitle;
    //HashMap<String , List<String>> expandableListDetail;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        switch_degisimi();

        // expandableListView = findViewById(R.id.expandableListView);

        // expandableListDetail = ExpandableListDataPump.getData();

        // expandableListTitle = new ArrayList<>(expandableListDetail.keySet());

        // expandableListAdapter = new CustomExpandableListAdapter
              //  (this,expandableListTitle,expandableListDetail);

       // expandableListView.setAdapter(expandableListAdapter);





        btn_Kayit = findViewById(R.id.btn_kayit);
        btn_Giris = findViewById(R.id.btn_giris);
        iletisimText = findViewById(R.id.iletisim); //192344
        txt_unuttum = (TextView) findViewById(R.id.sifremiUnuttum);


        btn_Kayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kayit = new Intent(MainActivity.this, KayitActivity.class);
                startActivity(kayit);
            }
        });

        btn_Giris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent giris = new Intent(MainActivity.this, GirisActivity.class);
                startActivity(giris);
            }
        });

        txt_unuttum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sifirla = new Intent(MainActivity.this,SifremiUnuttumActivity.class);
                startActivity(sifirla);
            }
        });


        iletisimText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ilet = new Intent(MainActivity.this, IletisimActivity.class );
                startActivity(ilet);
            }
        });

    }

    public void init() {
        yazi = (TextView) findViewById(R.id.yazi);
        sw = (Switch) findViewById(R.id.sw);
        sw.setTextOff("Gündüz");
        sw.setTextOn("Gece Modu Açık");

    }

    public void switch_degisimi() {
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (sw.isChecked()) {
                    yazi.setText(sw.getTextOn());
                    TextView txtGib = (TextView) findViewById(R.id.txtGib);
                    ConstraintLayout cons_one = (ConstraintLayout) findViewById(R.id.cons_one);
                    cons_one.setBackgroundColor(Color.parseColor("#000000"));
                    txtGib.setTextColor(Color.parseColor("#ffffff"));
                    yazi.setTextColor(Color.parseColor("#ffffff"));

                } else {
                    yazi.setText(sw.getTextOff());
                    TextView txtGib = (TextView) findViewById(R.id.txtGib);
                    ConstraintLayout cons_one = (ConstraintLayout) findViewById(R.id.cons_one);
                    txtGib.setTextColor(Color.parseColor("#E40E0E"));
                    cons_one.setBackgroundColor(Color.parseColor("#ffffff"));

                }
            }
        });
    }
}

