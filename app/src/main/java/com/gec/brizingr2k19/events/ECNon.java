package com.gec.brizingr2k19.events;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import com.gec.brizingr2k19.R;
import com.gec.brizingr2k19.expantable.Custom_expantable_adapter;
import com.gec.brizingr2k19.expantable.ExpantableECNon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ECNon extends AppCompatActivity {

    private Toolbar mTopToolbar;
    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecnon);


        mTopToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mTopToolbar);
        getSupportActionBar().setTitle("EC Non-Techanical");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        expandableListView = findViewById(R.id.expandableListViewECNon);
        expandableListDetail = ExpantableECNon.getData();
        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
        expandableListAdapter = new Custom_expantable_adapter(this, expandableListTitle, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {

            }
        });

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {

            }
        });

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                return false;
            }
        });

    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
