package com.zimmy.best.flunkeysample.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.zimmy.best.flunkeysample.Konstants;
import com.zimmy.best.flunkeysample.R;
import com.zimmy.best.flunkeysample.view.HomeActivity;

public class LogInActivity extends AppCompatActivity {


    private EditText userNameEt;
    private EditText passwordEt;
    private Button logIn;
    private SharedPreferences preferences;
    private boolean isLogIn;
    private SharedPreferences.Editor editor;


    final static String user1 = "flunkey";
    final static String user2 = "user";
    final static String password = "password123";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        userNameEt = findViewById(R.id.usernameEt);
        passwordEt = findViewById(R.id.passwordEt);
        logIn = findViewById(R.id.logIn);

        preferences=getSharedPreferences(Konstants.personalPreference, Context.MODE_PRIVATE);
        isLogIn=preferences.getBoolean(Konstants.login,false);
        editor=preferences.edit();

        userNameEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(userNameEt.getText().toString().length()<3||userNameEt.getText().toString().length()>11){
                    userNameEt.setError("username must be of 3-11 character");
                } else{
                    logIn.setActivated(true);
                }
            }
        });

        passwordEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(passwordEt.getText().toString().length()<3||passwordEt.getText().toString().length()>11){
                    passwordEt.setError("password must be of 3-11 character");
                } else{
                    logIn.setActivated(true);
                }
            }
        });


        logIn.setOnClickListener(view -> {
            if(userNameEt.getText().toString().isEmpty()){
                Toast.makeText(this,"username cannot be empty",Toast.LENGTH_SHORT).show();
                return;
            }

            if(passwordEt.getText().toString().isEmpty()){
                Toast.makeText(this,"Password cannot be empty",Toast.LENGTH_SHORT).show();
                return;
            }

            if (!passwordEt.getText().toString().equals(password)) {
                Toast.makeText(this, "either password or username is incorrect", Toast.LENGTH_SHORT).show();
                return;
            }


            if (userNameEt.getText().toString().equals(user1)) {
                Intent intent = new Intent(this, HomeActivity.class);
                intent.putExtra(Konstants.user, Konstants.user1);
                editor.putBoolean(Konstants.login,true);
                editor.putString(Konstants.user,user2);
                editor.apply();
                Toast.makeText(this, "Log in successful", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
            } else if (userNameEt.getText().toString().equals(user2)) {
                Intent intent = new Intent(this, HomeActivity.class);
                intent.putExtra(Konstants.user, Konstants.user2);
                editor.putBoolean(Konstants.login,true);
                editor.putString(Konstants.user,user2);
                editor.apply();
                Toast.makeText(this, "Log in successful", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(this, "either password or username is incorrect", Toast.LENGTH_SHORT).show();
            }
        });
    }
}