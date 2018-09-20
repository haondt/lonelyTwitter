package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

public class Duck extends Animal implements FlyingBehaviour{
    @Override
    public void swim(){
        Log.d("noah", "Great swimmer");
    }

    public void fly() {
        Log.d("noah", "Duck flaps his wings with great force");
    }
}
