package com.allifinance.mode1;

/**
 * @author: lvqz
 * @date: 2019/7/24
 * @time: 11:03
 */
public class Test {

    public static void main(String [] args){


        Cake cake = new PotatoCake();

        TomatoDecorateCake tomatoDecorateCake = new TomatoDecorateCake(cake);

        System.out.println(tomatoDecorateCake.Flavor());

        SourHotDecorateCake sour = new SourHotDecorateCake(cake);

        System.out.println(sour.Flavor());

    }

}
