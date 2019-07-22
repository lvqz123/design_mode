package com.allifinance.mode2;

/**
 * @author: lvqz
 * @date: 2019/7/22
 * @time: 10:49
 */
public interface Builder {

    /**
     * 构建车的车轮
     */
    void buildWheel();

    /**
     * 构建车的车身
     */
    void buildCarBody();

    /**
     * 构建车
     */
    Car buildCar();

}
