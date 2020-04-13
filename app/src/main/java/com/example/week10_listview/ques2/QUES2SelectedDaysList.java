package com.example.week10_listview.ques2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.week10_listview.R;

import java.util.ArrayList;

public class QUES2SelectedDaysList extends AppCompatActivity {
    public Bundle selected_days;
    ListView lvDays;
    ArrayList<String> daysList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_u_e_s2_selected_days_list);
        selected_days = getIntent().getExtras();

        daysList=new ArrayList<>();
        for (int i=0;i<7;i++)
        {
            if (selected_days != null && selected_days.getString("" + i) != null) {
                daysList.add(selected_days.getString("" + i));
            }
        }

        lvDays = findViewById(R.id.lvDays);
        CustomAdapterForSelectedDays customAdapterForDays = new CustomAdapterForSelectedDays(getApplicationContext(), daysList);
        lvDays.setAdapter(customAdapterForDays);
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
