package com.school.pooniepoop.sekolah;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button login;
    ConstraintLayout loginLayout;
    AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginLayout = (ConstraintLayout) findViewById(R.id.loginLayout);
        login = (Button) findViewById(R.id.btnLogin);
        animationDrawable = (AnimationDrawable) loginLayout.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();
        final TextInputEditText txtUsername = (TextInputEditText) findViewById(R.id.txtUsername);
        final TextInputEditText txtPassword = (TextInputEditText) findViewById(R.id.txtPassword);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtUsername.getText().toString().equals("rizki") && txtPassword.getText().toString().equals("rizki")){

                    Intent i = new Intent(getApplicationContext(),MainActivity.class);
                    i.putExtra("level","admin");
                    startActivity(i);
                }else{
                    Toast.makeText(LoginActivity.this,"Username atau Password salah",Toast.LENGTH_LONG);
                }


            }
        });
    }
}
