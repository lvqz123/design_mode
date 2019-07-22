/**
 * @author: lvqz
 * @date: 2019/7/18
 * @time: 10:58
 */
package com.allifinance.method;

public class Customer_M {

    public static void main(String [] args){
        MealFactory mealFactory = new BreadFactory();
        mealFactory.produceMeal().cook();
        MealFactory mealFactory1 = new ChickenFactory();
        mealFactory1.produceMeal().cook();
        MealFactory mealFactory2 = new RiceFactory();
        mealFactory2.produceMeal().cook();
    }
}
