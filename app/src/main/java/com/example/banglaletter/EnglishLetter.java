package com.example.banglaletter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class EnglishLetter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_letter);
    }

    public void ecletter(View view) {
        EnglishCapital ec = new EnglishCapital();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frmae, ec);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void csletter(View view) {
        EnglishSmall es = new EnglishSmall();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frmae, es);
        ft.addToBackStack(null);
        ft.commit();
    }
    public void enumber(View view) {
        EnglishNumber en = new EnglishNumber();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frmae, en);
        ft.addToBackStack(null);
        ft.commit();
    }
}