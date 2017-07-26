package com.example.android.hacker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
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
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.chat:
                return true;


            case R.id.buddy:
                return true;

            case R.id.help:
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView=(GridView) findViewById(R.id.my_grid);

       // ArrayList<String> topics=new ArrayList<>();

        final String topics[]= {"Android Development", "Web Development", "C", "Java", "Git", "Django", "Kotlin", "MySQL"};

        int images[]={R.drawable.android1,R.drawable.webd,R.drawable.c1,R.drawable.java1,R.drawable.git1,R.drawable.django1,R.drawable.android1,R.drawable.sql1};

        GridAdapter gridAdapter= new GridAdapter(getApplicationContext(),images,topics);


        gridView.setAdapter(gridAdapter);
       gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               switch(position)
               {
                  case 0:
                   Toast.makeText(MainActivity.this, topics[0], Toast.LENGTH_SHORT).show();
                       Intent this_intent=new Intent(getApplicationContext(),app.class);
                       startActivity(this_intent);


               }
           }
       });
    }
}
