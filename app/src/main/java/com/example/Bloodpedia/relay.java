package com.example.Bloodpedia;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.utils.Endpts;
import com.example.utils.VolleySingleton;

import java.util.HashMap;
import java.util.Map;

public class relay extends AppCompatActivity {
    EditText ednm,edps;
    Button login;
    TextView signUp,forgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relay);
        ednm = findViewById(R.id.edt_nm);
        edps = findViewById(R.id.ed_pas);
        login = findViewById(R.id.btn_sgn);
        signUp = findViewById(R.id.btn_clk);
        forgot = findViewById(R.id.txt_forgot);
        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(relay.this,forget.class);
                startActivity(i);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ednm.setError(null);
                edps.setError(null);
                String name = ednm.getText().toString();
                String password = edps.getText().toString();
                if(isValid(name,password))
                {
                    log(name,password);
                }

            }
        });
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(relay.this,reg.class);

                startActivity(intent);

            }
        });

    }
    private void log( final String name,final String password)
    {
        StringRequest stringRequest = new StringRequest(Request.Method.POST, Endpts.log_url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                 if (response.equals("Success"))
                {
                    Toast.makeText(relay.this,response, Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(relay.this, search.class));
                    relay.this.finish();
                }
                else {
                     Toast.makeText(relay.this, response, Toast.LENGTH_SHORT).show();
                 }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(relay.this, "Check your internet connection", Toast.LENGTH_SHORT).show();
                Log.d("VOLLEY",error.getMessage());
            }



        }){
            @Override
            protected Map<String,String> getParams() throws AuthFailureError
            {
                Map<String,String> params = new HashMap<>();
                params.put("name", name);
                params.put("password", password);

                return params;
            }
        };
        VolleySingleton.getInstance(this).addToRequestQueue(stringRequest);

    }

    private boolean isValid(String name,String password)
    {
        if(name.isEmpty())
        {
            showMessage("name is empty");
            ednm.setError("name is empty");
            return false;
        }
        else if(password.isEmpty())
        {
            showMessage("Empty Password");
            edps.setError("Password is empty");
            return false;
        }
        return true;
    }

    private void showMessage(String msg)
    {
        Toast.makeText(this,msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage("Are you want to exit?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
              relay.super.onBackPressed();
            }
        })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();


    }
}