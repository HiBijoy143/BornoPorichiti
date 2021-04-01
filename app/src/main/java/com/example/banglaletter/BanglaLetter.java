package com.example.banglaletter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class BanglaLetter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla_letter);
    }

    public void bsletter(View view) {
        BanglaShorborno bs = new BanglaShorborno();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frmae, bs);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void bbletter(View view) {
        BanglaBanjon bb = new BanglaBanjon();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frmae, bb);
        ft.addToBackStack(null);
        ft.commit();
    }
    public void bnumber(View view) {
        BanglaNumber bn = new BanglaNumber();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frmae, bn);
        ft.addToBackStack(null);
        ft.commit();
    }
}