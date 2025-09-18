package p000;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class SV1 extends TV1 {

    /* renamed from: b */
    public final /* synthetic */ int f10822b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SV1(Unsafe unsafe, int i) {
        super(unsafe);
        this.f10822b = i;
    }

    @Override // p000.TV1
    /* renamed from: a */
    public final double mo7384a(long j, Object obj) {
        switch (this.f10822b) {
        }
        return Double.longBitsToDouble(m7702m(j, obj));
    }

    @Override // p000.TV1
    /* renamed from: d */
    public final void mo7385d(Object obj, long j, byte b) {
        switch (this.f10822b) {
            case 0:
                if (!VV1.f12602g) {
                    VV1.m8456m(obj, j, b);
                    break;
                } else {
                    VV1.m8454k(obj, j, b);
                    break;
                }
            default:
                if (!VV1.f12602g) {
                    VV1.m8456m(obj, j, b);
                    break;
                } else {
                    VV1.m8454k(obj, j, b);
                    break;
                }
        }
    }

    @Override // p000.TV1
    /* renamed from: e */
    public final void mo7386e(Object obj, long j, double d) {
        switch (this.f10822b) {
            case 0:
                m7697b(j, Double.doubleToLongBits(d), obj);
                break;
            default:
                m7697b(j, Double.doubleToLongBits(d), obj);
                break;
        }
    }

    @Override // p000.TV1
    /* renamed from: f */
    public final void mo7387f(Object obj, long j, float f) {
        switch (this.f10822b) {
            case 0:
                m7698c(j, obj, Float.floatToIntBits(f));
                break;
            default:
                m7698c(j, obj, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // p000.TV1
    /* renamed from: g */
    public final void mo7388g(Object obj, long j, boolean z) {
        switch (this.f10822b) {
            case 0:
                if (!VV1.f12602g) {
                    VV1.m8456m(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    VV1.m8454k(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!VV1.f12602g) {
                    VV1.m8456m(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    VV1.m8454k(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // p000.TV1
    /* renamed from: i */
    public final float mo7389i(long j, Object obj) {
        switch (this.f10822b) {
        }
        return Float.intBitsToFloat(m7701l(j, obj));
    }

    @Override // p000.TV1
    /* renamed from: k */
    public final boolean mo7390k(long j, Object obj) {
        switch (this.f10822b) {
            case 0:
                if (VV1.f12602g) {
                    if (((byte) (VV1.f12598c.m7701l((-4) & j, obj) >>> ((int) (((~j) & 3) << 3)))) == 0) {
                    }
                } else {
                    if (((byte) (VV1.f12598c.m7701l((-4) & j, obj) >>> ((int) ((j & 3) << 3)))) == 0) {
                    }
                }
                break;
            default:
                if (VV1.f12602g) {
                    if (((byte) (VV1.f12598c.m7701l((-4) & j, obj) >>> ((int) (((~j) & 3) << 3)))) == 0) {
                    }
                } else {
                    if (((byte) (VV1.f12598c.m7701l((-4) & j, obj) >>> ((int) ((j & 3) << 3)))) == 0) {
                    }
                }
                break;
        }
        return false;
    }
}
