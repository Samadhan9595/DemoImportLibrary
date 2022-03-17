package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.chatlibrary.ChatActivity;

public class MainActivity extends AppCompatActivity {

    TextView hello_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello_tv=(TextView)findViewById(R.id.hello_tv);
        hello_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, ChatActivity.class);
                startActivity(intent);
            }
        });
    }
}