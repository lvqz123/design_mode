package com.allifinance.mode2;

/**
 * @author: lvqz
 * @date: 2019/7/22
 * @time: 10:53
 */
public class Director {

    public static Car constructorCom(Builder builder){

        builder.buildWheel();
        builder.buildCarBody();
        return builder.buildCar();

    }

}
