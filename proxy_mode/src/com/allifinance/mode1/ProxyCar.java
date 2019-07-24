package com.allifinance.mode1;

/**
 * @author: lvqz
 * @date: 2019/7/24
 * @time: 11:39
 */
public class ProxyCar implements Car {

    @Override
    public void buy() {
        new LanboCar().buy();
    }
}
