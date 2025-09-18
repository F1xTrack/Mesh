package defpackage;

import android.os.SystemClock;

/* renamed from: by0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2423by0 {
    public int a = Integer.MIN_VALUE;
    public int b = Integer.MIN_VALUE;
    public float c = 0.0f;
    public float d = 0.0f;
    public long e = -11;

    public final boolean a(int i, int i2) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.e;
        boolean z = (jUptimeMillis - j <= 10 && this.a == i && this.b == i2) ? false : true;
        if (jUptimeMillis - j != 0) {
            this.c = (i - this.a) / (jUptimeMillis - j);
            this.d = (i2 - this.b) / (jUptimeMillis - j);
        }
        this.e = jUptimeMillis;
        this.a = i;
        this.b = i2;
        return z;
    }
}
