package app

import android.app.Application

/**
 * Created by dawish on 2017/5/22.
 */
class MDApplication : Application() {
    init {
        instance = this
    }
    override fun onCreate() {
        super.onCreate()

    }

    companion object {
        lateinit var instance: MDApplication

    }
}