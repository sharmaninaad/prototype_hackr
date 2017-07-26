package com.example.android.hacker;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;

import static com.example.android.hacker.R.drawable.web;

public class app extends AppCompatActivity {
    ArrayList<String>tutorials;
    ArrayList<String> links;
    ListView listView1;
    ArrayAdapter arrayAdapter1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        tutorials=new ArrayList<>();
        links=new ArrayList<>();

        tutorials.add("Android App development by stanford");
        tutorials.add("Android Material Design Tutorial");
        tutorials.add("Tutorials about development for android");
        tutorials.add("Training for Android developers");
        tutorials.add("Android Tutorials for beginner");

        links.add("http://web.stanford.edu/class/cs193a/videos.shtml");
        links.add("https://www.youtube.com/playlist?list=PLonJJ3BVjZW6CtAMbJz1XD8ELUs1KXaTD");
        links.add("http://www.vogella.com/tutorials/android.html");
        links.add("https://developer.android.com/training/index.html");
        links.add("https://www.youtube.com/playlist?list=PLonJJ3BVjZW6hYgvtkaWvwAVvOFB7fkLa");

         listView1=(ListView)findViewById(R.id.a_list);
        arrayAdapter1=new ArrayAdapter(getApplicationContext(),R.layout.list_black,R.id.list_content,tutorials);
        listView1.setAdapter(arrayAdapter1);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(links.get(position)));
                startActivity(browserIntent);
            }
        });

    }
}
