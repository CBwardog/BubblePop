package com.example.cbwardog.bubblepop;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Start = (Button) findViewById(R.id.btn_start);
        Start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent openGame = new Intent(MainActivity.this, PopGame.class);
                startActivity(openGame);
            }
        });






    }




    public void exit(View v) {
        finish();
    }





    }

