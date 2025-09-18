package p000;

import java.util.ArrayList;

/* renamed from: nR0 */
/* loaded from: classes.dex */
public final class C10393nR0 extends AbstractC10649pR0 implements InterfaceC7186yC {

    /* renamed from: f */
    public final LX0 f38311f;

    public C10393nR0(long j, C6686qX c6686qX, P70 p70, LX0 lx0, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(c6686qX, p70, lx0, arrayList, arrayList2, arrayList3);
        this.f38311f = lx0;
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: I */
    public final long mo3612I(long j, long j2) {
        return this.f38311f.m5019f(j, j2);
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: P */
    public final boolean mo3613P() {
        return this.f38311f.mo5022i();
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: R */
    public final long mo3614R() {
        return this.f38311f.f6695d;
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: W */
    public final long mo3615W(long j) {
        return this.f38311f.mo5017d(j);
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: X */
    public final long mo3616X(long j, long j2) {
        return this.f38311f.m5015b(j, j2);
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: a */
    public final long mo3617a(long j) {
        return this.f38311f.m5020g(j);
    }

    @Override // p000.AbstractC10649pR0
    /* renamed from: b */
    public final String mo23138b() {
        return null;
    }

    @Override // p000.AbstractC10649pR0
    /* renamed from: d */
    public final C9481gJ0 mo23140d() {
        return null;
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: e */
    public final long mo3619e(long j, long j2) {
        return this.f38311f.m5018e(j, j2);
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: g */
    public final long mo3621g(long j, long j2) {
        return this.f38311f.m5016c(j, j2);
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: h */
    public final long mo3622h(long j, long j2) {
        LX0 lx0 = this.f38311f;
        if (lx0.f6697f != null) {
            return -9223372036854775807L;
        }
        long jM5015b = lx0.m5015b(j, j2) + lx0.m5016c(j, j2);
        return (lx0.m5018e(jM5015b, j) + lx0.m5020g(jM5015b)) - lx0.f6700i;
    }

    @Override // p000.InterfaceC7186yC
    /* renamed from: i */
    public final C9481gJ0 mo3623i(long j) {
        return this.f38311f.mo5021h(this, j);
    }

    @Override // p000.AbstractC10649pR0
    /* renamed from: c */
    public final InterfaceC7186yC mo23139c() {
        return this;
    }
}
