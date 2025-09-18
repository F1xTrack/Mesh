package p000;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class R31 extends AbstractC6758rg implements InterfaceC9919jk0 {

    /* renamed from: A */
    public C10825qp0 f9969A;

    /* renamed from: h */
    public final boolean f9970h;

    /* renamed from: i */
    public final Uri f9971i;

    /* renamed from: j */
    public final InterfaceC1397WC f9972j;

    /* renamed from: k */
    public final X11 f9973k;

    /* renamed from: l */
    public final C6914tt f9974l;

    /* renamed from: m */
    public final C22 f9975m;

    /* renamed from: n */
    public final InterfaceC1091RL f9976n;

    /* renamed from: o */
    public final C3979eG f9977o;

    /* renamed from: p */
    public final long f9978p;

    /* renamed from: q */
    public final C1356VY f9979q;

    /* renamed from: r */
    public final InterfaceC10231mA0 f9980r;

    /* renamed from: s */
    public final ArrayList f9981s;

    /* renamed from: t */
    public InterfaceC1586ZC f9982t;

    /* renamed from: u */
    public C8539Xo1 f9983u;

    /* renamed from: v */
    public InterfaceC10687pk0 f9984v;

    /* renamed from: w */
    public InterfaceC9648hc1 f9985w;

    /* renamed from: x */
    public long f9986x;

    /* renamed from: y */
    public J31 f9987y;

    /* renamed from: z */
    public Handler f9988z;

    static {
        AbstractC10953rp0.m24489a("media3.exoplayer.smoothstreaming");
    }

    public R31(C10825qp0 c10825qp0, InterfaceC1397WC interfaceC1397WC, InterfaceC10231mA0 interfaceC10231mA0, X11 x11, C6914tt c6914tt, C22 c22, InterfaceC1091RL interfaceC1091RL, C3979eG c3979eG, long j) {
        this.f9969A = c10825qp0;
        C10313mp0 c10313mp0 = c10825qp0.f41186b;
        c10313mp0.getClass();
        this.f9987y = null;
        Uri uri = Uri.EMPTY;
        Uri uriWithAppendedPath = c10313mp0.f37951a;
        if (uriWithAppendedPath.equals(uri)) {
            uriWithAppendedPath = null;
        } else {
            String path = uriWithAppendedPath.getPath();
            if (path != null) {
                Matcher matcher = AbstractC7485Dh1.f2176k.matcher(path);
                if (matcher.matches() && matcher.group(1) == null) {
                    uriWithAppendedPath = Uri.withAppendedPath(uriWithAppendedPath, "Manifest");
                }
            }
        }
        this.f9971i = uriWithAppendedPath;
        this.f9972j = interfaceC1397WC;
        this.f9980r = interfaceC10231mA0;
        this.f9973k = x11;
        this.f9974l = c6914tt;
        this.f9975m = c22;
        this.f9976n = interfaceC1091RL;
        this.f9977o = c3979eG;
        this.f9978p = j;
        this.f9979q = m24438a(null);
        this.f9970h = false;
        this.f9981s = new ArrayList();
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: b */
    public final InterfaceC11973zp0 mo3162b(C7604Fp0 c7604Fp0, C6224jE c6224jE, long j) {
        C1356VY c1356vyM24438a = m24438a(c7604Fp0);
        C0903OL c0903ol = new C0903OL(this.f41800d.f8366c, 0, c7604Fp0);
        J31 j31 = this.f9987y;
        InterfaceC9648hc1 interfaceC9648hc1 = this.f9985w;
        InterfaceC10687pk0 interfaceC10687pk0 = this.f9984v;
        Q31 q31 = new Q31(j31, this.f9973k, interfaceC9648hc1, this.f9974l, this.f9975m, this.f9976n, c0903ol, this.f9977o, c1356vyM24438a, interfaceC10687pk0, c6224jE);
        this.f9981s.add(q31);
        return q31;
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: h */
    public final synchronized C10825qp0 mo6202h() {
        return this.f9969A;
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: j */
    public final void mo3163j() {
        this.f9984v.mo858a();
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: l */
    public final void mo6203l(InterfaceC9648hc1 interfaceC9648hc1) {
        this.f9985w = interfaceC9648hc1;
        Looper looperMyLooper = Looper.myLooper();
        NB0 nb0 = this.f41803g;
        YN1.m9283h(nb0);
        InterfaceC1091RL interfaceC1091RL = this.f9976n;
        interfaceC1091RL.mo6998i(looperMyLooper, nb0);
        interfaceC1091RL.mo6997e();
        if (this.f9970h) {
            this.f9984v = new OL0(16);
            m6890u();
            return;
        }
        this.f9982t = this.f9972j.mo506s0();
        C8539Xo1 c8539Xo1 = new C8539Xo1("SsMediaSource", 2);
        this.f9983u = c8539Xo1;
        this.f9984v = c8539Xo1;
        this.f9988z = AbstractC7485Dh1.m1829n(null);
        m6891w();
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: m */
    public final void mo2001m(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2, boolean z) {
        C10359nA0 c10359nA0 = (C10359nA0) interfaceC10175lk0;
        long j3 = c10359nA0.f38158a;
        Uri uri = c10359nA0.f38161d.f6987c;
        C9535gk0 c9535gk0 = new C9535gk0(j2);
        this.f9977o.getClass();
        this.f9979q.m8472J(c9535gk0, c10359nA0.f38160c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: o */
    public final void mo3164o(InterfaceC11973zp0 interfaceC11973zp0) {
        Q31 q31 = (Q31) interfaceC11973zp0;
        for (C1375Vr c1375Vr : q31.f9459n) {
            c1375Vr.m8603A(null);
        }
        q31.f9457l = null;
        this.f9981s.remove(interfaceC11973zp0);
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: o0 */
    public final C9407fk0 mo2002o0(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2, IOException iOException, int i) {
        C10359nA0 c10359nA0 = (C10359nA0) interfaceC10175lk0;
        long j3 = c10359nA0.f38158a;
        Uri uri = c10359nA0.f38161d.f6987c;
        C9535gk0 c9535gk0 = new C9535gk0(j2);
        long jMo17892e = this.f9977o.mo17892e(new C0986Pf(iOException, i, 9));
        C9407fk0 c9407fk0 = jMo17892e == -9223372036854775807L ? C8539Xo1.f13979i : new C9407fk0(0, jMo17892e, false);
        this.f9979q.m8478P(c9535gk0, c10359nA0.f38160c, iOException, !c9407fk0.m18291a());
        return c9407fk0;
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: q */
    public final void mo3165q() {
        this.f9987y = this.f9970h ? this.f9987y : null;
        this.f9982t = null;
        this.f9986x = 0L;
        C8539Xo1 c8539Xo1 = this.f9983u;
        if (c8539Xo1 != null) {
            c8539Xo1.m9133P(null);
            this.f9983u = null;
        }
        Handler handler = this.f9988z;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f9988z = null;
        }
        this.f9976n.release();
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: t */
    public final synchronized void mo3166t(C10825qp0 c10825qp0) {
        this.f9969A = c10825qp0;
    }

    /* renamed from: u */
    public final void m6890u() {
        C10595p11 c10595p11;
        C1375Vr[] c1375VrArr;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9981s;
            if (i >= arrayList.size()) {
                break;
            }
            Q31 q31 = (Q31) arrayList.get(i);
            J31 j31 = this.f9987y;
            q31.f9458m = j31;
            C1375Vr[] c1375VrArr2 = q31.f9459n;
            int length = c1375VrArr2.length;
            int i2 = 0;
            while (i2 < length) {
                C0332FG c0332fg = (C0332FG) c1375VrArr2[i2].f12806e;
                I31[] i31Arr = c0332fg.f3130g.f5301f;
                int i3 = c0332fg.f3125b;
                I31 i31 = i31Arr[i3];
                int i4 = i31.f4684k;
                I31 i312 = j31.f5301f[i3];
                if (i4 == 0 || i312.f4684k == 0) {
                    c1375VrArr = c1375VrArr2;
                    c0332fg.f3131h += i4;
                } else {
                    int i5 = i4 - 1;
                    long[] jArr = i31.f4688o;
                    long jM3741c = i31.m3741c(i5) + jArr[i5];
                    c1375VrArr = c1375VrArr2;
                    long j = i312.f4688o[0];
                    if (jM3741c <= j) {
                        c0332fg.f3131h += i4;
                    } else {
                        c0332fg.f3131h = AbstractC7485Dh1.m1821f(jArr, j, true) + c0332fg.f3131h;
                    }
                }
                c0332fg.f3130g = j31;
                i2++;
                c1375VrArr2 = c1375VrArr;
            }
            InterfaceC11846yp0 interfaceC11846yp0 = q31.f9457l;
            interfaceC11846yp0.getClass();
            interfaceC11846yp0.mo1885m(q31);
            i++;
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MAX_VALUE;
        for (I31 i313 : this.f9987y.f5301f) {
            if (i313.f4684k > 0) {
                long[] jArr2 = i313.f4688o;
                jMax2 = Math.min(jMax2, jArr2[0]);
                int i6 = i313.f4684k - 1;
                jMax = Math.max(jMax, i313.m3741c(i6) + jArr2[i6]);
            }
        }
        if (jMax2 == Long.MAX_VALUE) {
            long j2 = this.f9987y.f5299d ? -9223372036854775807L : 0L;
            J31 j312 = this.f9987y;
            boolean z = j312.f5299d;
            c10595p11 = new C10595p11(j2, 0L, 0L, 0L, true, z, z, j312, mo6202h());
        } else {
            J31 j313 = this.f9987y;
            if (j313.f5299d) {
                long j3 = j313.f5303h;
                if (j3 != -9223372036854775807L && j3 > 0) {
                    jMax2 = Math.max(jMax2, jMax - j3);
                }
                long j4 = jMax2;
                long j5 = jMax - j4;
                long jM1802Q = j5 - AbstractC7485Dh1.m1802Q(this.f9978p);
                if (jM1802Q < 5000000) {
                    jM1802Q = Math.min(5000000L, j5 / 2);
                }
                c10595p11 = new C10595p11(-9223372036854775807L, j5, j4, jM1802Q, true, true, true, this.f9987y, mo6202h());
            } else {
                long j6 = j313.f5302g;
                long j7 = j6 != -9223372036854775807L ? j6 : jMax - jMax2;
                c10595p11 = new C10595p11(-9223372036854775807L, -9223372036854775807L, jMax2 + j7, j7, jMax2, 0L, true, false, false, this.f9987y, mo6202h(), null);
            }
        }
        m24442n(c10595p11);
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: v */
    public final void mo2004v(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2) {
        C10359nA0 c10359nA0 = (C10359nA0) interfaceC10175lk0;
        long j3 = c10359nA0.f38158a;
        Uri uri = c10359nA0.f38161d.f6987c;
        C9535gk0 c9535gk0 = new C9535gk0(j2);
        this.f9977o.getClass();
        this.f9979q.m8474L(c9535gk0, c10359nA0.f38160c);
        this.f9987y = (J31) c10359nA0.f38163f;
        this.f9986x = j - j2;
        m6890u();
        if (this.f9987y.f5299d) {
            this.f9988z.postDelayed(new RunnableC8352Tz0(29, this), Math.max(0L, (this.f9986x + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    /* renamed from: w */
    public final void m6891w() {
        if (this.f9983u.m9125G()) {
            return;
        }
        C10359nA0 c10359nA0 = new C10359nA0(this.f9982t, this.f9971i, 4, this.f9980r);
        C8539Xo1 c8539Xo1 = this.f9983u;
        C3979eG c3979eG = this.f9977o;
        int i = c10359nA0.f38160c;
        this.f9979q.m8481S(new C9535gk0(c10359nA0.f38158a, c10359nA0.f38159b, c8539Xo1.m9136S(c10359nA0, this, c3979eG.mo17891d(i))), i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
