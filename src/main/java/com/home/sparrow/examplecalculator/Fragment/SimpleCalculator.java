package com.home.sparrow.examplecalculator.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.home.sparrow.examplecalculator.R;

public class SimpleCalculator extends Calculator {

    private static SimpleCalculator mSimpleCalculator;

    public static SimpleCalculator getInstanse() {
        if (mSimpleCalculator == null)
            mSimpleCalculator = new SimpleCalculator();

        return mSimpleCalculator;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.simple_calculator, container, false);

        mCalcText = (TextView)mView.findViewById(R.id.calcText);
        return mView;
    }
}
