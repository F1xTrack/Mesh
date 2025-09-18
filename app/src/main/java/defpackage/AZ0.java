package defpackage;

/* loaded from: classes2.dex */
public final class AZ0 {
    public int a;
    public final int[] b = new int[10];

    public final int a() {
        if ((this.a & 128) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    public final void b(AZ0 az0) {
        O90.f(az0, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & az0.a) != 0) {
                c(i, az0.b[i]);
            }
        }
    }

    public final void c(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i >= iArr.length) {
                return;
            }
            this.a = (1 << i) | this.a;
            iArr[i] = i2;
        }
    }
}
