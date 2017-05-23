package presenter

import rx.Subscription
import rx.subscriptions.CompositeSubscription
import view.IView

/**
 * Created by dawish on 2017/5/22.
 */
open abstract  class BasePresenter<V : IView> : IPresenter<V> {

    override fun attachView(view: V) {
        TODO("not implemented")
    }

    override fun detachView() {
        TODO("to unSubscribe")
        unSubscribe()
    }
    /**
     * CompositeSubscription来持有所有的Subscriptions，
     * 然后在onDestroy()或者onDestroyView()里取消所有的订阅。
     */
    var compositeSubscription = CompositeSubscription()

    /**
     *添加subscriber订阅者到mCompositeSubscription，
     * 方便在detachView的时候取消订阅，防止内存泄露
     */
    protected fun addSubscription(subscription: Subscription) {
        compositeSubscription.add(subscription)
    }

    /**
     * 取消Subscriber事件订阅
     */
    fun unSubscribe() {
        if(compositeSubscription.hasSubscriptions()){
            compositeSubscription.unsubscribe()
        }
    }
}