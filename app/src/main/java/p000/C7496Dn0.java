package p000;

import java.io.IOException;

/* renamed from: Dn0 */
/* loaded from: classes.dex */
public final class C7496Dn0 implements InterfaceC11973zp0, InterfaceC11846yp0 {

    /* renamed from: a */
    public final C7604Fp0 f2244a;

    /* renamed from: b */
    public final long f2245b;

    /* renamed from: c */
    public final C6224jE f2246c;

    /* renamed from: d */
    public AbstractC6758rg f2247d;

    /* renamed from: e */
    public InterfaceC11973zp0 f2248e;

    /* renamed from: f */
    public InterfaceC11846yp0 f2249f;

    /* renamed from: g */
    public boolean f2250g;

    /* renamed from: h */
    public long f2251h = -9223372036854775807L;

    public C7496Dn0(C7604Fp0 c7604Fp0, C6224jE c6224jE, long j) {
        this.f2244a = c7604Fp0;
        this.f2246c = c6224jE;
        this.f2245b = j;
    }

    @Override // p000.InterfaceC11846yp0
    /* renamed from: a */
    public final void mo1876a(InterfaceC11973zp0 interfaceC11973zp0) {
        InterfaceC11846yp0 interfaceC11846yp0 = this.f2249f;
        int i = AbstractC7485Dh1.f2166a;
        interfaceC11846yp0.mo1876a(this);
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: b */
    public final long mo1877b(long j, DX0 dx0) {
        InterfaceC11973zp0 interfaceC11973zp0 = this.f2248e;
        int i = AbstractC7485Dh1.f2166a;
        return interfaceC11973zp0.mo1877b(j, dx0);
    }

    /* renamed from: c */
    public final void m1878c(C7604Fp0 c7604Fp0) {
        long j = this.f2251h;
        if (j == -9223372036854775807L) {
            j = this.f2245b;
        }
        AbstractC6758rg abstractC6758rg = this.f2247d;
        abstractC6758rg.getClass();
        InterfaceC11973zp0 interfaceC11973zp0Mo3162b = abstractC6758rg.mo3162b(c7604Fp0, this.f2246c, j);
        this.f2248e = interfaceC11973zp0Mo3162b;
        if (this.f2249f != null) {
            interfaceC11973zp0Mo3162b.mo1887o(this, j);
        }
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: d */
    public final long mo1879d(InterfaceC6237jR[] interfaceC6237jRArr, boolean[] zArr, InterfaceC9121dV0[] interfaceC9121dV0Arr, boolean[] zArr2, long j) {
        long j2 = this.f2251h;
        long j3 = (j2 == -9223372036854775807L || j != this.f2245b) ? j : j2;
        this.f2251h = -9223372036854775807L;
        InterfaceC11973zp0 interfaceC11973zp0 = this.f2248e;
        int i = AbstractC7485Dh1.f2166a;
        return interfaceC11973zp0.mo1879d(interfaceC6237jRArr, zArr, interfaceC9121dV0Arr, zArr2, j3);
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: e */
    public final long mo1880e() {
        InterfaceC11973zp0 interfaceC11973zp0 = this.f2248e;
        int i = AbstractC7485Dh1.f2166a;
        return interfaceC11973zp0.mo1880e();
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: g */
    public final void mo1881g() throws IOException {
        try {
            InterfaceC11973zp0 interfaceC11973zp0 = this.f2248e;
            if (interfaceC11973zp0 != null) {
                interfaceC11973zp0.mo1881g();
                return;
            }
            AbstractC6758rg abstractC6758rg = this.f2247d;
            if (abstractC6758rg != null) {
                abstractC6758rg.mo3163j();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: h */
    public final long mo1882h(long j) {
        InterfaceC11973zp0 interfaceC11973zp0 = this.f2248e;
        int i = AbstractC7485Dh1.f2166a;
        return interfaceC11973zp0.mo1882h(j);
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: i */
    public final void mo1883i(long j) {
        InterfaceC11973zp0 interfaceC11973zp0 = this.f2248e;
        int i = AbstractC7485Dh1.f2166a;
        interfaceC11973zp0.mo1883i(j);
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: l */
    public final boolean mo1884l() {
        InterfaceC11973zp0 interfaceC11973zp0 = this.f2248e;
        return interfaceC11973zp0 != null && interfaceC11973zp0.mo1884l();
    }

    @Override // p000.InterfaceC9383fY0
    /* renamed from: m */
    public final void mo1885m(InterfaceC9511gY0 interfaceC9511gY0) {
        InterfaceC11846yp0 interfaceC11846yp0 = this.f2249f;
        int i = AbstractC7485Dh1.f2166a;
        interfaceC11846yp0.mo1885m(this);
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: n */
    public final long mo1886n() {
        InterfaceC11973zp0 interfaceC11973zp0 = this.f2248e;
        int i = AbstractC7485Dh1.f2166a;
        return interfaceC11973zp0.mo1886n();
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: o */
    public final void mo1887o(InterfaceC11846yp0 interfaceC11846yp0, long j) {
        this.f2249f = interfaceC11846yp0;
        InterfaceC11973zp0 interfaceC11973zp0 = this.f2248e;
        if (interfaceC11973zp0 != null) {
            long j2 = this.f2251h;
            if (j2 == -9223372036854775807L) {
                j2 = this.f2245b;
            }
            interfaceC11973zp0.mo1887o(this, j2);
        }
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: q */
    public final C8201Rb1 mo1888q() {
        InterfaceC11973zp0 interfaceC11973zp0 = this.f2248e;
        int i = AbstractC7485Dh1.f2166a;
        return interfaceC11973zp0.mo1888q();
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: r */
    public final boolean mo1889r(C11455vk0 c11455vk0) {
        InterfaceC11973zp0 interfaceC11973zp0 = this.f2248e;
        return interfaceC11973zp0 != null && interfaceC11973zp0.mo1889r(c11455vk0);
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: s */
    public final long mo1890s() {
        InterfaceC11973zp0 interfaceC11973zp0 = this.f2248e;
        int i = AbstractC7485Dh1.f2166a;
        return interfaceC11973zp0.mo1890s();
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: t */
    public final void mo1891t(long j) {
        InterfaceC11973zp0 interfaceC11973zp0 = this.f2248e;
        int i = AbstractC7485Dh1.f2166a;
        interfaceC11973zp0.mo1891t(j);
    }
}
