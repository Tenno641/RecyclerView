package com.example.day4.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.day4.R;
import com.example.day4.data.FlagsModel;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {


    List<FlagsModel> flags;

    public RecyclerViewAdapter(List<FlagsModel> flags) {
        this.flags = flags;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FlagsModel contact = flags.get(position);
        holder.countryName.setText(contact.getName());
        holder.flagIV.setImageResource(contact.getFlag());
    }

    @Override
    public int getItemCount() {
        return flags.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView countryName;
        ImageView flagIV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            countryName = itemView.findViewById(R.id.countryNameTV);
            flagIV= itemView.findViewById(R.id.countryFlagIV);

        }
    }

}
