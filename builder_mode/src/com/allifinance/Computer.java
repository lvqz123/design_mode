package com.allifinance;

/**
 * @author: lvqz
 * @date: 2019/7/19
 * @time: 16:40
 */
public class Computer {
    /**
     * Ö÷°å
     */
    private String mainBoard;

    /**
     * Ó²ÅÌ
     */
    private String HardDisk;
    
    /**
     *cpu
     */
    private String cpu;

    public String getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public String getHardDisk() {
        return HardDisk;
    }

    public void setHardDisk(String hardDisk) {
        HardDisk = hardDisk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "mainBoard='" + mainBoard + '\'' +
                ", HardDisk='" + HardDisk + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
