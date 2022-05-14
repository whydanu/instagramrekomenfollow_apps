package com.example.instagramfollowclone;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.MyViewHolder> {

    int a [];

    public AdapterClass(int []a) {
        this.a = a;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.silder_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull AdapterClass.MyViewHolder holder, int position) {
        holder.imageview.setImageResource(a[position]);

    }

    @Override
    public int getItemCount() {
        return a.length;
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder{
        CircleImageView imageview;
        public MyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            imageview = itemView.findViewById(R.id.image_view);
        }
    }
}
