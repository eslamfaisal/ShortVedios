    package com.android.shortvideos.videos;

    import android.os.Bundle;

    import androidx.appcompat.app.AppCompatActivity;


    import com.android.shortvideos.R;
    import com.android.shortvideos.videos.data.FbVideo;
    import com.android.shortvideos.videos.playlist.MoreVideosFragment;

    import im.ene.toro.media.PlaybackInfo;

    public class VideosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos2);

        MoreVideosFragment moreVideos =
                MoreVideosFragment.newInstance(0, FbVideo.getItem(0, 0, 0), new PlaybackInfo());
        //Log.d(TAG, "onItemClick: "+position+", "+((FbVideo) item).mediaUrl+", "+info);
//        moreVideos.show(getSupportFragmentManager(), MoreVideosFragment.TAG);

    }
}