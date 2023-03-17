package com.nstu.www.nstu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MenuBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_bar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.shareId){
            //Toast.makeText(getApplicationContext(),"share is clicked",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String subject="NSTU APP";
            String body="Welcome to NSTU app.This app is about the entire information of NSTU(Noakhali Science and Technology university).This app is capable of showing all the info about the university including 'NEWS','NOTICE','JOB CIRCULAR','ADMISSION PROCEDURE' so that those who are using this app can easily get the information of the present condition of the entire university.Hopefully you might feel comfortable by using this app So feel free to install this app.Best of luck!!!!";
            intent.putExtra(intent.EXTRA_SUBJECT,subject);
            intent.putExtra(intent.EXTRA_TEXT,body);
            startActivity(Intent.createChooser(intent,"share with"));
        }
        return super.onOptionsItemSelected(item);
    }
}
