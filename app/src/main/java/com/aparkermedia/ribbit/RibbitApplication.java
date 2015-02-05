package com.aparkermedia.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Arron on 05/02/2015.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "rp1vaM5xzhtUyDYUelqdeULOj75PogJVF6G21QQG", "dRy5y5INgLFNFPTNdYgjnilbO7ZxfT5SpgxNdh1F");
    }

}
