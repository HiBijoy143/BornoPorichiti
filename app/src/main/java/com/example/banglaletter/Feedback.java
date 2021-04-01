package com.example.banglaletter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Feedback extends AppCompatActivity implements View.OnClickListener {

    private EditText nameEditText,feedbackEditText;
    private Button resetButton,submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        nameEditText = findViewById(R.id.nameEditTextId);
        feedbackEditText = findViewById(R.id.feedbackEditTextId);
        resetButton = findViewById(R.id.resetButtonId);
        submitButton = findViewById(R.id.submitButtonId);

        resetButton.setOnClickListener(this);
        submitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        try {
            String name = nameEditText.getText().toString();
            String feedback = feedbackEditText.getText().toString();
            if (v.getId()==R.id.resetButtonId)
            {
                nameEditText.setText("");
                feedbackEditText.setText("");
            }
            else if(v.getId()==R.id.submitButtonId)
            {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");

                intent.putExtra(Intent.EXTRA_EMAIL,new String[] {"hasanimambijoy.cse@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT,"Feedback From BA");
                intent.putExtra(Intent.EXTRA_TEXT,"Name : "+name+"\nFeedback : "+feedback);
                startActivity(Intent.createChooser(intent,"Feedback with"));
            }
        }catch (Exception e)
        {
            e.printStackTrace();
            Toast.makeText(Feedback.this,"Please Enter Feedback before Submit",Toast.LENGTH_SHORT).show();
        }
    }
}