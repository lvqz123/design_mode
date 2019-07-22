package com.allifinance.deepClone;

/**
 * @author: lvqz
 * @date: 2019/7/22
 * @time: 16:14
 *
 * 深克隆的实现情况
 */
public class Client {

    public static void main(String [] args) throws CloneNotSupportedException {
        Resume rs = new Resume();

        //引用数据类型  class、interfance、Array


        rs.setName("张三");
        rs.setAge(18);
        rs.setHobby(new String[]{"吃饭","睡觉","打豆豆"});

        Resume clone = (Resume) rs.clone();

        //成员变量是基本数据类型的，如果克隆的变量值变了 是什么样子
        /*clone.setAge(20);

        System.out.println("rs = " + rs);
        System.out.println("clone = " + clone);*/

        //成员变量是引用数据类型的，如果克隆的变量值变了 是什么样子

        String[] hobby = clone.getHobby();
        hobby[0]="玩游戏";
        clone.setHobby(hobby);

        System.out.println("rs = " + rs);
        System.out.println("clone = " + clone);


    }

}
