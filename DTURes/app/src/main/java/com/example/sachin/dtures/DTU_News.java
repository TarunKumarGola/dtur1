package com.example.sachin.dtures;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class DTU_News extends Fragment implements View.OnClickListener {
    FloatingActionButton newPostButton;
    RecyclerView recyclerView;
    DatabaseReference mref;


    public DTU_News() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_dtu__news, container, false);
        mref=FirebaseDatabase.getInstance().getReference().child("DTUNEWS");
        newPostButton=rootView.findViewById(R.id.floatingActionPostButton);
        recyclerView=rootView.findViewById(R.id.dtunnewRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        newPostButton.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent("com.example.sachin.dtures.AddPost"));
    }
    public static class PostViewHolder extends RecyclerView.ViewHolder{
        View view;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            view=itemView;
        }
        private void setPost(String title,String postDescription,String imageURL){
            TextView posttitle=view.findViewById(R.id.posttitlerecyclerview);
            TextView postdescp=view.findViewById(R.id.postdec);
            ImageView imageView=view.findViewById(R.id.dtunewimage);
            postdescp.setText(postDescription);
            posttitle.setText(title);
            Picasso.get().load(imageURL).into(imageView);


        }
    }

    @Override
    public void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<PostBlog,PostViewHolder> firebaseRecyclerAdapter=new FirebaseRecyclerAdapter<PostBlog, PostViewHolder>(
                PostBlog.class,
                R.layout.dtunewslayout,
                PostViewHolder.class,
                mref
        ) {
            @Override
            protected void populateViewHolder(PostViewHolder viewHolder, PostBlog model, int position) {
                viewHolder.setPost(model.getTitle(),model.getDescript(),model.getImageUrl());
            }
        };
        recyclerView.setAdapter(firebaseRecyclerAdapter);
    }
}
