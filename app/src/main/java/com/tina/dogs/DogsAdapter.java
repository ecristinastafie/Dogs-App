package com.tina.dogs;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Tina on 23/10/2017.
 */

public class DogsAdapter extends RecyclerView.Adapter<DogViewHolder> {
    private ArrayList<Dog> mDogs;

    public DogsAdapter(ArrayList<Dog> dogs) {
        mDogs = dogs;
    }

    @Override
    public DogViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dog, parent, false);
        return new DogViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final DogViewHolder holder, int position) {

        final Dog dog = mDogs.get(position);
        holder.nameTv.setText(dog.getName());
        holder.ageTv.setText("" + dog.getAge());
        holder.breedTv.setText("" + dog.getBreed());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            private Context context;

            @Override
            public void onClick(View view) {
                context = holder.itemView.getContext();
                Intent intent = new Intent(context, DogDetailsActivity.class);
                intent.putExtra("dog_data", dog);
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mDogs.size();
    }
}
