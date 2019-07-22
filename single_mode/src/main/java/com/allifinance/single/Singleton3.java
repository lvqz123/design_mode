package com.allifinance.single;

/**
 * @author: lvqz
 * @date: 2019/7/19
 * @time: 11:52
 * ����ģʽ�ľ�̬�ڲ���ʵ����ʽ
 */
public class Singleton3 {

    private Singleton3(){}

    //��̬�ڲ���
    private static class InSideClass{
        private static Singleton3 singleton3 = new Singleton3();
    }

    public static Singleton3 getInstance(){
        return InSideClass.singleton3;
    }

}
