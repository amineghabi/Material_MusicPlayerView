package androgeek.material.musicplayer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import androgeek.material.library.MaterialMusicPlayerView;


public class MainActivity extends Activity {

    MaterialMusicPlayerView mpv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mpv = (MaterialMusicPlayerView) findViewById(R.id.mpv);
        mpv.setCoverURL("http://blog.slateafrique.com/tawa-fi-tunis/files/2012/11/Esperance_Sportive_de_Tunis_New_Logo_2012.jpg");

        mpv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mpv.isRotating())
                    mpv.stop();
                else
                    mpv.start();
            }
        });
    }

}
