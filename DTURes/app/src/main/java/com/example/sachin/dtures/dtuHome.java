package com.example.sachin.dtures;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class dtuHome extends Fragment implements View.OnClickListener {


    private boolean isbooks;
    private boolean ispaper;
    private boolean ispractical;
    private boolean isnotes;
    private CardView firstYear;
    private CardView ComputerScience;
    private CardView InformationTechnology;
    private CardView Sowftware;
    private CardView ECE;
    private CardView Placements;
    private CardView MCE;
    private CardView EE;
    private CardView Syllabus;

    BottomNavigationView bottomNavigationView;
    public dtuHome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_dtu_home, container, false);
        isbooks=true;
        isnotes=false;
        ispaper=false;
        ispractical=false;
        bottomNavigationView=v.findViewById(R.id.homeBottomNavigationBar);
        firstYear=v.findViewById(R.id.firstYear);
        ComputerScience=v.findViewById(R.id.Computer_Science);
        InformationTechnology=v.findViewById(R.id.it);
        Sowftware=v.findViewById(R.id.se);
        ECE=v.findViewById(R.id.ECE);
        EE=v.findViewById(R.id.ee);
        Placements=v.findViewById(R.id.placement);
        MCE=v.findViewById(R.id.me);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                 switch (menuItem.getItemId()){
                     case R.id.book:Toast.makeText(getContext(),"You are in Books",Toast.LENGTH_LONG).show();
                              isbooks=true;
                              isnotes=false;
                              ispaper=false;
                              ispractical=false;

                       break;
                     case R.id.notes:Toast.makeText(getContext(),"You are in Notes",Toast.LENGTH_LONG).show();
                         isbooks=false;
                         isnotes=true;
                         ispaper=false;
                         ispractical=false;
                         break;
                     case R.id.paper:Toast.makeText(getContext(),"You are in paper",Toast.LENGTH_LONG).show();
                         isbooks=false;
                         isnotes=false;
                         ispaper=true;
                         ispractical=false;
                         break;
                     case R.id.Practical:Toast.makeText(getContext(),"You are in Practical",Toast.LENGTH_LONG).show();
                         isbooks=false;
                         isnotes=false;
                         ispaper=false;
                         ispractical=true;
                         break;

                 }

                return true;
            }
        });

        firstYear.setOnClickListener(this);
        ComputerScience.setOnClickListener(this);
        InformationTechnology.setOnClickListener(this);
        Sowftware.setOnClickListener(this);
        ECE.setOnClickListener(this);
        MCE.setOnClickListener(this);
        EE.setOnClickListener(this);
        Placements.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.firstYear){

           if (isbooks){
               Intent intent=new Intent("com.example.sachin.dtures.First_Year_Subj");
               intent.putExtra("type","Books");
               startActivity(intent);
           }
           else if (isnotes){
               Intent intent=new Intent("com.example.sachin.dtures.First_Year_Subj");
               intent.putExtra("type","Notes");
               startActivity(intent);
           }
           else if (ispaper) {
               Intent intent = new Intent("com.example.sachin.dtures.First_Year_Subj");
               intent.putExtra("type", "Question Paper");
               startActivity(intent);
           }
           else if (ispractical) {
               Intent intent = new Intent("com.example.sachin.dtures.First_Year_Subj");
               intent.putExtra("type", "Practicals");
               startActivity(intent);
           }
        }
        else if(view.getId()==R.id.Computer_Science)
            {
                if (isbooks){
                    Intent intent=new Intent("com.example.sachin.dtures.COE");
                    intent.putExtra("type","Books");
                    startActivity(intent);
                }
                else if (isnotes){
                    Intent intent=new Intent("com.example.sachin.dtures.COE");
                    intent.putExtra("type","Notes");
                    startActivity(intent);
                }
                else if (ispaper) {
                    Intent intent = new Intent("com.example.sachin.dtures.COE");
                    intent.putExtra("type", "Question Paper");
                    startActivity(intent);
                }
                else if (ispractical) {
                    Intent intent = new Intent("com.example.sachin.dtures.COE");
                    intent.putExtra("type", "Practicals");
                    startActivity(intent);
                }

            }
            else if (view.getId()==R.id.it) {
            if (isbooks) {
                Intent intent = new Intent("com.example.sachin.dtures.IT");
                intent.putExtra("type", "Books");
                startActivity(intent);
            } else if (isnotes) {
                Intent intent = new Intent("com.example.sachin.dtures.IT");
                intent.putExtra("type", "Notes");
                startActivity(intent);
            } else if (ispaper) {
                Intent intent = new Intent("com.example.sachin.dtures.IT");
                intent.putExtra("type", "Question Paper");
                startActivity(intent);
            } else if (ispractical) {
                Intent intent = new Intent("com.example.sachin.dtures.IT");
                intent.putExtra("type", "Practicals");
                startActivity(intent);
            }
        }
            else if (view.getId()==R.id.se){
                if (isbooks){
                    Intent intent=new Intent("com.example.sachin.dtures.SE");
                    intent.putExtra("type","Books");
                    startActivity(intent);
                }
                else if (isnotes){
                    Intent intent=new Intent("com.example.sachin.dtures.SE");
                    intent.putExtra("type","Notes");
                    startActivity(intent);
                }
                else if (ispaper) {
                    Intent intent = new Intent("com.example.sachin.dtures.SE");
                    intent.putExtra("type", "Question Paper");
                    startActivity(intent);
                }
                else if (ispractical) {
                    Intent intent = new Intent("com.example.sachin.dtures.SE");
                    intent.putExtra("type", "Practicals");
                    startActivity(intent);
                }

            }
            else if (view.getId()==R.id.ECE){
                if (isbooks){
                    Intent intent=new Intent("com.example.sachin.dtures.ECE");
                    intent.putExtra("type","Books");
                    startActivity(intent);
                }
                else if (isnotes){
                    Intent intent=new Intent("com.example.sachin.dtures.ECE");
                    intent.putExtra("type","Notes");
                    startActivity(intent);
                }
                else if (ispaper) {
                    Intent intent = new Intent("com.example.sachin.dtures.ECE");
                    intent.putExtra("type", "Question Paper");
                    startActivity(intent);
                }
                else if (ispractical) {
                    Intent intent = new Intent("com.example.sachin.dtures.ECE");
                    intent.putExtra("type", "Practicals");
                    startActivity(intent);
                }

            }
            else if (view.getId()==R.id.ee){
                if (isbooks){
                    Intent intent=new Intent("com.example.sachin.dtures.EE");
                    intent.putExtra("type","Books");
                    startActivity(intent);
                }
                else if (isnotes){
                    Intent intent=new Intent("com.example.sachin.dtures.EE");
                    intent.putExtra("type","Notes");
                    startActivity(intent);
                }
                else if (ispaper) {
                    Intent intent = new Intent("com.example.sachin.dtures.EE");
                    intent.putExtra("type", "Question Paper");
                    startActivity(intent);
                }
                else if (ispractical) {
                    Intent intent = new Intent("com.example.sachin.dtures.EE");
                    intent.putExtra("type", "Practicals");
                    startActivity(intent);
                }

            }
            else if (view.getId()==R.id.me){
                if (isbooks){
                    Intent intent=new Intent("com.example.sachin.dtures.ME");
                    intent.putExtra("type","Books");
                    startActivity(intent);
                }
                else if (isnotes){
                    Intent intent=new Intent("com.example.sachin.dtures.ME");
                    intent.putExtra("type","Notes");
                    startActivity(intent);
                }
                else if (ispaper) {
                    Intent intent = new Intent("com.example.sachin.dtures.ME");
                    intent.putExtra("type", "Question Paper");
                    startActivity(intent);
                }
                else if (ispractical) {
                    Intent intent = new Intent("com.example.sachin.dtures.ME");
                    intent.putExtra("type", "Practicals");
                    startActivity(intent);
                }

            }
            else if (view.getId()==R.id.placement){
                if (isbooks){
                    Intent intent=new Intent("com.example.sachin.dtures.PC");
                    intent.putExtra("type","Books");
                    startActivity(intent);
                }
                else if (isnotes){
                    Intent intent=new Intent("com.example.sachin.dtures.PC");
                    intent.putExtra("type","Notes");
                    startActivity(intent);
                }
                else if (ispaper) {
                    Intent intent = new Intent("com.example.sachin.dtures.PC");
                    intent.putExtra("type", "Question Paper");
                    startActivity(intent);
                }
                else if (ispractical) {
                    Intent intent = new Intent("com.example.sachin.dtures.PC");
                    intent.putExtra("type", "Practicals");
                    startActivity(intent);
                }

            }

        }

    }

