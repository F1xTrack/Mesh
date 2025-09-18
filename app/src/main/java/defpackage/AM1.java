package defpackage;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class AM1 extends AbstractC5862mJ1 {
    public AM1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.AbstractC5862mJ1
    public final double a(long j, Object obj) {
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // defpackage.AbstractC5862mJ1
    public final float b(long j, Object obj) {
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // defpackage.AbstractC5862mJ1
    public final void c(Object obj, long j, boolean z) {
        if (HM1.g) {
            HM1.b(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            HM1.c(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.AbstractC5862mJ1
    public final void d(Object obj, long j, byte b) {
        if (HM1.g) {
            HM1.b(obj, j, b);
        } else {
            HM1.c(obj, j, b);
        }
    }

    @Override // defpackage.AbstractC5862mJ1
    public final void e(Object obj, long j, double d) {
        this.a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.AbstractC5862mJ1
    public final void f(Object obj, long j, float f) {
        this.a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.AbstractC5862mJ1
    public final boolean g(long j, Object obj) {
        return HM1.g ? HM1.q(j, obj) : HM1.r(j, obj);
    }
}
