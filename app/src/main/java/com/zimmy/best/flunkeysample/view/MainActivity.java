package com.zimmy.best.flunkeysample.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import com.zimmy.best.flunkeysample.Konstants;
import com.zimmy.best.flunkeysample.R;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences preferences;
    private boolean isLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences=getSharedPreferences(Konstants.personalPreference, Context.MODE_PRIVATE);
        isLogIn=preferences.getBoolean(Konstants.login,false);

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(isLogIn){
                    startActivity(new Intent(MainActivity.this, HomeActivity.class));
                } else {
                    startActivity(new Intent(MainActivity.this, LogInActivity.class));
                }
                finish();
            }
        },1500);
    }
}