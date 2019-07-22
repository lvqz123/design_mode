package com.allifinance;

/**
 * @author: lvqz
 * @date: 2019/7/19
 * @time: 16:48
 */
public class BuilderComputer implements Builder {

    private Computer c = new Computer();

    @Override
    public void buildMainBoard() {
        c.setMainBoard("»ªË¶");
    }

    @Override
    public void buildHardDisk() {
        c.setHardDisk("ÉÁµÏ512GB");
    }

    @Override
    public void buildCpu() {
        c.setCpu("intel i7-9750");
    }

    @Override
    public Computer buildComputer() {
        return c;
    }
}
