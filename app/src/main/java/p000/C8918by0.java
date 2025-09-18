package p000;

import android.os.SystemClock;

/* renamed from: by0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8918by0 {

    /* renamed from: a */
    public int f17242a = Integer.MIN_VALUE;

    /* renamed from: b */
    public int f17243b = Integer.MIN_VALUE;

    /* renamed from: c */
    public float f17244c = 0.0f;

    /* renamed from: d */
    public float f17245d = 0.0f;

    /* renamed from: e */
    public long f17246e = -11;

    /* renamed from: a */
    public final boolean m10548a(int i, int i2) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.f17246e;
        boolean z = (jUptimeMillis - j <= 10 && this.f17242a == i && this.f17243b == i2) ? false : true;
        if (jUptimeMillis - j != 0) {
            this.f17244c = (i - this.f17242a) / (jUptimeMillis - j);
            this.f17245d = (i2 - this.f17243b) / (jUptimeMillis - j);
        }
        this.f17246e = jUptimeMillis;
        this.f17242a = i;
        this.f17243b = i2;
        return z;
    }
}
