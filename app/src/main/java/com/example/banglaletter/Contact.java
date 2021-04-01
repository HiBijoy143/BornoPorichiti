package com.example.banglaletter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Contact extends AppCompatActivity {

    private TextView textView;
    String mytext = "<h1>Md. Hasan Imam Bijoy</h1>\n"+
            "<h3>MyAppB Development Ltd.\n</h3>"+
            "<h3>Email: hasanimambijoy.cse@gmail.com\n</h3>"+
            "<h3>Copyright ©️ by MyAppB 2021</h3>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        textView = findViewById(R.id.developerTextId);
        textView.setText(Html.fromHtml(mytext));
    }
}