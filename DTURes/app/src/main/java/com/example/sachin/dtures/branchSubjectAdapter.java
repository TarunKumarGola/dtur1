package com.example.sachin.dtures;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class branchSubjectAdapter extends RecyclerView.Adapter<branchSubjectAdapter.branchSubjectViewHolder> {

   private String[] Subjectslist;
   private String type;

    public branchSubjectAdapter(String[] subjectslist, String type) {
        Subjectslist = subjectslist;
        this.type = type;
    }

    @NonNull
    @Override
    public branchSubjectViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(viewGroup.getContext());
        View view=layoutInflater.inflate(R.layout.layoutsubject,viewGroup,false);
        return new branchSubjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull branchSubjectViewHolder branchSubjectViewHolder, int i) {
           branchSubjectViewHolder.Subjects.setText(Subjectslist[i]);
    }

    @Override
    public int getItemCount() {
        return Subjectslist.length;
    }


    public class branchSubjectViewHolder extends RecyclerView.ViewHolder{
        TextView Subjects;
        public branchSubjectViewHolder(@NonNull View itemView) {
            super(itemView);
            Subjects=itemView.findViewById(R.id.subtitle);
        }
    }
}
