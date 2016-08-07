package com.jiahaoliuliu.dagger2test.model;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by jiahao on 04/08/16.
 */
@Singleton
public class Motor {

    private int rpm;

    @Inject
    public Motor() {
        this.rpm = 0;
    }

    public int getRpm() {
        return rpm;
    }

    public void accelerate(int rpm) {
        this.rpm = this.rpm + rpm;
    }

    public void breaks() {
        this.rpm = 0;
    }


}
