package com.home.sparrow.examplecalculator;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

/**
 * Created by sparrow on 21.08.16.
 */
public class MainActivity extends Activity {

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
}
