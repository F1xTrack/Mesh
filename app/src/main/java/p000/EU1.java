package p000;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class EU1 implements Closeable {

    /* renamed from: f */
    public static final HashMap f2721f = new HashMap();

    /* renamed from: a */
    public int f2722a;

    /* renamed from: b */
    public long f2723b;

    /* renamed from: c */
    public long f2724c;

    /* renamed from: d */
    public long f2725d = 2147483647L;

    /* renamed from: e */
    public long f2726e = -2147483648L;

    public EU1(String str) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.f2723b;
        if (j == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        mo197o(j);
    }

    /* renamed from: m */
    public void mo195m() {
        this.f2723b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    /* renamed from: n */
    public void mo196n(long j) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j2 = this.f2724c;
        if (j2 != 0 && jElapsedRealtimeNanos - j2 >= 1000000) {
            this.f2722a = 0;
            this.f2723b = 0L;
            this.f2725d = 2147483647L;
            this.f2726e = -2147483648L;
        }
        this.f2724c = jElapsedRealtimeNanos;
        this.f2722a++;
        this.f2725d = Math.min(this.f2725d, j);
        this.f2726e = Math.max(this.f2726e, j);
        if (this.f2722a % 50 == 0) {
            Locale locale = Locale.US;
            NV1.m5729D();
        }
        if (this.f2722a % 500 == 0) {
            this.f2722a = 0;
            this.f2723b = 0L;
            this.f2725d = 2147483647L;
            this.f2726e = -2147483648L;
        }
    }

    /* renamed from: o */
    public void mo197o(long j) {
        mo196n((SystemClock.elapsedRealtimeNanos() / 1000) - j);
    }
}
