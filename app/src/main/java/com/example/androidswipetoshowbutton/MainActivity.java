package com.example.androidswipetoshowbutton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.androidswipetoshowbutton.adapter.MyRecyclerViewAdapter;
import com.example.androidswipetoshowbutton.model.Item;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    MyRecyclerViewAdapter adapter;
    LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Init
        recyclerView = findViewById(R.id.recycler_test);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        generateItem();

    }

    private void generateItem() {
        List<Item> itemList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {

            itemList.add(new Item(
                    "Pizza "+i,
                    "100000$",
                    "https://image.shutterstock.com/z/stock-photo-heart-pizza-with-mozzarella-and-tomatoes-on-a-slate-valentine-s-day-date-food-concept-1569808198.jpg"));

        }
        adapter = new MyRecyclerViewAdapter(this,itemList);
        recyclerView.setAdapter(adapter);

    }
}
