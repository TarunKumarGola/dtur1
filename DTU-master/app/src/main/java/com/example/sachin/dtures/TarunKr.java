package com.example.sachin.dtures;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class TarunKr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarun_kr);

        final ImageView dev_fb1=findViewById(R.id.dev_fb);
        final ImageView dev_gmail1=findViewById(R.id.dev_gmail);
        final ImageView dev_linkedin=findViewById(R.id.dev_linkedin);
        final ImageView dev_github=findViewById(R.id.dev_git);


        dev_gmail1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent email = new Intent(Intent.ACTION_SENDTO);
                email.setData(Uri.parse("mailto:"));
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"tarun.dev.and@gmail.com"});
                email.putExtra(Intent.EXTRA_SUBJECT, "DTU Resources");
                email.putExtra(Intent.EXTRA_TEXT, "Query/Feedback");
                startActivity(email);
            }
        });
        dev_fb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TarunKr.this,"Developer Not On Facebok",Toast.LENGTH_SHORT).show();

            }
        });
        dev_linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse("https://www.linkedin.com");
                Intent browse = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(browse);
            }
        });
        dev_github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse("https://www.github.com/TarunKumarGola");
                Intent browse = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(browse);
            }
        });



    }
}
