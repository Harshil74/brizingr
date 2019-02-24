package com.example.brizingr2k19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.brizingr2k19.events.AutoMobile;
import com.example.brizingr2k19.events.Civil;
import com.example.brizingr2k19.events.Comp;
import com.example.brizingr2k19.events.EC;
import com.example.brizingr2k19.events.Electrical;
import com.example.brizingr2k19.events.FunZone;
import com.example.brizingr2k19.events.IC;
import com.example.brizingr2k19.events.Mech;

public class Event extends AppCompatActivity {

    CardView c1,c2,c3,c4,c5,c6,c7,c8;

    private Toolbar mTopToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        mTopToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mTopToolbar);
        getSupportActionBar().setTitle("Events");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        c1 = findViewById(R.id.card_computer);
        c2 = findViewById(R.id.card_mech);
        c3 = findViewById(R.id.card_ec);
        c4 = findViewById(R.id.card_ic);
        c5 = findViewById(R.id.card_civil);
        c6 = findViewById(R.id.card_automobile);
        c7 = findViewById(R.id.card_electrical);
        c8 = findViewById(R.id.card_fun);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Event.this, CompMain.class));
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Event.this, MechMain.class));
            }
        });

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Event.this, ECMain.class));
            }
        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Event.this, ICMain.class));
            }
        });

        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Event.this, CivilMain.class));
            }
        });

        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Event.this, AutoMobileMain.class));
            }
        });

        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Event.this, Electrical.class));
            }
        });

        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Event.this, FunZone.class));
            }
        });
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
