package com.allifinance.shallowClone;

import java.util.Arrays;

/**
 * @author: lvqz
 * @date: 2019/7/22
 * @time: 15:57
 * ǳ��¡��������
 */
public class Resume implements Cloneable{

    /**
     *����
     */
    private String name;

    /**
     * ����
     */
    private int age;

    /**
     *����
     */
    private String[] hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby=" + Arrays.toString(hobby) +
                '}'+super.toString();
    }
}
