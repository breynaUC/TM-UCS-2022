package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
  private EditText txtemail, txtpass;
  private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtemail = findViewById(R.id.edtemail);
        txtpass = findViewById(R.id.edtpassword);
        btn1 = findViewById(R.id.btnautntificar);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = "admin@gmail.com";
                String clave = "cl4v3";
                String correo = txtemail.getText().toString();
                String password = txtpass.getText().toString();
                if(correo.equals("")){
                    Toast.makeText(getApplicationContext(),"campos vacíos.."+password, Toast.LENGTH_LONG).show();
                }else{
                    if(correo.equals(email)){
                        Intent intent = new Intent(getApplicationContext(),PrincipalActivity.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(getApplicationContext(),"Datos Incorrectos", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}