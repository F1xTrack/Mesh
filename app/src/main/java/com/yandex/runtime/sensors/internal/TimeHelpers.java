package com.yandex.runtime.sensors.internal;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public class TimeHelpers {
    public static long eventNanosToMills(long j) {
        return j / 1000000;
    }

    public static long eventNanosToTimestampMills(long j) {
        return (j / 1000000) + (System.currentTimeMillis() - SystemClock.elapsedRealtime());
    }
}
