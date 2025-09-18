package defpackage;

import java.io.IOException;

/* renamed from: Dn0 */
/* loaded from: classes.dex */
public final class C0294Dn0 implements InterfaceC8435zp0, InterfaceC8245yp0 {
    public final C0456Fp0 a;
    public final long b;
    public final C5272jE c;
    public AbstractC6883rg d;
    public InterfaceC8435zp0 e;
    public InterfaceC8245yp0 f;
    public boolean g;
    public long h = -9223372036854775807L;

    public C0294Dn0(C0456Fp0 c0456Fp0, C5272jE c5272jE, long j) {
        this.a = c0456Fp0;
        this.c = c5272jE;
        this.b = j;
    }

    @Override // defpackage.InterfaceC8245yp0
    public final void a(InterfaceC8435zp0 interfaceC8435zp0) {
        InterfaceC8245yp0 interfaceC8245yp0 = this.f;
        int i = AbstractC0277Dh1.a;
        interfaceC8245yp0.a(this);
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long b(long j, DX0 dx0) {
        InterfaceC8435zp0 interfaceC8435zp0 = this.e;
        int i = AbstractC0277Dh1.a;
        return interfaceC8435zp0.b(j, dx0);
    }

    public final void c(C0456Fp0 c0456Fp0) {
        long j = this.h;
        if (j == -9223372036854775807L) {
            j = this.b;
        }
        AbstractC6883rg abstractC6883rg = this.d;
        abstractC6883rg.getClass();
        InterfaceC8435zp0 interfaceC8435zp0B = abstractC6883rg.b(c0456Fp0, this.c, j);
        this.e = interfaceC8435zp0B;
        if (this.f != null) {
            interfaceC8435zp0B.o(this, j);
        }
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long d(InterfaceC5311jR[] interfaceC5311jRArr, boolean[] zArr, InterfaceC3403dV0[] interfaceC3403dV0Arr, boolean[] zArr2, long j) {
        long j2 = this.h;
        long j3 = (j2 == -9223372036854775807L || j != this.b) ? j : j2;
        this.h = -9223372036854775807L;
        InterfaceC8435zp0 interfaceC8435zp0 = this.e;
        int i = AbstractC0277Dh1.a;
        return interfaceC8435zp0.d(interfaceC5311jRArr, zArr, interfaceC3403dV0Arr, zArr2, j3);
    }

    @Override // defpackage.InterfaceC3984gY0
    public final long e() {
        InterfaceC8435zp0 interfaceC8435zp0 = this.e;
        int i = AbstractC0277Dh1.a;
        return interfaceC8435zp0.e();
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void g() throws IOException {
        try {
            InterfaceC8435zp0 interfaceC8435zp0 = this.e;
            if (interfaceC8435zp0 != null) {
                interfaceC8435zp0.g();
                return;
            }
            AbstractC6883rg abstractC6883rg = this.d;
            if (abstractC6883rg != null) {
                abstractC6883rg.j();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long h(long j) {
        InterfaceC8435zp0 interfaceC8435zp0 = this.e;
        int i = AbstractC0277Dh1.a;
        return interfaceC8435zp0.h(j);
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void i(long j) {
        InterfaceC8435zp0 interfaceC8435zp0 = this.e;
        int i = AbstractC0277Dh1.a;
        interfaceC8435zp0.i(j);
    }

    @Override // defpackage.InterfaceC3984gY0
    public final boolean l() {
        InterfaceC8435zp0 interfaceC8435zp0 = this.e;
        return interfaceC8435zp0 != null && interfaceC8435zp0.l();
    }

    @Override // defpackage.InterfaceC3793fY0
    public final void m(InterfaceC3984gY0 interfaceC3984gY0) {
        InterfaceC8245yp0 interfaceC8245yp0 = this.f;
        int i = AbstractC0277Dh1.a;
        interfaceC8245yp0.m(this);
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long n() {
        InterfaceC8435zp0 interfaceC8435zp0 = this.e;
        int i = AbstractC0277Dh1.a;
        return interfaceC8435zp0.n();
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void o(InterfaceC8245yp0 interfaceC8245yp0, long j) {
        this.f = interfaceC8245yp0;
        InterfaceC8435zp0 interfaceC8435zp0 = this.e;
        if (interfaceC8435zp0 != null) {
            long j2 = this.h;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            interfaceC8435zp0.o(this, j2);
        }
    }

    @Override // defpackage.InterfaceC8435zp0
    public final C1350Rb1 q() {
        InterfaceC8435zp0 interfaceC8435zp0 = this.e;
        int i = AbstractC0277Dh1.a;
        return interfaceC8435zp0.q();
    }

    @Override // defpackage.InterfaceC3984gY0
    public final boolean r(C7660vk0 c7660vk0) {
        InterfaceC8435zp0 interfaceC8435zp0 = this.e;
        return interfaceC8435zp0 != null && interfaceC8435zp0.r(c7660vk0);
    }

    @Override // defpackage.InterfaceC3984gY0
    public final long s() {
        InterfaceC8435zp0 interfaceC8435zp0 = this.e;
        int i = AbstractC0277Dh1.a;
        return interfaceC8435zp0.s();
    }

    @Override // defpackage.InterfaceC3984gY0
    public final void t(long j) {
        InterfaceC8435zp0 interfaceC8435zp0 = this.e;
        int i = AbstractC0277Dh1.a;
        interfaceC8435zp0.t(j);
    }
}
