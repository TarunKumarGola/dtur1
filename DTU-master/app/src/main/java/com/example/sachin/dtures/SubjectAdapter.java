package com.example.sachin.dtures;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/*
public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.SubjectViewHolder> {
    String branch;
    String[] sublist;
    String[] descriptions;
    int[] ids;
    String type;

    public SubjectAdapter(String branch,String[] sublist, String[] descriptions, int[] ids, String type) {
        this.branch=branch;
        this.sublist = sublist;
        this.descriptions = descriptions;
        this.ids = ids;
        this.type=type;
    }

    @NonNull
    @Override
    public SubjectViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
       View view=inflater.inflate(R.layout.listofsubjects,viewGroup,false);
        return new SubjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final SubjectViewHolder subjectViewHolder, final int i) {
        subjectViewHolder.subjtitle.setText(sublist[i]);
        subjectViewHolder.subjdesc.setText(descriptions[i]);
        subjectViewHolder.subjimg.setImageResource(ids[i]);
        subjectViewHolder.subjectlistlinearlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (branch.equals("FirstYear")) {
                   Intent intent = new Intent("com.example.sachin.dtures.first_year_items");
                   intent.putExtra("subject", sublist[i]);
                   intent.putExtra("type", type);
                   subjectViewHolder.context.startActivity(intent);
               }
               else if (branch.equals("COE")){
                   Intent intent = new Intent("com.example.sachin.dtures.COE");
                   intent.putExtra("subject", sublist[i]);
                   intent.putExtra("type", type);
                   subjectViewHolder.context.startActivity(intent);
               }
               else if (branch.equals("IT")){
                   Intent intent = new Intent("com.example.sachin.dtures.IT");
                   intent.putExtra("subject", sublist[i]);
                   intent.putExtra("type", type);
                   subjectViewHolder.context.startActivity(intent);
               } else if (branch.equals("SE")){
                   Intent intent = new Intent("com.example.sachin.dtures.SE");
                   intent.putExtra("subject", sublist[i]);
                   intent.putExtra("type", type);
                   subjectViewHolder.context.startActivity(intent);
               } else if (branch.equals("ME")){
                   Intent intent = new Intent("com.example.sachin.dtures.ME");
                   intent.putExtra("subject", sublist[i]);
                   intent.putExtra("type", type);
                   subjectViewHolder.context.startActivity(intent);
               } else if (branch.equals("ECE")){
                   Intent intent = new Intent("com.example.sachin.dtures.ECE");
                   intent.putExtra("subject", sublist[i]);
                   intent.putExtra("type", type);
                   subjectViewHolder.context.startActivity(intent);
               } else if (branch.equals("PC")){
                   Intent intent = new Intent("com.example.sachin.dtures.PC");
                   intent.putExtra("subject", sublist[i]);
                   intent.putExtra("type", type);
                   subjectViewHolder.context.startActivity(intent);
               } else if (branch.equals("EE")){
                   Intent intent = new Intent("com.example.sachin.dtures.EE");
                   intent.putExtra("subject", sublist[i]);
                   intent.putExtra("type", type);
                   subjectViewHolder.context.startActivity(intent);
               }

            }
        });
    }

    @Override
    public int getItemCount() {
        return sublist.length;
    }

    public class SubjectViewHolder extends RecyclerView.ViewHolder{
        TextView subjtitle;
        TextView subjdesc;
        ImageView subjimg;
        Context context;
        LinearLayout subjectlistlinearlayout;
        public SubjectViewHolder(@NonNull View itemView) {
            super(itemView);
            subjtitle=itemView.findViewById(R.id.subtitle);
            subjdesc=itemView.findViewById(R.id.subdescription);
            subjimg=itemView.findViewById(R.id.subImage);
            context=itemView.getContext();
            subjectlistlinearlayout=itemView.findViewById(R.id.subjectlistlinearlayout);
        }
    }
}

*/
