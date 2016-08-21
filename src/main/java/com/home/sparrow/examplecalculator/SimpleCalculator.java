package com.home.sparrow.examplecalculator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SimpleCalculator extends Fragment implements Button.OnClickListener {

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


        return mView;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.clear:
                break;
            case R.id.minus:
                break;
            case R.id.plus:
                break;
            case R.id.multi:
                break;
            case R.id.divided:
                break;
            case R.id.leftBracket:
                break;
            case R.id.rightBracket:
                break;
            case R.id.one:
                break;
            case R.id.two:
                break;
            case R.id.three:
                break;
            case R.id.four:
                break;
            case R.id.five:
                break;
            case R.id.six:
                break;
            case R.id.seven:
                break;
            case R.id.eight:
                break;
            case R.id.nine:
                break;
        }
    }
}
