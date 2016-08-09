package com.jiahaoliuliu.dagger2test.model;

/**
 * Created by jiahao on 04/08/16.
 */
public interface Vehicle {

    void accelerate(int value);

    void stop();

    int getSpeed();

    double accelerateTo100Kmh();
}
