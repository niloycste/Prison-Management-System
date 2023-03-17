package com.nstu.www.nstu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    private EditText usrnameEditText,passwordEditText;
    private Button loginButton;
    private TextView textView;
    private  int counter=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usrnameEditText=(EditText) findViewById(R.id.usernameId);
        passwordEditText=(EditText)findViewById(R.id.passwordId);
        loginButton=(Button)findViewById(R.id.loginButtonId);
        textView=(TextView)findViewById(R.id.textviewId);
        textView.setText("Number of Attempts Remaining:3");
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=usrnameEditText.getText().toString();
                String password=passwordEditText.getText().toString();
                if(username.equals("niloypiash")&& password.equals("1768")){
                    Intent intent;
                    intent = new Intent(Login.this, Splash.class);
                    startActivity(intent);
                }else{
                    counter--;
                    textView.setText("Number of Attempts Remaining: "+counter);
                    if(counter==0){
                        loginButton.setEnabled(false);
                    }

                }
            }
        });
    }
}
