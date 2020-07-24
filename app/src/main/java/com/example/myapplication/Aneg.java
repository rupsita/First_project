package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class Aneg extends AppCompatActivity {
    TextView aneg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aneg);
        aneg= findViewById(R.id.anegb);

        aneg.setText("Around 8% of donors have A negative blood.\n" +
                "\n" +
                "In comparison, 30% of donors have A positive blood.\n"+"A negative red blood cells can be used to treat people with:\n" +
                "\n" +
                "A negative blood\n" +
                "A positive blood\n" +
                "AB positive blood\n" +
                "AB negative blood \n\nPeople with A negative blood can receive donations from:\n" +
                "\n" +
                "A negative donors\n" +
                "O negative donors\n\nAnyone can receive A negative platelets\n" +
                "\n" +
                "A negative red blood cells can be used to treat around 40% of the population.\n" +
                "\n" +
                "However, A negative platelets are particularly important because they can be given to people from all blood groups. That’s why A negative platelets are called the ‘universal platelet type’.");
        aneg.setTextColor(Color.WHITE);
    }
}