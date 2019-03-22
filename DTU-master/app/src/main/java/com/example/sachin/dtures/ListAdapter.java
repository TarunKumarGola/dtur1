package com.example.sachin.dtures;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private Context context;
    private List<abcd2> personUtils;
    private String type;


    public ListAdapter(Context context, List<abcd2> personUtils, String type) {
        this.context = context;
        this.personUtils = personUtils;
        this.type = type;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.itemView.setTag(personUtils.get(position));

        final abcd2 pu = personUtils.get(position);

        holder.pName.setImageResource(pu.getImgRes());
        holder.pJobProfile.setText(pu.getKann());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent intent=new Intent("com.example.sachin.dtures.All_Branch_item");
             intent.putExtra("type",type);
             intent.putExtra("subject",pu.getKann());
             context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return personUtils.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView pName;
        public TextView pJobProfile;
        public LinearLayout linearLayout;
        public ViewHolder(View itemView) {
            super(itemView);

            pName =  itemView.findViewById(R.id.iv);
            pJobProfile = itemView.findViewById(R.id.t1);
            linearLayout=itemView.findViewById(R.id.listLinearLayout);


        }
    }

}