package com.example.android.hacker;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;

import static com.example.android.hacker.R.drawable.web;

public class app extends AppCompatActivity {
    WebView mWebview ;
    ListView listView1;
    String[]links={"http://web.stanford.edu/class/cs193a/videos.shtml",
            "https://www.youtube.com/playlist?list=PLonJJ3BVjZW6CtAMbJz1XD8ELUs1KXaTD",
            "http://www.vogella.com/tutorials/android.html",
            "https://developer.android.com/training/index.html",
            "https://www.youtube.com/playlist?list=PLonJJ3BVjZW6hYgvtkaWvwAVvOFB7fkLa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
        final Activity activity = this;


        String[]tutorials={"Android App development by stanford", "Android Material Design Tutorial",
        "Tutorials about development for android",
        "Training for Android developers",
        "Android Tutorials for beginner"};

        String[] payment={"Free","Free","Free","Free","Free"};
        String[] voting={"88","23","13","13","9"};
        String[] vidd={"Video","Video","Text","Text","Video"};

        mWebview  = new WebView(this);



         listView1=(ListView)findViewById(R.id.a_list);
        listAdapter la=new listAdapter(this,tutorials,payment,voting,vidd);
        listView1.setAdapter(la);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                mWebview.getSettings().setJavaScriptEnabled(true); // enable javascript



                mWebview.setWebViewClient(new WebViewClient() {
                    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                        Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
                    }
                });

                mWebview .loadUrl(links[position].toString());
                setContentView(mWebview );
                /*Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(links[position]));
                startActivity(browserIntent);*/
            }
        });

    }
}
