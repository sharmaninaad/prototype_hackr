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

import java.util.ArrayList;

import static android.R.attr.id;
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
        String topics[]= {"Android Development", "Web Development", "C", "Java", "Git", "Django", "Kotlin", "MySQL"};
        int images[]={R.drawable.android,R.drawable.web,R.drawable.c,R.drawable.java,R.drawable.git,R.drawable.django,R.drawable.kotlin,R.drawable.sql};
        GridAdapter gridAdapter= new GridAdapter(MainActivity.this,images,topics);

        //ArrayAdapter arrayAdapter=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,topics);
        gridView.setAdapter(gridAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getApplicationContext(),tutor.class);
                intent.putExtra("place",position);

                startActivity(intent);
            }
        });

    }
}
