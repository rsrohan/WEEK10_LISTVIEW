package com.example.week10_listview.ques1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.example.week10_listview.R;

import java.util.ArrayList;

public class CustomAdapterForSuperhero extends BaseAdapter {


    private Context context;

    ArrayList<Superhero> superheroArrayList;

    public CustomAdapterForSuperhero(Context context, ArrayList<Superhero> superheroes)
    {
        this.context =context;
        this.superheroArrayList = superheroes;
    }

    @Override
    public int getCount() {
        return superheroArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return superheroArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view =  inflater.inflate(R.layout.list_items_for_superheros,parent,false);

        final ImageView dp = view.findViewById(R.id.ivSuperhero);
        TextView name = view.findViewById(R.id.tvSuperheroName);
        TextView superpower = view.findViewById(R.id.tvSuperpower);
        Button delete = view.findViewById(R.id.btnDelete);


        Glide.with(context).load(Uri.parse(superheroArrayList.get(position).getDp())).listener(new RequestListener<Drawable>() {
            @Override
            public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                Log.d("TAG", "onLoadFailed: "+e);
                return false;
            }

            @Override
            public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                dp.setImageDrawable(resource);
                return true;
            }
        }).submit();
        name.setText(superheroArrayList.get(position).getName());
        superpower.setText(superheroArrayList.get(position).getSuperpower());

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                superheroArrayList.remove(position);
                notifyDataSetChanged();
            }
        });


        return view;
    }
}
