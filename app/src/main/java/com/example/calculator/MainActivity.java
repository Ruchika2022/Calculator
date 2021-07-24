package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDiv,
            buttonMul, button10, buttonC, buttonEqual,buttonmod;
    TextView Text1;
    float mValueOne, mValueTwo;

    boolean madd, msub, mmul, mdiv,mmod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.zerob);
        button1 = (Button) findViewById(R.id.oneb);
        button2 = (Button) findViewById(R.id.twob);
        button3 = (Button) findViewById(R.id.threeb);
        button4 = (Button) findViewById(R.id.fourb);
        button5 = (Button) findViewById(R.id.fiveb);
        button6 = (Button) findViewById(R.id.sixb);
        button7 = (Button) findViewById(R.id.sevenb);
        button8 = (Button) findViewById(R.id.eightb);
        button9 = (Button) findViewById(R.id.nineb);
        button10 = (Button) findViewById(R.id.dotb);
        buttonAdd = (Button) findViewById(R.id.plusb);
        buttonSub = (Button) findViewById(R.id.subb);
        buttonMul = (Button) findViewById(R.id.mulb);
        buttonDiv = (Button) findViewById(R.id.divb);
        buttonmod= (Button) findViewById(R.id.modb);
        buttonC = (Button) findViewById(R.id.acb);
        buttonEqual = (Button) findViewById(R.id.equalb);
        Text1 = (TextView) findViewById(R.id.txt);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text1.setText(Text1.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text1.setText(Text1.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text1.setText(Text1.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text1.setText(Text1.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text1.setText(Text1.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text1.setText(Text1.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text1.setText(Text1.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text1.setText(Text1.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text1.setText(Text1.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text1.setText(Text1.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Text1 == null) {
                    Text1.setText("");
                } else {
                    mValueOne = Float.parseFloat(Text1.getText() + "");
                    madd = true;
                    Text1.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(Text1.getText() + "");
                msub = true;
                Text1.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(Text1.getText() + "");
                mmul = true;
                Text1.setText(null);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(Text1.getText() + "");
                mdiv = true;
                Text1.setText(null);
            }
        });
        buttonmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(Text1.getText() + "");
                mmod = true;
                Text1.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(Text1.getText() + "");

                if (madd == true) {
                    Text1.setText(mValueOne + mValueTwo + "");
                    madd = false;
                }

                if (msub == true) {
                    Text1.setText(mValueOne - mValueTwo + "");
                    msub = false;
                }

                if (mmul == true) {
                    Text1.setText(mValueOne * mValueTwo + "");
                    mmul = false;
                }

                if (mdiv == true) {
                    Text1.setText(mValueOne / mValueTwo + "");
                    mdiv = false;
                }
                if (mmod == true) {
                    Text1.setText(mValueOne % mValueTwo + "");
                    mmod = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text1.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text1.setText(Text1.getText() + ".");
            }
        });

    }
}