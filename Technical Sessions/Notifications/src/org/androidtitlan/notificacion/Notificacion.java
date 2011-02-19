package org.androidtitlan.notificacion;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Notificacion extends Activity {
    private static final int HELLO_ID = 123;
	private NotificationManager mNotificationManager;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
    	mNotificationManager=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);

    }
    
    public void createSimpleNotification(View v) {
    	
    	int icon = R.drawable.notification_icon;
		CharSequence tickerText = "Te estoy notificando";
		long when = System.currentTimeMillis();
		Notification mNotification = new Notification(icon , tickerText , when );
		
        mNotification.defaults |= Notification.DEFAULT_SOUND;
        
	    mNotification.defaults |= Notification.DEFAULT_VIBRATE;
	    
		mNotification.flags= Notification.FLAG_AUTO_CANCEL;

	    

	    Context context = getApplicationContext();
		CharSequence contentTitle = "Este es el titulo";
		CharSequence contentText = "Este es el cuerpo";
        Intent mIntent = new Intent(this, Notificacion.class); 
    	PendingIntent mPendingIntent = PendingIntent.getActivity(this, 0, mIntent, 0);

		mNotification.setLatestEventInfo(context, contentTitle , contentText , mPendingIntent);

	    mNotificationManager.notify(HELLO_ID, mNotification);     



    }
    
    public void clearNotification(View v) {
		mNotificationManager.cancel(HELLO_ID);
}     
}