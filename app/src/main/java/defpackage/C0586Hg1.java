package defpackage;

import sun.misc.Unsafe;

/* renamed from: Hg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0586Hg1 extends AbstractC0898Lg1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0586Hg1(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.AbstractC0898Lg1
    public final boolean c(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (AbstractC1053Ng1.g) {
                    if (AbstractC1053Ng1.h(j, obj) == 0) {
                    }
                } else if (AbstractC1053Ng1.i(j, obj) == 0) {
                }
                break;
            default:
                if (AbstractC1053Ng1.g) {
                    if (AbstractC1053Ng1.h(j, obj) == 0) {
                    }
                } else if (AbstractC1053Ng1.i(j, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.AbstractC0898Lg1
    public final byte d(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (!AbstractC1053Ng1.g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!AbstractC1053Ng1.g) {
                    break;
                } else {
                    break;
                }
        }
        return AbstractC1053Ng1.i(j, obj);
    }

    @Override // defpackage.AbstractC0898Lg1
    public final double e(long j, Object obj) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(h(j, obj));
    }

    @Override // defpackage.AbstractC0898Lg1
    public final float f(long j, Object obj) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(g(j, obj));
    }

    @Override // defpackage.AbstractC0898Lg1
    public final void k(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!AbstractC1053Ng1.g) {
                    AbstractC1053Ng1.m(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    AbstractC1053Ng1.l(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!AbstractC1053Ng1.g) {
                    AbstractC1053Ng1.m(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    AbstractC1053Ng1.l(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // defpackage.AbstractC0898Lg1
    public final void l(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!AbstractC1053Ng1.g) {
                    AbstractC1053Ng1.m(obj, j, b);
                    break;
                } else {
                    AbstractC1053Ng1.l(obj, j, b);
                    break;
                }
            default:
                if (!AbstractC1053Ng1.g) {
                    AbstractC1053Ng1.m(obj, j, b);
                    break;
                } else {
                    AbstractC1053Ng1.l(obj, j, b);
                    break;
                }
        }
    }

    @Override // defpackage.AbstractC0898Lg1
    public final void m(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                p(j, Double.doubleToLongBits(d), obj);
                break;
            default:
                p(j, Double.doubleToLongBits(d), obj);
                break;
        }
    }

    @Override // defpackage.AbstractC0898Lg1
    public final void n(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                o(j, obj, Float.floatToIntBits(f));
                break;
            default:
                o(j, obj, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // defpackage.AbstractC0898Lg1
    public final boolean s() {
        switch (this.b) {
        }
        return false;
    }
}
