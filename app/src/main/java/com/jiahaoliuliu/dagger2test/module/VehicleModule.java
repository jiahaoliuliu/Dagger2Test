package com.jiahaoliuliu.dagger2test.module;

import com.jiahaoliuliu.dagger2test.model.Motor;
import com.jiahaoliuliu.dagger2test.model.Vehicle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jiahao on 04/08/16.
 */
@Module
public class VehicleModule {

    @Singleton @Provides
    public Motor provideMotor() {
        return new Motor();
    }

    @Singleton @Provides
    public Vehicle provideVehicle() {
        return new Vehicle(new Motor());
    }
}
