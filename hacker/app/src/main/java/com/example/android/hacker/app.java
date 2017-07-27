package com.example.android.hacker;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;



public class app extends AppCompatActivity {
    WebView webView;
    final Activity activity=this;
    WebView mWebview ;
    ListView listView1;
    ArrayList<String>tutorials;
    ArrayList<String> payment;
    ArrayList<String> voting;
    ArrayList<String> vidd;
    ArrayList<String> links;

    ArrayList<String>linb;
    ArrayList<String> tutb;
    ArrayList<String> payb;
    ArrayList<String> votb;
    ArrayList<String> vidb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
        final Activity activity = this;

        links=new ArrayList<>();
        tutorials=new ArrayList<>();
        payment=new ArrayList<>();
        voting=new ArrayList<>();
        vidd=new ArrayList<>();

        tutb=new ArrayList<>();
        payb=new ArrayList<>();
        votb=new ArrayList<>();
        linb=new ArrayList<>();
        vidb=new ArrayList<>();


        links.add("http://web.stanford.edu/class/cs193a/videos.shtml");
        links.add ("https://www.youtube.com/playlist?list=PLonJJ3BVjZW6CtAMbJz1XD8ELUs1KXaTD");
        links.add("http://www.vogella.com/tutorials/android.html");
        links.add( "https://developer.android.com/training/index.html");
        links.add("https://www.udemy.com/complete-android-n-developer-course/learn/v4/?siteID=jU79Zysihs4-wKAeEmL_pzRJcuUc.XhRxw&LSNPUBID=jU79Zysihs4");

        tutorials.add("Android App development by stanford");
        tutorials.add("Android Material Design Tutorial");
        tutorials.add("Tutorials about development for android");
        tutorials.add("Training for Android developers");
        tutorials.add("Udemy-the complete developer course");
        tutb=tutorials;
        payment.add("Free");
        payment.add("Free");
        payment.add("Free");
        payment.add("Free");
        payment.add("Paid");



        voting.add("88");
        voting.add("23");
        voting.add("13");
        voting.add("13");
        voting.add("7");

        vidd.add("Video");
        vidd.add("Video");
        vidd.add("Text");
        vidd.add("Text");
        vidd.add("Video");



        mWebview  = new WebView(this);

        webView=new WebView(this);

         listView1=(ListView)findViewById(R.id.a_list);

        listAdapter la=new listAdapter(activity,tutorials,payment,voting,vidd);

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

                mWebview.loadUrl(links.get(position));
                setContentView(mWebview);


            }
    });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        webView.getSettings().setJavaScriptEnabled(true); // enable javascript


        webView.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }
        });



        switch (item.getItemId()) {
            case R.id.chat:
                webView .loadUrl("https://hackr.io/tutorials/learn-android-development/chat");
                setContentView(webView );
                return true;


            case R.id.buddy:
                webView .loadUrl("https://hackr.io/tutorial/android-app-development-by-stanford/buddy");
                setContentView(webView );
                return true;



            default:

                return super.onOptionsItemSelected(item);
        }

    }
}
