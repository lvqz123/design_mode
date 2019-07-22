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
        car.setWheel("����Ƥ����");
    }

    @Override
    public void buildCarBody() {
        car.setCarBody("���ӵ���������");
    }

    @Override
    public Car buildCar() {
        return car;
    }
}
