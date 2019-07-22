package com.allifinance;

/**
 * @author: lvqz
 * @date: 2019/7/19
 * @time: 16:45
 * 抽象构建
 */
public interface Builder {
    /**
     * 构建主板
     */
    public void buildMainBoard();

    /**
     * 构建硬盘
     */
    public void buildHardDisk();

    /**
     * 构建Cpu
     */
    public void buildCpu();

    /**
     * 构建电脑
     * @return
     */
    public Computer buildComputer();

}
