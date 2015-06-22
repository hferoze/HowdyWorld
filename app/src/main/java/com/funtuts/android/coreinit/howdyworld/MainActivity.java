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

        searchBtn = (Button) findViewById(R.id.searchBtn);
        searchPg = (WebView) findViewById(R.id.searchWV);
        searchPg.getSettings().setJavaScriptEnabled(true);

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
