package com.gustiramadhan.makananfavorit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {

    private Context mcontext;
    private ArrayList<Food> foods;

    public FoodAdapter(Context mcontext, ArrayList<Food> foods) {
        this.mcontext = mcontext;
        this.foods = foods;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mcontext);
        View view = inflater.inflate(R.layout.list_food_item, parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Food currentFood = foods.get(position);
        holder.tvName.setText(currentFood.getName());
        holder.tvPrice.setText(currentFood.getPrice()+"");
        holder.ratingBar.setRating(currentFood.getRate());
        if (currentFood.isFave()){
            holder.imageView.setImageResource(R.drawable.ic_favorite_24dp);
        }
        else {
            holder.imageView.setImageResource(R.drawable.ic_close_black_24dp);
        }

    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tvPrice, tvName;
        RatingBar ratingBar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            tvPrice = itemView.findViewById(R.id.tv_price);
            tvName = itemView.findViewById(R.id.tv_name);
            ratingBar = itemView.findViewById(R.id.ratingBar);
        }
    }
}
