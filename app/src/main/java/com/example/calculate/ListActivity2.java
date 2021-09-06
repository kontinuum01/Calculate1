package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ListActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list_item);

        String[] strings = getResources().getStringArray(R.array.options);
        TypedArray images = getResources().obtainTypedArray(R.array.images);
        LinearLayout container = findViewById(R.id.container);

        for (int i = 0; i < strings.length; i++) {

            View itemView = LayoutInflater.from(this).inflate(R.layout.item_list_item, container, false);

            ImageView img = itemView.findViewById(R.id.img);
            TextView txt = itemView.findViewById(R.id.txt);

            txt.setText(strings[i]);
            img.setImageResource(images.getResourceId(i, -1));

            container.addView(itemView);

        }
    }
}
