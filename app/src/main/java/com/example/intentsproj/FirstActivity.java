package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

   ArrayList<Double> arr=new ArrayList<>();
   String number1,number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void ok_button(View view){

        Intent intent=new Intent(this,SecondActivity.class);

        EditText editText1 = findViewById(R.id.number1);
        EditText editText2 = findViewById(R.id.number2);
        number1=editText1.getText().toString();
        number2=editText2.getText().toString();

        intent.putExtra("value1",number1);
        intent.putExtra("value2",number2);

        startActivity(intent);

        Context context = getApplicationContext();
        CharSequence message = "You just clicked the OK button";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();

    }
}