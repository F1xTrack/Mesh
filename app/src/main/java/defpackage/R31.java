package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class R31 extends AbstractC6883rg implements InterfaceC5369jk0 {
    public C6721qp0 A;
    public final boolean h;
    public final Uri i;
    public final WC j;
    public final X11 k;
    public final C7304tt l;
    public final C22 m;
    public final RL n;
    public final C3547eG o;
    public final long p;
    public final VY q;
    public final InterfaceC5834mA0 r;
    public final ArrayList s;
    public ZC t;
    public C1857Xo1 u;
    public InterfaceC6515pk0 v;
    public InterfaceC4188hc1 w;
    public long x;
    public J31 y;
    public Handler z;

    static {
        AbstractC6911rp0.a("media3.exoplayer.smoothstreaming");
    }

    public R31(C6721qp0 c6721qp0, WC wc, InterfaceC5834mA0 interfaceC5834mA0, X11 x11, C7304tt c7304tt, C22 c22, RL rl, C3547eG c3547eG, long j) {
        this.A = c6721qp0;
        C5957mp0 c5957mp0 = c6721qp0.b;
        c5957mp0.getClass();
        this.y = null;
        Uri uri = Uri.EMPTY;
        Uri uriWithAppendedPath = c5957mp0.a;
        if (uriWithAppendedPath.equals(uri)) {
            uriWithAppendedPath = null;
        } else {
            String path = uriWithAppendedPath.getPath();
            if (path != null) {
                Matcher matcher = AbstractC0277Dh1.k.matcher(path);
                if (matcher.matches() && matcher.group(1) == null) {
                    uriWithAppendedPath = Uri.withAppendedPath(uriWithAppendedPath, "Manifest");
                }
            }
        }
        this.i = uriWithAppendedPath;
        this.j = wc;
        this.r = interfaceC5834mA0;
        this.k = x11;
        this.l = c7304tt;
        this.m = c22;
        this.n = rl;
        this.o = c3547eG;
        this.p = j;
        this.q = a(null);
        this.h = false;
        this.s = new ArrayList();
    }

    @Override // defpackage.AbstractC6883rg
    public final InterfaceC8435zp0 b(C0456Fp0 c0456Fp0, C5272jE c5272jE, long j) {
        VY vyA = a(c0456Fp0);
        OL ol = new OL(this.d.c, 0, c0456Fp0);
        J31 j31 = this.y;
        InterfaceC4188hc1 interfaceC4188hc1 = this.w;
        InterfaceC6515pk0 interfaceC6515pk0 = this.v;
        Q31 q31 = new Q31(j31, this.k, interfaceC4188hc1, this.l, this.m, this.n, ol, this.o, vyA, interfaceC6515pk0, c5272jE);
        this.s.add(q31);
        return q31;
    }

    @Override // defpackage.AbstractC6883rg
    public final synchronized C6721qp0 h() {
        return this.A;
    }

    @Override // defpackage.AbstractC6883rg
    public final void j() {
        this.v.a();
    }

    @Override // defpackage.AbstractC6883rg
    public final void l(InterfaceC4188hc1 interfaceC4188hc1) {
        this.w = interfaceC4188hc1;
        Looper looperMyLooper = Looper.myLooper();
        NB0 nb0 = this.g;
        YN1.h(nb0);
        RL rl = this.n;
        rl.i(looperMyLooper, nb0);
        rl.e();
        if (this.h) {
            this.v = new OL0(16);
            u();
            return;
        }
        this.t = this.j.s0();
        C1857Xo1 c1857Xo1 = new C1857Xo1("SsMediaSource", 2);
        this.u = c1857Xo1;
        this.v = c1857Xo1;
        this.z = AbstractC0277Dh1.n(null);
        w();
    }

    @Override // defpackage.InterfaceC5369jk0
    public final void m(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2, boolean z) {
        C6025nA0 c6025nA0 = (C6025nA0) interfaceC5751lk0;
        long j3 = c6025nA0.a;
        Uri uri = c6025nA0.d.c;
        C4020gk0 c4020gk0 = new C4020gk0(j2);
        this.o.getClass();
        this.q.J(c4020gk0, c6025nA0.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.AbstractC6883rg
    public final void o(InterfaceC8435zp0 interfaceC8435zp0) {
        Q31 q31 = (Q31) interfaceC8435zp0;
        for (C1708Vr c1708Vr : q31.n) {
            c1708Vr.A(null);
        }
        q31.l = null;
        this.s.remove(interfaceC8435zp0);
    }

    @Override // defpackage.InterfaceC5369jk0
    public final C3829fk0 o0(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2, IOException iOException, int i) {
        C6025nA0 c6025nA0 = (C6025nA0) interfaceC5751lk0;
        long j3 = c6025nA0.a;
        Uri uri = c6025nA0.d.c;
        C4020gk0 c4020gk0 = new C4020gk0(j2);
        long jE = this.o.e(new C1204Pf(iOException, i, 9));
        C3829fk0 c3829fk0 = jE == -9223372036854775807L ? C1857Xo1.i : new C3829fk0(0, jE, false);
        this.q.P(c4020gk0, c6025nA0.c, iOException, !c3829fk0.a());
        return c3829fk0;
    }

    @Override // defpackage.AbstractC6883rg
    public final void q() {
        this.y = this.h ? this.y : null;
        this.t = null;
        this.x = 0L;
        C1857Xo1 c1857Xo1 = this.u;
        if (c1857Xo1 != null) {
            c1857Xo1.P(null);
            this.u = null;
        }
        Handler handler = this.z;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.z = null;
        }
        this.n.release();
    }

    @Override // defpackage.AbstractC6883rg
    public final synchronized void t(C6721qp0 c6721qp0) {
        this.A = c6721qp0;
    }

    public final void u() {
        C6378p11 c6378p11;
        C1708Vr[] c1708VrArr;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.s;
            if (i >= arrayList.size()) {
                break;
            }
            Q31 q31 = (Q31) arrayList.get(i);
            J31 j31 = this.y;
            q31.m = j31;
            C1708Vr[] c1708VrArr2 = q31.n;
            int length = c1708VrArr2.length;
            int i2 = 0;
            while (i2 < length) {
                FG fg = (FG) c1708VrArr2[i2].e;
                I31[] i31Arr = fg.g.f;
                int i3 = fg.b;
                I31 i31 = i31Arr[i3];
                int i4 = i31.k;
                I31 i312 = j31.f[i3];
                if (i4 == 0 || i312.k == 0) {
                    c1708VrArr = c1708VrArr2;
                    fg.h += i4;
                } else {
                    int i5 = i4 - 1;
                    long[] jArr = i31.o;
                    long jC = i31.c(i5) + jArr[i5];
                    c1708VrArr = c1708VrArr2;
                    long j = i312.o[0];
                    if (jC <= j) {
                        fg.h += i4;
                    } else {
                        fg.h = AbstractC0277Dh1.f(jArr, j, true) + fg.h;
                    }
                }
                fg.g = j31;
                i2++;
                c1708VrArr2 = c1708VrArr;
            }
            InterfaceC8245yp0 interfaceC8245yp0 = q31.l;
            interfaceC8245yp0.getClass();
            interfaceC8245yp0.m(q31);
            i++;
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MAX_VALUE;
        for (I31 i313 : this.y.f) {
            if (i313.k > 0) {
                long[] jArr2 = i313.o;
                jMax2 = Math.min(jMax2, jArr2[0]);
                int i6 = i313.k - 1;
                jMax = Math.max(jMax, i313.c(i6) + jArr2[i6]);
            }
        }
        if (jMax2 == Long.MAX_VALUE) {
            long j2 = this.y.d ? -9223372036854775807L : 0L;
            J31 j312 = this.y;
            boolean z = j312.d;
            c6378p11 = new C6378p11(j2, 0L, 0L, 0L, true, z, z, j312, h());
        } else {
            J31 j313 = this.y;
            if (j313.d) {
                long j3 = j313.h;
                if (j3 != -9223372036854775807L && j3 > 0) {
                    jMax2 = Math.max(jMax2, jMax - j3);
                }
                long j4 = jMax2;
                long j5 = jMax - j4;
                long jQ = j5 - AbstractC0277Dh1.Q(this.p);
                if (jQ < 5000000) {
                    jQ = Math.min(5000000L, j5 / 2);
                }
                c6378p11 = new C6378p11(-9223372036854775807L, j5, j4, jQ, true, true, true, this.y, h());
            } else {
                long j6 = j313.g;
                long j7 = j6 != -9223372036854775807L ? j6 : jMax - jMax2;
                c6378p11 = new C6378p11(-9223372036854775807L, -9223372036854775807L, jMax2 + j7, j7, jMax2, 0L, true, false, false, this.y, h(), null);
            }
        }
        n(c6378p11);
    }

    @Override // defpackage.InterfaceC5369jk0
    public final void v(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2) {
        C6025nA0 c6025nA0 = (C6025nA0) interfaceC5751lk0;
        long j3 = c6025nA0.a;
        Uri uri = c6025nA0.d.c;
        C4020gk0 c4020gk0 = new C4020gk0(j2);
        this.o.getClass();
        this.q.L(c4020gk0, c6025nA0.c);
        this.y = (J31) c6025nA0.f;
        this.x = j - j2;
        u();
        if (this.y.d) {
            this.z.postDelayed(new RunnableC1577Tz0(29, this), Math.max(0L, (this.x + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    public final void w() {
        if (this.u.G()) {
            return;
        }
        C6025nA0 c6025nA0 = new C6025nA0(this.t, this.i, 4, this.r);
        C1857Xo1 c1857Xo1 = this.u;
        C3547eG c3547eG = this.o;
        int i = c6025nA0.c;
        this.q.S(new C4020gk0(c6025nA0.a, c6025nA0.b, c1857Xo1.S(c6025nA0, this, c3547eG.d(i))), i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
