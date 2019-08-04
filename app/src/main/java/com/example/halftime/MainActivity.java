package com.example.halftime;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar);

        //Find each of the TextViews
        TextView all = (TextView) findViewById(R.id.all);
        TextView finance = (TextView) findViewById(R.id.finance);
        TextView tech = (TextView) findViewById(R.id.tech);
        TextView marketing = (TextView) findViewById(R.id.marketing);

        //Set a click listener for each View
        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent allIntent = new Intent(MainActivity.this, category_all.class);
                startActivity(allIntent);
            }
        });

        finance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent financeIntent = new Intent(MainActivity.this, category_finance.class);
                startActivity(financeIntent);
            }
        });

        tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent techIntent = new Intent(MainActivity.this, category_tech.class);
                startActivity(techIntent);
            }
        });

        marketing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marketingIntent = new Intent(MainActivity.this, category_marketing.class);
                startActivity(marketingIntent);
            }
        });
    }
}
