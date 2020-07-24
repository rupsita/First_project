package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class Oneg extends AppCompatActivity {
    TextView oneg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneg);
        oneg = findViewById(R.id.onegb);
        oneg.setText("O negative is the most common blood type used for transfusions when the blood type is unknown.  This is why it is used most often in cases of trauma, emergency, surgery and any situation where blood type is unknown.\n \n O negative is the universal blood type.\n" +
                "O negative blood type can only receive O negative blood. \n \n" +
                "O negative donors who are CMV negative are known as Heroes for Babies at the Red Cross because it is the safest blood for transfusions for immune deficient newborns. \n" +
                "Only 7% of the population have O negative  blood. Due to the its versatility for transfusions, it is in high demand.  In an emergency, it is the blood product of choice. For example, just one car accident victim can require up to 100 units of O neg.  \n" +
                "O negative is the first blood supply to run out during a shortage due to its universality.");
        oneg.setTextColor(Color.WHITE);
    }
}