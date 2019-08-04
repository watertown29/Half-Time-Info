package com.example.halftime;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CompanyAdapter extends ArrayAdapter<Company> {

    private static final String LOG_TAG = CompanyAdapter.class.getSimpleName();
    private int backgroundColor;

    /**
     * Constructor
     *
     * @param context the current context
     * @param colorId the color resource Id
     * @param companies a list of objects to display in a list
     */
    public CompanyAdapter(Activity context, int colorId, ArrayList<Company> companies){
        super(context, colorId, companies);
        backgroundColor = colorId;
    }

    /**
     * provides a view for an AdapterView (ListView GridView, etc.)
     * @param position
     * @param convertView
     * @param parent
     * @return the View for the position in the AdapterView
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.company_list_item, parent, false);
        }
        Company currentCompany = getItem(position);

        /**
         * set backround color to word theme
         */

        LinearLayout themeColor = (LinearLayout) listItemView.findViewById(R.id.theme_color);
        themeColor.setBackgroundResource(backgroundColor);

        /**
         * setText on miwokTextView in company_list_item to int position on the list
         */

        TextView companyNameText = (TextView) listItemView.findViewById(R.id.company_name_text);
        companyNameText.setText(currentCompany.getmCompanyName());

        /**
         * setText on defaultTextView in company_list_item to int position on the list
         */

        TextView companyCityText = (TextView) listItemView.findViewById(R.id.company_city_text);
        companyCityText.setText(currentCompany.getmCompanyCity());

        /**
         * set ImageView to the icon source if there is an associated image
         * if there is no image, hide the ImageView
         */

        ImageView companyImageView = (ImageView) listItemView.findViewById(R.id.company_image_view);

        if (currentCompany.getmImageResource() == 0) {
            companyImageView.setVisibility(View.GONE);
            return listItemView;

        } else{
            companyImageView.setImageResource(currentCompany.getmImageResource());
            return listItemView;
        }


    }

}
