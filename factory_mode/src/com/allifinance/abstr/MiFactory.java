/**
 * @author: lvqz
 * @date: 2019/7/18
 * @time: 12:03
 */
package com.allifinance.abstr;

public class MiFactory implements Businesses {
    @Override
    public Phone producePhone() {
        return new MiPhone();
    }

    @Override
    public Display produceDisplay() {
        return new MiDisplay();
    }
}
