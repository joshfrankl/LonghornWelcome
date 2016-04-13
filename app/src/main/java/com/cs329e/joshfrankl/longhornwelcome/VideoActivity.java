package com.cs329e.joshfrankl.longhornwelcome;

import android.app.Activity;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

/**
 * Created by scmuncey on 4/12/16.
 */

//Implement SurfaceHolder interface to Play video
//Implement this interface to receive information about changes to the surface
public class VideoActivity extends Activity implements SurfaceHolder.Callback{


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        Button buttonPlayVideo = (Button)findViewById(R.id.playvideoplayer);

        getWindow().setFormat(PixelFormat.UNKNOWN);


        buttonPlayVideo.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {

                // VideoView reference see main.xml
                VideoView mVideoView = (VideoView)findViewById(R.id.videoview);

                String uriPath = "android.resource://com.cs329e.joshfrankl.longhornwelcome/"+R.raw.video;

                // Creates a Uri which parses the given encoded URI string
                Uri uri = Uri.parse(uriPath);

                // set the video URO
                mVideoView.setVideoURI(uri);
                // start the video
                mVideoView.requestFocus();
                mVideoView.start();


            }});




    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width,
                               int height) {
        // TODO Auto-generated method stub

    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        // TODO Auto-generated method stub

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        // TODO Auto-generated method stub

    }
}
