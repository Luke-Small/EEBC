package com.example.earlyeducationbusinessconsultants;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainMenuListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] mainMenuOptions = {"Weekly Report","Edit Information"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main_menu_list, R.id.txtList, mainMenuOptions));
    }

    /**
     * Event handler for main menu list activity
     */
    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(MainMenuListActivity.this, WeeklyReportActivity.class));
                break;
            case 1:
                startActivity(new Intent(MainMenuListActivity.this, InitFormPageOneActivity.class));
                break;
        }
    }
}