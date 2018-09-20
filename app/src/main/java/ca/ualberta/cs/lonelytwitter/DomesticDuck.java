package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

public class DomesticDuck extends Animal implements FlyingBehaviour{
    @Override
    public void swim(){
        Log.d("noah", "Decent swimmer");
    }

    public void fly() {
        Log.d("noah", "Domestic Duck flaps his wings with mild force");
    }
}
