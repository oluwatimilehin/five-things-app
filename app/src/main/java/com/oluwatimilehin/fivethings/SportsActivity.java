package com.oluwatimilehin.fivethings;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SportsActivity extends AppCompatActivity {

    SportsFacts mSportsFacts = new SportsFacts();
    TextView mSportsFactText;
    Button mPreviousButton,mNextButton;
    int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
        mSportsFactText = (TextView) findViewById(R.id.sports_fact_view);
        mSportsFactText.setText(mSportsFacts.getSportsFact(i));
    }

    public void nextSportsFact(View view) {

        i = i + 1;
        if (i >= (mSportsFacts.mSportsFacts.length - 1)) {
            mNextButton= (Button) findViewById(R.id.sports_next);
            mNextButton.setVisibility(View.INVISIBLE);
        }


        mSetSportsFact(i);
        mPreviousButton = (Button) findViewById(R.id.sports_previous);
        mPreviousButton.setVisibility(View.VISIBLE);
    }


    public void previousSportsFact(View view){
        i -= 1;
        if(i <= 0){
            mPreviousButton.setVisibility(View.INVISIBLE);
            i = 0;
        }
        mNextButton.setVisibility(View.VISIBLE);

        mSetSportsFact(i);
    }

    public void mSetSportsFact(int i){
        String fact = mSportsFacts.getSportsFact(i);
        mSportsFactText.setText(fact);
    }




}
