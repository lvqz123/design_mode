package com.allifinance;

/**
 * @author: lvqz
 * @date: 2019/7/19
 * @time: 16:55
 */
public class Test {

    public static void main(String [] args){

        Computer computer = Director.constructorCom(new BuilderComputer());
        System.out.println("computer = " + computer);


    }

}
