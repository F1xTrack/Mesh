package p000;

import androidx.lifecycle.AbstractC1743b;

/* loaded from: classes.dex */
public final class KS0 extends AbstractC6749rX {

    /* renamed from: b */
    public final InterfaceC6766ro f6115b;

    /* renamed from: c */
    public final AbstractC9513gZ0 f6116c;

    /* renamed from: d */
    public final InterfaceC0491Hn f6117d;

    public KS0(InterfaceC6766ro interfaceC6766ro, InterfaceC0491Hn interfaceC0491Hn) {
        super(interfaceC6766ro);
        this.f6115b = interfaceC6766ro;
        this.f6117d = interfaceC0491Hn;
        this.f6116c = interfaceC0491Hn.mo3592V();
        interfaceC0491Hn.mo3590B();
        interfaceC0491Hn.mo3595k0();
    }

    @Override // p000.AbstractC6749rX, p000.InterfaceC6766ro
    /* renamed from: f */
    public final AbstractC1743b mo2394f() {
        return !NR1.m5689b(this.f6116c, 6) ? new C7560Et0(0) : this.f6115b.mo2394f();
    }

    @Override // p000.AbstractC6749rX, p000.InterfaceC6766ro
    /* renamed from: g */
    public final InterfaceC6766ro mo2395g() {
        return this.f6115b;
    }

    @Override // p000.AbstractC6749rX, p000.InterfaceC6766ro
    /* renamed from: h */
    public final InterfaceC6949uR mo2396h() {
        return !NR1.m5689b(this.f6116c, 7) ? new C7408Bv0(20) : this.f6115b.mo2396h();
    }

    @Override // p000.AbstractC6749rX, p000.InterfaceC6766ro
    /* renamed from: i */
    public final boolean mo2397i(C0974PT c0974pt) {
        C0974PT c0974ptM5688a = NR1.m5688a(this.f6116c, c0974pt);
        if (c0974ptM5688a == null) {
            return false;
        }
        return this.f6115b.mo2397i(c0974ptM5688a);
    }

    @Override // p000.AbstractC6749rX, p000.InterfaceC6766ro
    /* renamed from: r */
    public final boolean mo2406r() {
        if (NR1.m5689b(this.f6116c, 5)) {
            return this.f6115b.mo2406r();
        }
        return false;
    }

    @Override // p000.AbstractC6749rX, p000.InterfaceC6766ro
    /* renamed from: x */
    public final AbstractC1743b mo2412x() {
        return !NR1.m5689b(this.f6116c, 0) ? new C7560Et0(new C0984Pd(1.0f, 1.0f, 1.0f, 0.0f)) : this.f6115b.mo2412x();
    }
}
