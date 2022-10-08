package com.caglaaksoy.gibgib;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class FragmentB extends Fragment {
    @Override
    public void onAttach(Context context) {

        super.onAttach(context);
        Log.e("emre", "fragmentB onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Log.e("emre", "fragmentB onCreate");
    }

    @Override
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstancestate) {
        Log.e("emre", "fargmentB oncreateview");
        return inflater.inflate(R.layout.fragment_b, container, false);
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("emre","fragmentB onAvtivityCreated");
    }


    @Override
    public void onStart() {
        super.onStart();
        Log.e("emre","fragmentB onStart");
    }


    @Override
    public void onResume() {
        super.onResume();
        Log.e("emre","fragmentB onResume");
    }


    @Override
    public void onPause() {
        super.onPause();
        Log.e("emre","fragmentB onPause");
    }


    @Override
    public void onStop() {
        super.onStop();
        Log.e("emre","fragmentB onStop");
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("emre","fragmentB onDestroy");
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("emre","fragmentB onDestroyView");
    }


    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("emre","fragmentB onDetach");
    }



}
