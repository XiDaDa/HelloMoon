package com.app.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

public class AudioPlayer {

	private MediaPlayer mPlayer;
	
	public void stop() { 
		if(null != mPlayer){
			mPlayer.release();
			mPlayer = null;
		}
	}
	
	public void paly(Context c) {
		stop();
		mPlayer = MediaPlayer.create(c, R.raw.apollo_17_stroll);
		mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			
			@Override
			public void onCompletion(MediaPlayer mp) {
				// TODO Auto-generated method stub
				stop();
			}
		});
		mPlayer.start();
	}
}
