package defpackage;

import android.graphics.Bitmap;

/* renamed from: Vh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1678Vh {
    public int a;
    public long b;
    public final int c;
    public final int d;
    public final C3513e41 e;

    public C1678Vh(int i, int i2) {
        if (!(i > 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i2 > 0)) {
            throw new IllegalArgumentException();
        }
        this.c = i;
        this.d = i2;
        this.e = new C3513e41(5, this);
    }

    public final synchronized void a(Bitmap bitmap) {
        int iD = AbstractC6699qi.d(bitmap);
        ML1.b("No bitmaps registered.", this.a > 0);
        long j = iD;
        ML1.c(j <= this.b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(iD), Long.valueOf(this.b));
        this.b -= j;
        this.a--;
    }

    public final synchronized int b() {
        return this.a;
    }

    public final synchronized int c() {
        return this.c;
    }

    public final synchronized int d() {
        return this.d;
    }

    public final synchronized long e() {
        return this.b;
    }
}
