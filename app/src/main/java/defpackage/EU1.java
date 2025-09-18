package defpackage;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class EU1 implements Closeable {
    public static final HashMap f = new HashMap();
    public int a;
    public long b;
    public long c;
    public long d = 2147483647L;
    public long e = -2147483648L;

    public EU1(String str) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.b;
        if (j == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        o(j);
    }

    public void m() {
        this.b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void n(long j) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j2 = this.c;
        if (j2 != 0 && jElapsedRealtimeNanos - j2 >= 1000000) {
            this.a = 0;
            this.b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
        this.c = jElapsedRealtimeNanos;
        this.a++;
        this.d = Math.min(this.d, j);
        this.e = Math.max(this.e, j);
        if (this.a % 50 == 0) {
            Locale locale = Locale.US;
            NV1.D();
        }
        if (this.a % 500 == 0) {
            this.a = 0;
            this.b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
    }

    public void o(long j) {
        n((SystemClock.elapsedRealtimeNanos() / 1000) - j);
    }
}
