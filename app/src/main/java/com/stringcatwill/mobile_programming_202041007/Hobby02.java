package com.stringcatwill.mobile_programming_202041007;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Hobby02 extends AppCompatActivity {


    //스타트, 스탑 버튼 먼저 꺼내놓기.
    Button btn_singing_start;
    Button btn_singing_stop;

    Button btn_bass_start;
    Button btn_bass_stop;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hobby02);

        //노래
        btn_singing_start = findViewById(R.id.btn_singing_start);
        btn_singing_stop = findViewById(R.id.btn_singing_stop);


        MediaPlayer mp = new MediaPlayer();

        //재생 버튼
        btn_singing_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Media 객체 할당
                try{
                    mp.setDataSource("/res/raw/bass.mp3");
                    mp.prepare();
                    mp.start();
                }catch(Exception e){e.printStackTrace();}

            }
        });

        btn_singing_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    mp.setDataSource("/res/raw/bass.mp3");
                    mp.prepare();
                    mp.stop();
                }catch(Exception e){e.printStackTrace();}
            }
        });


        //베이스
        btn_bass_start = findViewById(R.id.btn_bass_start);
        btn_bass_stop = findViewById(R.id.btn_bass_stop);

        btn_bass_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Media 객체 할당
                try{
                    mp.setDataSource("/res/raw/bass.mp3");
                    mp.prepare();
                    mp.start();
                }catch(Exception e){e.printStackTrace();}
            }
        });

        btn_bass_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Media 객체 할당
                try{
                    mp.setDataSource("/res/raw/bass.mp3");
                    mp.prepare();
                    mp.stop();
                }catch(Exception e){e.printStackTrace();}
            }
        });
    }
}
