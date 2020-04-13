package com.example.week10_listview.ques3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.example.week10_listview.R;
import com.example.week10_listview.ques1.Superhero;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

import static com.example.week10_listview.ques3.QUES3.imageView;

public class RecyclerAdapterForImages extends RecyclerView.Adapter<RecyclerAdapterForImages.MyHolder> {
    Context context;

    ArrayList<Superhero> images;

    public RecyclerAdapterForImages(Context context, ArrayList<Superhero> images) {

        this.context = context;

        this.images = images;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyHolder(LayoutInflater.from(context).inflate(R.layout.list_items_for_circular_image, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder holder, final int position) {

        Glide.with(context).load(Uri.parse(images.get(position).getDp())).addListener(new RequestListener<Drawable>() {
            @Override
            public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                return false;
            }

            @Override
            public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                holder.image.setImageDrawable(resource);
                return true;
            }
        }).submit();

        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.with(context).load(Uri.parse(images.get(position).getDp())).addListener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                        imageView.setImageDrawable(resource);
                        return true;
                    }
                }).submit();
                Toast.makeText(context, "You selected: "+images.get(position).getName()+"\nAt position: "+(position+1), Toast.LENGTH_SHORT).show();
            }
        });

    }

   

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        CircleImageView image;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);




        }
    }


}
