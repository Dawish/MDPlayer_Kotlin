package view

import view.IView

/**
 * Created by dawish on 2017/5/22.
 */
open interface BaseView<T> : IView {

    /**
     * 获取数据成功后回调
     * @param data
     */
    fun getDataSuccess(data: List<T>)

}