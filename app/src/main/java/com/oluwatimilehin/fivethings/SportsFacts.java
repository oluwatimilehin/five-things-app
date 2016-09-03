package com.oluwatimilehin.fivethings;

/**
 * Created by timad on 03/09/2016.
 */
public class SportsFacts {

    public String mSportsFacts[] = {
            "Major League Baseball umpires are required to wear black underwear while on the job in case they split their pants.",
            "Michael Jordan makes more money from Nike annually than all of the Nike factory workers in Malaysia combined.",
            "At one point in August 1971, the Pittsburgh Pirates became the first professional team to field nine players who were either black or Latino. Coincidentally, this was the same year they won the World Series",
            "Track athletes are surprisingly most likely to break records late in the day, with body temperatures at their highest.",
            "It takes 3,000 cows to supply the NFL with enough leather for a year’s supply of footballs."
    };

    public String getSportsFact(int i){

        return mSportsFacts[i];
    }
}
