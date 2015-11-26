package com.example.administrator.gesse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random r=new Random();
    private  int number1=r.nextInt(1000);

    private void guess(){
        EditText Etext=(EditText)findViewById(R.id.editText);
        int number2=Integer.parseInt(Etext.getText().toString());

        if (number1==number2){
            Toast.makeText(this," correct anser ",Toast.LENGTH_SHORT).show();
        }
        else if(number1-number2<5&&number1-number2>-5){
            Toast.makeText(this,"close to anser",Toast.LENGTH_SHORT).show();
        }
        else if (number2>number1+5){
            Toast.makeText(this,"greater than anser",Toast.LENGTH_SHORT).show();
        }
        else if(number2<number1-5){
            Toast.makeText(this,"smaller than anser",Toast.LENGTH_SHORT).show();
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guess();
            }
        });

    }
}
