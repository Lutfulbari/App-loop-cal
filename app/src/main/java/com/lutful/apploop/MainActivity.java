package com.lutful.apploop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    EditText edFrom, edto;
    Button clickButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edFrom = findViewById(R.id.edFrom);
        edto = findViewById(R.id.edto);
        clickButton = findViewById(R.id.clickButton);

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvDisplay.setText("leap years are:\n" );

                int initValue = Integer.parseInt(edFrom.getText().toString());

                int targetValue = Integer.parseInt(edto.getText().toString());

            //    for (int x=initValue; x<=targetValue; x++){

                for (int year=initValue; year<=targetValue; year++){

                    ///  if (x%2==0) tvDisplay.append(" "+x);

                if ((year%400==0) || (year%4==0 && year%100!=0)){

                    tvDisplay.append("" +year);

                    }

                }


            }
        });



    }
}