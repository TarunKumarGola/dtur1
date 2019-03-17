package com.example.sachin.dtures;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class First_Year_Subj extends AppCompatActivity {



    private RecyclerView subjectrecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first__year__subj);
        String type=getIntent().getStringExtra("type");
        subjectrecyclerView=findViewById(R.id.subjectRecyclerView);
        subjectrecyclerView.setLayoutManager(new LinearLayoutManager(this));
        String []subjectslist={"Electrical","Computer","Environment","Mechanical","Mathematics","Engineering Drawing","Physics","Chemistry","English"};
        String []subjectsdescriptions={"Electrical Engineers do it with more frequency","You can love it or hate it","Mother Nature","Don't know","God is Greatest Mathematician","Art will never live you","I love it","Half truth","Without any reason"};
        int []subjectimgids={R.mipmap.electricalcon,R.mipmap.computerscienceicon,R.mipmap.iticonpng,R.mipmap.mechanicalicon,
                R.drawable.software,R.mipmap.eceiconpng,R.mipmap.softicon,R.mipmap.csicon,R.mipmap.eceiconpng,R.drawable.software,
                R.drawable.software

        };
        subjectrecyclerView.setAdapter(new SubjectAdapter("FirstYear",subjectslist,subjectsdescriptions,subjectimgids,type));

    }
}
