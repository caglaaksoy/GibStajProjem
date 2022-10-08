package com.caglaaksoy.gibgib;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView yazi;
    Switch sw;

    public Button btn_Kayit;
    public TextView iletisimText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        switch_degisimi();

        btn_Kayit = findViewById(R.id.btn_kayit);
        iletisimText = findViewById(R.id.iletisim);

        btn_Kayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kayit = new Intent(MainActivity.this, KayitActivity.class);
                startActivity(kayit);
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

