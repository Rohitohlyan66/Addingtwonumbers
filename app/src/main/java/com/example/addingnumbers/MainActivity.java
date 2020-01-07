package com.example.addingnumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText num1,num2;
    TextView resulttext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.resultbtn);
        num1=(EditText)findViewById(R.id.number1);
        num2=(EditText)findViewById(R.id.number2);
        resulttext=(TextView)findViewById(R.id.resulttext);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add();
            }
        });
    }
public void add()
{
    double a=Double.parseDouble(num1.getText().toString());
    double b=Double.parseDouble(num2.getText().toString());
    double c=a+b;

    resulttext.setText(Double.toString(c));

}
}
