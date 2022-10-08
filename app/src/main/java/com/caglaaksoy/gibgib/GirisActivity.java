package com.caglaaksoy.gibgib;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class GirisActivity extends AppCompatActivity {
    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);

        manager = getFragmentManager();
    }

    public void addFragmentA(View v) {
        FragmentA fragmentA = new FragmentA();

        FragmentTransaction transaction= manager.beginTransaction();
        transaction.add(R.id.container, fragmentA , "fragA");
        transaction.commit();
    }

    public void addFragmentB(View v) {
        FragmentB fragmentB = new FragmentB();

        FragmentTransaction transaction= manager.beginTransaction();
        transaction.add(R.id.container, fragmentB , "fragB");
        transaction.commit();
    }

    public void removeFragmentA(View v) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragA");
        FragmentTransaction transaction= manager.beginTransaction();
        if(fragmentA!=null) {
            transaction.remove(fragmentA);
            transaction.commit();
        }else {
            Toast.makeText(this,"Fargement A bulunamadı" , Toast.LENGTH_LONG).show();
        }
    }

    public void removeFragmentB(View v) {
        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag("fragB");
        FragmentTransaction transaction= manager.beginTransaction();
        if(fragmentB!=null) {
            transaction.remove(fragmentB);
            transaction.commit();
        }else {
            Toast.makeText(this,"Fragment B bulunamadı" , Toast.LENGTH_LONG).show();
        }
    }

    public void replaceByFragmentA(View v) {
        FragmentA fragmentA = new FragmentA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container,fragmentA,"fragA");
        transaction.commit();
    }


    public void replaceByFragmentB(View v) {
        FragmentB fragmentB = new FragmentB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container,fragmentB,"fragB");
        transaction.commit();
    }

    public void attachFragmentA(View v) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragA");
        FragmentTransaction transaction = manager.beginTransaction();
        if(fragmentA!=null){
            transaction.attach(fragmentA);
            transaction.commit();
        } else {
            Toast.makeText(this,"Fragment A bulunamadı" , Toast.LENGTH_LONG).show();
        }
    }

    public void detachFragmentA(View v) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragA");
        FragmentTransaction transaction = manager.beginTransaction();
        if(fragmentA!=null){
            transaction.detach(fragmentA);
            transaction.commit();
        } else {
            Toast.makeText(this,"Fragment A bulunamadı" , Toast.LENGTH_LONG).show();
        }
    }

    public void showFragmentA(View v) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragA");
        FragmentTransaction transaction = manager.beginTransaction();

        if(fragmentA!=null) {
            transaction.show(fragmentA);
            transaction.commit();
        } else {
            Toast.makeText(this,"Fragment A bulunamadı" , Toast.LENGTH_LONG).show();
        }
    }

    public void hideFragmentA(View v) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragA");
        FragmentTransaction transaction = manager.beginTransaction();

        if(fragmentA!=null) {
            transaction.hide(fragmentA);
            transaction.commit();
        } else {
            Toast.makeText(this,"Fragment A bulunamadı" , Toast.LENGTH_LONG).show();
        }
    }


}

/*  FragmentA fragmentA = new FragmentA(); // sınıf üzerinden nesne oluşturuyoryz
        FragmentManager manager = getFragmentManager(); // ekleme çıkarma işlemleri için transaction başlatmak lazım ve transactionları manager ele alıyor.
        FragmentTransaction transaction=manager.beginTransaction(); //getFragment... ile managere ulaşıyoruz

        // ekle çıkar ne yapmak istiyorsk buraya yazıyoruz
        transaction.add(R.id.giris_activity,fragmentA,"Fragment A");

        transaction.commit(); */

