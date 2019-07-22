package com.allifinance.mode2;

/**
 * @author: lvqz
 * @date: 2019/7/22
 * @time: 10:47
 */
public class Car {

    /**
     * 车轮
     */
    private String wheel;

    /**
     *车身主体
     */
    private String carBody;


    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }


    @Override
    public String toString() {
        return "Car{" +
                "wheel='" + wheel + '\'' +
                ", carBody='" + carBody + '\'' +
                '}';
    }
}
