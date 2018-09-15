package com.example.anon.swiggy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> ImageUrls = new ArrayList<>();
    private ArrayList<String> ImageNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initImages();
    }

   private void initImages(){
       ImageUrls.add("https://res.cloudinary.com/swiggy/image/upload/fl_lossy,f_auto,q_auto,w_520,h_520/cp6mgo9qt7j7mp7yfwrh");
       ImageNames.add("Happy Vinayaka");

        ImageUrls.add("https://res.cloudinary.com/swiggy/image/upload/fl_lossy,f_auto,q_auto,w_520,h_520/nznuygntaetleyakn42l");
        ImageNames.add("Restaurants");

       ImageUrls.add("https://res.cloudinary.com/swiggy/image/upload/fl_lossy,f_auto,q_auto,w_520,h_520/zf0qg2lfynoq6w46itrf");
       ImageNames.add("Hot Dogs");

       ImageUrls.add("https://res.cloudinary.com/swiggy/image/upload/fl_lossy,f_auto,q_auto,w_520,h_520/la7ilaaeh7lecjv8nvsq");
       ImageNames.add("Pani Puri");

       ImageUrls.add("https://res.cloudinary.com/swiggy/image/upload/fl_lossy,f_auto,q_auto,w_520,h_520/qbt7uzcjer5y43gpvs0f");
       ImageNames.add("KFC Chicken");

    initRecycler();
   }
   private void initRecycler(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
       RecyclerView recyclerView = findViewById(R.id.recyclerview);
       RecyclerViewAdapter adapter = new RecyclerViewAdapter(ImageUrls, ImageNames, this);
       recyclerView.setAdapter(adapter);
       recyclerView.setLayoutManager(linearLayoutManager);
   }
}
