package com.allifinance.mode2;

/**
 * @author: lvqz
 * @date: 2019/7/22
 * @time: 10:55
 */
public class Test {

    public static void main(String [] args){

        Car car = Director.constructorCom(new BuilderCar());
        System.out.println("car = " + car);

    }
}
