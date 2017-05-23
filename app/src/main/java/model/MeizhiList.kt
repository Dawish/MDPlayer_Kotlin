package model

/**
 * Created by Danxx on 2016/6/15.
 */
class MeizhiList : Model() {


    var isStatus: Boolean = false
    var total: Int = 0
    var tngou: List<TngouEntity>? = null

    class TngouEntity : Model() {
        /**访问数 */
        var count: Int = 0
        /**收藏数 */
        var fcount: Int = 0
        /**分类 */
        var galleryclass: Int = 0
        /**图库ID编码 */
        var id: Int = 0
        /**图片简介 */
        var img: String? = null
        /**rcount */
        var rcount: Int = 0
        var size: Int = 0
        /**发布时间 */
        var time: Long = 0
        /**标题，信息标题 */
        var title: String? = null
    }
}
