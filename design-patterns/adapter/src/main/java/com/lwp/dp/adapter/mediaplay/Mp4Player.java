package com.lwp.dp.adapter.mediaplay;

/**
 * @Author lanwp
 * @Date 2019/3/21
 */
public class Mp4Player implements AdvanceMediaPlayer{
    @Override
    public void playMp3(String media) {

    }

    @Override
    public void playMp4(String media) {
        System.out.println(this.getClass().getName() + " playMp4 播放 mp4");
    }
}
