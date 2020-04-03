package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float v1,v2;
     TextView textView;
   Button clear,divide,add, subtract,multiply,equal;
    Button one ,two,three,four,five,six,seven,eight,nine,zero,point;
    boolean mAddition, mSubtract, mMultiplication, mDivision ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textview);
        clear=findViewById(R.id.bttncleartext);

        divide=findViewById(R.id.bttndivid);
        add=findViewById(R.id.bttnplus);
        subtract=findViewById(R.id.bttnminus);
        multiply=findViewById(R.id.bttnmulti);
        equal=findViewById(R.id.bttnequal);

        one=findViewById(R.id.bttn1);
        two=findViewById(R.id.bttn2);
        three=findViewById(R.id.bttn3);
        four=findViewById(R.id.bttn4);
        five=findViewById(R.id.bttn5);
        six=findViewById(R.id.bttn6);
        seven=findViewById(R.id.bttn7);
        eight=findViewById(R.id.bttn8);
        nine=findViewById(R.id.bttn9);
        zero=findViewById(R.id.bttnzero);
        point=findViewById(R.id.bttnpoint);



        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() +"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() +"3" );
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+ "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"9");
            }
        });
       zero.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               textView.setText(textView.getText()+"0");
           }
       });
       point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+".");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(null);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textView == null)
                {
                    textView.setText("");
                }
                else
                {
                    v1=Float.parseFloat(textView.getText() +"");
                    mAddition=true;
                    textView.setText(null);
                }

            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=Float.parseFloat(textView.getText()+ " ");
                mSubtract=true;
                textView.setText(null);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=Float.parseFloat(textView.getText() +" ");
                mMultiplication=true;
                textView.setText(null);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=Float.parseFloat(textView.getText()+ "");
                mDivision=true;
                textView.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                v2=Float.parseFloat(textView.getText()+ "");

                if (mAddition ==true)
                {
                    textView.setText(v1+v2 + "");
                    mAddition=false;
                }
                if (mSubtract==true)
                {
                    textView.setText(v1-v2 + "");
                    mSubtract=false;
                }
                if (mMultiplication==true)
                {
                    textView.setText(v1*v2 +"");
                    mMultiplication=false;
                }
                if (mDivision==true)
                {
                    textView.setText(v1/v2+"");
                    mDivision=false;
                }

            }
        });

    }

}
