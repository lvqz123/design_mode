package com.allifinance.mode2;

/**
 * @author: lvqz
 * @date: 2019/7/22
 * @time: 10:52
 */
public class BuilderCar implements Builder {

    private Car car = new Car();


    @Override
    public void buildWheel() {
        car.setWheel("鳄鱼皮车轮");
    }

    @Override
    public void buildCarBody() {
        car.setCarBody("布加迪威龙车身");
    }

    @Override
    public Car buildCar() {
        return car;
    }
}
