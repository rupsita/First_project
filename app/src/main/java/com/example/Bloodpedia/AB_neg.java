package com.example.Bloodpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class AB_neg extends AppCompatActivity {
    TextView abNeg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_b_neg);
        abNeg = findViewById(R.id.abnegb);
        abNeg.setText("AB negative is the rarest blood type in the ABO blood group, accounting for just 1% of our blood donors.\n" +
                "\n" +
                "In total only 3% of donors belong to the AB blood group.\nYou can receive AB negative red blood cells if you are: \n" +
                "\n" +
                "AB negative\n" +
                "AB positive\n\nPeople with AB negative blood can receive donations from:\n" +
                "\n" +
                "AB negative donors\n" +
                "O negative donors\n" +
                "A negative donors\n" +
                "B negative donors\n\n" +
                "AB negative donations are extremely versatile, but because it is the rarest blood type finding new donors can be a challenge.\n" +
                "\n" +
                "Plasma from AB negative donations can help treat patients of all blood types, however fresh frozen plasma is only produced from male donations. This is because female donors (especially those who have been pregnant) can develop antibodies that, while no danger to themselves, can prove life threatening to patients transfused with their plasma."

        );
        abNeg.setTextColor(Color.WHITE);
    }
}