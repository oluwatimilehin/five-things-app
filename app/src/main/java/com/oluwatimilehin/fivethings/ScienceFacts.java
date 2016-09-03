package com.oluwatimilehin.fivethings;

/**
 * Created by timad on 02/09/2016.
 */

public class ScienceFacts  {

    public String mScienceFacts[] = {
            "Many scientists believe that an asteroid impact caused the extinction of the dinosaurs around 65 million years ago.",
            "Dog have superior hearing than humans, capable of hearing sounds at four times the distance.",
            "The most rainfall ever recorded in 24 hours is 182.5 centimetres in Foc-Foc, La Réunion on January 8, 1966.",
            "Examples of popular vegetables include lettuce, carrots, asparagus, cauliflower, broccoli, spinach, potatoes and onions",
            "A hippopotamus may seem huge but it can still run faster than a man."
    };

    int i = 0;

    public int mScienceImages[] =  {
            R.drawable.space,
            R.drawable.dog,
            R.drawable.weather,
            R.drawable.food,
            R.drawable.hippo
    };



        public String getScienceFacts (int i) {
        String fact = " ";
        fact = mScienceFacts[i];
        return fact;
    }

    public int getScienceImages(int j) {
        int image = mScienceImages[j];
        return image;
    }


}
