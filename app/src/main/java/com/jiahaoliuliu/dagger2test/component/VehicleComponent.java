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

//    Vehicle provideVehicle();
//
//    Motor provideMotor();

    void inject(MainActivity mainActivity);
}
