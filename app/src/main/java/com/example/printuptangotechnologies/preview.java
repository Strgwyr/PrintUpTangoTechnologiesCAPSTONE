package com.example.printuptangotechnologies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class preview extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);

        Button print = findViewById(R.id.print);


        print.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        Intent i = new Intent(preview.this, ThankYou.class
        );

        startActivity(i);




        switch (v.getId()) {
            case R.id.print:
                startActivity(i);


                break;

        }
    }
}