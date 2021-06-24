package com.zerokaraapp.sampleactivity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //レイアウトからボタンを取得
        Button button1 = findViewById(R.id.bt1);

        //ボタンクリックのリスナインスタンスを取得
        ButtonClickListener1 listener1 = new ButtonClickListener1();

        //ボタンにリスナを設定
        button1.setOnClickListener(listener1);
    }

    //ボタンクリック時のリスナクラスを設定
    private class ButtonClickListener1 implements View.OnClickListener{

        //クリックされたときの動作を定義するメソッドを定義
        @Override
        public void onClick(View view){

            //画面移動のためのインテントを取得
            Intent intent1 = new Intent(MainActivity.this,MainActivity2.class);

            //レイアウトからEditTextのビューを取得
            EditText editText = findViewById(R.id.et);

            //EditTextのビューのテキストを取得
            String text = editText.getText().toString();

            //インテントにtextを保存する
            intent1.putExtra("input",text);

            //画面移動を指示
            startActivity(intent1);
        }
    }
}