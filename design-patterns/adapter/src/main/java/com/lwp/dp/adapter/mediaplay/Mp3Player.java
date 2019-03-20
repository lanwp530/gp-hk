package com.lwp.dp.adapter.mediaplay;

/**
 * @Author lanwp
 * @Date 2019/3/21
 */
public class Mp3Player implements AdvanceMediaPlayer {
    @Override
    public void playMp3(String fileName) {
        System.out.println(this.getClass().getName() + " playMp3 播放 mp3");
    }

    @Override
    public void playMp4(String fileName) {

    }
}
