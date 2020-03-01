package com.naman14.timber.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("收到了","播放了");
        if(Constant.songsFragment!=null)
        Constant.songsFragment.mAdapter.manualPlaySong(4);
    }
}
