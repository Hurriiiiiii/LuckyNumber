package com.example.luckynumber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    TextView l1, l2;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        l1 = findViewById(R.id.luckynum_text);
        l2 = findViewById(R.id.lucky_num_text);
        b1 = findViewById(R.id.share_btn);

        Intent i = getIntent();

        String userName = i.getStringExtra("name");

        int randomnum = generateRandomNumber();

        l2.setText(""+randomnum);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareData(userName, randomnum);
            }
        });

    }

    public int generateRandomNumber(){
        Random random = new Random();

        int upp = 1000;

        int randomNum = random.nextInt(upp);

        return randomNum;

    }

    public void shareData (String username, int random){
        //implicit intent

        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_SUBJECT, username +"got lucky today");
        i.putExtra(Intent.EXTRA_TEXT, "Their lucky number is: "+random);

        startActivity(Intent.createChooser(i, "choose a platform"));
    }

}