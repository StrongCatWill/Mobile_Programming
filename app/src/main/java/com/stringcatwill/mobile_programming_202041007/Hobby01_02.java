package com.stringcatwill.mobile_programming_202041007;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


public class Hobby01_02 extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hobby01_02);

                /*포스터 누르면 해당 작품의 코멘트가 담긴 팝업창 만들기
        적용 범위(mov_03~mov_08)
        참고한 웹페이지 (https://whddn528.tistory.com/11)
        * */

        //영화 카테고리 > 오만과 편견
        ImageView mov_03;
        mov_03 = (ImageView)findViewById(R.id.mov_03);
        mov_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mov_03_ad = new AlertDialog.Builder(Hobby01_02.this);

                mov_03_ad.setTitle("영화 [오만과 편견]");
                mov_03_ad.setMessage("설명을 적어라 오타쿠");
                final EditText et = new EditText(Hobby01_02.this);
                mov_03_ad.setView(et);

                //닫기 버튼 만들기
                mov_03_ad.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
            }
        });


        //영화 카테고리 > 스타워즈 시스의 복수
        ImageView mov_04;
        mov_04 = (ImageView)findViewById(R.id.mov_04);
        mov_04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mov_04_ad = new AlertDialog.Builder(Hobby01_02.this);

                mov_04_ad.setTitle("영화 [스타워즈 ep3 시스의 복수]");
                mov_04_ad.setMessage("설명을 적어라 오타쿠");
                final EditText et = new EditText(Hobby01_02.this);
                mov_04_ad.setView(et);

                //닫기 버튼 만들기
                mov_04_ad.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
            }
        });


        //영화 카테고리 > 반지의 제왕 두 개의 탑
        ImageView mov_05;
        mov_05 = (ImageView)findViewById(R.id.mov_05);
        mov_05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mov_05_ad = new AlertDialog.Builder(Hobby01_02.this);

                mov_05_ad.setTitle("영화 [반지의 제왕 - 두 개의 탑]");
                mov_05_ad.setMessage("설명을 적어라 오타쿠");
                final EditText et = new EditText(Hobby01_02.this);
                mov_05_ad.setView(et);

                //닫기 버튼 만들기
                mov_05_ad.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
            }
        });

        
        //영화 카테고리 > 월플라워
        ImageView mov_06;
        mov_06 = (ImageView)findViewById(R.id.mov_06);
        mov_06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mov_06_ad = new AlertDialog.Builder(Hobby01_02.this);

                mov_06_ad.setTitle("영화 [월플라워]");
                mov_06_ad.setMessage("설명을 적어라 오타쿠");
                final EditText et = new EditText(Hobby01_02.this);
                mov_06_ad.setView(et);

                //닫기 버튼 만들기
                mov_06_ad.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
            }
        });


        //영화 카테고리 > 검은사제들
        ImageView mov_07;
        mov_07 = (ImageView)findViewById(R.id.mov_07);
        mov_07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mov_07_ad = new AlertDialog.Builder(Hobby01_02.this);

                mov_07_ad.setTitle("영화 [검은사제들]");
                mov_07_ad.setMessage("설명을 적어라 오타쿠");
                final EditText et = new EditText(Hobby01_02.this);
                mov_07_ad.setView(et);

                //닫기 버튼 만들기
                mov_07_ad.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
            }
        });


        //영화 카테고리 > 넷플릭스 앤
        ImageView mov_08;
        mov_08 = (ImageView)findViewById(R.id.mov_08);
        mov_08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mov_08_ad = new AlertDialog.Builder(Hobby01_02.this);

                mov_08_ad.setTitle("넷플릭스 드라마 [빨강머리 앤]");
                mov_08_ad.setMessage("설명을 적어라 오타쿠");
                final EditText et = new EditText(Hobby01_02.this);
                mov_08_ad.setView(et);

                //닫기 버튼 만들기
                mov_08_ad.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
            }
        });




        //다음 페이지로 이동하는 버튼 만들기.
        Button btn_backHome = (Button)findViewById(R.id.btn_backHome);
        btn_backHome.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //메인 화면으로 이동.
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
