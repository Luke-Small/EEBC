package com.example.earlyeducationbusinessconsultants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginBtn = (Button) findViewById(R.id.btnLogin); //button object to login to the mainmenu
        Button createAcntBtn = (Button)findViewById(R.id.btnCreateAccount); //Button object to create account if don't have one

        loginBtn.setOnClickListener(new View.OnClickListener() {  //event handler for button
            @Override
            public void onClick(View v) {
                Intent intentLogin = new Intent(MainActivity.this, MainMenuActivity.class);   //Intent to go to the main menu
            }
        });

        createAcntBtn.setOnClickListener(new View.OnClickListener() {  //event handler for button
            @Override
            public void onClick(View v) {
                Intent intentCreateAcnt = new Intent(MainActivity.this, InitFormPageOneActivity.class);   //Intent to create account
            }
        });
    }
}