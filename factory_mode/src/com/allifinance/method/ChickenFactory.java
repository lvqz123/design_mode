/**
 * @author: lvqz
 * @date: 2019/7/18
 * @time: 10:57
 */
package com.allifinance.method;

public class ChickenFactory implements MealFactory {
    @Override
    public Meal_M produceMeal() {
        return new Chicken();
    }
}
