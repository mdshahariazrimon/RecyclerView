package cseian.com;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    Context context;
    ArrayList<Food> foods;

    public FoodAdapter(Context context, ArrayList<Food> foods){
        this.context=context;
        this.foods=foods;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.sample_row,parent,false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        Food food = foods.get(position);
        holder.foodimage.setImageResource(food.getImage());
        holder.title.setText(food.getTitle());
    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder{

        ImageView foodimage;
        TextView title;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            foodimage= itemView.findViewById(R.id.foodimage);
            title= itemView.findViewById(R.id.title);
        }
    }
}