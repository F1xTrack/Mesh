package p000;

import android.os.SystemClock;
import com.facebook.react.modules.core.JavaTimerManager;

/* renamed from: qb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC10797qb0 implements Runnable {

    /* renamed from: a */
    public volatile boolean f41044a = false;

    /* renamed from: b */
    public final long f41045b;

    /* renamed from: c */
    public final /* synthetic */ JavaTimerManager f41046c;

    public RunnableC10797qb0(JavaTimerManager javaTimerManager, long j) {
        this.f41046c = javaTimerManager;
        this.f41045b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JavaTimerManager javaTimerManager;
        boolean z;
        if (this.f41044a) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - (this.f41045b / 1000000);
        long jCurrentTimeMillis = System.currentTimeMillis() - jUptimeMillis;
        if (16.666666f - jUptimeMillis < 1.0f) {
            return;
        }
        synchronized (this.f41046c.f17928f) {
            javaTimerManager = this.f41046c;
            z = javaTimerManager.f17938p;
        }
        if (z) {
            javaTimerManager.f17924b.callIdleCallbacks(jCurrentTimeMillis);
        }
        this.f41046c.f17935m = null;
    }
}
