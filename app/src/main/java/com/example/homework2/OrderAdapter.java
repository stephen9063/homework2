package com.example.homework2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderViewHolder> {

    private ArrayList<Order> ordersToAdapt;

    public void setData(ArrayList<Order> ordersToAdapt) {
        this.ordersToAdapt = ordersToAdapt;
    }

    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.order, parent, false);

        OrderViewHolder orderViewHolder = new OrderViewHolder(view);
        return orderViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {
        final Order orderAtPosition = ordersToAdapt.get(position);
        holder.orderTextView.setText(orderAtPosition.getOrderitem());
        holder.itemImageView.setImageResource(orderAtPosition.getImageDrawableId());

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, orderdetail.class);
                intent.putExtra("OrderID", orderAtPosition.getOrderID());
                context.startActivity(intent);
            }
        });


        /*holder.addbuttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(Intent.ACTION_SEND);

                intent.putExtra(Intent.EXTRA_TEXT, orderAtPosition.getOrderitem());
                intent.setType("text/plain");
                context.startActivity(intent);
            }
        });*/

        //holder.itemImageView.setImageResource(orderAtPosition.getImageDrawableId());

    }

    @Override
    public int getItemCount() {
        return ordersToAdapt.size();
    }

    public static class OrderViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView orderTextView;
        public ImageView itemImageView;
        public ImageView addbuttonView;

        public OrderViewHolder(View v) {
            super(v);
            view = v;
            orderTextView = v.findViewById(R.id.orderitem);
            itemImageView = v.findViewById(R.id.orderPhoto);
            addbuttonView = v.findViewById(R.id.addButton);

        }
    }
}
