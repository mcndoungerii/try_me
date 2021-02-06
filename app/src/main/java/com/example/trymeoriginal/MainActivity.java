package com.example.trymeoriginal;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View windowView;
    private Button tryMeButton;
    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new int[]{Color.CYAN,Color.GREEN,Color.RED,Color.BLUE,Color.BLACK,Color.DKGRAY,Color.LTGRAY,Color.MAGENTA,Color.YELLOW};

        windowView = findViewById(R.id.windowViewID);



        tryMeButton = (Button) findViewById(R.id.tryMeButtonID);

        tryMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int colorLen = colors.length;

                Random random = new Random();
                int randomNum = random.nextInt(colorLen);
                windowView.setBackgroundColor(colors[randomNum]);

                //Listerning
                Log.d("Random No: ",String.valueOf(randomNum));
            }
        });
    }
}