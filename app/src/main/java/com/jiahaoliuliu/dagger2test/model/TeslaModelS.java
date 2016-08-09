package com.jiahaoliuliu.dagger2test.model;

/**
 * Created by jiahao on 09/08/16.
 */
public class TeslaModelS implements Vehicle {
    private Motor motor;

    public TeslaModelS(Motor motor) {
        this.motor = motor;
    }

    @Override
    public void accelerate(int value) {
        motor.accelerate(value);
    }

    @Override
    public void stop() {
        motor.breaks();
    }

    @Override
    public int getSpeed() {
        return motor.getRpm();
    }

    @Override
    public double accelerateTo100Kmh() {
        return 10.8;
    }
}
