package com.allifinance.deepClone;

import java.util.Arrays;

/**
 * @author: lvqz
 * @date: 2019/7/22
 * @time: 15:57
 * ���¡��������
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

    /**
     * ��д����������ǳ��¡�����ǶԷ����еĲ��ֽ��и���֮��ͱ�������¡
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
