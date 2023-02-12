package org.me.gcu.backgroundchanger;

import static android.graphics.Color.BLUE;
import static android.graphics.Color.GREEN;
import static android.graphics.Color.MAGENTA;
import static android.graphics.Color.RED;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button redBtn, blueBtn, greenBtn;
    TextView colourSelection, redTxt, blueTxt, greenTxt, purpleTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redBtn = (Button)findViewById(R.id.redBtn);
        blueBtn = (Button)findViewById(R.id.blueBtn);
        greenBtn = (Button)findViewById(R.id.greenBtn);
        colourSelection = (TextView)findViewById(R.id.colourSelection);
        redTxt = (TextView)findViewById(R.id.redText);
        blueTxt = (TextView)findViewById(R.id.blueText);
        greenTxt = (TextView)findViewById(R.id.greenText);
        purpleTxt = (TextView)findViewById(R.id.purpleText);



        redBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colourSelection.setBackgroundColor(RED);
            }
        });

        blueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colourSelection.setBackgroundColor(BLUE);
            }
        });

        greenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colourSelection.setBackgroundColor(GREEN);
            }
        });

        redTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colourSelection.setBackgroundColor(RED);
            }
        });

        blueTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colourSelection.setBackgroundColor(BLUE);
            }
        });

        greenTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colourSelection.setBackgroundColor(GREEN);
            }
        });

        purpleTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colourSelection.setBackgroundColor(MAGENTA);
            }
        });

    }
}