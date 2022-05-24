package com.venzpire.batterystatus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.venzpire.batterystatus.databinding.ActivityBatteryStatusBinding;

public class Battery_Status extends AppCompatActivity {

    ActivityBatteryStatusBinding batteryStatusBinding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        batteryStatusBinding = ActivityBatteryStatusBinding.inflate(getLayoutInflater());
        setContentView(batteryStatusBinding.getRoot());

        batteryStatusBinding.save.setOnClickListener(v -> {
            String percentage = batteryStatusBinding.percentageEt.getText().toString();
            if (percentage.isEmpty())
                Toast.makeText(this, "Please Enter Percentage", Toast.LENGTH_SHORT).show();
            else
                setBatteryStatus(Integer.parseInt(percentage));
        });

    }

    public void setBatteryStatus(int percentage) {

        if (percentage >= 1 && percentage <= 20) {
            batteryStatusBinding.part1.setVisibility(View.INVISIBLE);
            batteryStatusBinding.part2.setVisibility(View.INVISIBLE);
            batteryStatusBinding.part3.setVisibility(View.INVISIBLE);
            batteryStatusBinding.part4.setVisibility(View.VISIBLE);
            batteryStatusBinding.part4.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.red, getTheme())));
        } else if (percentage >= 21 && percentage <= 60) {
            batteryStatusBinding.part1.setVisibility(View.INVISIBLE);
            batteryStatusBinding.part2.setVisibility(View.INVISIBLE);
            batteryStatusBinding.part3.setVisibility(View.VISIBLE);
            batteryStatusBinding.part4.setVisibility(View.VISIBLE);
            batteryStatusBinding.part3.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.orange, getTheme())));
            batteryStatusBinding.part4.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.orange, getTheme())));
        } else if (percentage >= 61 && percentage <= 80) {
            batteryStatusBinding.part1.setVisibility(View.INVISIBLE);
            batteryStatusBinding.part2.setVisibility(View.VISIBLE);
            batteryStatusBinding.part3.setVisibility(View.VISIBLE);
            batteryStatusBinding.part4.setVisibility(View.VISIBLE);
            batteryStatusBinding.part2.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.yellow, getTheme())));
            batteryStatusBinding.part3.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.yellow, getTheme())));
            batteryStatusBinding.part4.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.yellow, getTheme())));
        } else if (percentage >= 81 && percentage <= 100) {
            batteryStatusBinding.part1.setVisibility(View.VISIBLE);
            batteryStatusBinding.part2.setVisibility(View.VISIBLE);
            batteryStatusBinding.part3.setVisibility(View.VISIBLE);
            batteryStatusBinding.part4.setVisibility(View.VISIBLE);
            batteryStatusBinding.part1.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.green, getTheme())));
            batteryStatusBinding.part2.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.green, getTheme())));
            batteryStatusBinding.part3.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.green, getTheme())));
            batteryStatusBinding.part4.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.green, getTheme())));
        } else {
            batteryStatusBinding.part1.setVisibility(View.INVISIBLE);
            batteryStatusBinding.part2.setVisibility(View.INVISIBLE);
            batteryStatusBinding.part3.setVisibility(View.INVISIBLE);
            batteryStatusBinding.part4.setVisibility(View.INVISIBLE);
        }

    }

}