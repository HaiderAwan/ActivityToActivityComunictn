package com.example.aaa.getdatafromintent;

import android.content.Intent;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView = (TextView) findViewById(R.id.tvsecondactivity);

        Intent it = getIntent();
        String str1 = it.getStringExtra("firstname");
        String str2 = it.getStringExtra("secondname");
        textView.setText(""+str1+""+str2+"");
    }
}
