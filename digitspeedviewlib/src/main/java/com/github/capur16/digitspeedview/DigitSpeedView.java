package com.github.capur16.digitspeedview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

/**
 * Created by Riccardo on 13/01/2017.
 */

public class DigitSpeedView extends RelativeLayout {
    private String unit = "Km/h";
    private float speedTextSize = dpTOpx(100f);
    private float unitTextSize = dpTOpx(20f);
    private int speed = 0;
    private int speedTextColor = Color.CYAN;
    private int unitTextColor = Color.CYAN;
    private int backgoundColor = Color.BLACK;

    public DigitSpeedView(Context context) {
        super(context);
        init(context);
    }

    public DigitSpeedView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
        initAttributeSet(context, attrs);
    }

    public DigitSpeedView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
        initAttributeSet(context, attrs);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout., this, true);
    }

    private void initAttributeSet(Context context, AttributeSet attrs) {
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.DigitSpeedView, 0, 0);
        speedTextSize = a.getDimension(R.styleable.DigitSpeedView_speedTextSize, speedTextSize);
        unitTextSize = a.getDimension(R.styleable.DigitSpeedView_unitTextSize, unitTextSize);
        speedTextColor = a.getColor(R.styleable.DigitSpeedView_speedTextColor, speedTextColor);
        unitTextColor = a.getColor(R.styleable.DigitSpeedView_unitTextColor, unitTextColor);
        speed = a.getInt(R.styleable.DigitSpeedView_speed, speed);
        backgoundColor = a.getColor(R.styleable.DigitSpeedView_backgroundColor, backgoundColor);
        String unit = a.getString(R.styleable.DigitSpeedView_unit);
        this.unit =  (unit != null) ? unit : this.unit;
        a.recycle();
        initAttributeValue();
    }

    private void initAttributeValue() {
        speedTextPaint.setColor(speedTextColor);
        speedTextPaint.setTextSize(speedTextSize);
        unitTextPaint.setColor(speedTextColor);
        unitTextPaint.setTextSize(unitTextSize);
        /*if (unitUnderSpeedText) {
            speedTextPaint.setTextAlign(Paint.Align.CENTER);
            unitTextPaint.setTextAlign(Paint.Align.CENTER);
        }
        else {
            speedTextPaint.setTextAlign(Paint.Align.LEFT);
            unitTextPaint.setTextAlign(Paint.Align.LEFT);
        }*/
    }

    /**
     * convert dp to <b>pixel</b>.
     * @param dp to convert.
     * @return Dimension in pixel.
     */
    public float dpTOpx(float dp) {
        return dp * getContext().getResources().getDisplayMetrics().density;
    }

    /**
     * convert pixel to <b>dp</b>.
     * @param px to convert.
     * @return Dimension in dp.
     */
    public float pxTOdp(float px) {
        return px / getContext().getResources().getDisplayMetrics().density;
    }
}
