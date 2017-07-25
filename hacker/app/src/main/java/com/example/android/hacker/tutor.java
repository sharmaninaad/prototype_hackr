package com.example.android.hacker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class tutor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor);
        Intent my_intent= getIntent();
        int pos=my_intent.getIntExtra("place",-1);
        switch(pos)
        {
            case 0:Intent app=new Intent(getApplicationContext(),app.class);
                    startActivity(app);
                    break;


        }
    }
}
