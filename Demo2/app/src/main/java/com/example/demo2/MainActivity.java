package com.example.demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText1,editText2;
    Button button,button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text);
//        textView.setText("Good Morning");
        Toast.makeText(this, "Hello there!!", Toast.LENGTH_SHORT).show();
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int sum=Integer.parseInt(editText1.getText().toString())+Integer.parseInt(editText2.getText().toString());
                textView.setText("The sum of the numbers is "+sum);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sub=Math.abs(Integer.parseInt(editText1.getText().toString())-Integer.parseInt(editText2.getText().toString()));
                textView.setText("The difference between the numbers is "+sub);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int mul=Integer.parseInt(editText1.getText().toString())*Integer.parseInt(editText2.getText().toString());
                textView.setText("The product of the numbers is "+mul);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText2.getText().toString().equals("0"))
                {
                    Toast.makeText(MainActivity.this, "Invalid Numbers", Toast.LENGTH_SHORT).show();
                }
                else{
                    int div=Integer.parseInt(editText1.getText().toString())/Integer.parseInt(editText2.getText().toString());
                    textView.setText("The Division result of the numbers is "+div);
                }
            }
        });
    }

}