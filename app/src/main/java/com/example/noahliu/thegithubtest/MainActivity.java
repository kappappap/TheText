package com.example.noahliu.thegithubtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        Button bt;
        TextView Sam;
        int Size = 50;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=(Button) findViewById(R.id.button);
        Sam = (TextView) findViewById(R.id.TeWeiLiu);

        btClick();

    }//onCreate

    public void onclickBt (View view){
//      Sam.setText(R.string.Theapp);
        Sam.setText("這不是APP");
        Sam.setTextSize(Size);

    }//onclickBt

    public void btClick(){
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("BT","1");
            }
        });
    }//btClick



}
