package com.venzpire.batterystatus;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

import androidx.core.content.res.ResourcesCompat;

import com.venzpire.batterystatus.databinding.ActivityBatteryStatusBinding;

public class Battery {
    public void setBatteryStatus(Context context, ActivityBatteryStatusBinding batteryStatusBinding, int percentage) {

        if (percentage >= 1 && percentage <= 20) {
            batteryStatusBinding.part1.setVisibility(View.INVISIBLE);
            batteryStatusBinding.part2.setVisibility(View.INVISIBLE);
            batteryStatusBinding.part3.setVisibility(View.INVISIBLE);
            batteryStatusBinding.part4.setVisibility(View.VISIBLE);
            batteryStatusBinding.part4.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(context.getResources(), R.color.red, context.getTheme())));
        } else if (percentage >= 21 && percentage <= 60) {
            batteryStatusBinding.part1.setVisibility(View.INVISIBLE);
            batteryStatusBinding.part2.setVisibility(View.INVISIBLE);
            batteryStatusBinding.part3.setVisibility(View.VISIBLE);
            batteryStatusBinding.part4.setVisibility(View.VISIBLE);
            batteryStatusBinding.part3.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(context.getResources(), R.color.orange, context.getTheme())));
            batteryStatusBinding.part4.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(context.getResources(), R.color.orange, context.getTheme())));
        } else if (percentage >= 61 && percentage <= 80) {
            batteryStatusBinding.part1.setVisibility(View.INVISIBLE);
            batteryStatusBinding.part2.setVisibility(View.VISIBLE);
            batteryStatusBinding.part3.setVisibility(View.VISIBLE);
            batteryStatusBinding.part4.setVisibility(View.VISIBLE);
            batteryStatusBinding.part2.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(context.getResources(), R.color.yellow, context.getTheme())));
            batteryStatusBinding.part3.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(context.getResources(), R.color.yellow, context.getTheme())));
            batteryStatusBinding.part4.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(context.getResources(), R.color.yellow, context.getTheme())));
        } else if (percentage >= 81 && percentage <= 100) {
            batteryStatusBinding.part1.setVisibility(View.VISIBLE);
            batteryStatusBinding.part2.setVisibility(View.VISIBLE);
            batteryStatusBinding.part3.setVisibility(View.VISIBLE);
            batteryStatusBinding.part4.setVisibility(View.VISIBLE);
            batteryStatusBinding.part1.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(context.getResources(), R.color.green, context.getTheme())));
            batteryStatusBinding.part2.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(context.getResources(), R.color.green, context.getTheme())));
            batteryStatusBinding.part3.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(context.getResources(), R.color.green, context.getTheme())));
            batteryStatusBinding.part4.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(context.getResources(), R.color.green, context.getTheme())));
        } else {
            batteryStatusBinding.part1.setVisibility(View.INVISIBLE);
            batteryStatusBinding.part2.setVisibility(View.INVISIBLE);
            batteryStatusBinding.part3.setVisibility(View.INVISIBLE);
            batteryStatusBinding.part4.setVisibility(View.INVISIBLE);
        }

    }

}
