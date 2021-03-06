/*
  ------------------------------------------------------------------------------------------------------------------------------------------
  Project       : Code Report Generator
  File          : Splash.java
  Description   : This is just a splash screen that is presented at the beginning of the application.
  Author        : Konstantinos Monachopoulos
  ------------------------------------------------------------------------------------------------------------------------------------------
*/

package com.sphy.commander.codereportgenerator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends Activity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {

			/*
             * Showing splash screen with a timer. This will be useful when you
			 * want to show case your app logo / company
			 */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity

                Intent i = new Intent(Splash.this, MainActivity.class);
                startActivity(i);
            }
        }, SPLASH_TIME_OUT);
    }
}


