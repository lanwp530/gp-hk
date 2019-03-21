package com.lwp.dp.adapter.mediaplay;

/**
 * @Author lanwp
 * @Date 2019/3/21
 */
public class MediaAdapterTest {
    public static void main(String[] args) {
        new MediaAdapter().play("没有","测试媒体");
        new MediaAdapter().play("MP3", "十年");
        new MediaAdapter().play("MP4", "封神");
    }
}
