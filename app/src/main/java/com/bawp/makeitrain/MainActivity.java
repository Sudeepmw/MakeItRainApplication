package com.bawp.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {
//    private Button showMoney;
//    private Button showTag;
   private int moneyCounter;
   private TextView moneyText;

  @Override
   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         moneyText = findViewById(R.id.money_text);
//        showMoney = findViewById(R.id.button_make_rain);
//        showTag = findViewById(R.id.button_show_tag);
//        showMoney.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("mytag", "onClick: Show Money ");
//            }
//        });
   }

    public void showMoney(View view){
        moneyCounter += 1000;

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();




     moneyText.setText(numberFormat.format(moneyCounter));




     switch (moneyCounter){
         case 10000:
             moneyText.setTextColor(getResources().getColor(R.color.myColor));
             break;

         case 20000:
             moneyText.setTextColor(Color.BLACK);
             break;

         case 21000:
             moneyText.setTextColor(Color.GRAY);
             break;
     }


  //      Log.d("mytag", "onClick: Show Money " +moneyCounter);
    }

    public void showTag(View view){

        Toast.makeText(getApplicationContext(), R.string.app_name,Toast.LENGTH_LONG)
                .show();


    }

}



