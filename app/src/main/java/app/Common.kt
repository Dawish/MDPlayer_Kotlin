package app

/**
 * Created by Danxx on 2016/6/1.
 */
class Common {


    private val names = arrayOf(
            "香港电影",
            "综艺频道",
            "高清音乐",
            "动作电影",
            "电影",
            "周星驰",
            "成龙",
            "喜剧",
            "儿歌",
            "LIVE生活")

    private val urls = arrayOf(
            "http://live.gslb.letv.com/gslb?stream_id=lb_hkmovie_1300&tag=live&ext=m3u8&sign=live_tv&platid=10&splatid=1009&format=letv&expect=1",
            "http://live.gslb.letv.com/gslb?stream_id=lb_ent_1300&tag=live&ext=m3u8&sign=live_tv&platid=10&splatid=1009&format=letv&expect=1",
            "http://live.gslb.letv.com/gslb?stream_id=lb_music_1300&tag=live&ext=m3u8&sign=live_tv&platid=10&splatid=1009&format=letv&expect=1",
            "http://live.gslb.letv.com/gslb?tag=live&stream_id=lb_dzdy_720p&tag=live&ext=m3u8&sign=live_tv&platid=10&splatid=1009&format=C1S&expect=1",
            "http://live.gslb.letv.com/gslb?tag=live&stream_id=lb_movie_720p&tag=live&ext=m3u8&sign=live_tv&platid=10&splatid=1009&format=C1S&expect=1",
            "http://live.gslb.letv.com/gslb?tag=live&stream_id=lb_zxc_720p&tag=live&ext=m3u8&sign=live_tv&platid=10&splatid=1009&format=C1S&expect=1",
            "http://live.gslb.letv.com/gslb?tag=live&stream_id=lb_cl_720p&tag=live&ext=m3u8&sign=live_tv&platid=10&splatid=1009&format=C1S&expect=1",
            "http://live.gslb.letv.com/gslb?tag=live&stream_id=lb_comedy_720p&tag=live&ext=m3u8&sign=live_tv&platid=10&splatid=1009&format=C1S&expect=1",
            "http://live.gslb.letv.com/gslb?tag=live&stream_id=lb_erge_720p&tag=live&ext=m3u8&sign=live_tv&platid=10&splatid=1009&format=C1S&expect=1",
            "http://live.gslb.letv.com/gslb?tag=live&stream_id=lb_livemusic_720p&tag=live&ext=m3u8&sign=live_tv&platid=10&splatid=1009&format=C1S&expect=1")

    companion object {
        /**eventbus的刷新Action消息类型 */
        val EventBusType_Refresh = 1
        /**eventbus的隐藏Action消息类型 */
        val EventBusType_Hide = 2
        /**eventbus的显示Action消息类型 */
        val EventBusType_Show = 3

        /**Meizhi API */
        val meizhi_api = "http://www.tngou.net/"
        /**图片分类 */
        val img_classify = "http://www.tngou.net/tnfs/api/classify"
        /**图片列表 */
        val img_list = "http://www.tngou.net/tnfs/api/list"
        /**图片详情 */
        val img_show = "http://www.tngou.net/tnfs/api/show"
        /**图片URL拼接前缀 */
        val img_url = "http://tnfs.tngou.net/img"
    }
}
