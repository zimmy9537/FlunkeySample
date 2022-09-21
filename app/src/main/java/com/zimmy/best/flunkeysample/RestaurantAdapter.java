package com.zimmy.best.flunkeysample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.zimmy.best.flunkeysample.jsondata.Datum;

import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantAdapterViewHolder> {

    Context context;
    ArrayList<Datum> restaurantList;

    public RestaurantAdapter(Context context, ArrayList<Datum> restaurantList) {
        this.context = context;
        this.restaurantList = restaurantList;
    }

    @NonNull
    @Override
    public RestaurantAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.restaurent_item, parent, false);
        return new RestaurantAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantAdapterViewHolder holder, int position) {
        holder.cityTv.setText("city:- "+restaurantList.get(position).getCity());
        holder.restaurantIdTv.setText("id:- "+restaurantList.get(position).getRestaurantId());
        holder.ratingTv.setText("rating:- "+String.valueOf(restaurantList.get(position).getRating()));
        holder.restaurantNameTv.setText("restaurant name:- "+restaurantList.get(position).getRestaurantName());
        Picasso.get().load(restaurantList.get(position).getImageUrl()).into(holder.restaurantImage);
    }

    @Override
    public int getItemCount() {
        return restaurantList.size();
    }

    static class RestaurantAdapterViewHolder extends RecyclerView.ViewHolder {

        private ImageView restaurantImage;
        private TextView restaurantIdTv;
        private TextView ratingTv;
        private TextView restaurantNameTv;
        private TextView cityTv;

        public RestaurantAdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            restaurantImage = itemView.findViewById(R.id.restaurantIv);
            restaurantIdTv = itemView.findViewById(R.id.restaurant_id);
            restaurantNameTv = itemView.findViewById(R.id.restaurant_name);
            ratingTv = itemView.findViewById(R.id.rating);
            cityTv = itemView.findViewById(R.id.city);
        }
    }
}
