package com.example.sachin.dtures;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

import xyz.danoz.recyclerviewfastscroller.vertical.VerticalRecyclerViewFastScroller;

public class COE extends AppCompatActivity {

    String type;

    String[] SubjectsList={"Analog Electronics","Data Structure","Object Oriented Programming","Engineering Analysis and Design","SEM 4",
            "Digital Electronics","Digital Electronics","DBMS","Operating System Design","Comp. Org. & Arch","Algo Design ana Analysis","SEM 5","Software Engineering"
            ,"Theory of Computation","Compiler Design","SEM 6","Artificial Intelligence","Information and Network Security","Distributed System","SEM 7","Data warehouse and mining"
    };




    int [] picList={R.drawable.computerblack,R.drawable.computerblack,R.drawable.computerblack,R.drawable.computerblack,R.drawable.computerblack,R.drawable.computerblack,
            R.drawable.computerblack,R.drawable.computerblack,R.drawable.computerblack,R.drawable.computerblack,R.drawable.computerblack,R.drawable.computerblack,R.drawable.computerblack,
            R.drawable.computerblack,R.drawable.computerblack,R.drawable.computerblack,R.drawable.computerblack,R.drawable.computerblack,R.drawable.computerblack,
            R.drawable.computerblack,R.drawable.computerblack
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coe);
        ImageView backbutton=findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(COE.this,Home.class);
                startActivity(intent);
            }
        });




        type = getIntent().getStringExtra("type");

         RecyclerView recyclerView;
         RecyclerView.Adapter mAdapter;
         RecyclerView.LayoutManager layoutManager;

         recyclerView = (RecyclerView) findViewById(R.id.recycleViewContainer);
         recyclerView.setHasFixedSize(false);

        /// Grab your RecyclerView, RecyclerViewFastScroller, and SectionTitleIndicator from the layout
         VerticalRecyclerViewFastScroller fastScroller = (VerticalRecyclerViewFastScroller) findViewById(R.id.fast_scroller);

         // Connect the recycler to the scroller (to let the scroller scroll the list)
         fastScroller.setRecyclerView(recyclerView);

         // Connect the scroller to the recycler (to let the recycler scroll the scroller's handle)
         recyclerView.setOnScrollListener(fastScroller.getOnScrollListener());

         List<abcd2> abcd2List;



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

         mAdapter=new com.example.sachin.dtures.ListAdapter(this,abcd2List,type);
         recyclerView.setAdapter(mAdapter);



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
