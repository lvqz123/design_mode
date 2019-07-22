/**
 * @author: lvqz
 * @date: 2019/7/17
 * @time: 16:33
 */
package com.allifinance.simple;

public class Customer {

    public static void main(String [] args){
        MealFactory.cookDinner("米饭").cook();
        MealFactory.cookDinner("鸡肉").cook();
        MealFactory.cookDinner("面包").cook();
        MealFactory.cookDinner("宫保鸡丁").cook();
    }

}
