package com.jiahaoliuliu.dagger2test.model;

/**
 * Created by jiahao on 04/08/16.
 */
public class Motor {

    private int rpm;

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
