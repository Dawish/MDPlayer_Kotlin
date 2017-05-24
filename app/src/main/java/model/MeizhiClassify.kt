package model

/**
 * Created by Danxx on 2016/6/13.
 * 妹纸分类bean
 */
class MeizhiClassify : Model() {

    var isStatus: Boolean = false
    var tngou: List<TngouEntity>? = null

    class TngouEntity : Model() {
        var description: String? = null
        var id: Int = 0
        var keywords: String? = null
        var name: String? = null
        var seq: Int = 0
        var title: String? = null

    }
}
