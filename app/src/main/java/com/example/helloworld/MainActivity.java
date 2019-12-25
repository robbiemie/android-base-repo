package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView; // 声明组件
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = (Button) findViewById(R.id.btn_textview); // 强制类型转换
        mBtnTextView.setOnClickListener(new View.OnClickListener() { // 注册点击事件
            @Override
            public void onClick(View v) {
                // 跳转到 TextView 演示界面
                Intent intent = new Intent(MainActivity.this, TextViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
