package com.example.sachin.dtures;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import xyz.danoz.recyclerviewfastscroller.vertical.VerticalRecyclerViewFastScroller;

public class BT extends AppCompatActivity {



    String type;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coe);

        ImageView backbutton=findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BT.this,Home.class);
                startActivity(intent);
            }
        });

        type=getIntent().getStringExtra("type");
        type = getIntent().getStringExtra("type");



        RecyclerView recyclerView;
        RecyclerView.Adapter mAdapter;
        RecyclerView.LayoutManager layoutManager;
        recyclerView = (RecyclerView) findViewById(R.id.recycleViewContainer);

        /// Grab your RecyclerView, RecyclerViewFastScroller, and SectionTitleIndicator from the layout
        VerticalRecyclerViewFastScroller fastScroller = (VerticalRecyclerViewFastScroller) findViewById(R.id.fast_scroller);

        // Connect the recycler to the scroller (to let the scroller scroll the list)
        fastScroller.setRecyclerView(recyclerView);

        // Connect the scroller to the recycler (to let the recycler scroll the scroller's handle)
        recyclerView.setOnScrollListener(fastScroller.getOnScrollListener());

        List<abcd2> abcd2List;

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        abcd2List = new ArrayList<>();
        abcd2List.add(new abcd2("Applied Mathematics", R.drawable.biotech));
        abcd2List.add(new abcd2("Introduction to Biotechnology",  R.drawable.biotech));
        abcd2List.add(new abcd2("Biochemistry",  R.drawable.biotech));
        abcd2List.add(new abcd2("Biochemical Engineering Principles",  R.drawable.biotech));
        abcd2List.add(new abcd2("Engineering Analysis and Design",  R.drawable.biotech));
        abcd2List.add(new abcd2("SEM 4",  R.drawable.white));
        abcd2List.add(new abcd2("Data Structure and Algorithm",  R.drawable.biotech));
        abcd2List.add(new abcd2("Molecular Biology",  R.drawable.biotech));
        abcd2List.add(new abcd2("Genetics",  R.drawable.biotech));
        abcd2List.add(new abcd2("Microbiology",  R.drawable.biotech));
        abcd2List.add(new abcd2("Structural Biology",  R.drawable.biotech));
        abcd2List.add(new abcd2("SEM 5",  R.drawable.white));
        abcd2List.add(new abcd2("Immunology and Immuno-Technology",  R.drawable.biotech));
        abcd2List.add(new abcd2("Genetic Engineering",  R.drawable.biotech));
        abcd2List.add(new abcd2("SEM 6",  R.drawable.white));
        abcd2List.add(new abcd2("Plant Biotechnology",  R.drawable.biotech));
        abcd2List.add(new abcd2("Animal Biotechnology",  R.drawable.biotech));
        abcd2List.add(new abcd2("Genomics and Proteomics",  R.drawable.biotech));
        abcd2List.add(new abcd2("SEM 7",  R.drawable.white));
        abcd2List.add(new abcd2("Fundamental of Computational Biology",  R.drawable.biotech));
        abcd2List.add(new abcd2("Bioprocess Tech & Downstream Process",  R.drawable.biotech));
        abcd2List.add(new abcd2("SEM 8",  R.drawable.white));
        abcd2List.add(new abcd2("Advances in Computational Biology",  R.drawable.biotech));

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
