package com.example.uploadverification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Reportdispaly extends AppCompatActivity {
    RecyclerView recyclerView;
    ReportAdapter reportAdapter;
    DatabaseHelper databaseHelper;
    ArrayList<Transport_Model> transport_models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportdispaly);
        recyclerView = findViewById(R.id.recy_report);
        databaseHelper = new DatabaseHelper(this);
        transport_models = databaseHelper.getAllTransport();
       reportAdapter = new ReportAdapter(this,transport_models);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(reportAdapter);

    }
}