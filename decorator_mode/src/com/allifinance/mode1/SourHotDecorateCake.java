package com.allifinance.mode1;

/**
 * @author: lvqz
 * @date: 2019/7/24
 * @time: 11:12
 */
public class SourHotDecorateCake extends DecorateCake {
    public SourHotDecorateCake(Cake cake) {
        super(cake);
    }

    @Override
    public String Flavor() {
        return "À·¿±Œ∂"+cake.Flavor();
    }
}
