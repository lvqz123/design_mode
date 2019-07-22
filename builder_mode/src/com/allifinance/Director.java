package com.allifinance;

/**
 * @author: lvqz
 * @date: 2019/7/19
 * @time: 16:52
 * ������
 */
public class Director {

    public static Computer constructorCom(Builder builder){
        builder.buildMainBoard();
        builder.buildHardDisk();
        builder.buildCpu();
        return builder.buildComputer();
    }

}
