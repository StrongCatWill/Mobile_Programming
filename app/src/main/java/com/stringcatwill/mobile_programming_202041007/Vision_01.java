package com.stringcatwill.mobile_programming_202041007;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Vision_01 extends AppCompatActivity {

    Button btn_vision_to_vision02;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vision);

        //버튼 눌리면 Vision_02 페이지로 이동
        btn_vision_to_vision02 = findViewById(R.id.btn_vision_to_vision02);
        btn_vision_to_vision02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Vision_02.class);
                startActivity(intent);
            }
        });
    }

}
