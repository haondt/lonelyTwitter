package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Mood {
    private Date date;

    public Mood(Date date){
        this.date = date;
    }

    public Mood(){
        this.date = new Date(System.currentTimeMillis());
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Date getDate(){
        return this.date;
    }

    public abstract String getMood();
}
