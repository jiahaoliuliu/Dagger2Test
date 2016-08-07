package com.jiahaoliuliu.dagger2test.model;

import javax.inject.Inject;

/**
 * Created by jiahao on 04/08/16.
 */
public class Vehicle {

    private Motor motor;

    @Inject
    public Vehicle(Motor motor) {
        this.motor = motor;
    }

    public void accelerate(int value) {
        motor.accelerate(value);
    }

    public void stop() {
        motor.breaks();
    }

    public int getSpeed() {
        return motor.getRpm();
    }
}
