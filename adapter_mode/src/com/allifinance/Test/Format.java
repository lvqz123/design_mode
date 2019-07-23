package com.allifinance.Test;

/**
 * @author: lvqz
 * @date: 2019/7/23
 * @time: 12:02
 */
public class Format implements DC5 {

    private A220V a = new A220V();

    @Override
    public int output() {
        return a.output()/44;
    }

}
