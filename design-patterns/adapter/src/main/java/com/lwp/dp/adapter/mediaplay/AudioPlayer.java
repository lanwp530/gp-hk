package com.lwp.dp.adapter.mediaplay;

/**
 * @Author lanwp
 * @Date 2019/3/21
 */
public class AudioPlayer implements MediaPlayer  {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String media, String fileName) {
        mediaAdapter = new MediaAdapter();
        mediaAdapter.play(media, fileName);
    }
}
