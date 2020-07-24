package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class AB_pos extends AppCompatActivity {
    TextView abPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_b_pos);
        abPos = findViewById(R.id.abposb);
        abPos.setText("Just 2% of donors have AB positive blood making it one of the rarest blood types in the country.AB positive red blood cells can only be used to treat people with AB positive blood.People with AB positive blood can safely receive red blood cells from any blood type. This means that demand for AB positive red blood cells is at its lowest level in a decade.\nAlthough the need for AB positive red blood cells is falling, the demand for AB positive plasma hasn’t changed.\n" +
                "\n" +

                "Fresh frozen plasma is only produced from male donations.\n" +
                "\n" +
                "This is because female donors (especially those who have been pregnant) can develop antibodies that, while no danger to themselves, can prove life threatening to patients transfused with their plasma.\n" +
                "\n" +
                "We can generally meet the demand for frozen plasma and most red cells from our male donors, which is good news nowadays.\n" +
                "\n" +

                "\n" +
                " what makes AB+ different from the other blood types? AB+ blood has both A and B antigens at the surface of the red blood cells, while other blood groups (A and B) only have one, or lack them altogether (group O). Because of this unique combination, AB+ donors’ blood can only be given to others with AB+ blood. However, AB+ is the universal recipient blood type, meaning that patients with AB+ blood can receive blood from donors of any blood type if they require a transfusion.\n" +
                "\n" +
                "Antigens present in AB+ also play a vital role in plasma donations. While AB+ blood has both A and B antigens on the red blood cells, neither of the antigens are present in the plasma. This makes AB+ the universal plasma donor, meaning that AB+ plasma can be transfused into patients who have any other ABO blood type. The AB blood group is believed to be the newest blood type. The AB blood group is the result of the intermingling between Caucasian (commonly group A) and Mongolian (commonly group B) people. For these reasons, the AB blood group is found in low percentages throughout the European population, but appears more commonly within the sub-continent India.");
        abPos.setTextColor(Color.WHITE);
    }
}