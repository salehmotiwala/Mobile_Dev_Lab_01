package com.example.mobile_dev_lab_01;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void toggleText(View view) {
        TextView textView = findViewById(R.id.tvChangeText);
        String prevText = textView.getText().toString().toLowerCase();

        if (prevText.equals("hello world!")){
            textView.setText("Swift > Java!!");
        } else{
            textView.setText("Hello World!");
        }
    }

    public void toggleColor(View view) {
        TextView textView = findViewById(R.id.tvChangeText);
        int prevColor = textView.getCurrentTextColor();

        if (prevColor == Color.BLACK){
            textView.setTextColor(Color.RED);
        } else{
            textView.setTextColor(Color.BLACK);
        }
    }

    public void changeBg(View view) {
        TextView textView = findViewById(R.id.tvChangeText);
        int prevColor = textView.getBackground().getAlpha();

        if(prevColor == Color.alpha(Color.TRANSPARENT)){
            textView.setBackgroundColor(Color.GRAY);
        }else{
            textView.setBackgroundColor(Color.TRANSPARENT);
        }
    }

    //Code for revert
}