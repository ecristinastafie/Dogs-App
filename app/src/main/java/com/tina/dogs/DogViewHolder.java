package com.tina.dogs;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


public class DogViewHolder extends RecyclerView.ViewHolder{

        TextView nameTv;
        TextView ageTv;
        TextView breedTv;

    public DogViewHolder(View itemView) {
        super(itemView);

        nameTv = itemView.findViewById(R.id.name);
        ageTv = itemView.findViewById(R.id.age);
        breedTv = itemView.findViewById(R.id.breed);

    }
}
