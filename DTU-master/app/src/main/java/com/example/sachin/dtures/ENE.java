package com.example.sachin.dtures;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import xyz.danoz.recyclerviewfastscroller.vertical.VerticalRecyclerViewFastScroller;

public class ENE extends AppCompatActivity {



    private RecyclerView subjectrecyclerView;
    String type;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coe);

        ImageView backbutton=findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ENE.this,Home.class);
                startActivity(intent);
            }
        });

        type = getIntent().getStringExtra("type");

         RecyclerView recyclerView;
         RecyclerView.Adapter mAdapter;
         RecyclerView.LayoutManager layoutManager;

         List<abcd2> abcd2List;

         recyclerView = (RecyclerView) findViewById(R.id.recycleViewContainer);
         recyclerView.setHasFixedSize(true);

         layoutManager = new LinearLayoutManager(this);

         recyclerView.setLayoutManager(layoutManager);

         abcd2List = new ArrayList<>();
         abcd2List.add(new abcd2("Building Material & Construction", R.drawable.envi));
         abcd2List.add(new abcd2("Strength of Materials",  R.drawable.envi));
         abcd2List.add(new abcd2("Engineering & Environmental Surveying",  R.drawable.envi));
         abcd2List.add(new abcd2("Environmental Chemistry & Microbiology",  R.drawable.envi));
         abcd2List.add(new abcd2("Engineering Analysis & Design",  R.drawable.envi));
         abcd2List.add(new abcd2("SEM 4",  R.drawable.white));
         abcd2List.add(new abcd2("Structural Analysis",  R.drawable.envi));
         abcd2List.add(new abcd2("Geotechnical Engineering",  R.drawable.envi));
         abcd2List.add(new abcd2("Water Engineering: Design & Application",  R.drawable.envi));
         abcd2List.add(new abcd2("Engineering Geology, GIS & Remote Sensing",  R.drawable.envi));
         abcd2List.add(new abcd2("Fluid Mechanics & Hydraulic Machines",  R.drawable.envi));
         abcd2List.add(new abcd2("SEM 5",  R.drawable.white));
         abcd2List.add(new abcd2("Waste Water Engineering",  R.drawable.envi));
         abcd2List.add(new abcd2("Instrumentation Techniques",  R.drawable.envi));
         abcd2List.add(new abcd2("SEM 6",  R.drawable.white));
         abcd2List.add(new abcd2("Solid Waste Management",  R.drawable.envi));
         abcd2List.add(new abcd2("Air Pollution & Control",  R.drawable.envi));
         abcd2List.add(new abcd2("Hydrology & Ground Water Engineering",  R.drawable.envi));
         abcd2List.add(new abcd2("",  R.drawable.envi));
         abcd2List.add(new abcd2("",  R.drawable.envi));
         abcd2List.add(new abcd2("SEM 7",  R.drawable.white));
         abcd2List.add(new abcd2("Vibration Analysis & Control of Noise Pollution",  R.drawable.envi));
         abcd2List.add(new abcd2("Industrial Waste Management",  R.drawable.envi));
         abcd2List.add(new abcd2("SEM 8",  R.drawable.envi));
         abcd2List.add(new abcd2("Environmental Impact Assessment & Audit",  R.drawable.envi));

         mAdapter=new com.example.sachin.dtures.ListAdapter(this,abcd2List,type);
         recyclerView.setAdapter(mAdapter);


         /// Grab your RecyclerView, RecyclerViewFastScroller, and SectionTitleIndicator from the layout
         VerticalRecyclerViewFastScroller fastScroller = (VerticalRecyclerViewFastScroller) findViewById(R.id.fast_scroller);

         // Connect the recycler to the scroller (to let the scroller scroll the list)
         fastScroller.setRecyclerView(recyclerView);

         // Connect the scroller to the recycler (to let the recycler scroll the scroller's handle)
         recyclerView.setOnScrollListener(fastScroller.getOnScrollListener());


    }

    public static class ListUtils {
        public static void setDynamicHeight(ListView mListView) {
            ListAdapter mListAdapter = mListView.getAdapter();
            if (mListAdapter == null) {
                // when adapter is null
                return;
            }
            int height = 0;
            int desiredWidth = View.MeasureSpec.makeMeasureSpec(mListView.getWidth(), View.MeasureSpec.UNSPECIFIED);
            for (int i = 0; i < mListAdapter.getCount(); i++) {
                View listItem = mListAdapter.getView(i, null, mListView);
                listItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
                height += listItem.getMeasuredHeight();
            }
            ViewGroup.LayoutParams params = mListView.getLayoutParams();
            params.height = height + (mListView.getDividerHeight() * (mListAdapter.getCount() - 1));
            mListView.setLayoutParams(params);
            mListView.requestLayout();
        }

    }
}
