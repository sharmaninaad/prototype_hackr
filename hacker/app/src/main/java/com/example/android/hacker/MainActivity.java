package com.example.android.hacker;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.id;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static android.os.Build.VERSION_CODES.M;
import static android.transition.Fade.IN;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        GridView gridView=(GridView) findViewById(R.id.my_grid);

       // ArrayList<String> topics=new ArrayList<>();

        final String topics[]= {
                "Android Development",
                "Web Development",
                "C",
                "Java",
                "Git",
                "Django",
                "Kotlin",
                "MySQL",
                "Ansible",
                "Arduino",
                "Data Science",
                "Go",
                "Grails",

                "PHP",
                "Python",

                "Javascript",

                "Photoshop",
                "R"

        };

        int images[]={
                R.drawable.android1,
                R.drawable.webd,
                R.drawable.c1,
                R.drawable.java1,
                R.drawable.git1,
                R.drawable.django1,
                R.drawable.android1,
                R.drawable.sql1,
                R.drawable.ansible,
                R.drawable.arduino,
                R.drawable.datasc,
                R.drawable.go,
                R.drawable.grails,
                R.drawable.php,
                R.drawable.python,
                R.drawable.js,
                R.drawable.photoshop,
                R.drawable.r
        };



        if(images.length==topics.length) {
            GridAdapter gridAdapter = new GridAdapter(getApplicationContext(), images, topics);


            gridView.setAdapter(gridAdapter);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch (position) {
                        case 0:
                            Toast.makeText(MainActivity.this, topics[0], Toast.LENGTH_SHORT).show();
                            Intent this_intent = new Intent(getApplicationContext(), app.class);
                            startActivity(this_intent);


                    }
                }
            });

        }
        else
            {
                Toast.makeText(this, "lllll", Toast.LENGTH_SHORT).show();
            }
    }

}
