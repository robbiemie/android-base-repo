package com.example.android_base_repo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  // 声明 Button 组件
  private Button mBtnTextView;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    // 布局 res/layout/activity_main.xml
    setContentView(R.layout.activity_main);
    mBtnTextView = (Button) findViewById(R.id.btn_textView); // activity_main.xml 声明
    // 声明监听
    mBtnTextView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        // 跳转到 TextView Activity
//        Intent intent = new Intent(MainActivity.this, TextViewActivity.class);
        // 跳转到 WebView Activity
        Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
        startActivity(intent);
      }
    });
  }
}
