package p000;

import sun.misc.Unsafe;

/* renamed from: Hg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7691Hg1 extends AbstractC7899Lg1 {

    /* renamed from: b */
    public final /* synthetic */ int f4435b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7691Hg1(Unsafe unsafe, int i) {
        super(unsafe);
        this.f4435b = i;
    }

    @Override // p000.AbstractC7899Lg1
    /* renamed from: c */
    public final boolean mo3540c(long j, Object obj) {
        switch (this.f4435b) {
            case 0:
                if (AbstractC8003Ng1.f7955g) {
                    if (AbstractC8003Ng1.m5806h(j, obj) == 0) {
                    }
                } else if (AbstractC8003Ng1.m5807i(j, obj) == 0) {
                }
                break;
            default:
                if (AbstractC8003Ng1.f7955g) {
                    if (AbstractC8003Ng1.m5806h(j, obj) == 0) {
                    }
                } else if (AbstractC8003Ng1.m5807i(j, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // p000.AbstractC7899Lg1
    /* renamed from: d */
    public final byte mo3541d(long j, Object obj) {
        switch (this.f4435b) {
            case 0:
                if (!AbstractC8003Ng1.f7955g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!AbstractC8003Ng1.f7955g) {
                    break;
                } else {
                    break;
                }
        }
        return AbstractC8003Ng1.m5807i(j, obj);
    }

    @Override // p000.AbstractC7899Lg1
    /* renamed from: e */
    public final double mo3542e(long j, Object obj) {
        switch (this.f4435b) {
        }
        return Double.longBitsToDouble(m5055h(j, obj));
    }

    @Override // p000.AbstractC7899Lg1
    /* renamed from: f */
    public final float mo3543f(long j, Object obj) {
        switch (this.f4435b) {
        }
        return Float.intBitsToFloat(m5054g(j, obj));
    }

    @Override // p000.AbstractC7899Lg1
    /* renamed from: k */
    public final void mo3544k(Object obj, long j, boolean z) {
        switch (this.f4435b) {
            case 0:
                if (!AbstractC8003Ng1.f7955g) {
                    AbstractC8003Ng1.m5811m(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    AbstractC8003Ng1.m5810l(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!AbstractC8003Ng1.f7955g) {
                    AbstractC8003Ng1.m5811m(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    AbstractC8003Ng1.m5810l(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // p000.AbstractC7899Lg1
    /* renamed from: l */
    public final void mo3545l(Object obj, long j, byte b) {
        switch (this.f4435b) {
            case 0:
                if (!AbstractC8003Ng1.f7955g) {
                    AbstractC8003Ng1.m5811m(obj, j, b);
                    break;
                } else {
                    AbstractC8003Ng1.m5810l(obj, j, b);
                    break;
                }
            default:
                if (!AbstractC8003Ng1.f7955g) {
                    AbstractC8003Ng1.m5811m(obj, j, b);
                    break;
                } else {
                    AbstractC8003Ng1.m5810l(obj, j, b);
                    break;
                }
        }
    }

    @Override // p000.AbstractC7899Lg1
    /* renamed from: m */
    public final void mo3546m(Object obj, long j, double d) {
        switch (this.f4435b) {
            case 0:
                m5059p(j, Double.doubleToLongBits(d), obj);
                break;
            default:
                m5059p(j, Double.doubleToLongBits(d), obj);
                break;
        }
    }

    @Override // p000.AbstractC7899Lg1
    /* renamed from: n */
    public final void mo3547n(Object obj, long j, float f) {
        switch (this.f4435b) {
            case 0:
                m5058o(j, obj, Float.floatToIntBits(f));
                break;
            default:
                m5058o(j, obj, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // p000.AbstractC7899Lg1
    /* renamed from: s */
    public final boolean mo3548s() {
        switch (this.f4435b) {
        }
        return false;
    }
}
