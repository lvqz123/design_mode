/**
 * @author: lvqz
 * @date: 2019/7/18
 * @time: 12:03
 */
package com.allifinance.abstr;

public class MiPhone implements Phone{
    @Override
    public void say() {
        System.out.println("生产一个小米手机");
    }
}
