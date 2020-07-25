package com.example.Bloodpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class Bneg extends AppCompatActivity {
    TextView bneg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bneg);
        bneg = findViewById(R.id.bnegb);
        bneg.setText("B negative blood is one of the rarest blood types as just 2% of our blood donors have it.\n" +
                "\n" +
                "In comparison, 36% of donors have O positive blood which is the most common type.Around 1 in 8 people can receive red blood cells from B negative donors.\n" +
                "\n" +
                "B negative blood can help people who are:\n" +
                "\n" +
                "B negative\n" +
                "B positive\n" +
                "AB negative\n" +
                "AB positive\n\nB negative donors are immensely important to our lifesaving work.\n" +
                "\nB- is only found in 1 in every 61 people, making it extremely rare.\n" +
                        "Every two seconds, someone needs blood, so B- is in high demand constantly."
                );
        bneg.setTextColor(Color.WHITE);
    }
}