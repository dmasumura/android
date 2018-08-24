package com.example.android.sr.myomikujiapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void getOmikuji(View view){
        // TextViewの取得
        TextView tv = (TextView) findViewById(R.id.myTextView);
        String[] results = {
                "はじめしゃちょー",
                "hikakin",
                "水溜まりボンド",
                "ラファエル",
                "PDS",
                "マスムラダイキ"
        };
        // 乱数の生成
        Random randomGenerator = new Random();
        int num = randomGenerator.nextInt(results.length);
        // 結果の表示
        tv.setText(results[num]);
        /*
        Color.RED
        Color.rgb(255,0,0)
        Color.argb(255,0,0)
        */
        if (num == 0) {
            tv.setTextColor(Color.RED);
        }else{
            tv.setTextColor(Color.argb(150,150,0,0));
        }
    }
}
