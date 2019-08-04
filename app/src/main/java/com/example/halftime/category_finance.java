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
import com.example.halftime.companies.AmericanCenturyActivity;
import com.example.halftime.companies.AmericanExpressActivity;
import com.example.halftime.companies.BAMLActivity;
import com.example.halftime.companies.BarclaysActivity;
import com.example.halftime.companies.ChurchDwightActivity;
import com.example.halftime.companies.CitiActivity;
import com.example.halftime.companies.CitibankActivity;
import com.example.halftime.companies.CocaColaActivity;
import com.example.halftime.companies.ColgateActivity;
import com.example.halftime.companies.CreditActivity;
import com.example.halftime.companies.DBActivity;
import com.example.halftime.companies.DanoneActivity;
import com.example.halftime.companies.EJGalloActivity;
import com.example.halftime.companies.FidelityActivity;
import com.example.halftime.companies.GeneralMillsActivity;
import com.example.halftime.companies.HasbroActivity;
import com.example.halftime.companies.HersheyActivity;
import com.example.halftime.companies.IvyActivity;
import com.example.halftime.companies.JPActivity;
import com.example.halftime.companies.JohnsonJohnsonActivity;
import com.example.halftime.companies.KimberlyClarkActivity;
import com.example.halftime.companies.KraftHeinzActivity;
import com.example.halftime.companies.LIMUActivity;
import com.example.halftime.companies.LOrealActivity;
import com.example.halftime.companies.MMCActivity;
import com.example.halftime.companies.MTActivity;
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
        companies.add(new Company("American Century Investments", "Kansas City, MO", R.drawable.aci, new Intent(this, AmericanCenturyActivity.class)));
        companies.add(new Company("Bank of America Merrill Lynch", "Charlotte, NC & New York, NY", R.drawable.baml, new Intent(this, BAMLActivity.class)));
        companies.add(new Company("Barclays", "London, UK & New York, NY", R.drawable.barclays, new Intent(this, BarclaysActivity.class)));
        companies.add(new Company("Citi", "New York, NY", R.drawable.citi, new Intent(this, CitiActivity.class)));
        companies.add(new Company("Credit Suisse Group", "New York, NY", R.drawable.credit, new Intent(this, CreditActivity.class)));
        companies.add(new Company("Deutsche Bank", "New York, NY", R.drawable.db, new Intent(this, DBActivity.class)));
        companies.add(new Company("Fidelity", "Boston, MA", R.drawable.fidelity, new Intent(this, FidelityActivity.class)));
        companies.add(new Company("Ivy Investments", "Overland Park, KS", R.drawable.ivy, new Intent(this, IvyActivity.class)));
        companies.add(new Company("JP Morgan Chase & Co", "New York, NY", R.drawable.jpm, new Intent(this, JPActivity.class)));
        companies.add(new Company("Liberty Mutual", "Boston, MA", R.drawable.limu, new Intent(this, LIMUActivity.class)));
        companies.add(new Company("M&T Bank", "Buffalo, NY", R.drawable.mt, new Intent(this, MTActivity.class)));
        companies.add(new Company("Marsh & McLennan", "New York, NY", R.drawable.mmc, new Intent(this, MMCActivity.class)));


        //initialize a CompanyAdapter
        final CompanyAdapter adapter = new CompanyAdapter(this, R.color.finance, companies);

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
