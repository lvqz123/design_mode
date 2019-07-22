/**
 * @author: lvqz
 * @date: 2019/7/18
 * @time: 16:53
 */
package com.allifinance.single;

/**
 * 懒汉式单例模式（延迟加载）
 */
public class Singleton2 {

    private Singleton2() {
    }

    private static Singleton2 singleton = null;

    //如果有static，锁的是这个类。 如果没有static修饰，锁的是singleton这个对象
    synchronized public static Singleton2 getInstance(){
        if(singleton==null){
            try {
                //让线程休息10毫秒
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            singleton = new Singleton2();
        }
        return singleton;

    }

    //缩小范围，减少消耗
    /*public static Singleton2 getInstance(){
        synchronized (Singleton2.class){
            if(singleton==null){
                try {
                    //让线程休息10毫秒
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                singleton = new Singleton2();
            }
            return singleton;
        }
    }*/

    //双重检索
    /*public static Singleton2 getInstance() {

        if (singleton == null) {
                try {
                //让线程休息10毫秒
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Singleton2.class) {

                if (singleton == null) {
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }*/


}
