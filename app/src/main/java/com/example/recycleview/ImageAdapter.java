package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.MyViewHolder> {

    private List<String> imageList;
    private ImageListener imageListener;

    public ImageAdapter(List<String> imageList) {
        this.imageList = imageList;
        this.imageListener = imageListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.image_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

       // holder.firstName.setText(employeeList.get(position).getFirstName());
      //  holder.lastName.setText(employeeList.get(position).getLastName());
        Picasso.get().load(String.valueOf(imageList.get(position))).into(holder.image1);





    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView image1;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image1 = itemView.findViewById(R.id.ivImage1);

        }

        public void bind() {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                }
            });




        }
    }
}
