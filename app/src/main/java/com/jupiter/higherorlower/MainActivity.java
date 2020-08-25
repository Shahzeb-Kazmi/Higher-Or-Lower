package com.jupiter.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int ans;

    public void guessActionPerformed(View view){

        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);

        int inputNo = Integer.parseInt(editText.getText().toString());

        if (inputNo == ans){
            Toast.makeText(this, "You guessed correctly!", Toast.LENGTH_LONG).show();
        }

        else if(inputNo < ans){
            Toast.makeText(this, "Go Higher!", Toast.LENGTH_LONG).show();
        }

        else{
            Toast.makeText(this, "Go Lower!", Toast.LENGTH_LONG).show();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        ans = rand.nextInt(20) + 1;
    }
}