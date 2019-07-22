/**
 * @author: lvqz
 * @date: 2019/7/18
 * @time: 16:53
 */
package com.allifinance.single;

/**
 * ����ʽ����ģʽ���ӳټ��أ�
 */
public class Singleton2 {

    private Singleton2() {
    }

    private static Singleton2 singleton = null;

    //�����static������������ࡣ ���û��static���Σ�������singleton�������
    synchronized public static Singleton2 getInstance(){
        if(singleton==null){
            try {
                //���߳���Ϣ10����
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            singleton = new Singleton2();
        }
        return singleton;

    }

    //��С��Χ����������
    /*public static Singleton2 getInstance(){
        synchronized (Singleton2.class){
            if(singleton==null){
                try {
                    //���߳���Ϣ10����
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                singleton = new Singleton2();
            }
            return singleton;
        }
    }*/

    //˫�ؼ���
    /*public static Singleton2 getInstance() {

        if (singleton == null) {
                try {
                //���߳���Ϣ10����
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
