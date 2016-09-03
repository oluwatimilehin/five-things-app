package com.oluwatimilehin.fivethings;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ScienceActivity extends AppCompatActivity {

    ScienceFacts mFact = new ScienceFacts();
    TextView factText;
    ImageView factImage;
    Button previousButton;
    Button nextButton;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);

        i = 0;
        factText = (TextView) findViewById(R.id.science_fact);
        factText.setText(mFact.getScienceFacts(i));
        factImage = (ImageView) findViewById(R.id.science_image);
        factImage.setImageResource(mFact.getScienceImages(i));

    }

    public void nextScienceFact(View view) {

        i = i + 1;
        if (i >= (mFact.mScienceFacts.length - 1)) {
            nextButton = (Button) findViewById(R.id.science_next);
            nextButton.setVisibility(View.INVISIBLE);
        }


        mSetScienceFact(i);
        previousButton = (Button) findViewById(R.id.science_previous);
        previousButton.setVisibility(View.VISIBLE);
    }


    public void previousScienceFact(View view){
        i -= 1;
        if(i <= 0){
            previousButton.setVisibility(View.INVISIBLE);
            i = 0;
        }
        nextButton.setVisibility(View.VISIBLE);

        mSetScienceFact(i);
    }


    public void mSetScienceFact(int i){
        String fact = mFact.getScienceFacts(i);
        factText.setText(fact);
        int image = mFact.getScienceImages(i);
        factImage.setImageResource(image);
    }


}
