package com.example.Bloodpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class Apos extends AppCompatActivity {
    TextView apb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apos);
        apb = findViewById(R.id.aposb);

        apb.setText("If your blood is A positive (A+), it means that your blood contains type-A antigens with the presence of a protein called the rhesus (Rh) factor. Antigens are markers on the surface of a blood cell.\n" +
                "\n" +
                "According to the American Red Cross, this is one of the most common blood types.While there is no scientific proof that blood types are associated with certain personality traits, it’s a persistent theory in Japanese culture known as “ketsuekigata.”\n" +
                "\n" +
                "According to those who believe this theory, these are the personality traits associated with the A+ blood type:\n" +
                "\n" +
                "tense\n" +
                "stubborn\n" +
                "earnest\n" +
                "responsible\n" +
                "patient\n" +
                "reserved\n" +
                "sensible\n" +
                "creative \n\n If you have type A blood, your parents had one of the following possible combinations of blood types:\n" +
                "\n" +
                "AB and AB\n" +
                "AB and B\n" +
                "AB and A\n" +
                "AB and O\n" +
                "A and B\n" +
                "A and A\n" +
                "O and A\n" +
                "For example, both parents are type AB, or one parent is type AB and the other type B.\n" +
                "\n" +
                "Parents with the following combinations of blood types couldn’t have a child with type A blood:\n" +
                "\n" +
                "B and B\n" +
                "O and B\n" +
                "O and O\n\nIndividuals with type A blood may be better suited to natural, vegetarian diets.\n" +
                "People with type A blood have been shown to have lower levels of stomach-acid than other blood types, so a meat-based diet may not be digested as easily as a vegetarian based one.\n" +
                "Research has suggested that certain blood types may be at risk of developing specific diseases or conditions.\n" +
                "People with type A blood also have a higher natural propensity for developing other diseases, such as cancer and diabetes." );

        apb.setTextColor(Color.WHITE);


    }
}