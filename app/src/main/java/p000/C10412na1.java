package p000;

/* renamed from: na1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10412na1 implements InterfaceC11973zp0, InterfaceC11846yp0 {

    /* renamed from: a */
    public final InterfaceC11973zp0 f38382a;

    /* renamed from: b */
    public final long f38383b;

    /* renamed from: c */
    public InterfaceC11846yp0 f38384c;

    public C10412na1(InterfaceC11973zp0 interfaceC11973zp0, long j) {
        this.f38382a = interfaceC11973zp0;
        this.f38383b = j;
    }

    @Override // p000.InterfaceC11846yp0
    /* renamed from: a */
    public final void mo1876a(InterfaceC11973zp0 interfaceC11973zp0) {
        InterfaceC11846yp0 interfaceC11846yp0 = this.f38384c;
        interfaceC11846yp0.getClass();
        interfaceC11846yp0.mo1876a(this);
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: b */
    public final long mo1877b(long j, DX0 dx0) {
        long j2 = this.f38383b;
        return this.f38382a.mo1877b(j - j2, dx0) + j2;
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: d */
    public final long mo1879d(InterfaceC6237jR[] interfaceC6237jRArr, boolean[] zArr, InterfaceC9121dV0[] interfaceC9121dV0Arr, boolean[] zArr2, long j) {
        InterfaceC9121dV0[] interfaceC9121dV0Arr2 = new InterfaceC9121dV0[interfaceC9121dV0Arr.length];
        int i = 0;
        while (true) {
            InterfaceC9121dV0 interfaceC9121dV0 = null;
            if (i >= interfaceC9121dV0Arr.length) {
                break;
            }
            C10284ma1 c10284ma1 = (C10284ma1) interfaceC9121dV0Arr[i];
            if (c10284ma1 != null) {
                interfaceC9121dV0 = c10284ma1.f37781a;
            }
            interfaceC9121dV0Arr2[i] = interfaceC9121dV0;
            i++;
        }
        long j2 = this.f38383b;
        long jMo1879d = this.f38382a.mo1879d(interfaceC6237jRArr, zArr, interfaceC9121dV0Arr2, zArr2, j - j2);
        for (int i2 = 0; i2 < interfaceC9121dV0Arr.length; i2++) {
            InterfaceC9121dV0 interfaceC9121dV02 = interfaceC9121dV0Arr2[i2];
            if (interfaceC9121dV02 == null) {
                interfaceC9121dV0Arr[i2] = null;
            } else {
                InterfaceC9121dV0 interfaceC9121dV03 = interfaceC9121dV0Arr[i2];
                if (interfaceC9121dV03 == null || ((C10284ma1) interfaceC9121dV03).f37781a != interfaceC9121dV02) {
                    interfaceC9121dV0Arr[i2] = new C10284ma1(interfaceC9121dV02, j2);
                }
            }
        }
        return jMo1879d + j2;
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: e */
    public final long mo1880e() {
        long jMo1880e = this.f38382a.mo1880e();
        if (jMo1880e == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f38383b + jMo1880e;
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: g */
    public final void mo1881g() {
        this.f38382a.mo1881g();
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: h */
    public final long mo1882h(long j) {
        long j2 = this.f38383b;
        return this.f38382a.mo1882h(j - j2) + j2;
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: i */
    public final void mo1883i(long j) {
        this.f38382a.mo1883i(j - this.f38383b);
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: l */
    public final boolean mo1884l() {
        return this.f38382a.mo1884l();
    }

    @Override // p000.InterfaceC9383fY0
    /* renamed from: m */
    public final void mo1885m(InterfaceC9511gY0 interfaceC9511gY0) {
        InterfaceC11846yp0 interfaceC11846yp0 = this.f38384c;
        interfaceC11846yp0.getClass();
        interfaceC11846yp0.mo1885m(this);
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: n */
    public final long mo1886n() {
        long jMo1886n = this.f38382a.mo1886n();
        if (jMo1886n == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f38383b + jMo1886n;
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: o */
    public final void mo1887o(InterfaceC11846yp0 interfaceC11846yp0, long j) {
        this.f38384c = interfaceC11846yp0;
        this.f38382a.mo1887o(this, j - this.f38383b);
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: q */
    public final C8201Rb1 mo1888q() {
        return this.f38382a.mo1888q();
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: r */
    public final boolean mo1889r(C11455vk0 c11455vk0) {
        C11327uk0 c11327uk0 = new C11327uk0();
        c11327uk0.f43841b = c11455vk0.f44512b;
        c11327uk0.f43842c = c11455vk0.f44513c;
        c11327uk0.f43840a = c11455vk0.f44511a - this.f38383b;
        return this.f38382a.mo1889r(new C11455vk0(c11327uk0));
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: s */
    public final long mo1890s() {
        long jMo1890s = this.f38382a.mo1890s();
        if (jMo1890s == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f38383b + jMo1890s;
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: t */
    public final void mo1891t(long j) {
        this.f38382a.mo1891t(j - this.f38383b);
    }
}
