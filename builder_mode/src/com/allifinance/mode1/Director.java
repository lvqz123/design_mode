package com.allifinance.mode1;

/**
 * @author: lvqz
 * @date: 2019/7/19
 * @time: 16:52
 * НЈдьеп
 */
public class Director {

    public static Computer constructorCom(Builder builder){
        builder.buildMainBoard();
        builder.buildHardDisk();
        builder.buildCpu();
        return builder.buildComputer();
    }

}
