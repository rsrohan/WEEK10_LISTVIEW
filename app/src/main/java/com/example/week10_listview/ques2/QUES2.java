package com.example.week10_listview.ques2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.week10_listview.R;

public class QUES2 extends AppCompatActivity {

    public static Bundle days;
    ListView lvDays;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_2);

        days = new Bundle();
        lvDays = findViewById(R.id.lvDays);
        CustomAdapterForDays customAdapterForDays = new CustomAdapterForDays(getApplicationContext());
        lvDays.setAdapter(customAdapterForDays);

        findViewById(R.id.selectedButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), QUES2SelectedDaysList.class).putExtras(days));
            }
        });
    }
}
