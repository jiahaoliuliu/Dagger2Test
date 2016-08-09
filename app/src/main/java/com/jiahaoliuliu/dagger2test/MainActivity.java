package com.jiahaoliuliu.dagger2test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.jiahaoliuliu.dagger2test.component.DaggerVehicleComponent;
import com.jiahaoliuliu.dagger2test.component.VehicleComponent;
import com.jiahaoliuliu.dagger2test.model.Vehicle;
import com.jiahaoliuliu.dagger2test.module.VehicleModule;

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

        VehicleComponent component = DaggerVehicleComponent.builder()
                // Since the constructor of vehicleModule does not take any paramter, it is not
                // strictly necessary to create it.
//                .vehicleModule(new VehicleModule())
                .build();
        // Using field injection instead
//        vehicle = component.provideVehicle();
        component.inject(this);
        Log.v("Test", "The content of the vehicle is " + vehicle);

        mTextView = (TextView) findViewById(R.id.text);
        mTextView.setText(String.valueOf(vehicle.getSpeed()));
    }
}
