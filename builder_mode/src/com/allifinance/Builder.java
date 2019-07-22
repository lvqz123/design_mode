package com.allifinance;

/**
 * @author: lvqz
 * @date: 2019/7/19
 * @time: 16:45
 * ���󹹽�
 */
public interface Builder {
    /**
     * ��������
     */
    public void buildMainBoard();

    /**
     * ����Ӳ��
     */
    public void buildHardDisk();

    /**
     * ����Cpu
     */
    public void buildCpu();

    /**
     * ��������
     * @return
     */
    public Computer buildComputer();

}
