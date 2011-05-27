package org.androidtitlan.motodev.intentsimple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class First extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
    } 
    
    public void go(View v){
		Intent i = new Intent(this, Second.class);
        startActivity(i);
	}
}