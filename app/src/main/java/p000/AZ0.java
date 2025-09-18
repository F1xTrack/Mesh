package p000;

/* loaded from: classes2.dex */
public final class AZ0 {

    /* renamed from: a */
    public int f248a;

    /* renamed from: b */
    public final int[] f249b = new int[10];

    /* renamed from: a */
    public final int m230a() {
        if ((this.f248a & 128) != 0) {
            return this.f249b[7];
        }
        return 65535;
    }

    /* renamed from: b */
    public final void m231b(AZ0 az0) {
        O90.m5968f(az0, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & az0.f248a) != 0) {
                m232c(i, az0.f249b[i]);
            }
        }
    }

    /* renamed from: c */
    public final void m232c(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f249b;
            if (i >= iArr.length) {
                return;
            }
            this.f248a = (1 << i) | this.f248a;
            iArr[i] = i2;
        }
    }
}
