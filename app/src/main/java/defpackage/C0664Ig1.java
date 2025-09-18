package defpackage;

import sun.misc.Unsafe;

/* renamed from: Ig1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0664Ig1 extends AbstractC0975Mg1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0664Ig1(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.AbstractC0975Mg1
    public final boolean c(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (AbstractC1131Og1.h) {
                    if (AbstractC1131Og1.g(j, obj) == 0) {
                    }
                } else if (AbstractC1131Og1.h(j, obj) == 0) {
                }
                break;
            default:
                if (AbstractC1131Og1.h) {
                    if (AbstractC1131Og1.g(j, obj) == 0) {
                    }
                } else if (AbstractC1131Og1.h(j, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.AbstractC0975Mg1
    public final byte d(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (!AbstractC1131Og1.h) {
                    break;
                } else {
                    break;
                }
            default:
                if (!AbstractC1131Og1.h) {
                    break;
                } else {
                    break;
                }
        }
        return AbstractC1131Og1.h(j, obj);
    }

    @Override // defpackage.AbstractC0975Mg1
    public final double e(long j, Object obj) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(h(j, obj));
    }

    @Override // defpackage.AbstractC0975Mg1
    public final float f(long j, Object obj) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(g(j, obj));
    }

    @Override // defpackage.AbstractC0975Mg1
    public final void k(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!AbstractC1131Og1.h) {
                    AbstractC1131Og1.o(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    AbstractC1131Og1.n(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!AbstractC1131Og1.h) {
                    AbstractC1131Og1.o(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    AbstractC1131Og1.n(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // defpackage.AbstractC0975Mg1
    public final void l(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!AbstractC1131Og1.h) {
                    AbstractC1131Og1.o(obj, j, b);
                    break;
                } else {
                    AbstractC1131Og1.n(obj, j, b);
                    break;
                }
            default:
                if (!AbstractC1131Og1.h) {
                    AbstractC1131Og1.o(obj, j, b);
                    break;
                } else {
                    AbstractC1131Og1.n(obj, j, b);
                    break;
                }
        }
    }

    @Override // defpackage.AbstractC0975Mg1
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

    @Override // defpackage.AbstractC0975Mg1
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
}
