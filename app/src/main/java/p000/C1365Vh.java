package p000;

import android.graphics.Bitmap;

/* renamed from: Vh */
/* loaded from: classes.dex */
public final class C1365Vh {

    /* renamed from: a */
    public int f12688a;

    /* renamed from: b */
    public long f12689b;

    /* renamed from: c */
    public final int f12690c;

    /* renamed from: d */
    public final int f12691d;

    /* renamed from: e */
    public final C9196e41 f12692e;

    public C1365Vh(int i, int i2) {
        if (!(i > 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i2 > 0)) {
            throw new IllegalArgumentException();
        }
        this.f12690c = i;
        this.f12691d = i2;
        this.f12692e = new C9196e41(5, this);
    }

    /* renamed from: a */
    public final synchronized void m8531a(Bitmap bitmap) {
        int iM24051d = AbstractC6697qi.m24051d(bitmap);
        ML1.m5335b("No bitmaps registered.", this.f12688a > 0);
        long j = iM24051d;
        ML1.m5336c(j <= this.f12689b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(iM24051d), Long.valueOf(this.f12689b));
        this.f12689b -= j;
        this.f12688a--;
    }

    /* renamed from: b */
    public final synchronized int m8532b() {
        return this.f12688a;
    }

    /* renamed from: c */
    public final synchronized int m8533c() {
        return this.f12690c;
    }

    /* renamed from: d */
    public final synchronized int m8534d() {
        return this.f12691d;
    }

    /* renamed from: e */
    public final synchronized long m8535e() {
        return this.f12689b;
    }
}
