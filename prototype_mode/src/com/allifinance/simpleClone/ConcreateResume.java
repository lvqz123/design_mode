package com.allifinance.simpleClone;

/**
 * @author: lvqz
 * @date: 2019/7/22
 * @time: 16:01
 */
public class ConcreateResume implements Resume {
    @Override
    public Resume clone() {

        Resume re = new ConcreateResume(); //������� new resumeҲ�ǿ��еģ�������new�˱��� Ӧ���Ǳ�����ʵ���������
        return re;
    }
}
