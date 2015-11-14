package com.app.hellomoon;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HelloMoonFragment extends Fragment {
	
	private AudioPlayer mPlayer = new AudioPlayer();
	private SurfaceView mVideoPlayerSurfaceView;
	private SurfaceHolder mSurfaceHolder;
	private Button mPlayButton;
	private Button mStopButton;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
		
		View v = inflater.inflate(R.layout.fragment_hello_moon, parent, false); 
		mVideoPlayerSurfaceView = (SurfaceView) v.findViewById(R.id.hellomoon_playvideo);
		mSurfaceHolder = mVideoPlayerSurfaceView.getHolder();
		
		mPlayButton = (Button) v.findViewById(R.id.hellomoon_playButton);
		mPlayButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mPlayer.paly(getActivity());
			}
		});
		mStopButton = (Button) v.findViewById(R.id.hellomoon_stopButton);
		mStopButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mPlayer.stop();
			}
		});
		return v; 
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		mPlayer.stop();
	}
	
}
