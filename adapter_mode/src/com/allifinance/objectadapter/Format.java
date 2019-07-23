package com.allifinance.objectadapter;

/**
 * @author: lvqz
 * @date: 2019/7/23
 * @time: 11:11
 * 适配器，使得目标对象可以播放MP4
 */
public class Format implements PlayMovie {

    private PlayMp4 playMp4 = new PlayMp4();

    @Override
    public void playMovieAVI() {
        playMp4.playMp4();
    }
}
