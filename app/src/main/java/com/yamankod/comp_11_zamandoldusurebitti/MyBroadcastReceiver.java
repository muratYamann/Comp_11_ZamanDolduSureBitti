package com.yamankod.comp_11_zamandoldusurebitti;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
	@Override
	public void onReceive(Context context, Intent intent) {
		 Toast.makeText(context, "Zaman doldu. Süre bitti!!!!.",
			        Toast.LENGTH_LONG).show();
			    Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
			    vibrator.vibrate(2000);
	}
}

