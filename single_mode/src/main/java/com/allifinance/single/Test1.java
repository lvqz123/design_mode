package com.allifinance.single;

/**
 * @author: lvqz
 * @date: 2019/7/19
 * @time: 10:04
 */
public class Test1 {
    
    public static void main(String [] args){
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        Singleton1 instance3 = Singleton1.getInstance();

        System.out.println("instance1 = " + instance1.hashCode());
     /*   System.out.println("instance2 = " + instance2);
        System.out.println("instance3 = " + instance3);*/
    }
    
}
