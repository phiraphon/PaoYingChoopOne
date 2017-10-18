package com.startitup.phiraphon.projectone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect imgItem
        final ImageView imgItem = (ImageView)findViewById(R.id.imgItem);

        //Connect btnHammer
        Button btnHammer = (Button)findViewById(R.id.btnHammer);
        //Click button show hammer image
        btnHammer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Show image hammer
                imgItem.setImageResource(R.drawable.hammer);
            }
        });

        //Connect btnScissors
        Button btnScissors = (Button)findViewById(R.id.btnScissors);
        //Click button show Scissors image
        btnScissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Show image scissors
                imgItem.setImageResource(R.drawable.scissors);
            }
        });

        //Connect btnPaper
        Button btnPaper = (Button)findViewById(R.id.btnPaper);
        //Click button show paper image
        btnPaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgItem.setImageResource(R.drawable.paper);
            }
        });

        //Connect btnRandom
        Button btnRandom = (Button)findViewById(R.id.btnRandom);
        //Click button show random image
        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create random class
                Random random = new Random();
                //Create number random
                int number = random.nextInt(3) + 1;
                //Random output for image
                if ( number == 1){
                    //if number is 1 show hammer image
                    imgItem.setImageResource(R.drawable.hammer);
                } else if ( number == 2 ){
                    //if number is 2 show scissors image
                    imgItem.setImageResource(R.drawable.scissors);
                }else if (number == 3){
                    //if number is 3 show paper image
                    imgItem.setImageResource(R.drawable.paper);
                }
            }
        });

        
    }
}
