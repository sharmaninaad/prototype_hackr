package com.example.android.hacker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class app extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        ArrayList<String>tutorials=new ArrayList<>();
        tutorials.add("Android App development by stanford");
        tutorials.add("Android Material Design Tutorial");
        tutorials.add("Tutorials about development for android");
        tutorials.add("Training for Android developers");
        tutorials.add("Android Tutorials for beginner");

        ListView listView1=(ListView)findViewById(R.id.a_list);
        ArrayAdapter arrayAdapter1=new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,tutorials);
        listView1.setAdapter(arrayAdapter1);

    }
}
