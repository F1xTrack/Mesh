package defpackage;

import java.util.ArrayList;

/* renamed from: nR0 */
/* loaded from: classes.dex */
public final class C6076nR0 extends AbstractC6458pR0 implements InterfaceC8127yC {
    public final LX0 f;

    public C6076nR0(long j, C6666qX c6666qX, P70 p70, LX0 lx0, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(c6666qX, p70, lx0, arrayList, arrayList2, arrayList3);
        this.f = lx0;
    }

    @Override // defpackage.InterfaceC8127yC
    public final long I(long j, long j2) {
        return this.f.f(j, j2);
    }

    @Override // defpackage.InterfaceC8127yC
    public final boolean P() {
        return this.f.i();
    }

    @Override // defpackage.InterfaceC8127yC
    public final long R() {
        return this.f.d;
    }

    @Override // defpackage.InterfaceC8127yC
    public final long W(long j) {
        return this.f.d(j);
    }

    @Override // defpackage.InterfaceC8127yC
    public final long X(long j, long j2) {
        return this.f.b(j, j2);
    }

    @Override // defpackage.InterfaceC8127yC
    public final long a(long j) {
        return this.f.g(j);
    }

    @Override // defpackage.AbstractC6458pR0
    public final String b() {
        return null;
    }

    @Override // defpackage.AbstractC6458pR0
    public final C3939gJ0 d() {
        return null;
    }

    @Override // defpackage.InterfaceC8127yC
    public final long e(long j, long j2) {
        return this.f.e(j, j2);
    }

    @Override // defpackage.InterfaceC8127yC
    public final long g(long j, long j2) {
        return this.f.c(j, j2);
    }

    @Override // defpackage.InterfaceC8127yC
    public final long h(long j, long j2) {
        LX0 lx0 = this.f;
        if (lx0.f != null) {
            return -9223372036854775807L;
        }
        long jB = lx0.b(j, j2) + lx0.c(j, j2);
        return (lx0.e(jB, j) + lx0.g(jB)) - lx0.i;
    }

    @Override // defpackage.InterfaceC8127yC
    public final C3939gJ0 i(long j) {
        return this.f.h(this, j);
    }

    @Override // defpackage.AbstractC6458pR0
    public final InterfaceC8127yC c() {
        return this;
    }
}
