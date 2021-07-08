package com.example.sharepreference_77;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_spf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //绑定控件
        initview();

        //点击跳转
        initintent();


    }

    private void initintent() {
        btn_spf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SharePerfence.class);
                startActivity(intent);
            }
        });
    }

    private void initview() {
        btn_spf = findViewById(R.id.btn_spf);
    }
}