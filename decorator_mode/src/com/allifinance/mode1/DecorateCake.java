package com.allifinance.mode1;

/**
 * @author: lvqz
 * @date: 2019/7/24
 * @time: 10:52
 * װ����������
 */
public class DecorateCake implements Cake{

    Cake cake;

    public DecorateCake (Cake cake){
        this.cake = cake;
    }


    @Override
    public String Flavor() {
        return cake.Flavor();
    }
}
