package presenter

import view.IView

/**
 * Created by dawish on 2017/5/21.
 * 基本的Presenter接口
 * open类才可以被继承,默认的类为final类
 */
open interface IPresenter<V : IView>{

     fun attachView(view : V)

     fun detachView()

}