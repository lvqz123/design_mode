package com.allifinance.classadapter;

/**
 * @author: lvqz
 * @date: 2019/7/23
 * @time: 11:11
 * 适配器，使得目标对象可以播放MP4
 */
public class Format extends PlayMp4 implements PlayMovie {

    @Override
    public void playMovieAVI() {
        super.playMp4();
     }
}
