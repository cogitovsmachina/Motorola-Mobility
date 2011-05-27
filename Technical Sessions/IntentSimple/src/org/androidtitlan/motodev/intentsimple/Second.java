package org.androidtitlan.motodev.intentsimple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Second extends Activity {
	/**
	 * @see android.app.Activity#onCreate(Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
	}
	
	public void back(View v){
		finish();
	}       
}
