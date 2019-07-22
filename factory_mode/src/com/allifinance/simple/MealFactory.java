/**
 * @author: lvqz
 * @date: 2019/7/17
 * @time: 16:28
 */
package com.allifinance.simple;

public class MealFactory {

    public static Meal cookDinner(String message){

        if ("�׷�".equals(message)){
            return new Rice();
        }else if ("����".equals(message)){
            return new Chicken();
        }else if("���".equals(message)){
            return new Bread();
        }else {
            throw new RuntimeException("�Բ��𣬱�����û������Ҫ�Ĳ�Ʒ");
        }

    }

}
