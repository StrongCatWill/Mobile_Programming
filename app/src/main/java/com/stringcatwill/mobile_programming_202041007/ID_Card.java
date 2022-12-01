package com.stringcatwill.mobile_programming_202041007;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ID_Card extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.id_card);

        //tv_callsign 클릭하면 콜싸인 탄생 비화 띄워주기
        TextView tv_callsign = (TextView)findViewById(R.id.tv_callsign);
        tv_callsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder tv_callsign_ad = new AlertDialog.Builder(ID_Card.this);

                tv_callsign_ad.setTitle("콜싸인 404");
                tv_callsign_ad.setMessage("탑건을 보고 친구들과 서로 콜싸인을 지어주던 중, \n" +
                        "쟤는 로봇같이 똑 부러지는데 어느 순간 혼자 오류날 때가 있다며 \n" +
                        "Page Not Found, 404로 콜싸인이 붙여짐. \n" +
                        "현실의 콜싸인은 좌표값과의 혼돈을 방지하기 위해 숫자를 사용하지 않지만 저는 파일럿이 아닌 엔지니어기에 괜찮습니다");

                final EditText et = new EditText(ID_Card.this);
                tv_callsign_ad.setView(et);

                //닫기 버튼 만들기
                tv_callsign_ad.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
            }
        });

        //BackEnd 클릭하면 지금 상황 설명하고 비전 페이지로 인텐트
        TextView tv_backend = (TextView)findViewById(R.id.tv_backend);
        tv_backend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder tv_backend_ad = new AlertDialog.Builder(ID_Card.this);

                tv_backend_ad.setTitle("포지션");
                tv_backend_ad.setMessage("학교를 다니면서는 네트워크와 JAVA, 리눅스를 공부하면서 소위 말하는 백엔드 개발자 테크트리를 타고 있습니다." +
                        "\n 장기적으로 희망하는 포지션을 보고 싶다면 아래 이동 버튼을 누르세요.");
                final EditText et = new EditText(ID_Card.this);
                tv_backend_ad.setView(et);


                //이동 버튼
                tv_backend_ad.setPositiveButton("이동", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(), Vision_01.class);
                        startActivity(intent);
                    }
                });

                //닫기 버튼 만들기
                tv_backend_ad.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
            }
        });


    }
}
