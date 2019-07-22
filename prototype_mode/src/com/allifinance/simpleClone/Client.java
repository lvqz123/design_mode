package com.allifinance.simpleClone;

/**
 * @author: lvqz
 * @date: 2019/7/22
 * @time: 16:04
 */
public class Client {

    public static void main(String [] args){
        Resume resume = new ConcreateResume();
        Resume clone = resume.clone();

        System.out.println("resume = " + resume);
        System.out.println("clone = " + clone);
    }
        
}
