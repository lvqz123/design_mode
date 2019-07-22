/**
 * @author: lvqz
 * @date: 2019/7/18
 * @time: 17:22
 */
package com.allifinance.single;

public class Test {

    public static void main(String [] args){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        System.out.println("singleton1 = " + singleton1);
     /*   System.out.println("singleton2 = " + singleton2);
        System.out.println("singleton3 = " + singleton3);*/

    }

}
