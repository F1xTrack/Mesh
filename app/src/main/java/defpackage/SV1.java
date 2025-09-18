package defpackage;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class SV1 extends TV1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SV1(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.TV1
    public final double a(long j, Object obj) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(m(j, obj));
    }

    @Override // defpackage.TV1
    public final void d(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!VV1.g) {
                    VV1.m(obj, j, b);
                    break;
                } else {
                    VV1.k(obj, j, b);
                    break;
                }
            default:
                if (!VV1.g) {
                    VV1.m(obj, j, b);
                    break;
                } else {
                    VV1.k(obj, j, b);
                    break;
                }
        }
    }

    @Override // defpackage.TV1
    public final void e(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                b(j, Double.doubleToLongBits(d), obj);
                break;
            default:
                b(j, Double.doubleToLongBits(d), obj);
                break;
        }
    }

    @Override // defpackage.TV1
    public final void f(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                c(j, obj, Float.floatToIntBits(f));
                break;
            default:
                c(j, obj, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // defpackage.TV1
    public final void g(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!VV1.g) {
                    VV1.m(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    VV1.k(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!VV1.g) {
                    VV1.m(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    VV1.k(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // defpackage.TV1
    public final float i(long j, Object obj) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(l(j, obj));
    }

    @Override // defpackage.TV1
    public final boolean k(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (VV1.g) {
                    if (((byte) (VV1.c.l((-4) & j, obj) >>> ((int) (((~j) & 3) << 3)))) == 0) {
                    }
                } else {
                    if (((byte) (VV1.c.l((-4) & j, obj) >>> ((int) ((j & 3) << 3)))) == 0) {
                    }
                }
                break;
            default:
                if (VV1.g) {
                    if (((byte) (VV1.c.l((-4) & j, obj) >>> ((int) (((~j) & 3) << 3)))) == 0) {
                    }
                } else {
                    if (((byte) (VV1.c.l((-4) & j, obj) >>> ((int) ((j & 3) << 3)))) == 0) {
                    }
                }
                break;
        }
        return false;
    }
}
