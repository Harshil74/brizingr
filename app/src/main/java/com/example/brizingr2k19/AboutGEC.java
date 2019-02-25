package com.example.brizingr2k19;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CalendarView;
import android.widget.ImageView;

public class AboutGEC extends AppCompatActivity {

    private Toolbar mTopToolbar;
    ImageView hGLink;
    CardView cardHarshil,cardGec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_gec);

        mTopToolbar = (Toolbar) findViewById(R.id.toolbar);
        cardHarshil = findViewById(R.id.card_harshil);
        CardView cardNehal = findViewById(R.id.card_nehal);
        setSupportActionBar(mTopToolbar);
        getSupportActionBar().setTitle("About GEC");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        cardGec = findViewById(R.id.card_gec);

        hGLink = findViewById(R.id.harshil_linkedin);

        cardHarshil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/harshil-gohel-592b8712b/"));
                startActivity(intent);
            }
        });

        cardGec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.gecrj.cteguj.in/"));
                startActivity(intent);
            }
        });

        cardNehal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/nehal-dholakia-970a7914b/"));
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
