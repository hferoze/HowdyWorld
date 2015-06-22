package com.funtuts.android.coreinit.howdyworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;


public class MainActivity extends Activity {

    Button searchBtn;
    WebView searchPg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize Button
        searchBtn = (Button) findViewById(R.id.searchBtn);
        //initialize WebView
        searchPg = (WebView) findViewById(R.id.searchWV);
        searchPg.getSettings().setJavaScriptEnabled(true);

        //What will happen when button is clicked
        searchBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
		        System.out.println("Search Button Pressed!");
                searchPg.loadUrl("https://www.google.com");
            }
        });
    }


}
