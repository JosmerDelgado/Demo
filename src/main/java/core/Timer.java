package core;

import java.util.Date;

/**
 * Created by Josmer Delgado on 29/3/2017.
 */
public class Timer {
    public long startStamp;

    public void start(){
        startStamp=getTimeStamp();
    }

    private long getTimeStamp() {
        return new Date().getTime();
    }

    public boolean expired(int seconds){
        int diference=(int) ((getTimeStamp() - startStamp)/1000);
        return diference>seconds;
    }
}
