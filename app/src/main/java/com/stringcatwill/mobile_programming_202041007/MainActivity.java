package com.stringcatwill.mobile_programming_202041007;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;

public class MainActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutpre);

        ImageView barcode = (ImageView) findViewById(R.id.image_barcode);   //바코드 이미지 회전시키려는 시도.
        int degree = 90;
        barcode.setImageBitmap(rotateImage(BitmapFactory.decodeResource(getResources(), R.drawable.barcode), degree));

        TextView backend = (TextView)findViewById(R.id.tv_backend);
        backend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public Bitmap rotateImage(Bitmap src, float degree){

        //이미지 회전시키는 함수.
        Matrix matrix = new Matrix();
        matrix.postRotate(degree);

        return Bitmap.createBitmap(src, 0, 0, src.getWidth(), src.getHeight(), matrix, true);
    }
}
