package com.jiahaoliuliu.dagger2test.component;

import com.jiahaoliuliu.dagger2test.MainActivity;
import com.jiahaoliuliu.dagger2test.model.Motor;
import com.jiahaoliuliu.dagger2test.model.Vehicle;
import com.jiahaoliuliu.dagger2test.module.VehicleModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jiahao on 04/08/16.
 */
@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    // Providers
    Vehicle provideVehicle();
    Motor provideMotor();

    // Injections
    void inject(MainActivity mainActivity);
}
