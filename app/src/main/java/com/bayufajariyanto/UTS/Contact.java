package com.bayufajariyanto.UTS;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Contact extends AppCompatActivity {

    private ArrayList<Data> dataArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        addData();

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        ContactAdapter adapter = new ContactAdapter(dataArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Contact.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){
        dataArrayList = new ArrayList<>();
        dataArrayList.add(new Data("Bayu Fajariyanto", "083851350939", "Pasuruan","L"));
        dataArrayList.add(new Data("Fathur Rohman", "082940795647", "Pujon","L"));
        dataArrayList.add(new Data("Anindya Nindi", "085738491602", "Bojonegoro","P"));
        dataArrayList.add(new Data("Fajar Rahman", "089374182438", "Surabaya","L"));
        dataArrayList.add(new Data("Dita Arsy", "082384759120", "Malang","P"));
    }

}