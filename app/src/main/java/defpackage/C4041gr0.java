package defpackage;

import java.util.List;

/* renamed from: gr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4041gr0 implements InterfaceC5311jR {
    public final InterfaceC5311jR a;
    public final C1272Qb1 b;

    public C4041gr0(InterfaceC5311jR interfaceC5311jR, C1272Qb1 c1272Qb1) {
        this.a = interfaceC5311jR;
        this.b = c1272Qb1;
    }

    @Override // defpackage.InterfaceC5311jR
    public final long a() {
        return this.a.a();
    }

    @Override // defpackage.InterfaceC5311jR
    public final boolean b(int i, long j) {
        return this.a.b(i, j);
    }

    @Override // defpackage.InterfaceC5311jR
    public final void c(long j, long j2, long j3, List list, InterfaceC0375Eo0[] interfaceC0375Eo0Arr) {
        this.a.c(j, j2, j3, list, interfaceC0375Eo0Arr);
    }

    @Override // defpackage.InterfaceC5311jR
    public final C1272Qb1 d() {
        return this.b;
    }

    @Override // defpackage.InterfaceC5311jR
    public final void disable() {
        this.a.disable();
    }

    @Override // defpackage.InterfaceC5311jR
    public final int e() {
        return this.a.e();
    }

    @Override // defpackage.InterfaceC5311jR
    public final void enable() {
        this.a.enable();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4041gr0)) {
            return false;
        }
        C4041gr0 c4041gr0 = (C4041gr0) obj;
        return this.a.equals(c4041gr0.a) && this.b.equals(c4041gr0.b);
    }

    @Override // defpackage.InterfaceC5311jR
    public final int f(C6666qX c6666qX) {
        return this.a.t(this.b.b(c6666qX));
    }

    @Override // defpackage.InterfaceC5311jR
    public final boolean g(long j, AbstractC1318Qr abstractC1318Qr, List list) {
        return this.a.g(j, abstractC1318Qr, list);
    }

    @Override // defpackage.InterfaceC5311jR
    public final void h(boolean z) {
        this.a.h(z);
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + 527) * 31);
    }

    @Override // defpackage.InterfaceC5311jR
    public final C6666qX i(int i) {
        return this.b.d[this.a.j(i)];
    }

    @Override // defpackage.InterfaceC5311jR
    public final int j(int i) {
        return this.a.j(i);
    }

    @Override // defpackage.InterfaceC5311jR
    public final int k(long j, List list) {
        return this.a.k(j, list);
    }

    @Override // defpackage.InterfaceC5311jR
    public final int l() {
        return this.a.l();
    }

    @Override // defpackage.InterfaceC5311jR
    public final int length() {
        return this.a.length();
    }

    @Override // defpackage.InterfaceC5311jR
    public final C6666qX m() {
        return this.b.d[this.a.l()];
    }

    @Override // defpackage.InterfaceC5311jR
    public final int n() {
        return this.a.n();
    }

    @Override // defpackage.InterfaceC5311jR
    public final boolean o(int i, long j) {
        return this.a.o(i, j);
    }

    @Override // defpackage.InterfaceC5311jR
    public final void p(float f) {
        this.a.p(f);
    }

    @Override // defpackage.InterfaceC5311jR
    public final Object q() {
        return this.a.q();
    }

    @Override // defpackage.InterfaceC5311jR
    public final void r() {
        this.a.r();
    }

    @Override // defpackage.InterfaceC5311jR
    public final void s() {
        this.a.s();
    }

    @Override // defpackage.InterfaceC5311jR
    public final int t(int i) {
        return this.a.t(i);
    }
}
