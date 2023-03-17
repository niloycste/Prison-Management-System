package com.bitm.firebase;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button signInBtn, signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signInBtn = findViewById(R.id.signInBtn);
        signUpBtn = findViewById(R.id.signUpBtn);

        replaceFragment(new SignInFragment());
        signInBtn.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        signUpBtn.setBackgroundColor(getResources().getColor(R.color.white));

        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new SignInFragment());
                signInBtn.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                signUpBtn.setBackgroundColor(getResources().getColor(R.color.white));
            }
        });

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new SignUpFragment());

                signInBtn.setBackgroundColor(getResources().getColor(R.color.white));
                signUpBtn.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
            }
        });
    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();

    }
}
