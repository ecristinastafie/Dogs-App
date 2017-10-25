package com.tina.dogs;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import java.io.Serializable;

public class DogDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_details);

    //PART OF THE BACK BUTTON CODE

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        TextView mName = (TextView) findViewById(R.id.name);
        TextView mAge = (TextView)findViewById(R.id.age);
        TextView mBreed = (TextView)findViewById(R.id.breed);

        Intent intent = getIntent();
        Dog dog = (Dog) intent.getSerializableExtra("dog_data");

        mName.setText(dog.getName());
        mAge.setText(dog.getAge() + "");
        mBreed.setText(dog.getBreed());
    }

    //THE BACK BUTTON
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
