package com.example.sachin.dtures;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import xyz.danoz.recyclerviewfastscroller.vertical.VerticalRecyclerViewFastScroller;

public class First_Year_Subj extends AppCompatActivity {



    private RecyclerView subjectrecyclerView;
    String type;
    String []subjectslist={"Electrical","Computer","Environment","Mechanical","Mathematics","Engineering Drawing","Physics","Chemistry","English"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first__year__subj);
        type = getIntent().getStringExtra("type");
        /*RecyclerView recyclerView;
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
        abcd2List = new ArrayList<>();
        abcd2List.add(new abcd2("Electrical", R.drawable.computerblack));
        abcd2List.add(new abcd2("Computer",  R.drawable.computerblack));
        abcd2List.add(new abcd2("Environment",  R.drawable.computerblack));
        abcd2List.add(new abcd2("Mechanical",  R.drawable.computerblack));
        abcd2List.add(new abcd2("Mathematics ",  R.drawable.computerblack));

        abcd2List.add(new abcd2("Engineering Drawing",  R.drawable.computerblack));
        abcd2List.add(new abcd2("Physics",  R.drawable.computerblack));
        abcd2List.add(new abcd2("Chemistry",  R.drawable.computerblack));
        abcd2List.add(new abcd2("English",  R.drawable.computerblack));


        mAdapter=new com.example.sachin.dtures.ListAdapter(this,abcd2List);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/
      final ArrayList<abcd> subject = new ArrayList<>();
        subject.add(new abcd("Electrical",  R.drawable.computerblack));
        subject.add(new abcd("Computer",  R.drawable.computerblack));
        subject.add(new abcd("Environment",  R.drawable.computerblack));
        subject.add(new abcd("Mechanical",  R.drawable.computerblack));
        subject.add(new abcd("Mathematics",  R.drawable.computerblack));
        subject.add(new abcd("Engineering Drawing",R.drawable.computerblack));
        subject.add(new abcd("Physics",  R.drawable.computerblack));
        subject.add(new abcd("Chemistry",  R.drawable.computerblack));
        subject.add(new abcd("English ",R.drawable.computerblack));

        ListView list = findViewById(R.id.lvf);
        wordextender item = new wordextender(this, subject);
        list.setAdapter(item);
       // COE.ListUtils.setDynamicHeight(list);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                abcd word = subject.get(position);
                Intent intent=new Intent(First_Year_Subj.this,first_year_items.class);
                intent.putExtra("type",type);
                intent.putExtra("subject",word.getKann());
                startActivity(intent);
            }
        });



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
