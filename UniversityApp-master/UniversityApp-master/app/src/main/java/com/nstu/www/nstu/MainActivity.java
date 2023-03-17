package com.nstu.www.nstu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mwebview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN ,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        mwebview = (WebView) findViewById(R.id.activity_main_webview);
        WebSettings webSettings = mwebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mwebview.loadUrl("http://nstu.edu.bd/");
        mwebview.setWebViewClient(new WebViewClient(){


                                      @Override
                                      public void onPageFinished(WebView view, String url) {

                                          findViewById(R.id.nstu1 ).setVisibility(View.GONE);
                                          findViewById(R.id.activity_main_webview).setVisibility(view.VISIBLE);
                                      }
                                  }


//tools:context="com.nstu.www.nstu.Login">
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater= getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if (item.getItemId()==R.id.developerId){
            Intent intent=new Intent(getApplicationContext(),developerActivity.class);
            startActivity(intent);
            return true;
        }

        if(item.getItemId()==R.id.shareId){
            Intent intent=new Intent(getApplicationContext(),MenuBar.class);
            startActivity(intent);

        }else if(item.getItemId()==R.id.feedbackId){
            Intent intent =new Intent(getApplicationContext(),feedbackActivity.class);
            startActivity(intent);
        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        if(mwebview.canGoBack()){
            mwebview.goBack();
        }else {
            super.onBackPressed();
        }
    }


}
