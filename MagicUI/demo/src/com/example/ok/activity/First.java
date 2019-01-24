package com.example.ok.activity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;


import com.example.ok.R;
import com.magic.view.spinner.NiceSpinner;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/7.
 */
public class First extends Activity {


    private NiceSpinner nice_spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {

        NiceSpinner niceSpinner = (NiceSpinner) findViewById(R.id.nice_spinner);niceSpinner.setTextColor(Color.BLACK);
        List<String> dataset = new LinkedList<>(Arrays.asList("One", "Two", "Three", "Four", "Five"));
        niceSpinner.attachDataSource(dataset);
    }
}
