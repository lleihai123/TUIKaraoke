package com.tencent.liteav.tuikaraoke.ui.music;

import com.tencent.liteav.tuikaraoke.model.TRTCKaraokeRoomDef;

public abstract class KaraokeMusicService {

    //////////////////////////////////////////////////////////
    //                 歌曲列表管理
    //////////////////////////////////////////////////////////

    /**
     * 获取歌曲列表
     *
     * @param page     页码
     * @param pageSize 每页大小
     */
    public abstract void ktvGetMusicPage(int page, int pageSize, KaraokeMusicCallback.MusicListCallback callback);

    /**
     * 获取已点歌曲列表
     */
    public abstract void ktvGetSelectedMusicList(KaraokeMusicCallback.MusicSelectedListCallback callback);

    /**
     * 选择歌曲
     *
     * @param musicID 歌曲ID
     */
    public abstract void pickMusic(String musicID, KaraokeMusicCallback.ActionCallback callback);

    /**
     * 删除歌曲
     *
     * @param musicID  歌曲ID
     * @param callback
     */
    public abstract void deleteMusic(String musicID, KaraokeMusicCallback.ActionCallback callback);

    /**
     * 删除某个用户全部已点歌曲
     *
     * @param userID   用户ID
     * @param callback
     */
    public abstract void deleteAllMusic(String userID, KaraokeMusicCallback.ActionCallback callback);

    /**
     * 置顶歌曲
     *
     * @param musicID  歌曲ID
     * @param callback
     */
    public abstract void topMusic(String musicID, KaraokeMusicCallback.ActionCallback callback);

    /**
     * 切歌
     *
     * @param callback
     */
    public abstract void nextMusic(KaraokeMusicCallback.ActionCallback callback);

    /**
     * 歌曲即将播放
     *
     * @param musicID 歌曲ID
     */
    public abstract void prepareToPlay(String musicID);

    /**
     * 歌曲播放完成
     *
     * @param musicID 歌曲ID
     */
    public abstract void completePlaying(String musicID);

    /**
     * 退出房间
     */
    public abstract void onExitRoom();

    //////////////////////////////////////////////////////////
    //                 预加载管理
    //////////////////////////////////////////////////////////

    /**
     * 下载歌曲
     *
     * @param musicID  歌曲ID
     * @param callback
     */
    public abstract void downLoadMusic(String musicID, KaraokeMusicCallback.ActionCallback callback);

    /**
     * 下载歌词
     *
     * @param musicID  歌曲ID
     * @param callback
     */
    public abstract void downLoadLrc(String musicID, KaraokeMusicCallback.ActionCallback callback);

    //////////////////////////////////////////////////////////
    //                 房间信息传递
    //////////////////////////////////////////////////////////

    /**
     * 设置房间信息
     *
     * @param roomInfo 房间信息
     */
    public abstract void setRoomInfo(TRTCKaraokeRoomDef.RoomInfo roomInfo);

    /**
     * 设置歌曲管理回调对象
     *
     * @param delegate 代理实现对象
     */
    public abstract void setServiceDelegate(KaraokeMusicServiceDelegate delegate);
}
