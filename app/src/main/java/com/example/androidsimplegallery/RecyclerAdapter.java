package com.example.androidsimplegallery;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ImageViewHolder> {
    int [] images;
    public  RecyclerAdapter(int[] images){
        this.images = images;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.picture_layout,parent,false);
        ImageViewHolder imageViewHolder = new ImageViewHolder(view);
        return imageViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        int image_id = images[position];
        holder.Picture.setImageResource(image_id);
        holder.PictureTitle.setText("Picture: "+position);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }
    public static class ImageViewHolder extends  RecyclerView.ViewHolder {

        ImageView Picture;
        TextView PictureTitle;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            Picture = itemView.findViewById(R.id.picture);
            PictureTitle = itemView.findViewById(R.id.picture_title);
        }
    }
}
