package p000;

import sun.misc.Unsafe;

/* renamed from: Ig1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7743Ig1 extends AbstractC7951Mg1 {

    /* renamed from: b */
    public final /* synthetic */ int f5081b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7743Ig1(Unsafe unsafe, int i) {
        super(unsafe);
        this.f5081b = i;
    }

    @Override // p000.AbstractC7951Mg1
    /* renamed from: c */
    public final boolean mo3964c(long j, Object obj) {
        switch (this.f5081b) {
            case 0:
                if (AbstractC8055Og1.f8569h) {
                    if (AbstractC8055Og1.m6104g(j, obj) == 0) {
                    }
                } else if (AbstractC8055Og1.m6105h(j, obj) == 0) {
                }
                break;
            default:
                if (AbstractC8055Og1.f8569h) {
                    if (AbstractC8055Og1.m6104g(j, obj) == 0) {
                    }
                } else if (AbstractC8055Og1.m6105h(j, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // p000.AbstractC7951Mg1
    /* renamed from: d */
    public final byte mo3965d(long j, Object obj) {
        switch (this.f5081b) {
            case 0:
                if (!AbstractC8055Og1.f8569h) {
                    break;
                } else {
                    break;
                }
            default:
                if (!AbstractC8055Og1.f8569h) {
                    break;
                } else {
                    break;
                }
        }
        return AbstractC8055Og1.m6105h(j, obj);
    }

    @Override // p000.AbstractC7951Mg1
    /* renamed from: e */
    public final double mo3966e(long j, Object obj) {
        switch (this.f5081b) {
        }
        return Double.longBitsToDouble(m5420h(j, obj));
    }

    @Override // p000.AbstractC7951Mg1
    /* renamed from: f */
    public final float mo3967f(long j, Object obj) {
        switch (this.f5081b) {
        }
        return Float.intBitsToFloat(m5419g(j, obj));
    }

    @Override // p000.AbstractC7951Mg1
    /* renamed from: k */
    public final void mo3968k(Object obj, long j, boolean z) {
        switch (this.f5081b) {
            case 0:
                if (!AbstractC8055Og1.f8569h) {
                    AbstractC8055Og1.m6112o(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    AbstractC8055Og1.m6111n(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!AbstractC8055Og1.f8569h) {
                    AbstractC8055Og1.m6112o(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    AbstractC8055Og1.m6111n(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // p000.AbstractC7951Mg1
    /* renamed from: l */
    public final void mo3969l(Object obj, long j, byte b) {
        switch (this.f5081b) {
            case 0:
                if (!AbstractC8055Og1.f8569h) {
                    AbstractC8055Og1.m6112o(obj, j, b);
                    break;
                } else {
                    AbstractC8055Og1.m6111n(obj, j, b);
                    break;
                }
            default:
                if (!AbstractC8055Og1.f8569h) {
                    AbstractC8055Og1.m6112o(obj, j, b);
                    break;
                } else {
                    AbstractC8055Og1.m6111n(obj, j, b);
                    break;
                }
        }
    }

    @Override // p000.AbstractC7951Mg1
    /* renamed from: m */
    public final void mo3970m(Object obj, long j, double d) {
        switch (this.f5081b) {
            case 0:
                m5424p(j, Double.doubleToLongBits(d), obj);
                break;
            default:
                m5424p(j, Double.doubleToLongBits(d), obj);
                break;
        }
    }

    @Override // p000.AbstractC7951Mg1
    /* renamed from: n */
    public final void mo3971n(Object obj, long j, float f) {
        switch (this.f5081b) {
            case 0:
                m5423o(j, obj, Float.floatToIntBits(f));
                break;
            default:
                m5423o(j, obj, Float.floatToIntBits(f));
                break;
        }
    }
}
