package com.example.baibhav.intentdemoexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {


    Button gotofirst_btn;
    TextView textfromone_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textfromone_tv=(TextView) findViewById(R.id.tv_textfromone);

        gotofirst_btn=(Button) findViewById(R.id.btn_gotofirst);
        gotofirst_btn.setOnClickListener(this);

        Bundle firstactdata=getIntent().getExtras();
        if(firstactdata==null) {
            return;
        }

        String msgfrm1=firstactdata.getString("messagefrom1");
        textfromone_tv.setText(msgfrm1);



    }

    @Override
    public void onClick(View v) {
        Intent  intent2first=new Intent(this,MainActivity.class);


        startActivity(intent2first);
    }
}
