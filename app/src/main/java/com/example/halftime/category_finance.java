package com.example.halftime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.halftime.companies.ABInbevActivity;
import com.example.halftime.companies.AmericanExpressActivity;
import com.example.halftime.companies.ChurchDwightActivity;
import com.example.halftime.companies.CitibankActivity;
import com.example.halftime.companies.CocaColaActivity;
import com.example.halftime.companies.ColgateActivity;
import com.example.halftime.companies.DanoneActivity;
import com.example.halftime.companies.EJGalloActivity;
import com.example.halftime.companies.GeneralMillsActivity;
import com.example.halftime.companies.HasbroActivity;
import com.example.halftime.companies.HersheyActivity;
import com.example.halftime.companies.JohnsonJohnsonActivity;
import com.example.halftime.companies.KimberlyClarkActivity;
import com.example.halftime.companies.KraftHeinzActivity;
import com.example.halftime.companies.LOrealActivity;
import com.example.halftime.companies.MarsActivity;
import com.example.halftime.companies.MattelActivity;
import com.example.halftime.companies.NestleActivity;
import com.example.halftime.companies.OceanSprayActivity;
import com.example.halftime.companies.PepsiActivity;
import com.example.halftime.companies.PgActivity;
import com.example.halftime.companies.RBActivity;
import com.example.halftime.companies.SCJActivity;
import com.example.halftime.companies.UnileverActivity;

import java.util.ArrayList;

public class category_finance extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_layout);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar);
        TextView title = (TextView) findViewById(R.id.actionbar_title);
        title.setText(R.string.category_finance);


        //Create a list of company objects
        ArrayList<Company> companies = new ArrayList<Company>();
        companies.add(new Company("Under Construction", "Coming Soon!", R.drawable.construction, new Intent(this, AmericanExpressActivity.class)));

        //initialize a CompanyAdapter
        final CompanyAdapter adapter = new CompanyAdapter(this, R.color.marketing, companies);

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
