package com.example.Bloodpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class search extends AppCompatActivity {
     SearchView srch;
     ListView mylist;
     ArrayList<String>  arlist = new ArrayList<>();
     ArrayAdapter<String> adapt;
     ImageView img;
     ImageView logout;
     TextView location;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        img = findViewById(R.id.image_phn);
        logout = findViewById(R.id.power);
        srch = findViewById(R.id.srch);
        location = findViewById(R.id.loc);
        mylist = findViewById(R.id.lstvw);
        arlist.add("A+ve");
        arlist.add("A-ve");
        arlist.add("B+ve");
        arlist.add("B-ve");
        arlist.add("O+ve");
        arlist.add("O-ve");
        arlist.add("AB+ve");
        arlist.add("AB-ve");


        adapt = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arlist);
        mylist.setAdapter(adapt);
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                          @Override
                                          public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                              if (i == 0) {
                                                  Intent intent= new Intent(search.this,Apos.class);

                                                  startActivity(intent);
                                              }
                                              if(i == 1)
                                              {
                                                  Intent intent= new Intent(search.this,Aneg.class);

                                                  startActivity(intent);
                                              }
                                              if (i == 2)
                                              {
                                                  Intent intent= new Intent(search.this,Bpos.class);

                                                  startActivity(intent);
                                              }
                                              if(i == 3)
                                              {
                                                  Intent intent= new Intent(search.this,Bneg.class);

                                                  startActivity(intent);
                                              }
                                              if (i == 4)
                                              {

                                                 Intent intent= new Intent(search.this,Opos.class);
                                                  startActivity(intent);

                                              }
                                              if (i == 5)
                                              {
                                                  Intent intent= new Intent(search.this,Oneg.class);
                                                  startActivity(intent);

                                              }

                                              if( i == 6)
                                              {
                                                  Intent intent= new Intent(search.this,AB_pos.class);
                                                  startActivity(intent);
                                              }
                                              if(i == 7)
                                              {
                                                  Intent intent= new Intent(search.this,AB_neg.class);
                                                  startActivity(intent);
                                              }


                                          }
                                      });
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri ref = Uri.parse("geo:O,O?q=BLOOD BANKS");
                Intent i = new Intent(Intent.ACTION_VIEW,ref);
                i.setPackage("com.google.android.apps.maps");
                startActivity(i);
            }
        });

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1234567890"));
                startActivity(intent);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(search.this,relay.class);
                startActivity(intent);
                finish();
                Toast.makeText(search.this, "Logout Successfully", Toast.LENGTH_SHORT).show();
            }
        });


        srch.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {



                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapt.getFilter().filter(s);
                return false;
            }
        });

    }
}