package com.lwp.dp.adapter.mediaplay;

/**
 * @Author lanwp
 * @Date 2019/3/21
 */
public class MediaAdapter implements MediaPlayer{

    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter() {

    }

    @Override
    public void play(String media, String fileName) {
        AdvanceMediaPlayer advanceMediaPlayer = null;
        if ("mp3".equalsIgnoreCase(media)) {
            advanceMediaPlayer = new Mp3Player();
            advanceMediaPlayer.playMp3(media);
        } else if ("mp4".equalsIgnoreCase(media)) {
            advanceMediaPlayer = new Mp4Player();
            advanceMediaPlayer.playMp4(media);
        } else{
            System.out.println("Invalid media. "+
                    media + " format not supported");
        }

    }
}
