package com.allifinance.single;

/**
 * @author: lvqz
 * @date: 2019/7/19
 * @time: 10:00
 * 单例模式第二种：静态代码块
 */
public class Singleton1 {

    private Singleton1(){}

    private static Singleton1 singleton1 = null;

    //静态代码块
    static {
        singleton1 = new Singleton1();
    }

    public static Singleton1 getInstance(){
        return singleton1;
    }


}
