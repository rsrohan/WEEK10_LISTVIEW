package com.example.week10_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

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
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view =  inflater.inflate(R.layout.list_items_for_superheros,parent,false);

        ImageView dp = view.findViewById(R.id.ivSuperhero);
        TextView name = view.findViewById(R.id.tvSuperheroName);
        TextView superpower = view.findViewById(R.id.tvSuperpower);
        Button delete = view.findViewById(R.id.btnDelete);




        return view;
    }
}
