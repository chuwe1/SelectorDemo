package com.github.chuwe1.selectordemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2, et3;
    Button btn1, btn2, btn3, btn4;
    TextView tv1, tv2, tv3, tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);

        initEditText();
        initButton();
        initTextView();
    }

    private void initEditText() {
        et1.setBackground(SelectorFactory.newShapeSelector()
                .setDefaultStrokeColor(Color.GRAY)
                .setFocusedStrokeColor(Color.YELLOW)
                .setStrokeWidth(2)
                .create());
        et2.setBackground(SelectorFactory.newShapeSelector()
                .setDefaultStrokeColor(Color.GRAY)
                .setFocusedStrokeColor(Color.YELLOW)
                .setStrokeWidth(2)
                .setCornerRadius(20)
                .create());
        et3.setBackground(SelectorFactory.newShapeSelector()
                .setDefaultStrokeColor(Color.GRAY)
                .setFocusedStrokeColor(Color.RED)
                .setStrokeWidth(2)
                .create());

        et1.setHintTextColor(SelectorFactory.newColorSelector()
                .setDefaultColor(Color.GRAY)
                .setFocusedColor(Color.BLACK)
                .create());
        et2.setHintTextColor(SelectorFactory.newColorSelector()
                .setDefaultColor(Color.GRAY)
                .setFocusedColor(Color.BLACK)
                .create());
        et3.setHintTextColor(SelectorFactory.newColorSelector()
                .setDefaultColor(Color.GRAY)
                .setFocusedColor(Color.BLACK)
                .create());

        et1.setTextColor(SelectorFactory.newColorSelector()
                .setDefaultColor(Color.BLACK)
                .setFocusedColor(Color.YELLOW)
                .create());
        et2.setTextColor(SelectorFactory.newColorSelector()
                .setDefaultColor(Color.BLACK)
                .setFocusedColor(Color.YELLOW)
                .create());
        et3.setTextColor(SelectorFactory.newColorSelector()
                .setDefaultColor(Color.BLACK)
                .setFocusedColor(Color.RED)
                .create());
    }

    private void initButton() {
        btn1.setBackground(SelectorFactory.newGeneralSelector()
                .setDefaultDrawable(ContextCompat.getDrawable(this, R.mipmap.blue_primary))
                .setPressedDrawable(this, R.mipmap.blue_primary_dark)
                .create());
        btn2.setBackground(SelectorFactory.newShapeSelector()
                .setDefaultBgColor(ContextCompat.getColor(this, android.R.color.holo_blue_light))
                .setPressedBgColor(ContextCompat.getColor(this, android.R.color.holo_blue_dark))
                .create());
        btn3.setBackground(SelectorFactory.newShapeSelector()
                .setDefaultBgColor(ContextCompat.getColor(this, android.R.color.holo_blue_light))
                .setPressedBgColor(ContextCompat.getColor(this, android.R.color.holo_blue_dark))
                .setSelectedBgColor(ContextCompat.getColor(this, android.R.color.holo_blue_dark))
                .setCornerRadius(20)
                .create());
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn3.setSelected(!btn3.isSelected());
            }
        });
        btn4.setBackground(SelectorFactory.newShapeSelector()
                .setDefaultBgColor(ContextCompat.getColor(this, android.R.color.holo_blue_light))
                .setPressedBgColor(ContextCompat.getColor(this, android.R.color.holo_blue_dark))
                .setDisabledBgColor(Color.GRAY)
                .create());
        btn4.setEnabled(false);
    }

    private void initTextView() {
        tv1.setBackground(SelectorFactory.newShapeSelector()
                .setDefaultStrokeColor(Color.GRAY)
                .setStrokeWidth(1)
                .setCornerRadius(20)
                .create());
        tv2.setTextColor(SelectorFactory.newColorSelector()
                .setDefaultColor(Color.BLACK)
                .setPressedColor(Color.YELLOW)
                .create());
        tv3.setTextColor(SelectorFactory.newColorSelector()
                .setDefaultColor(Color.BLACK)
                .setSelectedColor(Color.YELLOW)
                .create());
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv3.setSelected(!tv3.isSelected());
            }
        });
        tv4.setTextColor(SelectorFactory.newColorSelector()
                .setDefaultColor(Color.BLACK)
                .setSelectedColor(Color.YELLOW)
                .setDisabledColor(Color.GRAY)
                .create());
        tv4.setEnabled(false);
    }
}
