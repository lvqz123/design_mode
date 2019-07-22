/**
 * @author: lvqz
 * @date: 2019/7/18
 * @time: 12:04
 */
package com.allifinance.abstr;

public class Customer {

    public static void main(String [] args){
        Businesses le = new LenvoFactory();
        le.producePhone().say();
        le.produceDisplay().say();
        Businesses mi = new MiFactory();
        mi.producePhone().say();
        mi.produceDisplay().say();
    }
}
