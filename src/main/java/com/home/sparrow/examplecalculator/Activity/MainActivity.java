package com.home.sparrow.examplecalculator.Activity;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.home.sparrow.examplecalculator.Fragment.Calculator;
import com.home.sparrow.examplecalculator.R;
import com.home.sparrow.examplecalculator.Fragment.SimpleCalculator;

/**
 * Created by sparrow on 21.08.16.
 */
public class MainActivity extends Activity implements Button.OnClickListener {

    FragmentManager mFragMan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);


        mFragMan = getFragmentManager();

        mFragMan.beginTransaction()
                .add(R.id.MainFrame, SimpleCalculator.getInstanse(), "Simple")
                .commit();
    }

    @Override
    public void onClick(View view) {
        ((Calculator)mFragMan.findFragmentByTag("Simple")).onClick(view);
    }
}
