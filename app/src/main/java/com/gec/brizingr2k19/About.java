package com.gec.brizingr2k19;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class About extends AppCompatActivity {


    private Toolbar mTopToolbar;
    CardView cardBrizingr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        mTopToolbar = (Toolbar) findViewById(R.id.toolbar);
        cardBrizingr = findViewById(R.id.card_brizingr);
        setSupportActionBar(mTopToolbar);
        getSupportActionBar().setTitle("About Brizingr");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        cardBrizingr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://instagram.com/brizingr_2k19?utm_source=ig_profile_share&igshid=12vu7du6fwvf6"));
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
