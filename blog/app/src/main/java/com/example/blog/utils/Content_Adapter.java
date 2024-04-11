package com.example.blog.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;


import com.example.blog.ContentInterface;

import com.example.blog.R;
import com.example.blog.models.ContentModel;

import java.util.ArrayList;

public class Content_Adapter extends RecyclerView.Adapter<Content_Adapter.MyViewHolder> {
    private final ContentInterface contentInterface;
    // content adapter
    Context context;
    ArrayList<ContentModel>contentModels;

    public Content_Adapter(Context context, ArrayList<ContentModel> contentModels,
                           ContentInterface contentInterface) {
        this.context = context;
        this.contentModels = contentModels;
        this.contentInterface = contentInterface;
    }

    @NonNull
    @Override
    public Content_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.content_view, parent, false);
        return new MyViewHolder(view) ;

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.content_view, parent, false);
        return new MyViewHolder(view, contentInterface) ;

    }

    @Override
    public void onBindViewHolder(@NonNull Content_Adapter.MyViewHolder holder, int position) {
        holder.authorName.setText("Hard coded for now");
        holder.time.setText(contentModels.get(position).getTime());
        holder.title.setText(contentModels.get(position).getTitle());
        holder.date.setText(contentModels.get(position).getDate());

        Glide.with(context).load(contentModels.get(position).getImage()).into(holder.imageView2);

        Glide.with(context).load(contentModels.get(position).getImage()).into(holder.imageView2);


    }

    @Override
    public int getItemCount() {
        return contentModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {



        TextView title, authorname, date, time;
        ImageView imageView2;


        public MyViewHolder(@NonNull View itemView, ContentInterface contentInterface) {
            super(itemView);

            imageView2 = itemView.findViewById(R.id.imageView2);
            title = itemView.findViewById(R.id.title);
            time = itemView.findViewById(R.id.time);
            date = itemView.findViewById(R.id.date);
            authorname = itemView.findViewById(R.id.authorid);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (contentInterface != null){
                        int position = getAdapterPosition();


                        if (position!= RecyclerView.NO_POSITION){
                            contentInterface.onPostClick(position);
                        }

                    }
                }
            });

        }
    }
}
