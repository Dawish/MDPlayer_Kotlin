package view

/**
 * Created by dawish on 2017/5/22.
 * 可以被继承的基本View接口
 */
open interface IView{

    /**
     * 获取数据失败
     * @param e
     */
     fun getDataError(eMsg : String)

    /**
     *
     */
     fun showProgress()

    /**
     *
     */
     fun hideProgress()
}
