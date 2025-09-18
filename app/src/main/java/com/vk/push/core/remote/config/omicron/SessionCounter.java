package com.vk.push.core.remote.config.omicron;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public class SessionCounter {
    public final SharedPreferences a;

    public SessionCounter(SharedPreferences sharedPreferences, int i) {
        this.a = sharedPreferences;
    }

    public int getCurrentCount() {
        return this.a.getInt("current_count", 0);
    }

    public int getTotalCount() {
        return this.a.getInt("total_count", 0);
    }
}
