package com.zkteam.live.event.demo

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.zkteam.live.event.ZKLiveEventBus
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val TAG = "flag_data"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 请优先注册，最好是 Application 注册
        ZKLiveEventBus.init(this)

        ZKLiveEventBus.instance.with(TAG).observe(this, Observer {
            toast(it)
        })

        btn.setOnClickListener {
            ZKLiveEventBus.instance.with(TAG).post("测试消息")
        }
    }

    private fun toast(it: Any?) {
        Toast.makeText(this, "$it", Toast.LENGTH_SHORT).show()
    }
}
