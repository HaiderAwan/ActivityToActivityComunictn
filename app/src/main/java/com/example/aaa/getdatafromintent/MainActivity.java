package com.example.aaa.getdatafromintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String First,Second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText first=(EditText)findViewById(R.id.edtfirst);
        EditText second=(EditText)findViewById(R.id.edtsecond);
        Button btn=(Button)findViewById(R.id.secondactivitybtn);
        First=first.getText().toString();
        Second=second.getText().toString();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("firstname",First);
                intent.putExtra("secondname",Second);
            startActivity(intent);
            }
        });
    }
}
