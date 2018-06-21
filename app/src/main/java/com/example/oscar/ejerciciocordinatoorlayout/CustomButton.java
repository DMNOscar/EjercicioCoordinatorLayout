package com.example.oscar.ejerciciocordinatoorlayout;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

/**
 * Created by Oscar on 20/06/2018.
 */

@CoordinatorLayout.DefaultBehavior(CustomMoveUpBehavior.class)
public class CustomButton extends AppCompatButton {
    public CustomButton(Context context) {
        super(context);
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}