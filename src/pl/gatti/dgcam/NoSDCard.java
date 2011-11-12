package pl.gatti.dgcam;

import android.app.Activity;
import android.os.Bundle;

public class NoSDCard extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.no_sdcard);
	}
}
