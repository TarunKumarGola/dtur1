package com.example.sachin.dtures;

import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static android.os.Environment.DIRECTORY_DOWNLOADS;

public class All_Branch_item extends AppCompatActivity {

    private String itemtype;
    private String itemsubject;
    private TextView toolbaritem;
    private RecyclerView bookrecyclerViewitems;
    DatabaseReference bookgroupref;
    DatabaseReference Notesref;
    DatabaseReference Practicalref;
    DatabaseReference PaperRef;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all__branch_item);
        Toolbar toolbar = findViewById(R.id.toolbarfirstyearitems);
        setSupportActionBar(toolbar);


        ImageView backbutton=findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(All_Branch_item.this,Home.class);
                startActivity(intent);
            }
        });


        toolbaritem=findViewById(R.id.toolbarfirstyearitemstitle);
        itemtype=getIntent().getStringExtra("type");
        itemsubject=getIntent().getStringExtra("subject");
        bookgroupref=FirebaseDatabase.getInstance().getReference().child("users").child("AllbranchSubjects").child("Books").child(itemsubject);
        Notesref=FirebaseDatabase.getInstance().getReference().child("users").child("AllbranchSubjects").child("Notes").child(itemsubject);
        PaperRef=FirebaseDatabase.getInstance().getReference().child("users").child("AllbranchSubjects").child("Paper").child(itemsubject);
        Practicalref=FirebaseDatabase.getInstance().getReference().child("users").child("AllbranchSubjects").child("Practical").child(itemsubject);

        toolbaritem.setText(itemsubject);

        bookrecyclerViewitems=findViewById(R.id.recyclerViewbooksitems);
        bookrecyclerViewitems.setLayoutManager(new LinearLayoutManager(this));

    }

    public static class BookViewholder extends RecyclerView.ViewHolder{
        View bookView;
        LinearLayout booklist;
        public BookViewholder(@NonNull View itemView) {
            super(itemView);
            bookView=itemView;
            booklist=itemView.findViewById(R.id.booklistLinearLayout);
        }
        public void setBook(String booktitle,String bookdownloadlink){
            TextView textView=bookView.findViewById(R.id.booktitle);
            textView.setText(booktitle);
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        if (itemtype.equals("Books")) {

            FirebaseRecyclerAdapter<Books, first_year_items.BookViewholder> booksBookViewholderFirebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Books, first_year_items.BookViewholder>(
                    Books.class,
                    R.layout.booklayout,
                    first_year_items.BookViewholder.class,
                    bookgroupref
            ) {
                @Override
                protected void populateViewHolder(first_year_items.BookViewholder viewHolder, final Books model, int position) {
                    viewHolder.setBook(model.getBooktitle(), model.getBookdownloadlink());
                    viewHolder.booklist.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            downloadbook(getApplicationContext(), model.getBooktitle(), model.getBooktype(), DIRECTORY_DOWNLOADS, model.getBookdownloadlink().trim());
                        }
                    });
                }
            };


            bookrecyclerViewitems.setAdapter(booksBookViewholderFirebaseRecyclerAdapter);
            progressDialog.dismiss();
        }
        else if (itemtype.equals("Notes")){

            FirebaseRecyclerAdapter<Books, first_year_items.BookViewholder> booksBookViewholderFirebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Books, first_year_items.BookViewholder>(
                    Books.class,
                    R.layout.booklayout,
                    first_year_items.BookViewholder.class,
                    Notesref
            ) {
                @Override
                protected void populateViewHolder(first_year_items.BookViewholder viewHolder, final Books model, int position) {
                    viewHolder.setBook(model.getBooktitle(), model.getBookdownloadlink());
                    viewHolder.booklist.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            downloadbook(getApplicationContext(), model.getBooktitle(), model.getBooktype(), DIRECTORY_DOWNLOADS, model.getBookdownloadlink().trim());
                        }
                    });
                }
            };


            bookrecyclerViewitems.setAdapter(booksBookViewholderFirebaseRecyclerAdapter);
            progressDialog.dismiss();

        }
        else if (itemtype.equals("Practicals")){
            FirebaseRecyclerAdapter<Books, first_year_items.BookViewholder> booksBookViewholderFirebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Books, first_year_items.BookViewholder>(
                    Books.class,
                    R.layout.booklayout,
                    first_year_items.BookViewholder.class,
                    Practicalref
            ) {
                @Override
                protected void populateViewHolder(first_year_items.BookViewholder viewHolder, final Books model, int position) {
                    viewHolder.setBook(model.getBooktitle(), model.getBookdownloadlink());
                    viewHolder.booklist.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            downloadbook(getApplicationContext(), model.getBooktitle(), model.getBooktype(), DIRECTORY_DOWNLOADS, model.getBookdownloadlink().trim());
                        }
                    });
                }
            };


            bookrecyclerViewitems.setAdapter(booksBookViewholderFirebaseRecyclerAdapter);

        }
        else if (itemtype.equals("Question Paper")){
            FirebaseRecyclerAdapter<Books, first_year_items.BookViewholder> booksBookViewholderFirebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Books, first_year_items.BookViewholder>(
                    Books.class,
                    R.layout.booklayout,
                    first_year_items.BookViewholder.class,
                    PaperRef
            ) {
                @Override
                protected void populateViewHolder(first_year_items.BookViewholder viewHolder, final Books model, int position) {
                    viewHolder.setBook(model.getBooktitle(), model.getBookdownloadlink());
                    viewHolder.booklist.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            downloadbook(getApplicationContext(), model.getBooktitle(), model.getBooktype(), DIRECTORY_DOWNLOADS, model.getBookdownloadlink().trim());
                        }
                    });
                }
            };

            bookrecyclerViewitems.setAdapter(booksBookViewholderFirebaseRecyclerAdapter);

        }



    }

    private void downloadbook(Context context, String Filename, String FileExtension, String DesignationDirectory, String url) {
        DownloadManager downloadManager=(DownloadManager) context.getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri=Uri.parse(url);
        DownloadManager.Request request=new DownloadManager.Request(uri);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context,DesignationDirectory,Filename+FileExtension);
        downloadManager.enqueue(request);
    }


}
