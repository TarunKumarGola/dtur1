package com.example.sachin.dtures;

import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Developers extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers);

        ArrayList<Devs> androidFlavors = new ArrayList<Devs>();
        androidFlavors.add(new Devs("Aarnav Jindal", "aarnavjindal1000@gmail.com",R.drawable.bhaiya ));
        androidFlavors.add(new Devs("Akshat Jindal", "akshatjindal215@gmail.com", R.drawable.akshat));
        androidFlavors.add(new Devs("Arnav Gohil", "arnav.gohil04@gmail.com",R.drawable.arnav ));
        androidFlavors.add(new Devs("Tarun Kumar Gola", "dev.tarun.and@gmail.com",R.drawable.tarun ));

        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        DevsAdapter oAdapter = new DevsAdapter(this, androidFlavors);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(oAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ActivityOptions options = null;
                switch (position)
                {
                    case 0:

                         intent = new Intent(Developers.this,AarnavJindal.class);

                        break;
                    case 1:

                         intent = new Intent(Developers.this,AkshatJindal.class);

                        break;

                    case 2:

                         intent = new Intent(Developers.this,ArnavGohil.class);

                        break;

                    case 3:

                         intent = new Intent(Developers.this,TarunKr.class);

                        break;
                }


                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    options = ActivityOptions.makeSceneTransitionAnimation(Developers.this,view,"img_transition");
                    startActivity(intent, options.toBundle());
                }
                else
                    startActivity(intent);
            }
        });
    }
}
