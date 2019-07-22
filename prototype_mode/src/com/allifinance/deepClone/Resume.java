package com.allifinance.deepClone;

import java.util.Arrays;

/**
 * @author: lvqz
 * @date: 2019/7/22
 * @time: 15:57
 * 深克隆——简历
 */
public class Resume implements Cloneable{

    /**
     *名字
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     *爱好
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

    /**
     * 重写方法本身是浅克隆，但是对方法中的部分进行改造之后就变成了深克隆
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Resume resume = (Resume) super.clone();
        resume.hobby = resume.getHobby().clone();
        return resume;
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
