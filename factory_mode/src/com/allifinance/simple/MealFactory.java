/**
 * @author: lvqz
 * @date: 2019/7/17
 * @time: 16:28
 */
package com.allifinance.simple;

public class MealFactory {

    public static Meal cookDinner(String message){

        if ("米饭".equals(message)){
            return new Rice();
        }else if ("鸡肉".equals(message)){
            return new Chicken();
        }else if("面包".equals(message)){
            return new Bread();
        }else {
            throw new RuntimeException("对不起，本饭店没有您想要的菜品");
        }

    }

}
