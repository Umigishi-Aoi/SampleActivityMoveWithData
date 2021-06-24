package com.zerokaraapp.sampleactivity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //画面1からインテントを取得
        Intent intent2 = getIntent();

        //インテントからテキストを取得
        String text2 = intent2.getStringExtra("input");

        //レイアウトからテキストビューを取得
        TextView textView = findViewById(R.id.tv);

        //テキストビューにテキストを設定
        textView.setText(text2);


        //レイアウトからボタンを取得
        Button button2 = findViewById(R.id.bt2);

        //ボタンクリックのリスナインスタンスを取得
        ButtonClickListener2 listener2 = new ButtonClickListener2();

        //ボタンにリスナを設定
        button2.setOnClickListener(listener2);
    }

    //ボタンクリック時のリスナクラスを設定
    private class ButtonClickListener2 implements View.OnClickListener{

        //クリックされたときの動作を定義するメソッドを定義
        @Override
        public void onClick(View view){
            //画面移動
            finish();
        }
    }
}