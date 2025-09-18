package p000;

import sun.misc.Unsafe;

/* renamed from: fJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9354fJ1 extends AbstractC10250mJ1 {
    public C9354fJ1(Unsafe unsafe) {
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
        if (BJ1.f715g) {
            BJ1.m582b(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            BJ1.m583c(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p000.AbstractC10250mJ1
    /* renamed from: d */
    public final void mo162d(Object obj, long j, byte b) {
        if (BJ1.f715g) {
            BJ1.m582b(obj, j, b);
        } else {
            BJ1.m583c(obj, j, b);
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
        return BJ1.f715g ? BJ1.m597q(j, obj) : BJ1.m598r(j, obj);
    }
}
