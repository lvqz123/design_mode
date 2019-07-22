package com.allifinance.single;

/**
 * @author: lvqz
 * @date: 2019/7/19
 * @time: 10:00
 * ����ģʽ�ڶ��֣���̬�����
 */
public class Singleton1 {

    private Singleton1(){}

    private static Singleton1 singleton1 = null;

    //��̬�����
    static {
        singleton1 = new Singleton1();
    }

    public static Singleton1 getInstance(){
        return singleton1;
    }


}
