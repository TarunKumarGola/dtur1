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

public class First_Year_Subj extends AppCompatActivity {



    private RecyclerView subjectrecyclerView;
    String type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first__year__subj);
        type = getIntent().getStringExtra("type");

        ImageView backbutton=findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(First_Year_Subj.this,Home.class);
                startActivity(intent);
            }
        });

        final ArrayList<abcd> subject = new ArrayList<>();
        subject.add(new abcd("Mathematics",  R.drawable.first));
        subject.add(new abcd("Physics",  R.drawable.first));
        subject.add(new abcd("Chemistry",  R.drawable.first));
        subject.add(new abcd("Electrical",  R.drawable.first));
        subject.add(new abcd("Computer",  R.drawable.first));
        subject.add(new abcd("Mechanical",  R.drawable.first));
        subject.add(new abcd("Engineering Drawing",R.drawable.first));

        ListView list = findViewById(R.id.lvf);
        wordextender item = new wordextender(this, subject);
        list.setAdapter(item);

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
