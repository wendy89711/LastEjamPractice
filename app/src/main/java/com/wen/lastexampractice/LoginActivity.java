package com.wen.lastexampractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText edUername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
   /* public void moo() {
        Intent intent = new Intent(this,MainActivity.class);
        SharedPreferences setting = getSharedPreferences("test",MODE_PRIVATE);
        setting.edit()
                .putString("user",edUername.getText().toString())
                .commit();
        startActivityForResult(intent,10);
    }*/
    public void next1(View view) {
        edUername = findViewById(R.id.ed_name);
        String name = edUername.getText().toString();
        if (!TextUtils.isEmpty(edUername.getText().toString())) {
            SharedPreferences setting = getSharedPreferences("test",MODE_PRIVATE);
            setting.edit()
                    .putString("user",edUername.getText().toString())
                    .commit();
            Log.d("RESULT_USERNAME",name);
            setResult(RESULT_OK);
            finish();
            //moo();
        }
    }

}
