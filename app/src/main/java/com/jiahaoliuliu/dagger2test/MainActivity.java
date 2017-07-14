package com.jiahaoliuliu.dagger2test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.jiahaoliuliu.dagger2test.model.Vehicle;

import javax.inject.Inject;

/**
 * Simple test of dagger 2.x. The example is based on :
 * http://code.tutsplus.com/tutorials/dependency-injection-with-dagger-2-on-android--cms-23345
 */
public class MainActivity extends AppCompatActivity {

    @Inject
    Vehicle vehicle;

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MainApplication)getApplication()).getVehicleComponent().inject(this);
        Log.v("Test", "The content of the vehicle is " + vehicle);

        // Set the value for vehicle
        vehicle.accelerate(100);

        mTextView = (TextView) findViewById(R.id.text);
        mTextView.setText(String.valueOf(vehicle.getSpeed()));
    }
}
