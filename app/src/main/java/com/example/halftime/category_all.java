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
import com.example.halftime.companies.ADPActivity;
import com.example.halftime.companies.AmazonActivity;
import com.example.halftime.companies.AmericanCenturyActivity;
import com.example.halftime.companies.AmericanExpressActivity;
import com.example.halftime.companies.AppleActivity;
import com.example.halftime.companies.BAMLActivity;
import com.example.halftime.companies.BarclaysActivity;
import com.example.halftime.companies.ChewyActivity;
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
import com.example.halftime.companies.GSActivity;
import com.example.halftime.companies.GeneralMillsActivity;
import com.example.halftime.companies.GoogleActivity;
import com.example.halftime.companies.HPActivity;
import com.example.halftime.companies.HasbroActivity;
import com.example.halftime.companies.HersheyActivity;
import com.example.halftime.companies.IBMActivity;
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
import com.example.halftime.companies.MicrosoftActivity;
import com.example.halftime.companies.NestleActivity;
import com.example.halftime.companies.OceanSprayActivity;
import com.example.halftime.companies.PayPalActivity;
import com.example.halftime.companies.PepsiActivity;
import com.example.halftime.companies.PgActivity;
import com.example.halftime.companies.RBActivity;
import com.example.halftime.companies.SCJActivity;
import com.example.halftime.companies.UnileverActivity;

import java.util.ArrayList;

public class category_all extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_layout);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar);
        TextView title = (TextView) findViewById(R.id.actionbar_title);
        title.setText(R.string.category_all);

        //Create a list of company objects
        ArrayList<Company> companies = new ArrayList<Company>();
        companies.add(new Company("ADP", "Roseland, NJ", R.drawable.adp, new Intent(this, ADPActivity.class)));
        companies.add(new Company("Amazon", "Seattle, WA", R.drawable.amazon, new Intent(this, AmazonActivity.class)));
        companies.add(new Company("Apple", "Cupertino, CA", R.drawable.apple, new Intent(this, AppleActivity.class)));
        companies.add(new Company("American Century Investments", "Kansas City, MO", R.drawable.aci, new Intent(this, AmericanCenturyActivity.class)));
        companies.add(new Company("American Express", "New York, NY", R.drawable.american_express, new Intent(this, AmericanExpressActivity.class)));
        companies.add(new Company("AB Inbev", "St. Louis, MO", R.drawable.ab, new Intent(this, ABInbevActivity.class)));
        companies.add(new Company("Bank of America Merrill Lynch", "Charlotte, NC & New York, NY", R.drawable.baml, new Intent(this, BAMLActivity.class)));
        companies.add(new Company("Barclays", "London, UK & New York, NY", R.drawable.barclays, new Intent(this, BarclaysActivity.class)));
        companies.add(new Company("Colgate Palmolive", "New York, NY", R.drawable.colgate, new Intent(this, ColgateActivity.class)));
        companies.add(new Company("Citibank", "New York, NY", R.drawable.citibank, new Intent(this, CitibankActivity.class)));
        companies.add(new Company("Church & Dwight", "Ewing, NJ", R.drawable.cd, new Intent(this, ChurchDwightActivity.class)));
        companies.add(new Company("The Coca-Cola Company", "Atlanta, GA", R.drawable.ccc, new Intent(this, CocaColaActivity.class)));
        companies.add(new Company("Chewy.com", "Dania Beach, FL", R.drawable.chewy, new Intent(this, ChewyActivity.class)));
        companies.add(new Company("Citi", "New York, NY", R.drawable.citi, new Intent(this, CitiActivity.class)));
        companies.add(new Company("Credit Suisse Group", "New York, NY", R.drawable.credit, new Intent(this, CreditActivity.class)));
        companies.add(new Company("Danone North America", "White Plains, NY", R.drawable.danone, new Intent(this, DanoneActivity.class)));
        companies.add(new Company("Deutsche Bank", "New York, NY", R.drawable.db, new Intent(this, DBActivity.class)));
        companies.add(new Company("E. & J. Gallo", "Modesto, CA", R.drawable.ejg, new Intent(this, EJGalloActivity.class)));
        companies.add(new Company("Fidelity", "Boston, MA", R.drawable.fidelity, new Intent(this, FidelityActivity.class)));
        companies.add(new Company("Google", "Mountain View, CA", R.drawable.google, new Intent(this, GoogleActivity.class)));
        companies.add(new Company("Goldman Sachs", "New York, NY", R.drawable.goldman, new Intent(this, GSActivity.class)));
        companies.add(new Company("General Mills", "Minneapolis, MN", R.drawable.gm, new Intent(this, GeneralMillsActivity.class)));
        companies.add(new Company("Hasbro", "Pawtucket, RI", R.drawable.hasbro, new Intent(this, HasbroActivity.class)));
        companies.add(new Company("Hewlett-Packard", "Palo Alto, CA", R.drawable.hp, new Intent(this, HPActivity.class)));
        companies.add(new Company("Hershey Company", "Hershey, PA", R.drawable.hershey, new Intent(this, HersheyActivity.class)));
        companies.add(new Company("Ivy Investments", "Overland Park, KS", R.drawable.ivy, new Intent(this, IvyActivity.class)));
        companies.add(new Company("IBM", "Armonk, NY", R.drawable.ibm, new Intent(this, IBMActivity.class)));
        companies.add(new Company("Johnson & Johnson", "Numerous", R.drawable.jnj, new Intent(this, JohnsonJohnsonActivity.class)));
        companies.add(new Company("JP Morgan Chase & Co", "New York, NY", R.drawable.jpm, new Intent(this, JPActivity.class)));
        companies.add(new Company("Kimberly-Clark Corporation", "Irving, TX", R.drawable.kc, new Intent(this, KimberlyClarkActivity.class)));
        companies.add(new Company("Kraft Heinz Company", "Chicago, IL", R.drawable.kh, new Intent(this, KraftHeinzActivity.class)));
        companies.add(new Company("L'Oreal USA", "New York, NY", R.drawable.loreal, new Intent(this, LOrealActivity.class)));
        companies.add(new Company("Liberty Mutual", "Boston, MA", R.drawable.limu, new Intent(this, LIMUActivity.class)));
        companies.add(new Company("M&T Bank", "Buffalo, NY", R.drawable.mt, new Intent(this, MTActivity.class)));
        companies.add(new Company("Microsoft", "Redmond, WA", R.drawable.microsoft, new Intent(this, MicrosoftActivity.class)));
        companies.add(new Company("Marsh & McLennan", "New York, NY", R.drawable.mmc, new Intent(this, MMCActivity.class)));
        companies.add(new Company("Mars", "McLean, VA", R.drawable.mars, new Intent(this, MarsActivity.class)));
        companies.add(new Company("Mattel", "El Segundo, CA", R.drawable.mattel, new Intent(this, MattelActivity.class)));
        companies.add(new Company("Nestlé", "Arlington, VA", R.drawable.nestle, new Intent(this, NestleActivity.class)));
        companies.add(new Company("Ocean Spray", "Lakeville-Middleboro, MA", R.drawable.os, new Intent(this, OceanSprayActivity.class)));
        companies.add(new Company("PayPal", "San Jose, CA", R.drawable.paypal, new Intent(this, PayPalActivity.class)));
        companies.add(new Company("PepsiCo", "Harrison, NY", R.drawable.pepsico, new Intent(this, PepsiActivity.class)));
        companies.add(new Company("Proctor & Gamble", "Cincinnati, OH", R.drawable.pg, new Intent(this, PgActivity.class)));
        companies.add(new Company("RB (Reckitt Benckiser)", "Parsippany, NJ", R.drawable.rb, new Intent(this, RBActivity.class)));
        companies.add(new Company("S.C. Johnson & Son", "Racine, WI; Chicago, IL", R.drawable.scj, new Intent(this, SCJActivity.class)));
        companies.add(new Company("Unilever", "Englewood Cliffs, NJ", R.drawable.unilever, new Intent(this, UnileverActivity.class)));



        //initialize a CompanyAdapter
        final CompanyAdapter adapter = new CompanyAdapter(this, R.color.all, companies);

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
