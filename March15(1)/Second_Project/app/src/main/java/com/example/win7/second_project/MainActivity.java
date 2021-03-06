package com.example.win7.second_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn);
        /*btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ImageView image = (ImageView) findViewById(R.id.image);
        counter++;
        switch(counter){
            case 1: image.setImageResource(R.drawable.pic1);
                    break;
            case 2: image.setImageResource(R.drawable.pic2);
                    break;
            case 3: image.setImageResource(R.drawable.pic3);
                    break;
        }
        if (counter == 3){
            counter = 0;
        }
    }


}
