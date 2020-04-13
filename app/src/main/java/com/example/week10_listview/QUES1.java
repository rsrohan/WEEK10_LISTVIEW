package com.example.week10_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class QUES1 extends AppCompatActivity {

    ListView lvSuperhero;
    ArrayList<Superhero> superheroArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_1);

        lvSuperhero = findViewById(R.id.lvSuperhero);
        superheroArrayList = new ArrayList<>();



    }
}
