package com.fanhl.wechat

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.fanhl.wechat.wxapi.WxApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_info.text = WxApi.info()
    }
}
