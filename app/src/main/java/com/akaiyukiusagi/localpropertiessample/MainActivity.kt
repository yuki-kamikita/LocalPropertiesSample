package com.akaiyukiusagi.localpropertiessample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // BuildConfig.javaは初回ビルド時に生成される
        text_view.text = BuildConfig.LOCAL_PROPERTIES_SAMPLE
    }
}