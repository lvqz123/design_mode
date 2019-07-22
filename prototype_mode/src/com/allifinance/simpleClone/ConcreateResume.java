package com.allifinance.simpleClone;

/**
 * @author: lvqz
 * @date: 2019/7/22
 * @time: 16:01
 */
public class ConcreateResume implements Resume {
    @Override
    public Resume clone() {

        Resume re = new ConcreateResume(); //个人理解 new resume也是可行的，在这里new了本身 应该是本身是实体这种情况
        return re;
    }
}
