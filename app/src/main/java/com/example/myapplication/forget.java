package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

public class forget extends AppCompatActivity {
    EditText user,phn;
    Button sub;
    String contactno, name;
    StringRequest request;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget);
        user = findViewById(R.id.user_name);
        phn = findViewById(R.id.mobile);
        sub= findViewById(R.id.submit);
        subbtn();
    }

    private void subbtn() {

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setError(null);
                phn.setError(null);
                contactno = phn.getText().toString();
                name = user.getText().toString();
                if(valid()) {
                    request = new StringRequest(Request.Method.POST, Endpts.forgot_url, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            if (response.equals("Success")) {
                                Toast.makeText(forget.this, "Email successfully sent Please check your email", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(forget.this, relay.class));
                                forget.this.finish();
                            } else {
                                Toast.makeText(forget.this, "failed", Toast.LENGTH_SHORT).show();
                            }

                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(forget.this, "Check your internet connection", Toast.LENGTH_SHORT).show();
                            Log.d("VOLLEY", error.getMessage());

                        }
                    }) {
                        protected Map<String, String> getParams() throws AuthFailureError {
                            Map<String, String> params = new HashMap<>();
                            params.put("name", name);
                            params.put("number", contactno);

                            return params;

                        }
                    };
                    VolleySingleton.getInstance(forget.this).addToRequestQueue(request);
                }

            }
        });


    }

    private boolean valid() {
        if(name.isEmpty())
        {
            showMessage("name is empty");
            user.setError("name is empty");
            return false;
        }
        else if(contactno.isEmpty())
        {
            showMessage("Empty Password");
            phn.setError("Password is empty");
            return false;
        }
        return true;
    }
    private void showMessage(String msg)
    {
        Toast.makeText(this,msg, Toast.LENGTH_SHORT).show();
    }
}