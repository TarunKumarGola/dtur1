package com.example.sachin.dtures;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private Context context;
    private List<abcd2> personUtils;

    public ListAdapter(Context context, List personUtils) {
        this.context = context;
        this.personUtils = personUtils;
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

        abcd2 pu = personUtils.get(position);

        holder.pName.setImageResource(pu.getImgRes());
        holder.pJobProfile.setText(pu.getKann());

    }

    @Override
    public int getItemCount() {
        return personUtils.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView pName;
        public TextView pJobProfile;

        public ViewHolder(View itemView) {
            super(itemView);

            pName =  itemView.findViewById(R.id.iv);
            pJobProfile = itemView.findViewById(R.id.t1);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    abcd2 cpu = (abcd2) view.getTag();
                    //jo bhi aage onclick pe karna hai...

                }
            });

        }
    }

}