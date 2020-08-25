package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import static java.lang.Double.parseDouble;

public class SecondActivity extends AppCompatActivity {

    String num1,num2,calc;
    double total;
    TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        TextView textView1=findViewById(R.id.number1);
        TextView textView2=findViewById(R.id.number2);

        num1=intent.getExtras().getString("value1");
        num2=intent.getExtras().getString("value2");

        textView1.setText(num1);
        textView2.setText(num2);

        answer=findViewById(R.id.answer);
    }

    public void addCalc(View view){
        total = parseDouble(num1)+parseDouble(num2);
        calc=num1+" + "+num2+" = "+this.total;
        answer.setText(calc);
    }
    public void subCalc(View view){
        total = parseDouble(num1)-parseDouble(num2);
        calc=num1+" - "+num2+" = "+this.total;
        answer.setText(calc);
    }
    public void mulCalc(View view){
        total = parseDouble(num1)*parseDouble(num2);
        calc=num1+" * "+num2+" = "+this.total;
        answer.setText(calc);
    }
    public void divCalc(View view){
        total = parseDouble(num1)/parseDouble(num2);
        calc=num1+" / "+num2+" = "+this.total;
        answer.setText(calc);
    }
}