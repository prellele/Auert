package de.prellele.auert;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends Activity {
	public MediaPlayer mp;
	private ImageView img;
	private Context context;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		img = (ImageView) findViewById(R.id.playAuert);
		img.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				mp = MediaPlayer.create(MainActivity.this, R.raw.fart);
				mp.start();
				mp.setOnCompletionListener(new OnCompletionListener() {

					@Override
					public void onCompletion(MediaPlayer mp) {
						// TODO Auto-generated method stub
						mp.release();
					}

				});

			}
		});

	}

}