package com.allifinance.single;

/**
 * @author: lvqz
 * @date: 2019/7/19
 * @time: 11:46
 */
public class Test3 {

    public static void main(String [] args){
    /*    Singleton instance1 = Singleton.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();*/
        Singleton3 singleton3 = Singleton3.getInstance();

/*        System.out.println("instance1 = " + instance1);
        System.out.println("instance2 = " + instance2);*/
        System.out.println("singleton3 = " + singleton3);
    }

}
