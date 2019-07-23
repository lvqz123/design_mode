package com.allifinance.Test;

/**
 * @author: lvqz
 * @date: 2019/7/23
 * @time: 12:04
 */
public class Test {

    public static void main(String [] args){

        DC5 dc5 = new Format();

        int output = dc5.output();

        if(output == 5){
            System.out.println("已将220V转换为5V");
        }

    }
}
