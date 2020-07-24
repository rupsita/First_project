package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class Opos extends AppCompatActivity {
    TextView opos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opos);
        opos = findViewById(R.id.oposb);
        opos.setText("Type O positive blood is given to patients more than any other blood type, which is why it’s considered the most needed blood type.\n" +
                "\n38% of the population has O positive blood, making it the most common blood type.\n" +
                "O positive red blood cells are not universally compatible to all types, but they are compatible to any red blood cells that are positive (A+, B+, O+, AB+).\n" +
                "Over 80% of the population has a positive blood type and can receive O positive blood. That’s another reason it’s in such high demand.\n" +
                "\nIn major traumas with massive blood loss, many hospitals transfuse O positive blood, even when the patient’s blood type is unknown. The risk of reaction is much lower in ongoing blood loss situations and O positive is more available than O negative. Type O positive blood is critical in trauma care.\n" +
                "\nThose with O positive blood can only receive transfusions from O positive or O negative blood types. \n" +
                "Type O positive blood is one of the first to run out during a shortage due to its high demand.\n\nThose with type O blood should choose high-protein foods and eat lots of meat, vegetables, fish, and fruit but limit grains, beans, and legumes. To lose weight, seafood, kelp, red meat, broccoli, spinach, and olive oil are best; wheat, corn, and dairy are to be avoided. ");
        opos.setTextColor(Color.WHITE);
    }
}