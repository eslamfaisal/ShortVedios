package com.android.shortvideos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.shortvideos.videos.data.FbVideo
import com.android.shortvideos.videos.playlist.MoreVideosFragment
import im.ene.toro.media.PlaybackInfo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val moreVideos = MoreVideosFragment.newInstance(
            0,
            FbVideo.getItem(0, 0, 0),
            PlaybackInfo()
        )
        supportFragmentManager.beginTransaction().replace(R.id.cointainer,moreVideos).addToBackStack(null).commit()
    }
}