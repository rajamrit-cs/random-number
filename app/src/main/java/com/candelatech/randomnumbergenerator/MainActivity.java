package com.candelatech.randomnumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public Button button;
    public TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.random);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random_num = random();
                String rr = String.valueOf(random_num);
                textView.setText(rr);
            }
        });

    }

    public int random(){
        Random r = new Random();
//        range 1 to 100
        int num = r.nextInt(100) + 1;

//        range 1 to 6
//        Random random = new Random();
//        int number = random.nextInt(6) + 1;
        return num;
    }
}