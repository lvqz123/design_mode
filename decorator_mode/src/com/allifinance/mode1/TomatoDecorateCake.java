package com.allifinance.mode1;

/**
 * @author: lvqz
 * @date: 2019/7/24
 * @time: 11:02
 */
public class TomatoDecorateCake extends DecorateCake {

    public TomatoDecorateCake(Cake cake) {
        super(cake);
    }

    @Override
    public String Flavor() {
        return "·¬ÇÑÎ¶"+cake.Flavor();
    }
}
