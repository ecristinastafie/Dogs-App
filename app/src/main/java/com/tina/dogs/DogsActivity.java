package com.tina.dogs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DogsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogs);

        ArrayList<Dog>dogs = new ArrayList<>();
        dogs.add (new Dog("Scooby", 2, "Mixed Race"));
        dogs.add(new Dog("Max", 1, "Labrador"));
        dogs.add(new Dog("Serghei", 3, "Dalmatian"));
        dogs.add(new Dog("Carla", 1, "Pocket Dog"));


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list_dogs);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        DogsAdapter dogsAdapter = new DogsAdapter(dogs);
        recyclerView.setAdapter(dogsAdapter);
    }
}
