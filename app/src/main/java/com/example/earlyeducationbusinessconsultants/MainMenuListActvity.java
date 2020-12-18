package com.example.earlyeducationbusinessconsultants;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainMenuListActvity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] mainMenuOptions = {"Weekly Report","Edit Information"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main_menu_list, R.id.listMain, mainMenuOptions));
    }

    /**
     * Event handler for main menu list activity
     */
    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(MainMenuListActvity.this, WeeklyReportActivity.class));
                break;
            case 1:
                startActivity(new Intent(MainMenuListActvity.this, InitFormPageOneActivity.class));
                break;
        }
    }
}