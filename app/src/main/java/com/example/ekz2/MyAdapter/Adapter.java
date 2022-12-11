package com.example.ekz2.MyAdapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ekz2.R;
import com.example.ekz2.models.FeelingsResponse;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private Context context;
    private List<FeelingsResponse.FeelingModel> models;

    public Adapter(Context context, List<FeelingsResponse.FeelingModel> models) {
        this.context = context;
        this.models = models;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.feelings_item, parent, false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {
        FeelingsResponse.FeelingModel feelingModel = models.get(position);
        holder.text.setText(feelingModel.getTitle());
        Glide.with(context).load(feelingModel.getImage()).into(holder.image);;
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        private ImageView image;
        private TextView text;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image =itemView.findViewById(R.id.imagefeeling);
            text=itemView.findViewById(R.id.textfeeling);
        }
    }
}
