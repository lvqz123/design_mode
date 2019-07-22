/**
 * @author: lvqz
 * @date: 2019/7/18
 * @time: 11:57
 */
package com.allifinance.abstr;

public class LenvoFactory implements Businesses {


    @Override
    public Phone producePhone() {
        return new LenvoPhone();
    }

    @Override
    public Display produceDisplay() {
        return new LenvoDisplay();
    }
}
