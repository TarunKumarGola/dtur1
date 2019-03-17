package com.example.sachin.dtures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class PC extends AppCompatActivity {



    String type;
    private RecyclerView subjectrecyclerView;
    String[] semthreesub={"Aptitude","Coding","Non Tech ","Common InterView"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pc);
        Toolbar toolbar=findViewById(R.id.toolbarsubjectpc);
        setSupportActionBar(toolbar);
        type=getIntent().getStringExtra("type");
        subjectrecyclerView=findViewById(R.id.subjectRecyclerViewpc);
        subjectrecyclerView.setLayoutManager(new LinearLayoutManager(this));
        subjectrecyclerView.setAdapter(new branchSubjectAdapter(semthreesub,type));

    }
}


