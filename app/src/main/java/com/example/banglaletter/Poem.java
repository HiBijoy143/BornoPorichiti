package com.example.banglaletter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class Poem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem);
    }

    public void bpoem(View view) {
        BlankKobita bk= new BlankKobita();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frmaePoem, bk);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void epoem(View view) {
        EnglishPoem ep = new EnglishPoem();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frmaePoem, ep);
        ft.addToBackStack(null);
        ft.commit();
    }
}