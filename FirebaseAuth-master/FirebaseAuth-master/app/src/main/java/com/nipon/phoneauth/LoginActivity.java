package com.nipon.phoneauth;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    private EditText mobileNumberET;
    private CheckBox acceptCB;
    private FloatingActionButton nextFABtn;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        firebaseAuth = FirebaseAuth.getInstance();
        if (firebaseAuth.getCurrentUser()!=null){
            Intent intent = new Intent(LoginActivity.this,MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }

        mobileNumberET = findViewById(R.id.mobileNumberET);
        acceptCB = findViewById(R.id.acceptCB);
        nextFABtn = findViewById(R.id.nextFABtn);

        acceptCB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("RestrictedApi")
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b==true){
                    nextFABtn.setVisibility(View.VISIBLE);
                }else if (b==false){
                    nextFABtn.setVisibility(View.GONE);
                }
            }
        });

        nextFABtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mobileNumber = mobileNumberET.getText().toString();
                if (mobileNumber.length()!=11){
                    Toast.makeText(LoginActivity.this, "Please enter a valid phone number", Toast.LENGTH_SHORT).show();
                }else {
                    startActivity(new Intent(LoginActivity.this,VerifyActivity.class).putExtra("mobileNumber",mobileNumber));
                }

            }
        });
    }
}
