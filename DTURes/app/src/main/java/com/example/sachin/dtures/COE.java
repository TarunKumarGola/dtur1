package com.example.sachin.dtures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class COE extends AppCompatActivity {



    private RecyclerView subjectrecyclerView;
    String type;
    String[] semthreesub={"Analog Electronics","Data Structure","Object Oriented Programming","Discrete Structures"};
    String[] semfoursub={"Digital Electronics","Database Management Systems","Operating Systems Design","Computer Organization and Architecture","Algorithm and Design and Analysis","Fundamentas of management"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coe);
        Toolbar toolbar=findViewById(R.id.toolbarsubjectcoe);
        setSupportActionBar(toolbar);
        type=getIntent().getStringExtra("type");
        subjectrecyclerView=findViewById(R.id.subjectRecyclerViewcoe);
        subjectrecyclerView.setLayoutManager(new LinearLayoutManager(this));
        subjectrecyclerView.setAdapter(new branchSubjectAdapter(semthreesub,type));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.semestermenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.semester3:
                loadsemthreesub();
                 break;
            case  R.id.semester4:
                  loadsemfoursub();
                 break;
        }
        return true;
    }
    void loadsemthreesub(){
        subjectrecyclerView.setAdapter(new branchSubjectAdapter(semthreesub,type));
    }
    void loadsemfoursub(){
        subjectrecyclerView.setAdapter(new branchSubjectAdapter(semfoursub,type));
    }
}
