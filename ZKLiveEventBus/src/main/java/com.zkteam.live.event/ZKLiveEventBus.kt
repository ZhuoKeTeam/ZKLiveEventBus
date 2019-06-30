package com.zkteam.live.event

import android.content.Context
import com.jeremyliao.liveeventbus.LiveEventBus

class ZKLiveEventBus {

    private object Holder {
        val INSTANCE = LiveEventBus.get()!!
    }

    companion object {
        fun init(context: Context) {
            val mContext = context.applicationContext
            ZKLiveEventBus.instance
                .config()
                .supportBroadcast(mContext)
                .lifecycleObserverAlwaysActive(true)
                .autoClear(false)
        }

        val instance: LiveEventBus by lazy {
            Holder.INSTANCE
        }
    }

}