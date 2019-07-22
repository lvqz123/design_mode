/**
 * @author: lvqz
 * @date: 2019/7/18
 * @time: 10:55
 */
package com.allifinance.method;

public class BreadFactory implements MealFactory {

    @Override
    public Meal_M produceMeal() {
        return new Bread();
    }
}
