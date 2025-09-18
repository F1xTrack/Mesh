package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class O11 implements InterfaceC11973zp0, InterfaceC9919jk0 {

    /* renamed from: a */
    public final C3976eD f8175a;

    /* renamed from: b */
    public final InterfaceC1397WC f8176b;

    /* renamed from: c */
    public final InterfaceC9648hc1 f8177c;

    /* renamed from: d */
    public final C3979eG f8178d;

    /* renamed from: e */
    public final C1356VY f8179e;

    /* renamed from: f */
    public final C8201Rb1 f8180f;

    /* renamed from: h */
    public final long f8182h;

    /* renamed from: j */
    public final C6686qX f8184j;

    /* renamed from: k */
    public final boolean f8185k;

    /* renamed from: l */
    public boolean f8186l;

    /* renamed from: m */
    public byte[] f8187m;

    /* renamed from: n */
    public int f8188n;

    /* renamed from: g */
    public final ArrayList f8181g = new ArrayList();

    /* renamed from: i */
    public final C8539Xo1 f8183i = new C8539Xo1("SingleSampleMediaPeriod", 2);

    public O11(C3976eD c3976eD, InterfaceC1397WC interfaceC1397WC, InterfaceC9648hc1 interfaceC9648hc1, C6686qX c6686qX, long j, C3979eG c3979eG, C1356VY c1356vy, boolean z) {
        this.f8175a = c3976eD;
        this.f8176b = interfaceC1397WC;
        this.f8177c = interfaceC9648hc1;
        this.f8184j = c6686qX;
        this.f8182h = j;
        this.f8178d = c3979eG;
        this.f8179e = c1356vy;
        this.f8185k = z;
        this.f8180f = new C8201Rb1(new C8149Qb1("", c6686qX));
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: d */
    public final long mo1879d(InterfaceC6237jR[] interfaceC6237jRArr, boolean[] zArr, InterfaceC9121dV0[] interfaceC9121dV0Arr, boolean[] zArr2, long j) {
        for (int i = 0; i < interfaceC6237jRArr.length; i++) {
            InterfaceC9121dV0 interfaceC9121dV0 = interfaceC9121dV0Arr[i];
            ArrayList arrayList = this.f8181g;
            if (interfaceC9121dV0 != null && (interfaceC6237jRArr[i] == null || !zArr[i])) {
                arrayList.remove(interfaceC9121dV0);
                interfaceC9121dV0Arr[i] = null;
            }
            if (interfaceC9121dV0Arr[i] == null && interfaceC6237jRArr[i] != null) {
                M11 m11 = new M11(this);
                arrayList.add(m11);
                interfaceC9121dV0Arr[i] = m11;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: e */
    public final long mo1880e() {
        return (this.f8186l || this.f8183i.m9127I()) ? Long.MIN_VALUE : 0L;
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: h */
    public final long mo1882h(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f8181g;
            if (i >= arrayList.size()) {
                return j;
            }
            M11 m11 = (M11) arrayList.get(i);
            if (m11.f6968a == 2) {
                m11.f6968a = 1;
            }
            i++;
        }
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: l */
    public final boolean mo1884l() {
        return this.f8183i.m9127I();
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: m */
    public final void mo2001m(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2, boolean z) {
        Uri uri = ((N11) interfaceC10175lk0).f7465c.f6987c;
        C9535gk0 c9535gk0 = new C9535gk0(j2);
        this.f8178d.getClass();
        this.f8179e.m8472J(c9535gk0, 1, -1, null, 0, null, 0L, this.f8182h);
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: n */
    public final long mo1886n() {
        return -9223372036854775807L;
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: o */
    public final void mo1887o(InterfaceC11846yp0 interfaceC11846yp0, long j) {
        interfaceC11846yp0.mo1876a(this);
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: o0 */
    public final C9407fk0 mo2002o0(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2, IOException iOException, int i) {
        C9407fk0 c9407fk0;
        Uri uri = ((N11) interfaceC10175lk0).f7465c.f6987c;
        C9535gk0 c9535gk0 = new C9535gk0(j2);
        AbstractC7485Dh1.m1819d0(this.f8182h);
        C0986Pf c0986Pf = new C0986Pf(iOException, i, 9);
        C3979eG c3979eG = this.f8178d;
        long jMo17892e = c3979eG.mo17892e(c0986Pf);
        boolean z = jMo17892e == -9223372036854775807L || i >= c3979eG.mo17891d(1);
        if (this.f8185k && z) {
            AbstractC10872rA1.m24176i("Loading failed, treating as end-of-stream.", iOException);
            this.f8186l = true;
            c9407fk0 = C8539Xo1.f13978h;
        } else {
            c9407fk0 = jMo17892e != -9223372036854775807L ? new C9407fk0(0, jMo17892e, false) : C8539Xo1.f13979i;
        }
        C9407fk0 c9407fk02 = c9407fk0;
        this.f8179e.m8477O(c9535gk0, 1, -1, this.f8184j, 0, null, 0L, this.f8182h, iOException, !c9407fk02.m18291a());
        return c9407fk02;
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: q */
    public final C8201Rb1 mo1888q() {
        return this.f8180f;
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: r */
    public final boolean mo1889r(C11455vk0 c11455vk0) {
        if (this.f8186l) {
            return false;
        }
        C8539Xo1 c8539Xo1 = this.f8183i;
        if (c8539Xo1.m9127I() || c8539Xo1.m9125G()) {
            return false;
        }
        InterfaceC1586ZC interfaceC1586ZCMo506s0 = this.f8176b.mo506s0();
        InterfaceC9648hc1 interfaceC9648hc1 = this.f8177c;
        if (interfaceC9648hc1 != null) {
            interfaceC1586ZCMo506s0.mo5255d(interfaceC9648hc1);
        }
        N11 n11 = new N11(interfaceC1586ZCMo506s0, this.f8175a);
        this.f8179e.m8481S(new C9535gk0(n11.f7463a, this.f8175a, c8539Xo1.m9136S(n11, this, this.f8178d.mo17891d(1))), 1, -1, this.f8184j, 0, null, 0L, this.f8182h);
        return true;
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: s */
    public final long mo1890s() {
        return this.f8186l ? Long.MIN_VALUE : 0L;
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: v */
    public final void mo2004v(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2) {
        N11 n11 = (N11) interfaceC10175lk0;
        this.f8188n = (int) n11.f7465c.f6986b;
        byte[] bArr = n11.f7466d;
        bArr.getClass();
        this.f8187m = bArr;
        this.f8186l = true;
        Uri uri = n11.f7465c.f6987c;
        C9535gk0 c9535gk0 = new C9535gk0(j2);
        this.f8178d.getClass();
        this.f8179e.m8475M(c9535gk0, 1, -1, this.f8184j, 0, null, 0L, this.f8182h);
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: g */
    public final void mo1881g() {
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: i */
    public final void mo1883i(long j) {
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: t */
    public final void mo1891t(long j) {
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: b */
    public final long mo1877b(long j, DX0 dx0) {
        return j;
    }
}
