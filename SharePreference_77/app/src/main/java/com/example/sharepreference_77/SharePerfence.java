package com.example.sharepreference_77;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SharePerfence extends AppCompatActivity {
    private SharedPreferences sp;
    private EditText edt_account,edt_password;
    private Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        //绑定控件
        initview();

        //登陆
        initlogin();

    }

    private void initlogin() {
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account = String.valueOf(edt_account.getText());
                String password = String.valueOf(edt_password.getText());
                if (account.equals("1322688717")&&password.equals("123456")){
                    Toast.makeText(SharePerfence.this,"登陆成功",Toast.LENGTH_SHORT).show();
                    sp = getSharedPreferences("confit",MODE_PRIVATE);
                    sp.edit().putString("account",account).apply();
                    sp.edit().putString("password",password).apply();
                    //获取shareperference中的账号密码
                    Log.e("TAG","account:"+sp.getString("account",""));
                    Log.e("TAG","password:"+sp.getString("password",""));

                }else {
                    Toast.makeText(SharePerfence.this,"账号密码有误",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void initview() {
        edt_account = findViewById(R.id.edt_account);
        edt_password = findViewById(R.id.edt_password);
        btn_login = findViewById(R.id.btn_login);
    }
}