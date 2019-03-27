package com.example.sachin.dtures;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class MAM extends AppCompatActivity {



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
                Intent intent=new Intent(MAM.this,Home.class);
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
         abcd2List.add(new abcd2("Quantitative Techniques", R.drawable.mam));
         abcd2List.add(new abcd2("Engineering Mechanics",  R.drawable.mam));
         abcd2List.add(new abcd2("Thermodynamics",  R.drawable.mam));
         abcd2List.add(new abcd2("Manufacturing Machines",  R.drawable.mam));
         abcd2List.add(new abcd2("Engineering Analysis and Design",  R.drawable.mam));
         abcd2List.add(new abcd2("SEM 4",  R.drawable.white));
         abcd2List.add(new abcd2("Automotive Electrical and Electronics",  R.drawable.mam));
         abcd2List.add(new abcd2("Heat and Mass Transfer",  R.drawable.mam));
         abcd2List.add(new abcd2("Theory of Machines",  R.drawable.mam));
         abcd2List.add(new abcd2("Mechanics of Solids",  R.drawable.mam));
         abcd2List.add(new abcd2("Material Engineering & Metallurgy",  R.drawable.mam));
         abcd2List.add(new abcd2("SEM 5",  R.drawable.white));
         abcd2List.add(new abcd2("Manufacturing Technology",  R.drawable.mam));
         abcd2List.add(new abcd2("Fluid Mechanics And Hydraulic Machines",  R.drawable.mam));
         abcd2List.add(new abcd2("SEM 6",  R.drawable.white));
         abcd2List.add(new abcd2("Design of Machine Elements",  R.drawable.mam));
         abcd2List.add(new abcd2("Internal Combustion Engines",  R.drawable.mam));
         abcd2List.add(new abcd2("Design of Automobile Components",  R.drawable.mam));
         abcd2List.add(new abcd2("SEM 7",  R.drawable.white));
         abcd2List.add(new abcd2("Alternative Fuels And Energy Systems",  R.drawable.mam));
         abcd2List.add(new abcd2("Production And Operations Management",  R.drawable.mam));
         abcd2List.add(new abcd2("Computer Aided Vehicle Design And Safety",  R.drawable.mam));

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
