package com.example.homework2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class orderitemdetail extends AppCompatActivity {
    private TextView orderitemTextView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderitemdetail);

        Intent intent = getIntent();

        int orderID = intent.getIntExtra("OrderID",0);

        Order order = fakedatabase.getOrderById(orderID);

        orderitemTextView = findViewById(R.id.orderitem);
        imageView = findViewById(R.id.detailImage);

        orderitemTextView.setText(order.getOrderitem());
        imageView.setImageResource(order.getImageDrawableId());
    }
}
