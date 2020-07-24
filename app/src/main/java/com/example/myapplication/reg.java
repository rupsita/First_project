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
import com.android.volley.toolbox.Volley;
import com.example.utils.Endpts;
import com.example.utils.VolleySingleton;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class reg extends AppCompatActivity {
    private EditText nameEdt, cityEdt, bloodEdt,phnEdt, passEdt,emailEdt;
    private Button subBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        nameEdt = findViewById(R.id.name_edt);
        cityEdt = findViewById(R.id.city_edt);
        bloodEdt = findViewById(R.id.blood_edt);
        phnEdt = findViewById(R.id.phone_edt);
        passEdt = findViewById(R.id.pass_edt);
        emailEdt = findViewById(R.id.email_edt);
        subBtn = findViewById(R.id.btn_donor);

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name, city, blood_group, password, mobile,email;
                name = nameEdt.getText().toString();
                city= cityEdt.getText().toString();
                blood_group = bloodEdt.getText().toString();
                password = passEdt.getText().toString();
                mobile = phnEdt.getText().toString();
                email = emailEdt.getText().toString();

                if(isValid(name, city, blood_group, password, mobile,email))
                {
                  register(name,city,blood_group,password,mobile,email);
                }

            }
        });
    }
    private void register(final String name, final String city, final String blood_group, final String password, final String mobile,final String email)
    {
      StringRequest stringRequest = new StringRequest(Request.Method.POST, Endpts.register_url, new Response.Listener<String>() {
          @Override
          public void onResponse(String response) {
              if (response.equals("Success"))
              {
                  Toast.makeText(reg.this,response, Toast.LENGTH_SHORT).show();
                  startActivity(new Intent(reg.this, search.class));
                  reg.this.finish();
              }
              else{
                  Toast.makeText(reg.this,response, Toast.LENGTH_SHORT).show();
              }

          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {

              Toast.makeText(reg.this, "Something went wrong\ncheck your internet connection", Toast.LENGTH_SHORT).show();
              Log.d("VOLLEY",error.getMessage());
          }



    }){
          @Override
          protected Map<String,String> getParams() throws AuthFailureError
          {
              Map<String,String> params = new HashMap<>();
              params.put("name", name);
              params.put("city", city);
              params.put("blood_group", blood_group);
              params.put("password", password);
              params.put("number", mobile);
              params.put("email",email);
             return params;
          }
      };
        VolleySingleton.getInstance(this).addToRequestQueue(stringRequest);
                


    }

    private boolean isValid(String name,String city, String blood_group, String password, String mobile, String email)
    {
        List<String> blood_groups = new ArrayList<>();
        blood_groups.add("A+");
        blood_groups.add("B+");
        blood_groups.add("A-");
        blood_groups.add("B-");
        blood_groups.add("O+");
        blood_groups.add("O-");
        blood_groups.add("AB+");
        blood_groups.add("AB-");
        if(name.isEmpty()){
            showMessage("Enter your name");
            return false;
        }
        else if (city.isEmpty()){
            showMessage("Enter your city");
            return false;
        }
        else if (!blood_groups.contains(blood_group))
        {
            showMessage("invalid blood group Choose from"+blood_groups);
            return false;
        }
        else if(password.isEmpty())
        {
           showMessage("password cannot be empty");
           return false;
        }
        else if (mobile.isEmpty() || mobile.length() != 10)
        {
            showMessage("enter 10 digit valid mobile number");
            return false;
        }
        else if(email.isEmpty())
        {
            showMessage("Email cannot be empty");
            return false;
        }

        return true;
    }
    private void showMessage(String msg)
    {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}