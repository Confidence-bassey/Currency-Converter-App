package com.confidenceb.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){
        Log.i("Info","Button Clicked");
        EditText editText = (EditText)findViewById(R.id.editText);
        String amtInNaira = editText.getText().toString();
        double amtInNairaD = Double.parseDouble(amtInNaira);
        double amtInDollar = amtInNairaD * 415.92;
        String amtInDollarString = String.format("%2f",amtInDollar);
        Log.i("Amount in dollar", amtInDollarString);
        Toast.makeText(this,"$"+ amtInNairaD+ " is" +" ₦"+ amtInDollarString, Toast.LENGTH_LONG).show();

    }


    public void convertCurrencyToDollar(View view){
        Log.i("Info","Button Clicked");
        EditText editText = (EditText)findViewById(R.id.editText);
        String amtInDollar = editText.getText().toString();
        double amtInDollarD = Double.parseDouble(amtInDollar);
        double amtInNaira = amtInDollarD / 415.92;
        String amtInNairaString = Double.toString(amtInNaira);
        Log.i("Amount in Naira", amtInNairaString);
        Toast.makeText(this,"₦"+ amtInDollarD+ " is" +" $"+ amtInNairaString, Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* Button btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertCurrency();
            }
        });*/
    }
}