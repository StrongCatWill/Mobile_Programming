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
                mov_03_ad.setMessage("클래식은 영원하다는 말을 이 영화를 보고 이해했다. \n 영화 구석구석 신경쓴 태가 남. 로맨스 영화 중 제일 아끼는 작품.\n" +
                        "역시 주기적으로 돌려본다.");
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
                mov_04_ad.setMessage("루카스 필름이 디즈니에 넘어가기 전 나오는 연출과 영상을 특히 사랑한다. \n스타워즈에서 나오는 전투기, 드로이드 조형을 매우 좋아한다. \n" +
                        "트릴로지 1의 마지막을 장식하는 영화이니 만큼, 스토리 전개도 숨막히도록 벅차게 진행된다. 언제쯤 루카스가 만든 스타워즈를 사랑하지 않을 수 있을까. \n" +
                        "MAY THE FORCE BE WITH YOU");
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
                mov_05_ad.setMessage("선의 찬미를 주제로 잡은 영화 중 제일 아끼는 작품이다.\n" +
                        "헬름 협곡 전투, 로한의 기마대, 마지막 샘이 읊는 시까지 빠짐없이 아낀다.");
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
                mov_06_ad.setMessage("로건래먼, 엠마왓슨, 이제는 범죄자가 된 에즈라 밀러가 나오는 하이틴 무비\n" +
                        "미묘하고 또 우울한 정서를 정말 잘 담아냈다. 데위비드 보위의 음악이 배경음악으로 나오는 엔딩장면이 제일 유명하지만\n" +
                        "주인공 셋이 들려주는 모든 서사가 찬란해서 정말 지치는 날을 위해 아끼고 아겨두는 영화.");
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
                mov_07_ad.setMessage("이 영화로 한국 엑소시즘 장르의 서막을 열었다 해도 과언이 아니다. \n" +
                        "생의 찬미라는 주제를 선택하고 있으면서도, 한국 영화가 갖는 특유의 색감과 정서를 잘 담아냈다. \n" +
                        "인트로 장면을 특히 좋아한다. 사제복을 입은 강동원도.");
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
                mov_08_ad.setMessage("익히 아는 빨간머리 앤을 각색한 넷플릭스 오리지널 드라마. \n" +
                        "모든 장면이 따뜻하고 선하다. 주인공들이 겪는 성장통이 과하지도, 부족하지도 않게 담겨있고 \n" +
                        "원작이 갖는 시대적인 한계를 뛰어넘는 발상으로 보는 이로 하여금 사회의 다양한 문제를 다시 생각할 수 있게 만든다." +
                        "\n위의 모든 요소를 차치하고서라도, 십대를 다루는 드라마 중 자극적이지 않게 있는 그대로를 그려낸 따뜻한 드라마다." +
                        "\n날이 추워지면 꼭 생각난다.");
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
