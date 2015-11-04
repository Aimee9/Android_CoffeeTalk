package com.example.guest.coffeetalk;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Guest on 11/4/15.
 */
public class MyApplication extends Application{


    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "qSlYap8eVARo139yZezoWOLF5SwAufocZKnvGUs7", "EcaY7kWLVREDAIhegwvzYwblmlrOvhpO0fVAbtvV");


    }
}
