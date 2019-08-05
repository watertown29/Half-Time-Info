package com.example.halftime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.halftime.companies.ADPActivity;
import com.example.halftime.companies.AmazonActivity;
import com.example.halftime.companies.AppleActivity;
import com.example.halftime.companies.ChewyActivity;
import com.example.halftime.companies.GoogleActivity;
import com.example.halftime.companies.HPActivity;
import com.example.halftime.companies.IBMActivity;
import com.example.halftime.companies.MicrosoftActivity;
import com.example.halftime.companies.PayPalActivity;

import java.util.ArrayList;

public class category_tech extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_layout);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar);
        TextView title = (TextView) findViewById(R.id.actionbar_title);
        title.setText(R.string.category_tech);

        //Create a list of company objects
        ArrayList<Company> companies = new ArrayList<Company>();
        companies.add(new Company("ADP", "Roseland, NJ", R.drawable.adp, new Intent(this, ADPActivity.class)));
        companies.add(new Company("Amazon", "Seattle, WA", R.drawable.amazon, new Intent(this, AmazonActivity.class)));
        companies.add(new Company("Apple", "Cupertino, CA", R.drawable.apple, new Intent(this, AppleActivity.class)));
        companies.add(new Company("Chewy.com", "Dania Beach, FL", R.drawable.chewy, new Intent(this, ChewyActivity.class)));
        companies.add(new Company("Google", "Mountain View, CA", R.drawable.google, new Intent(this, GoogleActivity.class)));
        companies.add(new Company("Hewlett-Packard", "Palo Alto, CA", R.drawable.hp, new Intent(this, HPActivity.class)));
        companies.add(new Company("IBM", "Armonk, NY", R.drawable.ibm, new Intent(this, IBMActivity.class)));
        companies.add(new Company("Microsoft", "Redmond, WA", R.drawable.microsoft, new Intent(this, MicrosoftActivity.class)));
        companies.add(new Company("PayPal", "San Jose, CA", R.drawable.paypal, new Intent(this, PayPalActivity.class)));

        //initialize a CompanyAdapter
        final CompanyAdapter adapter = new CompanyAdapter(this, R.color.tech, companies);

        //find the listView in the XML
        ListView listView = (ListView) findViewById(R.id.list);

        //Set listView with a CompanyAdapter
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Company currentCompany = (Company) adapter.getItem(position);
                Intent intent = currentCompany.getmActivityResource();
                startActivity(intent);

            }
        });
    }
}
