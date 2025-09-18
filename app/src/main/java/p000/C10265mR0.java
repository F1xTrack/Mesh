package p000;

import android.os.SystemClock;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: mR0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10265mR0 {

    /* renamed from: a */
    public final double f37698a;

    /* renamed from: b */
    public final double f37699b;

    /* renamed from: c */
    public final long f37700c;

    /* renamed from: d */
    public final long f37701d;

    /* renamed from: e */
    public final int f37702e;

    /* renamed from: f */
    public final ArrayBlockingQueue f37703f;

    /* renamed from: g */
    public final ThreadPoolExecutor f37704g;

    /* renamed from: h */
    public final C8411Vc1 f37705h;

    /* renamed from: i */
    public final C4238iN f37706i;

    /* renamed from: j */
    public int f37707j;

    /* renamed from: k */
    public long f37708k;

    public C10265mR0(C8411Vc1 c8411Vc1, BZ0 bz0, C4238iN c4238iN) {
        double d = bz0.f907d;
        this.f37698a = d;
        this.f37699b = bz0.f908e;
        this.f37700c = bz0.f909f * 1000;
        this.f37705h = c8411Vc1;
        this.f37706i = c4238iN;
        this.f37701d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.f37702e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f37703f = arrayBlockingQueue;
        this.f37704g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f37707j = 0;
        this.f37708k = 0L;
    }

    /* renamed from: a */
    public final int m22826a() {
        if (this.f37708k == 0) {
            this.f37708k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f37708k) / this.f37700c);
        int iMin = this.f37703f.size() == this.f37702e ? Math.min(100, this.f37707j + iCurrentTimeMillis) : Math.max(0, this.f37707j - iCurrentTimeMillis);
        if (this.f37707j != iMin) {
            this.f37707j = iMin;
            this.f37708k = System.currentTimeMillis();
        }
        return iMin;
    }

    /* renamed from: b */
    public final void m22827b(C0669Kc c0669Kc, S81 s81) {
        this.f37705h.m8514a(new C0040Ad(c0669Kc.f6223a, EnumC11261uD0.f43596c, null), new C0835NG(SystemClock.elapsedRealtime() - this.f37701d < 2000, this, s81, c0669Kc));
    }
}
