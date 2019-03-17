package com.example.sachin.dtures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class SE extends AppCompatActivity {


    String type;
    private RecyclerView subjectrecyclerView;
    String[] semthreesub={"Analog Electronics","Data Structures","Object Oriented Programming","Web Technology","Modelling and Simulation","Engineering Economics","Java Programming"};
    String[] semfoursub={"Digital Electronics","Software Engineering","Computer Oraganization and Architecture","DataBase Management System","Discrete Structure","Fundamental of Management"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_se);
        Toolbar toolbar=findViewById(R.id.toolbarsubjectse);
        setSupportActionBar(toolbar);
        type=getIntent().getStringExtra("type");
        subjectrecyclerView=findViewById(R.id.subjectRecyclerViewse);
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
