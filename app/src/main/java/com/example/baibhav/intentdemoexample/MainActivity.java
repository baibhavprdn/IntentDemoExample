package com.example.baibhav.intentdemoexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText text2send_et;
    Button gotosecond_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text2send_et=(EditText) findViewById(R.id.et_text2send);


        gotosecond_btn=(Button) findViewById(R.id.btn_gotosecond);
        gotosecond_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent2second=new Intent(this,Main2Activity.class);
        String msg=text2send_et.getText().toString();
        intent2second.putExtra("messagefrom1",msg);

        startActivity(intent2second);
    }
}
