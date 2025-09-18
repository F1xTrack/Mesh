package p000;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class AM1 extends AbstractC10250mJ1 {
    public AM1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p000.AbstractC10250mJ1
    /* renamed from: a */
    public final double mo159a(long j, Object obj) {
        return Double.longBitsToDouble(this.f37626a.getLong(obj, j));
    }

    @Override // p000.AbstractC10250mJ1
    /* renamed from: b */
    public final float mo160b(long j, Object obj) {
        return Float.intBitsToFloat(this.f37626a.getInt(obj, j));
    }

    @Override // p000.AbstractC10250mJ1
    /* renamed from: c */
    public final void mo161c(Object obj, long j, boolean z) {
        if (HM1.f4249g) {
            HM1.m3361b(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            HM1.m3362c(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p000.AbstractC10250mJ1
    /* renamed from: d */
    public final void mo162d(Object obj, long j, byte b) {
        if (HM1.f4249g) {
            HM1.m3361b(obj, j, b);
        } else {
            HM1.m3362c(obj, j, b);
        }
    }

    @Override // p000.AbstractC10250mJ1
    /* renamed from: e */
    public final void mo163e(Object obj, long j, double d) {
        this.f37626a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p000.AbstractC10250mJ1
    /* renamed from: f */
    public final void mo164f(Object obj, long j, float f) {
        this.f37626a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // p000.AbstractC10250mJ1
    /* renamed from: g */
    public final boolean mo165g(long j, Object obj) {
        return HM1.f4249g ? HM1.m3376q(j, obj) : HM1.m3377r(j, obj);
    }
}
