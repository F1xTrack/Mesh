package defpackage;

import android.os.SystemClock;
import com.facebook.react.modules.core.JavaTimerManager;

/* renamed from: qb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC6679qb0 implements Runnable {
    public volatile boolean a = false;
    public final long b;
    public final /* synthetic */ JavaTimerManager c;

    public RunnableC6679qb0(JavaTimerManager javaTimerManager, long j) {
        this.c = javaTimerManager;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JavaTimerManager javaTimerManager;
        boolean z;
        if (this.a) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - (this.b / 1000000);
        long jCurrentTimeMillis = System.currentTimeMillis() - jUptimeMillis;
        if (16.666666f - jUptimeMillis < 1.0f) {
            return;
        }
        synchronized (this.c.f) {
            javaTimerManager = this.c;
            z = javaTimerManager.p;
        }
        if (z) {
            javaTimerManager.b.callIdleCallbacks(jCurrentTimeMillis);
        }
        this.c.m = null;
    }
}
