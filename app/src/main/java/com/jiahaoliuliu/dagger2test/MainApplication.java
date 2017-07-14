package com.jiahaoliuliu.dagger2test;

import android.app.Application;

import com.jiahaoliuliu.dagger2test.component.DaggerVehicleComponent;
import com.jiahaoliuliu.dagger2test.component.VehicleComponent;

/**
 * Created by jiahaoliuliu on 7/14/17.
 */

public class MainApplication extends Application {

    private VehicleComponent mVehicleComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mVehicleComponent = DaggerVehicleComponent.builder()
                // Since the constructor of vehicleModule does not take any parameter, it is not
                // strictly necessary to create it.
//                .vehicleModule(new VehicleModule())
                .build();

    }

    public VehicleComponent getVehicleComponent() {
        return mVehicleComponent;
    }
}
