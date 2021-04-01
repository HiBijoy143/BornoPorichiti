package com.example.banglaletter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.drawerId);
        NavigationView navigationView = findViewById(R.id.navigationId);
        navigationView.setNavigationItemSelectedListener(this);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(actionBarDrawerToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        if(menuItem.getItemId()==R.id.homeId)
        {
            Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Home.class);
            startActivity(intent);

        }
        else if(menuItem.getItemId()==R.id.banglaId)
        {
            Toast.makeText(this, "Bangla Letter", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, BanglaLetter.class);
            startActivity(intent);

        }
        else if(menuItem.getItemId()==R.id.englishId)
        {
            Toast.makeText(this, "English Letter", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, EnglishLetter.class);
            startActivity(intent);

        }
        else if(menuItem.getItemId()==R.id.poemId)
        {
            Toast.makeText(this, "EnglishPoem", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Poem.class);
            startActivity(intent);
        }
        else if(menuItem.getItemId()==R.id.kobitaId)
        {
            Toast.makeText(this, "EnglishPoem", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Poem.class);
            startActivity(intent);
        }
        else if(menuItem.getItemId()==R.id.contactId)
        {
            Intent intent = new Intent(MainActivity.this, Contact.class);
            startActivity(intent);
        }
        else if(menuItem.getItemId()==R.id.feedbackId)
        {
            Intent intent = new Intent(MainActivity.this, Feedback.class);
            startActivity(intent);
        }
        else if(menuItem.getItemId()==R.id.exictId)
        {
            finish();

        }
        return false;
    }
}