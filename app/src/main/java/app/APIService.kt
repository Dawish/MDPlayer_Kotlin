package app

import model.MeizhiClassify
import model.MeizhiList
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable
import java.util.*

/**
 * Created by dawish on 2017/5/24.
 * retrofit数据请求接口
 */
interface APIService{
    /**
     * 获取妹纸分类数据
     * @return
     */
    @GET("tnfs/api/classify")
    fun getMeizhiClassify() : Observable<MeizhiClassify>

    /**
     * 获取妹纸分类数据
     * @param id 分类id
     * @param page 分页页码
     * @param rows 页面大小
     */
    @GET("tnfs/api/classify")
    fun getMeizhiList(
            @Query("id") id: String,
            @Query("page") page: String ,
            @Query("rows") rows: String
    ) : Observable<MeizhiList>

}