package com.p019vk.push.core.remote.config.omicron;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public class SessionCounter {

    /* renamed from: a */
    public final SharedPreferences f20535a;

    public SessionCounter(SharedPreferences sharedPreferences, int i) {
        this.f20535a = sharedPreferences;
    }

    public int getCurrentCount() {
        return this.f20535a.getInt("current_count", 0);
    }

    public int getTotalCount() {
        return this.f20535a.getInt("total_count", 0);
    }
}
