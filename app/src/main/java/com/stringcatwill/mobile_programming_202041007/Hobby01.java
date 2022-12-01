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

import androidx.appcompat.app.AppCompatActivity;


public class Hobby01 extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hobby01);

        /*포스터 누르면 해당 작품의 코멘트가 담긴 팝업창 만들기
        적용 범위(musical_01~mov_02)
        참고한 웹페이지 (https://whddn528.tistory.com/11)
        * */


        //클릭 이벤트를 달 이미지 변수 이름은 id와 통일.
        //뮤지컬 카테고리 > 브라더스 카라마죠프 창.
        ImageView musical_01;
        musical_01 = (ImageView)findViewById(R.id.musical_01);
        musical_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder musical_01_ad = new AlertDialog.Builder(Hobby01.this);

                musical_01_ad.setTitle("뮤지컬 [브라더스 까라마죠프]");
                musical_01_ad.setMessage("카라마죠프의 형제들을 원작으로 한 뮤지컬. \n 서술자 알료샤를 앞세운" +
                        "원작 소설과 달리 이반과 스메르자코프의 갈등 관계를 주로 다루며, 성가를 변형한 넘버가 도드라짐.");
                final EditText et = new EditText(Hobby01.this);
                musical_01_ad.setView(et);

                //닫기 버튼 만들기
                musical_01_ad.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
            }
        });



        //뮤지컬 카테고리 > 배니싱
        ImageView musical_02;
        musical_02 = (ImageView)findViewById(R.id.musical_02);
        musical_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder musical_02_ad = new AlertDialog.Builder(Hobby01.this);

                musical_02_ad.setTitle("뮤지컬 [배니싱]");
                musical_02_ad.setMessage("경성을 배경으로 하는 남성 3인 뮤지컬\n" +
                        "최근에 제일 많이 본 작품." +
                        "핵심 대사\n"+
                        "'피부로 나뉘어 있는 한 우리는 영원히 타인의 감각을 이해할 수 없을 것이다.\n" +
                        "피부를 뚫고, 그와 내가 하나의 동질임을 깨달았을 때, 비로소 이해가 시작된다.' \n" +
                        "의학도와 우생학을 연구하는 친일파, 벰파이어가 등장하지만 본질은 이해에 관한 극." +
                        "특히 무대가 아름답고 굉장히 극적임.");
                final EditText et = new EditText(Hobby01.this);
                musical_02_ad.setView(et);

                //닫기 버튼 만들기
                musical_02_ad.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
            }
        });

        //뮤지컬 카테고리 > 땡큐 베리 스트로베리
        ImageView musical_03;
        musical_03 = (ImageView)findViewById(R.id.musical_03);
        musical_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder musical_03_ad = new AlertDialog.Builder(Hobby01.this);

                musical_03_ad.setTitle("뮤지컬 [땡큐 베리 스트로베리]");
                musical_03_ad.setMessage("힐링 뮤지컬. 곧 철거 예정인 폐허에 혼자 사는 할머니에게 휴머노이드 로봇이 배달되는 것으로 시작. \n" +
                        "삶의 아름다움을 세련되게 그려낸 작품이라 다른 뮤지컬인 [전설의 리틀 농구단]과 함께 꼽는 건강한 뮤지컬.");
                final EditText et = new EditText(Hobby01.this);
                musical_03_ad.setView(et);

                //닫기 버튼 만들기
                musical_03_ad.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
            }
        });

        //뮤지컬 카테고리 > 지저스 크라이스트 슈퍼스타
        ImageView musical_04;
        musical_04 = (ImageView)findViewById(R.id.musical_04);
        musical_04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder musical_04_ad = new AlertDialog.Builder(Hobby01.this);

                musical_04_ad.setTitle("뮤지컬 [지저스 크라이스트 슈퍼스타]");
                musical_04_ad.setMessage("가룟유다의 시선에서 본 예수의 이야기. 성경 서술을 기점으로는 예수가 부활하는 구절 직전까지만 진행됨.\n" +
                        "겟세마네가 제일 유명하지만, 아레나 버전의 지저스 크라이스트 슈퍼스타를 본 터라, 활력 넘치는 넘버와 무대 위에 있는 라이브 세션을 매우 좋아한다." +
                        "마침 지금 한국버전 지저스 크라이스트 슈퍼스타가 공연중이나, 락 정서를 100% 살리는 아레나 버전을 제일로 꼽음."
                );
                final EditText et = new EditText(Hobby01.this);
                musical_04_ad.setView(et);

                //닫기 버튼 만들기
                musical_04_ad.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
            }
        });
        
        //영화 카테고리 > 캡틴 아메리카 윈터솔저
        ImageView mov_01;
        mov_01 = (ImageView)findViewById(R.id.mov_01);
        mov_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mov_01_ad = new AlertDialog.Builder(Hobby01.this);

                mov_01_ad.setTitle("영화 [캡틴 아메리카 윈터솔저]");
                mov_01_ad.setMessage("마블 시리즈 중에서 제일 좋아하는 영화다. 짧은 호흡의 액션과 스파이들 간의 심리전이 압도적임\n" +
                        "CG에 담근 마블 페이즈가 등장하기 전, 현실적인 액션을 담은 영상이 정말 아름답다.");
                final EditText et = new EditText(Hobby01.this);
                mov_01_ad.setView(et);

                //닫기 버튼 만들기
                mov_01_ad.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
            }
        });


        //영화 카테고리 > 포레스트 검프
        ImageView mov_02;
        mov_02 = (ImageView)findViewById(R.id.mov_02);
        mov_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mov_02_ad = new AlertDialog.Builder(Hobby01.this);

                mov_02_ad.setTitle("영화 [포레스트 검프]");
                mov_02_ad.setMessage("주기적으로 관람하는 영화. 힐링이 필요할 땐 깃털에 날리는 바람과 같이 살아온 포레스트 검프의 이야기를 본다.\n" +
                        "입체적인 주변 인물들이 자연스럽게 시눕시스에 끼어드는 구조미를 특히 좋아함.");
                final EditText et = new EditText(Hobby01.this);
                mov_02_ad.setView(et);

                //닫기 버튼 만들기
                mov_02_ad.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
            }
        });


        //다음 페이지로 이동하는 버튼 만들기.
        Button btn_nextPage = (Button)findViewById(R.id.btn_nextPage);
        btn_nextPage.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //화면 전환
                Intent intent = new Intent(getApplicationContext(), Hobby01_02.class);
                startActivity(intent);
            }
        });
    }
}
