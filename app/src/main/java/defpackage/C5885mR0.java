package defpackage;

import android.os.SystemClock;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: mR0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5885mR0 {
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;
    public final C1665Vc1 h;
    public final C4332iN i;
    public int j;
    public long k;

    public C5885mR0(C1665Vc1 c1665Vc1, BZ0 bz0, C4332iN c4332iN) {
        double d = bz0.d;
        this.a = d;
        this.b = bz0.e;
        this.c = bz0.f * 1000;
        this.h = c1665Vc1;
        this.i = c4332iN;
        this.d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }

    public final int a() {
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.k) / this.c);
        int iMin = this.f.size() == this.e ? Math.min(100, this.j + iCurrentTimeMillis) : Math.max(0, this.j - iCurrentTimeMillis);
        if (this.j != iMin) {
            this.j = iMin;
            this.k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(C0806Kc c0806Kc, S81 s81) {
        this.h.a(new C0029Ad(c0806Kc.a, EnumC7370uD0.c, null), new NG(SystemClock.elapsedRealtime() - this.d < 2000, this, s81, c0806Kc));
    }
}
