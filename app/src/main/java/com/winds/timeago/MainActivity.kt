package com.winds.timeago

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.winds.timesago.TimeAgo
import com.winds.timesago.TimeAgo.Companion.using
import com.winds.timesago.TimeAgoMessages
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timeInMillis = System.currentTimeMillis()

       // val text: String = TimeAgo.using(timeInMillis)


        Timer().scheduleAtFixedRate(MyTimerTask(),0,10000*3)

    }


inner class MyTimerTask : TimerTask() {
    val LocaleBylanguageTag: Locale = Locale.forLanguageTag("hi")
    val messages =
        TimeAgoMessages.Builder().withLocale(LocaleBylanguageTag).build()

    override fun run() {
        val text = using(System.currentTimeMillis(), messages)
        runOnUiThread {
            tv.append("\n"+text)
        }
    }
}
}
