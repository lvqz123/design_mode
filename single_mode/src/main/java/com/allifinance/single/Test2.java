package com.allifinance.single;

/**
 * @author: lvqz
 * @date: 2019/7/19
 * @time: 10:10
 */
public class Test2 {

    public static void main(String[] args) {
        /*Singleton2 singleton1 = Singleton2.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();
        Singleton2 singleton3 = Singleton2.getInstance();
        System.out.println("singleton1 = " + singleton1.hashCode());
        System.out.println("singleton2 = " + singleton2.hashCode());
        System.out.println("singleton3 = " + singleton3.hashCode());*/

        new Thread() {

            @Override
            public void run() {
                System.out.println(Singleton2.getInstance().hashCode());
            }
        }.start();
        new Thread() {

            @Override
            public void run() {
                System.out.println(Singleton2.getInstance().hashCode());
            }
        }.start();
        new Thread() {

            @Override
            public void run() {
                System.out.println(Singleton2.getInstance().hashCode());
            }
        }.start();


    }
}
