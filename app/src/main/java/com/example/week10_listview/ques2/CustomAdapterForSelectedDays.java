package com.example.week10_listview.ques2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.week10_listview.R;

import java.util.ArrayList;

import static com.example.week10_listview.ques2.QUES2.days;

public class CustomAdapterForSelectedDays extends BaseAdapter {


    private Context context;

    ArrayList<String> dayArrayList;

    public CustomAdapterForSelectedDays(Context context, ArrayList<String> dayArrayList) {
        this.context = context;
        this.dayArrayList = dayArrayList;

    }

    @Override
    public int getCount() {
        return dayArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return dayArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.list_items_for_days, parent, false);

        TextView name = view.findViewById(R.id.tvDayName);

        name.setText(dayArrayList.get(position));



        return view;
    }
}
