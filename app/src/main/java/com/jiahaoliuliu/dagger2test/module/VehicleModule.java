package com.jiahaoliuliu.dagger2test.module;

import com.jiahaoliuliu.dagger2test.model.LaFerrari;
import com.jiahaoliuliu.dagger2test.model.Motor;
import com.jiahaoliuliu.dagger2test.model.TeslaModelS;
import com.jiahaoliuliu.dagger2test.model.Vehicle;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jiahao on 04/08/16.
 */
@Module
public class VehicleModule {

//    @Singleton @Provides
//    public Motor provideMotor() {
//        return new Motor();
//    }

    @Singleton @Provides
    @Named("LaFerrari")
    public Vehicle provideLaFerrari(Motor motor) {
        return new LaFerrari(motor);
    }

    @Singleton @Provides
    @Named("TeslaModelS")
    public Vehicle provideTesla(Motor motor) {
        return new TeslaModelS(motor);
    }

}
