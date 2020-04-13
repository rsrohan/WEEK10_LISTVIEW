package com.example.week10_listview.ques1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.week10_listview.R;

import java.util.ArrayList;

public class QUES1 extends AppCompatActivity {

    ListView lvSuperhero;
    ArrayList<Superhero> superheroArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_1);

        lvSuperhero = findViewById(R.id.lvSuperhero);
        superheroArrayList = new ArrayList<>();

        Superhero ironman = new Superhero("https://images.news18.com/optimize/0WKBxfg4iGxKo_11iMYDIz7fMQg=/698x552/images.news18.com/ibnlive/uploads/698x552/jpg/2016/04/ironman.jpg", "Iron Man", "He is Iron Man");
        Superhero captainAmerica = new Superhero("https://i.pinimg.com/originals/d5/81/79/d58179ac3e5781037d0fbf2bf3a97cdc.jpg", "Captain America", "Shield");
        Superhero spiderman = new Superhero("https://upload.wikimedia.org/wikipedia/en/thumb/2/21/Web_of_Spider-Man_Vol_1_129-1.png/250px-Web_of_Spider-Man_Vol_1_129-1.png", "Spider Man", "His uncle is Iron Man");
        Superhero hulk = new Superhero("https://img.etimg.com/thumb/msid-72400227,width-1200,height-900,imgsize-349917,overlay-etpanache/photo.jpg", "Hulk", "Very Humble");
        Superhero thor = new Superhero("https://image.cnbcfm.com/api/v1/image/104819285-thor.jpg?v=1529476684&w=678&h=381", "Thor", "God of Thunder");
        Superhero natasha = new Superhero("https://i.ytimg.com/vi/KLBmMLCovlc/maxresdefault.jpg", "Natasha", "She can do everything");
        Superhero blackPanther = new Superhero("https://media.newyorker.com/photos/5a875e3f33aebd0cab9bab12/4:3/w_1439,h_1079,c_limit/Brody-Passionate-Politics-Black-Panther.jpg", "Black Panther", "Quarantined Wakanda before Corona");


        superheroArrayList.add(ironman);
        superheroArrayList.add(captainAmerica);
        superheroArrayList.add(spiderman);
        superheroArrayList.add(hulk);
        superheroArrayList.add(thor);
        superheroArrayList.add(natasha);
        superheroArrayList.add(blackPanther);

        CustomAdapterForSuperhero customAdapterForSuperhero = new CustomAdapterForSuperhero(getApplicationContext(), superheroArrayList);
        lvSuperhero.setAdapter(customAdapterForSuperhero);

    }
}
