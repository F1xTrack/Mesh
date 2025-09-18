package defpackage;

/* renamed from: na1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6104na1 implements InterfaceC8435zp0, InterfaceC8245yp0 {
    public final InterfaceC8435zp0 a;
    public final long b;
    public InterfaceC8245yp0 c;

    public C6104na1(InterfaceC8435zp0 interfaceC8435zp0, long j) {
        this.a = interfaceC8435zp0;
        this.b = j;
    }

    @Override // defpackage.InterfaceC8245yp0
    public final void a(InterfaceC8435zp0 interfaceC8435zp0) {
        InterfaceC8245yp0 interfaceC8245yp0 = this.c;
        interfaceC8245yp0.getClass();
        interfaceC8245yp0.a(this);
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long b(long j, DX0 dx0) {
        long j2 = this.b;
        return this.a.b(j - j2, dx0) + j2;
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long d(InterfaceC5311jR[] interfaceC5311jRArr, boolean[] zArr, InterfaceC3403dV0[] interfaceC3403dV0Arr, boolean[] zArr2, long j) {
        InterfaceC3403dV0[] interfaceC3403dV0Arr2 = new InterfaceC3403dV0[interfaceC3403dV0Arr.length];
        int i = 0;
        while (true) {
            InterfaceC3403dV0 interfaceC3403dV0 = null;
            if (i >= interfaceC3403dV0Arr.length) {
                break;
            }
            C5913ma1 c5913ma1 = (C5913ma1) interfaceC3403dV0Arr[i];
            if (c5913ma1 != null) {
                interfaceC3403dV0 = c5913ma1.a;
            }
            interfaceC3403dV0Arr2[i] = interfaceC3403dV0;
            i++;
        }
        long j2 = this.b;
        long jD = this.a.d(interfaceC5311jRArr, zArr, interfaceC3403dV0Arr2, zArr2, j - j2);
        for (int i2 = 0; i2 < interfaceC3403dV0Arr.length; i2++) {
            InterfaceC3403dV0 interfaceC3403dV02 = interfaceC3403dV0Arr2[i2];
            if (interfaceC3403dV02 == null) {
                interfaceC3403dV0Arr[i2] = null;
            } else {
                InterfaceC3403dV0 interfaceC3403dV03 = interfaceC3403dV0Arr[i2];
                if (interfaceC3403dV03 == null || ((C5913ma1) interfaceC3403dV03).a != interfaceC3403dV02) {
                    interfaceC3403dV0Arr[i2] = new C5913ma1(interfaceC3403dV02, j2);
                }
            }
        }
        return jD + j2;
    }

    @Override // defpackage.InterfaceC3984gY0
    public final long e() {
        long jE = this.a.e();
        if (jE == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.b + jE;
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void g() {
        this.a.g();
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long h(long j) {
        long j2 = this.b;
        return this.a.h(j - j2) + j2;
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void i(long j) {
        this.a.i(j - this.b);
    }

    @Override // defpackage.InterfaceC3984gY0
    public final boolean l() {
        return this.a.l();
    }

    @Override // defpackage.InterfaceC3793fY0
    public final void m(InterfaceC3984gY0 interfaceC3984gY0) {
        InterfaceC8245yp0 interfaceC8245yp0 = this.c;
        interfaceC8245yp0.getClass();
        interfaceC8245yp0.m(this);
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long n() {
        long jN = this.a.n();
        if (jN == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.b + jN;
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void o(InterfaceC8245yp0 interfaceC8245yp0, long j) {
        this.c = interfaceC8245yp0;
        this.a.o(this, j - this.b);
    }

    @Override // defpackage.InterfaceC8435zp0
    public final C1350Rb1 q() {
        return this.a.q();
    }

    @Override // defpackage.InterfaceC3984gY0
    public final boolean r(C7660vk0 c7660vk0) {
        C7469uk0 c7469uk0 = new C7469uk0();
        c7469uk0.b = c7660vk0.b;
        c7469uk0.c = c7660vk0.c;
        c7469uk0.a = c7660vk0.a - this.b;
        return this.a.r(new C7660vk0(c7469uk0));
    }

    @Override // defpackage.InterfaceC3984gY0
    public final long s() {
        long jS = this.a.s();
        if (jS == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.b + jS;
    }

    @Override // defpackage.InterfaceC3984gY0
    public final void t(long j) {
        this.a.t(j - this.b);
    }
}
