package com.example.Bloodpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class Bpos extends AppCompatActivity {
    TextView bpos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bpos);
        bpos = findViewById(R.id.bposb);
        bpos.setText("About 9% of the population have B positive blood.\n" +
                "B positive red blood cells can be given to both B positive and AB positive patients.  \n" +
                "B positive patients can receive blood from B positive, B negative, O positive and O negative donors.\nB positive is an important blood type for treating people with sickle cell disease and thalassemia who need regular transfusions.\n" +
                "\n" +
                "These conditions affect South Asian and Black communities where B positive blood is more common.\n" +
                "\n" +
                "There is currently a very high demand for B positive donations with the subtype Ro.\n\nThe society also focuses on the negative side of the people with B blood type, even though they have a good side too. But as a result of this, they tend to be loners. Positive personality traits: Curious, strong, relaxed, creative, adventurous, passionate, cheerful, active and outgoing");
        bpos.setTextColor(Color.WHITE);
    }
}