package com.example.medical;

import android.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class Register extends AppCompatActivity {
   TextInputLayout email,Password;
   TextView bt_button;
   public TextView button;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_register);
       button = (TextView) findViewById(R.id.sign in);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MAIN.this, Login.class);
               startActivity(intent);
           }
       });

   }}
