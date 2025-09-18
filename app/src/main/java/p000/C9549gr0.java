package p000;

import java.util.List;

/* renamed from: gr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9549gr0 implements InterfaceC6237jR {

    /* renamed from: a */
    public final InterfaceC6237jR f28067a;

    /* renamed from: b */
    public final C8149Qb1 f28068b;

    public C9549gr0(InterfaceC6237jR interfaceC6237jR, C8149Qb1 c8149Qb1) {
        this.f28067a = interfaceC6237jR;
        this.f28068b = c8149Qb1;
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: a */
    public final long mo2722a() {
        return this.f28067a.mo2722a();
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: b */
    public final boolean mo2723b(int i, long j) {
        return this.f28067a.mo2723b(i, j);
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: c */
    public final void mo6373c(long j, long j2, long j3, List list, InterfaceC7550Eo0[] interfaceC7550Eo0Arr) {
        this.f28067a.mo6373c(j, j2, j3, list, interfaceC7550Eo0Arr);
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: d */
    public final C8149Qb1 mo2724d() {
        return this.f28068b;
    }

    @Override // p000.InterfaceC6237jR
    public final void disable() {
        this.f28067a.disable();
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: e */
    public final int mo6374e() {
        return this.f28067a.mo6374e();
    }

    @Override // p000.InterfaceC6237jR
    public final void enable() {
        this.f28067a.enable();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9549gr0)) {
            return false;
        }
        C9549gr0 c9549gr0 = (C9549gr0) obj;
        return this.f28067a.equals(c9549gr0.f28067a) && this.f28068b.equals(c9549gr0.f28068b);
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: f */
    public final int mo2725f(C6686qX c6686qX) {
        return this.f28067a.mo2737t(this.f28068b.m6736b(c6686qX));
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: g */
    public final boolean mo2726g(long j, AbstractC1061Qr abstractC1061Qr, List list) {
        return this.f28067a.mo2726g(j, abstractC1061Qr, list);
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: h */
    public final void mo2727h(boolean z) {
        this.f28067a.mo2727h(z);
    }

    public final int hashCode() {
        return this.f28067a.hashCode() + ((this.f28068b.hashCode() + 527) * 31);
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: i */
    public final C6686qX mo2728i(int i) {
        return this.f28068b.f9690d[this.f28067a.mo2729j(i)];
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: j */
    public final int mo2729j(int i) {
        return this.f28067a.mo2729j(i);
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: k */
    public final int mo2730k(long j, List list) {
        return this.f28067a.mo2730k(j, list);
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: l */
    public final int mo2731l() {
        return this.f28067a.mo2731l();
    }

    @Override // p000.InterfaceC6237jR
    public final int length() {
        return this.f28067a.length();
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: m */
    public final C6686qX mo2732m() {
        return this.f28068b.f9690d[this.f28067a.mo2731l()];
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: n */
    public final int mo6375n() {
        return this.f28067a.mo6375n();
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: o */
    public final boolean mo2733o(int i, long j) {
        return this.f28067a.mo2733o(i, j);
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: p */
    public final void mo2734p(float f) {
        this.f28067a.mo2734p(f);
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: q */
    public final Object mo6376q() {
        return this.f28067a.mo6376q();
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: r */
    public final void mo2735r() {
        this.f28067a.mo2735r();
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: s */
    public final void mo2736s() {
        this.f28067a.mo2736s();
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: t */
    public final int mo2737t(int i) {
        return this.f28067a.mo2737t(i);
    }
}
