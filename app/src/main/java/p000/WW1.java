package p000;

import android.os.Looper;

/* loaded from: classes.dex */
public final class WW1 extends AbstractC9608hI1 {

    /* renamed from: d */
    public HandlerC11145tJ0 f13242d;

    /* renamed from: e */
    public boolean f13243e;

    /* renamed from: f */
    public final C10909rT0 f13244f;

    /* renamed from: g */
    public final C0451H9 f13245g;

    /* renamed from: h */
    public final ES1 f13246h;

    public WW1(C9110dP1 c9110dP1) {
        super(c9110dP1);
        this.f13243e = true;
        this.f13244f = new C10909rT0(this);
        C0451H9 c0451h9 = new C0451H9();
        c0451h9.f4149d = this;
        c0451h9.f4148c = new C10662pX1(c0451h9, (C9110dP1) this.f11615b, 0);
        long jElapsedRealtime = ((C9110dP1) this.f11615b).f26044n.elapsedRealtime();
        c0451h9.f4146a = jElapsedRealtime;
        c0451h9.f4147b = jElapsedRealtime;
        this.f13245g = c0451h9;
        this.f13246h = new ES1(29, this);
    }

    /* renamed from: C1 */
    public final void m8803C1() {
        mo7681v1();
        if (this.f13242d == null) {
            this.f13242d = new HandlerC11145tJ0(Looper.getMainLooper());
        }
    }

    @Override // p000.AbstractC9608hI1
    /* renamed from: z1 */
    public final boolean mo2654z1() {
        return false;
    }
}
