package com.stringcatwill.mobile_programming_202041007;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);

        //조이스틱 클릭시, id 해당 버튼을 길게 클릭하면 창으로 이동한다는 메시지 띄우고 길게 클릭하면 화면 넘어가게
        ImageView btn_to_id = (ImageView) findViewById(R.id.btn_to_id);
        btn_to_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast btn_to_id_toast = Toast.makeText(getApplicationContext(), "조이스틱을 길게 클릭하면 간단 소개 창으로 이동합니다", Toast.LENGTH_LONG);
                btn_to_id_toast.setGravity(Gravity.TOP, Gravity.CENTER, 444);
            }
        });
        btn_to_id.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ID_Card.class);
                startActivity(intent);
                return true;
            }
        });



        //고도, 위도 계기판 클릭 > 해당 버튼을 길게 클릭하면 다음 화면으로 이동한다는 메시지 띄우고 길게 클릭하면 화면 이동.
        ImageView btn_to_hobby01 = (ImageView)findViewById(R.id.btn_to_hobby01);
        btn_to_hobby01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast btn_to_id_toast = Toast.makeText(getApplicationContext(), "고도, 위도 계기판을 길게 클릭하면 취미생활1로 이동합니다", Toast.LENGTH_LONG);
                btn_to_id_toast.setGravity(Gravity.TOP, Gravity.CENTER, 350);
            }
        });

        btn_to_hobby01.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Hobby01.class);
                startActivity(intent);
                return true;
            }
        });



        //기체 상태 모니터링 계기판 클릭 > 해당 버튼을 길게 클릭하면 다음 화면으로 이동한다는 메시지 띄우고 길게 클릭하면 화면 이동.
        ImageView btn_to_hobby02 = (ImageView)findViewById(R.id.btn_to_hobby02);
        btn_to_hobby02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast btn_to_id_toast = Toast.makeText(getApplicationContext(), "기체 상태 모니터링 계기판을 길게 클릭하면 취미생활2로 이동합니다", Toast.LENGTH_LONG);
                btn_to_id_toast.setGravity(Gravity.TOP, Gravity.CENTER, 350);
            }
        });

        btn_to_hobby02.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Hobby02.class);
                startActivity(intent);
                return true;
            }
        });



        //조준점 창 클릭 > 해당 버튼을 길게 클릭하면 다음 화면으로 이동한다는 메시지 띄우고 길게 클릭하면 화면 이동
        ImageView btn_to_vision = (ImageView)findViewById(R.id.btn_to_vision);
        btn_to_vision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast btn_to_id_toast = Toast.makeText(getApplicationContext(), "조준창을 길게 클릭하면 비전 소개 페이지로 이동합니다", Toast.LENGTH_LONG);
                btn_to_id_toast.setGravity(Gravity.TOP, Gravity.CENTER, 20);
            }
        });

        btn_to_vision.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Vision.class);
                startActivity(intent);
                return true;
            }
        });


        //튠 조율 계기판 클릭 > 해당 버튼을 길게 클릭하면 다음 화면으로 이동한다는 메시지 띄우고 길게 클릭하면 화면 이동
        ImageView btn_to_history = (ImageView)findViewById(R.id.btn_to_history);
        btn_to_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast btn_to_id_toast = Toast.makeText(getApplicationContext(), "튠 계기판을 길게 클릭하면 약력 소개 페이지로 이동합니다", Toast.LENGTH_LONG);
                btn_to_id_toast.setGravity(Gravity.TOP, Gravity.CENTER, 140);
            }
        });

        btn_to_history.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(getApplicationContext(), History.class);
                startActivity(intent);
                return true;
            }
        });
    }
}
