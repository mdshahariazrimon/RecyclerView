package cseian.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        ArrayList<Food> foods=new ArrayList<>();
        foods.add(new Food("Salad View",R.drawable.img));
        foods.add(new Food("Tasty Treat",R.drawable.img_1));
        foods.add(new Food("Food Court",R.drawable.img_2));
        foods.add(new Food("Fast Food",R.drawable.img_3));
        foods.add(new Food("Arabian",R.drawable.img_4));

        FoodAdapter adapter=new FoodAdapter(this,foods);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}