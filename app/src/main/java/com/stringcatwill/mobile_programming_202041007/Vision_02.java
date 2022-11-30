package com.stringcatwill.mobile_programming_202041007;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Vision_02 extends AppCompatActivity {

    Button btn_to_Github;
    Button btn_to_Main;
    Intent toGit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vision_02);

        //개인 깃허브로 연결하는 버튼
        btn_to_Github = findViewById(R.id.btn_to_Github);
        btn_to_Github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toGit.setData(Uri.parse("https://github.com/StrongCatWill"));
                startActivity(toGit);
            }
        });

        //메인 화면으로 이동하는 버튼
        btn_to_Main = findViewById(R.id.btn_to_Main);
        btn_to_Main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
