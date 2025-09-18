package defpackage;

/* renamed from: lp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5766lp0 {
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        new C5575kp0().a();
        AbstractC0277Dh1.L(0);
        AbstractC0277Dh1.L(1);
        AbstractC0277Dh1.L(2);
        AbstractC0277Dh1.L(3);
        AbstractC0277Dh1.L(4);
    }

    public C5766lp0(C5575kp0 c5575kp0) {
        long j = c5575kp0.a;
        long j2 = c5575kp0.b;
        long j3 = c5575kp0.c;
        float f = c5575kp0.d;
        float f2 = c5575kp0.e;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = f;
        this.e = f2;
    }

    public final C5575kp0 a() {
        C5575kp0 c5575kp0 = new C5575kp0();
        c5575kp0.a = this.a;
        c5575kp0.b = this.b;
        c5575kp0.c = this.c;
        c5575kp0.d = this.d;
        c5575kp0.e = this.e;
        return c5575kp0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5766lp0)) {
            return false;
        }
        C5766lp0 c5766lp0 = (C5766lp0) obj;
        return this.a == c5766lp0.a && this.b == c5766lp0.b && this.c == c5766lp0.c && this.d == c5766lp0.d && this.e == c5766lp0.e;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.c;
        int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
        float f = this.d;
        int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.e;
        return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }
}
