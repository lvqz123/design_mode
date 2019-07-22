package com.allifinance.single;

/**
 * @author: lvqz
 * @date: 2019/7/19
 * @time: 11:52
 * 单例模式的静态内部类实现形式
 */
public class Singleton3 {

    private Singleton3(){}

    //静态内部类
    private static class InSideClass{
        private static Singleton3 singleton3 = new Singleton3();
    }

    public static Singleton3 getInstance(){
        return InSideClass.singleton3;
    }

}
