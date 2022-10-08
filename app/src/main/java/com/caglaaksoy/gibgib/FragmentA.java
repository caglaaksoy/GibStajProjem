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

public class FragmentA extends Fragment {

    @Override
    public void onAttach(Context context) {

        super.onAttach(context);
        Log.d("emre", "fragmentA onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Log.d("emre", "fragmentA onCreate");
    }

    @Override
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstancestate) {
        Log.d("emre", "fargmentA oncreateview");
        return inflater.inflate(R.layout.fragment_a, container, false);
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("emre","fragmentA onAvtivityCreated");
    }


    @Override
    public void onStart() {
        super.onStart();
        Log.d("emre","fragmentA onStart");
    }


    @Override
    public void onResume() {
        super.onResume();
        Log.d("emre","fragmentA onResume");
    }


    @Override
    public void onPause() {
        super.onPause();
        Log.d("emre","fragmentA onPause");
    }


    @Override
    public void onStop() {
        super.onStop();
        Log.d("emre","fragmentA onStop");
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("emre","fragmentA onDestroy");
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("emre","fragmentA onDestroyView");
    }


    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("emre","fragmentA onDetach");
    }





}




















  /*  @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // inflater metodunu kullanarak layouttaki fargment a'yı xml'den javaya dönüşütmek istediğimiiz söylüyoruz
        View view = inflater.inflate(R.layout.fragment_a,container,false);

        return view;
    }
}*/


























