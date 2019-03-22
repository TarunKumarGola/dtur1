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
         abcd2List.add(new abcd2("Analog Electronics", R.drawable.computerblack));
         abcd2List.add(new abcd2("Data Structure",  R.drawable.computerblack));
         abcd2List.add(new abcd2("Object Oriented Programming",  R.drawable.computerblack));
         abcd2List.add(new abcd2("Engineering Analysis and Design",  R.drawable.computerblack));
         abcd2List.add(new abcd2("Discrete Structures",  R.drawable.computerblack));
         abcd2List.add(new abcd2("SEM 4",  R.drawable.white));
         abcd2List.add(new abcd2("Digital Electronics",  R.drawable.computerblack));
         abcd2List.add(new abcd2("DBMS",  R.drawable.computerblack));
         abcd2List.add(new abcd2("Operating System Design",  R.drawable.computerblack));
         abcd2List.add(new abcd2("Comp. Org. & Arch",  R.drawable.computerblack));
         abcd2List.add(new abcd2("Algo Design ana Analysis",  R.drawable.computerblack));
         abcd2List.add(new abcd2("SEM 5",  R.drawable.white));
         abcd2List.add(new abcd2("Software Engineering",  R.drawable.computerblack));
         abcd2List.add(new abcd2("Theory of Computation",  R.drawable.computerblack));
         abcd2List.add(new abcd2("Compiler Design",  R.drawable.computerblack));
         abcd2List.add(new abcd2("SEM 6",  R.drawable.white));
         abcd2List.add(new abcd2("Artificial Intelligence",  R.drawable.computerblack));
         abcd2List.add(new abcd2("Computer Networks",  R.drawable.computerblack));
         abcd2List.add(new abcd2("Information and Network Security",  R.drawable.computerblack));
         abcd2List.add(new abcd2("Distributed System",  R.drawable.computerblack));
         abcd2List.add(new abcd2("SEM 7",  R.drawable.white));
         abcd2List.add(new abcd2("Data warehouse and mining",  R.drawable.computerblack));

         mAdapter=new com.example.sachin.dtures.ListAdapter(this,abcd2List);
         recyclerView.setAdapter(mAdapter);


         /// Grab your RecyclerView, RecyclerViewFastScroller, and SectionTitleIndicator from the layout
         VerticalRecyclerViewFastScroller fastScroller = (VerticalRecyclerViewFastScroller) findViewById(R.id.fast_scroller);

         // Connect the recycler to the scroller (to let the scroller scroll the list)
         fastScroller.setRecyclerView(recyclerView);

         // Connect the scroller to the recycler (to let the recycler scroll the scroller's handle)
         recyclerView.setOnScrollListener(fastScroller.getOnScrollListener());


        /*
        final ArrayList<abcd> subject = new ArrayList<>();
        subject.add(new abcd("Analog Electronics",  R.drawable.computerblack));
        subject.add(new abcd("Data Structure",  R.drawable.computerblack));
        subject.add(new abcd("Object Oriented Programming",  R.drawable.computerblack));
        subject.add(new abcd("Digital Electronics",  R.drawable.computerblack));
        subject.add(new abcd("Discrete Structures",  R.drawable.computerblack));

        ListView list = findViewById(R.id.lvf);
        wordextender item = new wordextender(this, subject);
        list.setAdapter(item);
        COE.ListUtils.setDynamicHeight(list);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                abcd word = subject.get(position);
                //Jo Karna Hai aage;
            }
        });

        final ArrayList<abcd> subject2 = new ArrayList<>();
        subject2.add(new abcd("Analog Electronics",  R.drawable.computerblack));
        subject2.add(new abcd("Data Structure",  R.drawable.computerblack));
        subject2.add(new abcd("Object Oriented Programming",  R.drawable.computerblack));
        subject2.add(new abcd("Digital Electronics",  R.drawable.computerblack));
        subject2.add(new abcd("Discrete Structures",  R.drawable.computerblack));

        ListView list2 = findViewById(R.id.lvf2);
        wordextender item2 = new wordextender(this, subject2);
        list2.setAdapter(item2);
        COE.ListUtils.setDynamicHeight(list2);
        list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                abcd word = subject2.get(position);
                //Jo Karna Hai aage;
            }
        });

        */

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
