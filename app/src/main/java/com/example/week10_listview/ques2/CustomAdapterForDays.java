package com.example.week10_listview.ques2;

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
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.example.week10_listview.R;
import com.example.week10_listview.ques1.Superhero;

import java.util.ArrayList;

import static com.example.week10_listview.ques2.QUES2.days;

public class CustomAdapterForDays extends BaseAdapter {


    private Context context;

    ArrayList<String> dayArrayList;

    public CustomAdapterForDays(Context context)
    {
        this.context =context;
        dayArrayList=new ArrayList<>();
        dayArrayList.add("Sunday");
        dayArrayList.add("Monday");
        dayArrayList.add("Tuesday");
        dayArrayList.add("Wednesday");
        dayArrayList.add("Thursday");
        dayArrayList.add("Friday");
        dayArrayList.add("Saturday");

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
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view =  inflater.inflate(R.layout.list_items_for_days,parent,false);

        TextView name = view.findViewById(R.id.tvDayName);

        name.setText(dayArrayList.get(position));

        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                days.putString(String.valueOf(position), dayArrayList.get(position));
                Toast.makeText(context, "Selected: "+dayArrayList.get(position), Toast.LENGTH_SHORT).show();
            }
        });







        return view;
    }
}
