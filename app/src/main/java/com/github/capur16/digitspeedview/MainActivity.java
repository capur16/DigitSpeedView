package com.github.capur16.digitspeedview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatSeekBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.github.capur16.digitspeedviewlib.DigitSpeedView;
import com.github.capur16.digitspeedviewlib.OnSpeedChangeListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digit_speed_view);
        final TextView textView = (TextView)findViewById(R.id.current_speed_text);
        final DigitSpeedView digitSpeedView = (DigitSpeedView)findViewById(R.id.digit_speed_view);
        digitSpeedView.setOnSpeedChangeListener(new OnSpeedChangeListener() {
            @Override
            public void onSpeedChange(DigitSpeedView digitSpeedView, boolean isSpeedUp) {
                textView.setText("Speed: " + digitSpeedView.getSpeed() + " - Speed up: " + isSpeedUp);
            }
        });
        AppCompatSeekBar mSeekBar = (AppCompatSeekBar) findViewById(R.id.seek);
        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                digitSpeedView.updateSpeed(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
