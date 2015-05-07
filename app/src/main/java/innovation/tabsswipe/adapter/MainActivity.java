package innovation.tabsswipe.adapter;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

import innovation.myapplication.R;


public class MainActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;

        Resources res = getResources();
        intent = new Intent().setClass(this, Tasks.class);

        spec = tabHost
                .newTabSpec("Widget")
                .setIndicator("DateTime",
                        res.getDrawable(android.R.drawable.ic_menu_today))
                .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, Contacts.class);
        spec = tabHost
                .newTabSpec("Form")
                .setIndicator("Form",
                        res.getDrawable(android.R.drawable.ic_menu_manage))
                .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, done.class);
        spec = tabHost
                .newTabSpec("onglet3")
                .setIndicator("onglet3", res.getDrawable(android.R.drawable.ic_menu_mapmode))
                .setContent(intent);
        tabHost.addTab(spec);

        tabHost.setCurrentTab(0);

    }


    }