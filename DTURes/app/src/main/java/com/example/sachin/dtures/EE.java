package com.example.sachin.dtures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class EE extends AppCompatActivity {

    String type;
    private RecyclerView subjectrecyclerView;
    String[] semthreesub={"Numerical and Engineering ","Network Analysis and Synthesis","Electronics Devices and Circuits","ElectroMechanical Energy Conversion and Transformers","","Engineering Economics"};
    String[] semfoursub={"Power Plant Engineering ","Electromagnetic Field Theory","Digital Circuits and Systems","Control System","Asynchronous and Synchronous Machine","Fundamental of Management"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ee);
        Toolbar toolbar=findViewById(R.id.toolbarsubjectee);
        setSupportActionBar(toolbar);
        type=getIntent().getStringExtra("type");
        subjectrecyclerView=findViewById(R.id.subjectRecyclerViewee);
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