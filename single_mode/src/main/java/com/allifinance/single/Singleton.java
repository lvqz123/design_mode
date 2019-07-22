/**
 * @author: lvqz
 * @date: 2019/7/18
 * @time: 16:53
 */
package com.allifinance.single;

/**
 * ����ģʽ�ĵ���������
 */
public class Singleton {

    private Singleton(){}

    private static Singleton singleton = new Singleton();

    public static Singleton getInstance(){

        /*if(singleton==null){
            singleton = new Singleton();
        }*/
        return singleton;
    }


}
