package com.home.sparrow.examplecalculator.Fragment;

import android.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.home.sparrow.examplecalculator.R;

/**
 * Created by sparrow on 22.08.16.
 */
public class Calculator extends Fragment implements Button.OnClickListener{

    public TextView mCalcText;

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.clear:
                break;
            case R.id.minus:
                mCalcText.append("-");
                break;
            case R.id.plus:
                mCalcText.append("+");
                break;
            case R.id.multi:
                mCalcText.append("*");
                break;
            case R.id.divided:
                mCalcText.append("/");
                break;
            case R.id.leftBracket:
                mCalcText.append("(");
                break;
            case R.id.rightBracket:
                mCalcText.append(")");
                break;
            case R.id.one:
                mCalcText.append("1");
                break;
            case R.id.two:
                mCalcText.append("2");
                break;
            case R.id.three:
                mCalcText.append("3");
                break;
            case R.id.four:
                mCalcText.append("4");
                break;
            case R.id.five:
                mCalcText.append("5");
                break;
            case R.id.six:
                mCalcText.append("6");
                break;
            case R.id.seven:
                mCalcText.append("7");
                break;
            case R.id.eight:
                mCalcText.append("8");
                break;
            case R.id.nine:
                mCalcText.append("9");
                break;
        }
    }
}
