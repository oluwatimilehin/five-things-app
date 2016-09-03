package com.oluwatimilehin.fivethings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startScience(View view){
       Intent i = new Intent(this, ScienceActivity.class);
       startActivity(i);
   }


    public void startSports(View view){
        Intent i = new Intent(this,SportsActivity.class);
        startActivity(i);

    }




}
