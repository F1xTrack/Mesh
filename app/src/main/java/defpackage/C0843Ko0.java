package defpackage;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.regex.Pattern;

/* renamed from: Ko0 */
/* loaded from: classes.dex */
public final class C0843Ko0 extends AbstractC1622Uo0 implements InterfaceC0453Fo0 {
    public final Context Q1;
    public final CC0 R1;
    public final NE S1;
    public int T1;
    public boolean U1;
    public boolean V1;
    public C6666qX W1;
    public C6666qX X1;
    public long Y1;
    public boolean Z1;
    public boolean a2;
    public boolean b2;
    public int c2;

    public C0843Ko0(Context context, InterfaceC0609Ho0 interfaceC0609Ho0, boolean z, Handler handler, UQ uq, NE ne) {
        super(1, interfaceC0609Ho0, z, 44100.0f);
        this.Q1 = context.getApplicationContext();
        this.S1 = ne;
        this.c2 = -1000;
        this.R1 = new CC0(handler, 5, uq);
        ne.s = new G10(21, this);
    }

    @Override // defpackage.AbstractC1622Uo0
    public final C2285bE C(C1076No0 c1076No0, C6666qX c6666qX, C6666qX c6666qX2) {
        C2285bE c2285bEB = c1076No0.b(c6666qX, c6666qX2);
        boolean z = this.F == null && p0(c6666qX2);
        int i = c2285bEB.e;
        if (z) {
            i |= 32768;
        }
        if (v0(c1076No0, c6666qX2) > this.T1) {
            i |= 64;
        }
        int i2 = i;
        return new C2285bE(c1076No0.a, c6666qX, c6666qX2, i2 == 0 ? c2285bEB.d : 0, i2);
    }

    @Override // defpackage.AbstractC1622Uo0
    public final float N(float f, C6666qX[] c6666qXArr) {
        int iMax = -1;
        for (C6666qX c6666qX : c6666qXArr) {
            int i = c6666qX.B;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f * iMax;
    }

    @Override // defpackage.AbstractC1622Uo0
    public final ArrayList O(C4403il c4403il, C6666qX c6666qX, boolean z) {
        C1076No0 c1076No0E;
        C3769fQ0 c3769fQ0H = c6666qX.m == null ? C3769fQ0.e : (this.S1.f(c6666qX) == 0 || (c1076No0E = AbstractC2012Zo0.e("audio/raw")) == null) ? AbstractC2012Zo0.h(c4403il, c6666qX, z, false) : P70.B(c1076No0E);
        Pattern pattern = AbstractC2012Zo0.a;
        ArrayList arrayList = new ArrayList(c3769fQ0H);
        Collections.sort(arrayList, new C4243hv(2, new EE(26, c6666qX)));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0060  */
    @Override // defpackage.AbstractC1622Uo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C0531Go0 P(defpackage.C1076No0 r12, defpackage.C6666qX r13, android.media.MediaCrypto r14, float r15) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0843Ko0.P(No0, qX, android.media.MediaCrypto, float):Go0");
    }

    @Override // defpackage.AbstractC1622Uo0
    public final void Q(ZD zd) {
        C6666qX c6666qX;
        HE he;
        if (AbstractC0277Dh1.a < 29 || (c6666qX = zd.c) == null || !Objects.equals(c6666qX.m, "audio/opus") || !this.u1) {
            return;
        }
        ByteBuffer byteBuffer = zd.h;
        byteBuffer.getClass();
        C6666qX c6666qX2 = zd.c;
        c6666qX2.getClass();
        if (byteBuffer.remaining() == 8) {
            int i = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            NE ne = this.S1;
            AudioTrack audioTrack = ne.w;
            if (audioTrack == null || !NE.m(audioTrack) || (he = ne.u) == null || !he.k) {
                return;
            }
            ne.w.setOffloadDelayPadding(c6666qX2.D, i);
        }
    }

    @Override // defpackage.AbstractC1622Uo0
    public final void V(Exception exc) {
        AbstractC6789rA1.e("Audio codec error", exc);
        CC0 cc0 = this.R1;
        Handler handler = (Handler) cc0.b;
        if (handler != null) {
            handler.post(new RunnableC7629va(cc0, exc, 0));
        }
    }

    @Override // defpackage.AbstractC1622Uo0
    public final void W(long j, long j2, String str) {
        CC0 cc0 = this.R1;
        Handler handler = (Handler) cc0.b;
        if (handler != null) {
            handler.post(new RunnableC7819wa(cc0, str, j, j2, 0));
        }
    }

    @Override // defpackage.AbstractC1622Uo0
    public final void X(String str) {
        CC0 cc0 = this.R1;
        Handler handler = (Handler) cc0.b;
        if (handler != null) {
            handler.post(new RunnableC6769r4(cc0, 5, str));
        }
    }

    @Override // defpackage.AbstractC1622Uo0
    public final C2285bE Y(N8 n8) throws IQ {
        C6666qX c6666qX = (C6666qX) n8.c;
        c6666qX.getClass();
        this.W1 = c6666qX;
        C2285bE c2285bEY = super.Y(n8);
        CC0 cc0 = this.R1;
        Handler handler = (Handler) cc0.b;
        if (handler != null) {
            handler.post(new RunnableC1557Ts1(cc0, c6666qX, c2285bEY, 2));
        }
        return c2285bEY;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0104 A[Catch: Ba -> 0x0102, TryCatch #0 {Ba -> 0x0102, blocks: (B:110:0x00d9, B:113:0x00e1, B:115:0x00e5, B:117:0x00ee, B:121:0x00fc, B:124:0x0104, B:128:0x010b, B:129:0x0110), top: B:133:0x00d9 }] */
    @Override // defpackage.AbstractC1622Uo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z(defpackage.C6666qX r14, android.media.MediaFormat r15) throws defpackage.IQ {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0843Ko0.Z(qX, android.media.MediaFormat):void");
    }

    @Override // defpackage.InterfaceC0453Fo0
    public final void a(CB0 cb0) {
        NE ne = this.S1;
        ne.getClass();
        ne.D = new CB0(AbstractC0277Dh1.i(cb0.a, 0.1f, 8.0f), AbstractC0277Dh1.i(cb0.b, 0.1f, 8.0f));
        if (ne.t()) {
            ne.s();
            return;
        }
        IE ie = new IE(cb0, -9223372036854775807L, -9223372036854775807L);
        if (ne.l()) {
            ne.B = ie;
        } else {
            ne.C = ie;
        }
    }

    @Override // defpackage.AbstractC1622Uo0
    public final void a0() {
        this.S1.getClass();
    }

    @Override // defpackage.InterfaceC0453Fo0
    public final long b() {
        if (this.h == 2) {
            w0();
        }
        return this.Y1;
    }

    @Override // defpackage.InterfaceC0453Fo0
    public final boolean c() {
        boolean z = this.b2;
        this.b2 = false;
        return z;
    }

    @Override // defpackage.AbstractC1622Uo0
    public final void c0() {
        this.S1.M = true;
    }

    @Override // defpackage.AbstractC0038Ag, defpackage.PB0
    public final void d(int i, Object obj) {
        NE ne = this.S1;
        if (i == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (ne.P != fFloatValue) {
                ne.P = fFloatValue;
                if (ne.l()) {
                    if (AbstractC0277Dh1.a >= 21) {
                        ne.w.setVolume(ne.P);
                        return;
                    }
                    AudioTrack audioTrack = ne.w;
                    float f = ne.P;
                    audioTrack.setStereoVolume(f, f);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            Q9 q9 = (Q9) obj;
            q9.getClass();
            if (ne.A.equals(q9)) {
                return;
            }
            ne.A = q9;
            if (ne.d0) {
                return;
            }
            C2541ca c2541ca = ne.y;
            if (c2541ca != null) {
                c2541ca.j = q9;
                c2541ca.a(Y9.b((Context) c2541ca.b, q9, (C3607ea) c2541ca.i));
            }
            ne.d();
            return;
        }
        if (i == 6) {
            C2366bf c2366bf = (C2366bf) obj;
            c2366bf.getClass();
            if (ne.b0.equals(c2366bf)) {
                return;
            }
            if (ne.w != null) {
                ne.b0.getClass();
            }
            ne.b0 = c2366bf;
            return;
        }
        if (i == 12) {
            if (AbstractC0277Dh1.a >= 23) {
                AbstractC0765Jo0.a(ne, obj);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.c2 = ((Integer) obj).intValue();
            InterfaceC0687Io0 interfaceC0687Io0 = this.L;
            if (interfaceC0687Io0 != null && AbstractC0277Dh1.a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt(NotificationConstants.IMPORTANCE, Math.max(0, -this.c2));
                interfaceC0687Io0.a(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            ne.E = ((Boolean) obj).booleanValue();
            IE ie = new IE(ne.t() ? CB0.d : ne.D, -9223372036854775807L, -9223372036854775807L);
            if (ne.l()) {
                ne.B = ie;
                return;
            } else {
                ne.C = ie;
                return;
            }
        }
        if (i != 10) {
            if (i == 11) {
                this.G = (YQ) obj;
                return;
            }
            return;
        }
        obj.getClass();
        int iIntValue = ((Integer) obj).intValue();
        if (ne.a0 != iIntValue) {
            ne.a0 = iIntValue;
            ne.Z = iIntValue != 0;
            ne.d();
        }
    }

    @Override // defpackage.InterfaceC0453Fo0
    public final CB0 e() {
        return this.S1.D;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0068  */
    @Override // defpackage.AbstractC1622Uo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g0(long r1, long r3, defpackage.InterfaceC0687Io0 r5, java.nio.ByteBuffer r6, int r7, int r8, int r9, long r10, boolean r12, boolean r13, defpackage.C6666qX r14) throws defpackage.IQ {
        /*
            r0 = this;
            r6.getClass()
            qX r1 = r0.X1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L14
            r1 = r8 & 2
            if (r1 == 0) goto L14
            r5.getClass()
            r5.o(r7, r3)
            return r2
        L14:
            NE r1 = r0.S1
            if (r12 == 0) goto L27
            if (r5 == 0) goto L1d
            r5.o(r7, r3)
        L1d:
            WD r3 = r0.L1
            int r4 = r3.f
            int r4 = r4 + r9
            r3.f = r4
            r1.M = r2
            return r2
        L27:
            boolean r1 = r1.i(r6, r10, r9)     // Catch: defpackage.C0332Ea -> L3b defpackage.C0176Ca -> L55
            if (r1 == 0) goto L3a
            if (r5 == 0) goto L32
            r5.o(r7, r3)
        L32:
            WD r1 = r0.L1
            int r3 = r1.e
            int r3 = r3 + r9
            r1.e = r3
            return r2
        L3a:
            return r3
        L3b:
            r1 = move-exception
            boolean r2 = r0.u1
            if (r2 == 0) goto L4c
            ZQ0 r2 = r0.d
            r2.getClass()
            int r2 = r2.a
            if (r2 == 0) goto L4c
            r2 = 5003(0x138b, float:7.01E-42)
            goto L4e
        L4c:
            r2 = 5002(0x138a, float:7.009E-42)
        L4e:
            boolean r3 = r1.b
            IQ r1 = r0.f(r1, r14, r3, r2)
            throw r1
        L55:
            r1 = move-exception
            qX r2 = r0.W1
            boolean r3 = r0.u1
            if (r3 == 0) goto L68
            ZQ0 r3 = r0.d
            r3.getClass()
            int r3 = r3.a
            if (r3 == 0) goto L68
            r3 = 5004(0x138c, float:7.012E-42)
            goto L6a
        L68:
            r3 = 5001(0x1389, float:7.008E-42)
        L6a:
            boolean r4 = r1.b
            IQ r1 = r0.f(r1, r2, r4, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0843Ko0.g0(long, long, Io0, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, qX):boolean");
    }

    @Override // defpackage.AbstractC0038Ag
    public final String i() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.AbstractC1622Uo0
    public final void j0() throws IQ {
        try {
            NE ne = this.S1;
            if (!ne.V && ne.l() && ne.c()) {
                ne.p();
                ne.V = true;
            }
        } catch (C0332Ea e) {
            throw f(e, e.c, e.b, this.u1 ? 5003 : 5002);
        }
    }

    @Override // defpackage.AbstractC0038Ag
    public final boolean k() {
        if (this.H1) {
            NE ne = this.S1;
            if (!ne.l() || (ne.V && !ne.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC1622Uo0, defpackage.AbstractC0038Ag
    public final boolean l() {
        return this.S1.j() || super.l();
    }

    @Override // defpackage.AbstractC1622Uo0, defpackage.AbstractC0038Ag
    public final void m() {
        CC0 cc0 = this.R1;
        this.a2 = true;
        this.W1 = null;
        try {
            this.S1.d();
            try {
                super.m();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.m();
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.AbstractC0038Ag
    public final void n(boolean z, boolean z2) {
        WD wd = new WD();
        this.L1 = wd;
        CC0 cc0 = this.R1;
        Handler handler = (Handler) cc0.b;
        if (handler != null) {
            handler.post(new RunnableC7247ta(cc0, wd, 0));
        }
        ZQ0 zq0 = this.d;
        zq0.getClass();
        boolean z3 = zq0.b;
        NE ne = this.S1;
        if (z3) {
            ne.getClass();
            YN1.f(AbstractC0277Dh1.a >= 21);
            YN1.f(ne.Z);
            if (!ne.d0) {
                ne.d0 = true;
                ne.d();
            }
        } else if (ne.d0) {
            ne.d0 = false;
            ne.d();
        }
        NB0 nb0 = this.f;
        nb0.getClass();
        ne.r = nb0;
        M71 m71 = this.g;
        m71.getClass();
        ne.i.J = m71;
    }

    @Override // defpackage.AbstractC1622Uo0, defpackage.AbstractC0038Ag
    public final void o(long j, boolean z) throws IQ {
        super.o(j, z);
        this.S1.d();
        this.Y1 = j;
        this.b2 = false;
        this.Z1 = true;
    }

    @Override // defpackage.AbstractC0038Ag
    public final void p() {
        C2160aa c2160aa;
        C2541ca c2541ca = this.S1.y;
        if (c2541ca == null || !c2541ca.a) {
            return;
        }
        c2541ca.h = null;
        int i = AbstractC0277Dh1.a;
        Context context = (Context) c2541ca.b;
        if (i >= 23 && (c2160aa = (C2160aa) c2541ca.e) != null) {
            Z9.b(context, c2160aa);
        }
        D6 d6 = (D6) c2541ca.f;
        if (d6 != null) {
            context.unregisterReceiver(d6);
        }
        C2351ba c2351ba = (C2351ba) c2541ca.g;
        if (c2351ba != null) {
            c2351ba.a.unregisterContentObserver(c2351ba);
        }
        c2541ca.a = false;
    }

    @Override // defpackage.AbstractC1622Uo0
    public final boolean p0(C6666qX c6666qX) {
        ZQ0 zq0 = this.d;
        zq0.getClass();
        if (zq0.a != 0) {
            int iU0 = u0(c6666qX);
            if ((iU0 & 512) != 0) {
                ZQ0 zq02 = this.d;
                zq02.getClass();
                if (zq02.a == 2 || (iU0 & 1024) != 0 || (c6666qX.D == 0 && c6666qX.E == 0)) {
                    return true;
                }
            }
        }
        return this.S1.f(c6666qX) != 0;
    }

    @Override // defpackage.AbstractC0038Ag
    public final void q() {
        NE ne = this.S1;
        this.b2 = false;
        try {
            try {
                E();
                i0();
                LL ll = this.F;
                if (ll != null) {
                    ll.d(null);
                }
                this.F = null;
            } catch (Throwable th) {
                LL ll2 = this.F;
                if (ll2 != null) {
                    ll2.d(null);
                }
                this.F = null;
                throw th;
            }
        } finally {
            if (this.a2) {
                this.a2 = false;
                ne.r();
            }
        }
    }

    @Override // defpackage.AbstractC1622Uo0
    public final int q0(C4403il c4403il, C6666qX c6666qX) {
        int iU0;
        C1076No0 c1076No0E;
        boolean z;
        if (!AbstractC1865Xr0.j(c6666qX.m)) {
            return AbstractC7209tN0.m(0, 0, 0, 0);
        }
        int i = AbstractC0277Dh1.a >= 21 ? 32 : 0;
        boolean z2 = true;
        int i2 = c6666qX.J;
        boolean z3 = i2 != 0;
        boolean z4 = i2 == 0 || i2 == 2;
        int i3 = 8;
        NE ne = this.S1;
        if (!z4 || (z3 && AbstractC2012Zo0.e("audio/raw") == null)) {
            iU0 = 0;
        } else {
            iU0 = u0(c6666qX);
            if (ne.f(c6666qX) != 0) {
                return AbstractC7209tN0.m(4, 8, i, iU0);
            }
        }
        String str = c6666qX.m;
        if ("audio/raw".equals(str) && ne.f(c6666qX) == 0) {
            return AbstractC7209tN0.m(1, 0, 0, 0);
        }
        C6475pX c6475pX = new C6475pX();
        c6475pX.l = AbstractC1865Xr0.n("audio/raw");
        c6475pX.z = c6666qX.A;
        c6475pX.A = c6666qX.B;
        c6475pX.B = 2;
        if (ne.f(new C6666qX(c6475pX)) == 0) {
            return AbstractC7209tN0.m(1, 0, 0, 0);
        }
        C3769fQ0 c3769fQ0H = str == null ? C3769fQ0.e : (ne.f(c6666qX) == 0 || (c1076No0E = AbstractC2012Zo0.e("audio/raw")) == null) ? AbstractC2012Zo0.h(c4403il, c6666qX, false, false) : P70.B(c1076No0E);
        if (c3769fQ0H.isEmpty()) {
            return AbstractC7209tN0.m(1, 0, 0, 0);
        }
        if (!z4) {
            return AbstractC7209tN0.m(2, 0, 0, 0);
        }
        C1076No0 c1076No0 = (C1076No0) c3769fQ0H.get(0);
        boolean zD = c1076No0.d(c6666qX);
        if (zD) {
            z = true;
            z2 = zD;
        } else {
            for (int i4 = 1; i4 < c3769fQ0H.d; i4++) {
                C1076No0 c1076No02 = (C1076No0) c3769fQ0H.get(i4);
                if (c1076No02.d(c6666qX)) {
                    z = false;
                    c1076No0 = c1076No02;
                    break;
                }
            }
            z = true;
            z2 = zD;
        }
        int i5 = z2 ? 4 : 3;
        if (z2 && c1076No0.e(c6666qX)) {
            i3 = 16;
        }
        return i5 | i3 | i | (c1076No0.g ? 64 : 0) | (z ? 128 : 0) | iU0;
    }

    @Override // defpackage.AbstractC0038Ag
    public final void r() {
        this.S1.o();
    }

    @Override // defpackage.AbstractC0038Ag
    public final void s() throws IllegalStateException {
        w0();
        NE ne = this.S1;
        ne.Y = false;
        if (ne.l()) {
            C1345Ra c1345Ra = ne.i;
            c1345Ra.d();
            if (c1345Ra.y == -9223372036854775807L) {
                C1267Qa c1267Qa = c1345Ra.f;
                c1267Qa.getClass();
                c1267Qa.a();
            } else {
                c1345Ra.A = c1345Ra.b();
                if (!NE.m(ne.w)) {
                    return;
                }
            }
            ne.w.pause();
        }
    }

    public final int u0(C6666qX c6666qX) {
        C6102na c6102naE = this.S1.e(c6666qX);
        if (!c6102naE.a) {
            return 0;
        }
        int i = c6102naE.b ? 1536 : 512;
        return c6102naE.c ? i | 2048 : i;
    }

    public final int v0(C1076No0 c1076No0, C6666qX c6666qX) {
        int i;
        if (!"OMX.google.raw.decoder".equals(c1076No0.a) || (i = AbstractC0277Dh1.a) >= 24 || (i == 23 && AbstractC0277Dh1.P(this.Q1))) {
            return c6666qX.n;
        }
        return -1;
    }

    public final void w0() {
        long jMax;
        ArrayDeque arrayDeque;
        long jY;
        long jY2;
        boolean zK = k();
        NE ne = this.S1;
        if (!ne.l() || ne.N) {
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(ne.i.a(zK), AbstractC0277Dh1.W(ne.u.e, ne.h()));
            while (true) {
                arrayDeque = ne.j;
                if (arrayDeque.isEmpty() || jMin < ((IE) arrayDeque.getFirst()).c) {
                    break;
                } else {
                    ne.C = (IE) arrayDeque.remove();
                }
            }
            long j = jMin - ne.C.c;
            boolean zIsEmpty = arrayDeque.isEmpty();
            C5772lr0 c5772lr0 = ne.b;
            if (zIsEmpty) {
                S21 s21 = (S21) c5772lr0.d;
                if (s21.isActive()) {
                    if (s21.o >= 1024) {
                        long j2 = s21.n;
                        s21.j.getClass();
                        long j3 = j2 - ((r3.k * r3.b) * 2);
                        int i = s21.h.a;
                        int i2 = s21.g.a;
                        jY2 = i == i2 ? AbstractC0277Dh1.Y(j, j3, s21.o, RoundingMode.FLOOR) : AbstractC0277Dh1.Y(j, j3 * i, s21.o * i2, RoundingMode.FLOOR);
                    } else {
                        jY2 = (long) (s21.c * j);
                    }
                    j = jY2;
                }
                jY = ne.C.b + j;
            } else {
                IE ie = (IE) arrayDeque.getFirst();
                jY = ie.b - AbstractC0277Dh1.y(ie.c - jMin, ne.C.a.a);
            }
            long j4 = ((I01) c5772lr0.c).q;
            jMax = AbstractC0277Dh1.W(ne.u.e, j4) + jY;
            long j5 = ne.j0;
            if (j4 > j5) {
                long jW = AbstractC0277Dh1.W(ne.u.e, j4 - j5);
                ne.j0 = j4;
                ne.k0 += jW;
                if (ne.l0 == null) {
                    ne.l0 = new Handler(Looper.myLooper());
                }
                ne.l0.removeCallbacksAndMessages(null);
                ne.l0.postDelayed(new DE(0, ne), 100L);
            }
        }
        if (jMax != Long.MIN_VALUE) {
            if (!this.Z1) {
                jMax = Math.max(this.Y1, jMax);
            }
            this.Y1 = jMax;
            this.Z1 = false;
        }
    }

    @Override // defpackage.AbstractC0038Ag
    public final InterfaceC0453Fo0 h() {
        return this;
    }
}
