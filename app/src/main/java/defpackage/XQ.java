package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class XQ extends U0 implements ExoPlayer {
    public final X11 A;
    public final C5720la B;
    public final C6518pl0 C;
    public final C0162Bv0 D;
    public final long E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public final DX0 K;
    public C8280z01 L;
    public final LQ M;
    public EB0 N;
    public C7484up0 O;
    public C6666qX P;
    public AudioTrack Q;
    public Surface R;
    public Surface S;
    public SurfaceHolder T;
    public C5813m31 U;
    public boolean V;
    public TextureView W;
    public final int X;
    public C2058a21 Y;
    public final int Z;
    public Q9 a0;
    public float b0;
    public final C2359bc1 c;
    public boolean c0;
    public final EB0 d;
    public final boolean d0;
    public final FC e;
    public boolean e0;
    public final Context f;
    public final IB0 g;
    public final AbstractC0038Ag[] h;
    public final AbstractC6715qn0 i;
    public final R71 j;
    public final QQ k;
    public final C3390dR l;
    public final C1607Uj0 m;
    public final CopyOnWriteArraySet n;
    public final C0022Aa1 o;
    public final ArrayList p;
    public final boolean q;
    public final int q1;
    public final C8323zE r;
    public boolean r1;
    public final Looper s;
    public C1530Tj1 s1;
    public final InterfaceC0191Cf t;
    public C7484up0 t1;
    public final long u;
    public BB0 u1;
    public final long v;
    public int v1;
    public final long w;
    public long w1;
    public final M71 x;
    public final UQ y;
    public final VQ z;

    static {
        AbstractC6911rp0.a("media3.exoplayer");
    }

    public XQ(KQ kq) {
        super(4);
        this.e = new FC();
        try {
            AbstractC6789rA1.g("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + AbstractC0277Dh1.e + "]");
            Context context = kq.a;
            Looper looper = kq.h;
            this.f = context.getApplicationContext();
            M71 m71 = kq.b;
            this.r = new C8323zE(m71);
            this.q1 = kq.i;
            this.a0 = kq.j;
            this.X = kq.k;
            this.c0 = false;
            this.E = kq.s;
            UQ uq = new UQ(this);
            this.y = uq;
            this.z = new VQ();
            Handler handler = new Handler(looper);
            AbstractC0038Ag[] abstractC0038AgArrM = ((X11) kq.c.b).m(handler, uq, uq, uq, uq);
            this.h = abstractC0038AgArrM;
            YN1.f(abstractC0038AgArrM.length > 0);
            this.i = (AbstractC6715qn0) kq.e.get();
            this.t = (InterfaceC0191Cf) kq.g.get();
            this.q = kq.l;
            this.K = kq.m;
            this.u = kq.n;
            this.v = kq.o;
            this.w = kq.p;
            this.s = looper;
            this.x = m71;
            this.g = this;
            this.m = new C1607Uj0(looper, m71, new QQ(this));
            this.n = new CopyOnWriteArraySet();
            this.p = new ArrayList();
            this.L = new C8280z01();
            this.M = LQ.a;
            this.c = new C2359bc1(new ZQ0[abstractC0038AgArrM.length], new InterfaceC5311jR[abstractC0038AgArrM.length], C3615ec1.b, (C4271i3) null);
            this.o = new C0022Aa1();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i = 0; i < 20; i++) {
                int i2 = iArr[i];
                YN1.f(!false);
                sparseBooleanArray.append(i2, true);
            }
            this.i.getClass();
            YN1.f(!false);
            sparseBooleanArray.append(29, true);
            YN1.f(!false);
            VV vv = new VV(sparseBooleanArray);
            this.d = new EB0(vv);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i3 = 0; i3 < vv.a.size(); i3++) {
                int iA = vv.a(i3);
                YN1.f(!false);
                sparseBooleanArray2.append(iA, true);
            }
            YN1.f(!false);
            sparseBooleanArray2.append(4, true);
            YN1.f(!false);
            sparseBooleanArray2.append(10, true);
            YN1.f(!false);
            this.N = new EB0(new VV(sparseBooleanArray2));
            this.j = this.x.a(this.s, null);
            QQ qq = new QQ(this);
            this.k = qq;
            this.u1 = BB0.i(this.c);
            this.r.R(this.g, this.s);
            int i4 = AbstractC0277Dh1.a;
            String str = kq.v;
            this.l = new C3390dR(this.h, this.i, this.c, (C3357dG) kq.f.get(), this.t, this.F, this.G, this.r, this.K, kq.q, kq.r, this.s, this.x, qq, i4 < 31 ? new NB0(str) : TQ.a(this.f, this, kq.t, str), this.M);
            this.b0 = 1.0f;
            this.F = 0;
            C7484up0 c7484up0 = C7484up0.A;
            this.O = c7484up0;
            this.t1 = c7484up0;
            this.v1 = -1;
            if (i4 < 21) {
                AudioTrack audioTrack = this.Q;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.Q.release();
                    this.Q = null;
                }
                if (this.Q == null) {
                    this.Q = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.Z = this.Q.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.f.getSystemService("audio");
                this.Z = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            }
            int i5 = C7554vB.b;
            this.d0 = true;
            C8323zE c8323zE = this.r;
            c8323zE.getClass();
            this.m.a(c8323zE);
            InterfaceC0191Cf interfaceC0191Cf = this.t;
            Handler handler2 = new Handler(this.s);
            C8323zE c8323zE2 = this.r;
            PE pe = (PE) interfaceC0191Cf;
            pe.getClass();
            c8323zE2.getClass();
            QQ0 qq0 = pe.b;
            qq0.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) qq0.a;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C0035Af c0035Af = (C0035Af) it.next();
                if (c0035Af.b == c8323zE2) {
                    c0035Af.c = true;
                    copyOnWriteArrayList.remove(c0035Af);
                }
            }
            copyOnWriteArrayList.add(new C0035Af(handler2, c8323zE2));
            this.n.add(this.y);
            X11 x11 = new X11(context, handler, this.y);
            this.A = x11;
            x11.r();
            C5720la c5720la = new C5720la(context, handler, this.y);
            this.B = c5720la;
            c5720la.b(null);
            C6518pl0 c6518pl0 = new C6518pl0(23);
            context.getApplicationContext();
            this.C = c6518pl0;
            this.D = new C0162Bv0(context);
            C7950xG0 c7950xG0 = new C7950xG0(3);
            c7950xG0.b = 0;
            c7950xG0.c = 0;
            new C6624qJ(c7950xG0);
            this.s1 = C1530Tj1.e;
            this.Y = C2058a21.c;
            this.i.b(this.a0);
            U1(1, 10, Integer.valueOf(this.Z));
            U1(2, 10, Integer.valueOf(this.Z));
            U1(1, 3, this.a0);
            U1(2, 4, Integer.valueOf(this.X));
            U1(2, 5, 0);
            U1(1, 9, Boolean.valueOf(this.c0));
            U1(2, 7, this.z);
            U1(6, 8, this.z);
            U1(-1, 16, Integer.valueOf(this.q1));
            this.e.g();
        } catch (Throwable th) {
            this.e.g();
            throw th;
        }
    }

    public static long L1(BB0 bb0) {
        C0100Ba1 c0100Ba1 = new C0100Ba1();
        C0022Aa1 c0022Aa1 = new C0022Aa1();
        bb0.a.g(bb0.b.a, c0022Aa1);
        long j = bb0.c;
        if (j != -9223372036854775807L) {
            return c0022Aa1.e + j;
        }
        return bb0.a.m(c0022Aa1.c, c0100Ba1, 0L).l;
    }

    public final long A1(BB0 bb0) {
        if (!bb0.b.b()) {
            return AbstractC0277Dh1.d0(F1(bb0));
        }
        Object obj = bb0.b.a;
        AbstractC0178Ca1 abstractC0178Ca1 = bb0.a;
        C0022Aa1 c0022Aa1 = this.o;
        abstractC0178Ca1.g(obj, c0022Aa1);
        long j = bb0.c;
        return j == -9223372036854775807L ? AbstractC0277Dh1.d0(abstractC0178Ca1.m(H1(bb0), (C0100Ba1) this.b, 0L).l) : AbstractC0277Dh1.d0(c0022Aa1.e) + AbstractC0277Dh1.d0(j);
    }

    public final int B1() {
        g2();
        if (M1()) {
            return this.u1.b.b;
        }
        return -1;
    }

    public final int C1() {
        g2();
        if (M1()) {
            return this.u1.b.c;
        }
        return -1;
    }

    public final int D1() {
        g2();
        int iH1 = H1(this.u1);
        if (iH1 == -1) {
            return 0;
        }
        return iH1;
    }

    public final long E1() {
        g2();
        return AbstractC0277Dh1.d0(F1(this.u1));
    }

    public final long F1(BB0 bb0) {
        if (bb0.a.p()) {
            return AbstractC0277Dh1.Q(this.w1);
        }
        long j = bb0.p ? bb0.j() : bb0.s;
        if (bb0.b.b()) {
            return j;
        }
        AbstractC0178Ca1 abstractC0178Ca1 = bb0.a;
        Object obj = bb0.b.a;
        C0022Aa1 c0022Aa1 = this.o;
        abstractC0178Ca1.g(obj, c0022Aa1);
        return j + c0022Aa1.e;
    }

    public final AbstractC0178Ca1 G1() {
        g2();
        return this.u1.a;
    }

    public final int H1(BB0 bb0) {
        if (bb0.a.p()) {
            return this.v1;
        }
        return bb0.a.g(bb0.b.a, this.o).c;
    }

    public final long I1() {
        g2();
        if (!M1()) {
            AbstractC0178Ca1 abstractC0178Ca1G1 = G1();
            if (abstractC0178Ca1G1.p()) {
                return -9223372036854775807L;
            }
            return AbstractC0277Dh1.d0(abstractC0178Ca1G1.m(D1(), (C0100Ba1) this.b, 0L).m);
        }
        BB0 bb0 = this.u1;
        C0456Fp0 c0456Fp0 = bb0.b;
        AbstractC0178Ca1 abstractC0178Ca1 = bb0.a;
        Object obj = c0456Fp0.a;
        C0022Aa1 c0022Aa1 = this.o;
        abstractC0178Ca1.g(obj, c0022Aa1);
        return AbstractC0277Dh1.d0(c0022Aa1.a(c0456Fp0.b, c0456Fp0.c));
    }

    public final boolean J1() {
        g2();
        return this.u1.l;
    }

    public final int K1() {
        g2();
        return this.u1.e;
    }

    public final boolean M1() {
        g2();
        return this.u1.b.b();
    }

    public final BB0 N1(BB0 bb0, AbstractC0178Ca1 abstractC0178Ca1, Pair pair) {
        List list;
        YN1.c(abstractC0178Ca1.p() || pair != null);
        AbstractC0178Ca1 abstractC0178Ca12 = bb0.a;
        long jA1 = A1(bb0);
        BB0 bb0H = bb0.h(abstractC0178Ca1);
        if (abstractC0178Ca1.p()) {
            C0456Fp0 c0456Fp0 = BB0.u;
            long jQ = AbstractC0277Dh1.Q(this.w1);
            BB0 bb0B = bb0H.c(c0456Fp0, jQ, jQ, jQ, 0L, C1350Rb1.d, this.c, C3769fQ0.e).b(c0456Fp0);
            bb0B.q = bb0B.s;
            return bb0B;
        }
        Object obj = bb0H.b.a;
        boolean zEquals = obj.equals(pair.first);
        C0456Fp0 c0456Fp02 = !zEquals ? new C0456Fp0(pair.first) : bb0H.b;
        long jLongValue = ((Long) pair.second).longValue();
        long jQ2 = AbstractC0277Dh1.Q(jA1);
        if (!abstractC0178Ca12.p()) {
            jQ2 -= abstractC0178Ca12.g(obj, this.o).e;
        }
        if (!zEquals || jLongValue < jQ2) {
            YN1.f(!c0456Fp02.b());
            C1350Rb1 c1350Rb1 = !zEquals ? C1350Rb1.d : bb0H.h;
            C2359bc1 c2359bc1 = !zEquals ? this.c : bb0H.i;
            if (zEquals) {
                list = bb0H.j;
            } else {
                N70 n70 = P70.b;
                list = C3769fQ0.e;
            }
            BB0 bb0B2 = bb0H.c(c0456Fp02, jLongValue, jLongValue, jLongValue, 0L, c1350Rb1, c2359bc1, list).b(c0456Fp02);
            bb0B2.q = jLongValue;
            return bb0B2;
        }
        if (jLongValue != jQ2) {
            YN1.f(!c0456Fp02.b());
            long jMax = Math.max(0L, bb0H.r - (jLongValue - jQ2));
            long j = bb0H.q;
            if (bb0H.k.equals(bb0H.b)) {
                j = jLongValue + jMax;
            }
            BB0 bb0C = bb0H.c(c0456Fp02, jLongValue, jLongValue, jLongValue, jMax, bb0H.h, bb0H.i, bb0H.j);
            bb0C.q = j;
            return bb0C;
        }
        int iB = abstractC0178Ca1.b(bb0H.k.a);
        if (iB != -1 && abstractC0178Ca1.f(iB, this.o, false).c == abstractC0178Ca1.g(c0456Fp02.a, this.o).c) {
            return bb0H;
        }
        abstractC0178Ca1.g(c0456Fp02.a, this.o);
        long jA = c0456Fp02.b() ? this.o.a(c0456Fp02.b, c0456Fp02.c) : this.o.d;
        BB0 bb0B3 = bb0H.c(c0456Fp02, bb0H.s, bb0H.s, bb0H.d, jA - bb0H.s, bb0H.h, bb0H.i, bb0H.j).b(c0456Fp02);
        bb0B3.q = jA;
        return bb0B3;
    }

    public final Pair O1(AbstractC0178Ca1 abstractC0178Ca1, int i, long j) {
        if (abstractC0178Ca1.p()) {
            this.v1 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.w1 = j;
            return null;
        }
        if (i == -1 || i >= abstractC0178Ca1.o()) {
            i = abstractC0178Ca1.a(this.G);
            j = AbstractC0277Dh1.d0(abstractC0178Ca1.m(i, (C0100Ba1) this.b, 0L).l);
        }
        return abstractC0178Ca1.i((C0100Ba1) this.b, this.o, i, AbstractC0277Dh1.Q(j));
    }

    public final void P1(final int i, final int i2) {
        C2058a21 c2058a21 = this.Y;
        if (i == c2058a21.a && i2 == c2058a21.b) {
            return;
        }
        this.Y = new C2058a21(i, i2);
        this.m.f(24, new InterfaceC1373Rj0() { // from class: OQ
            @Override // defpackage.InterfaceC1373Rj0
            public final void invoke(Object obj) {
                ((GB0) obj).H(i, i2);
            }
        });
        U1(2, 14, new C2058a21(i, i2));
    }

    public final void Q1() {
        g2();
        boolean zJ1 = J1();
        int iD = this.B.d(2, zJ1);
        d2(iD, iD == -1 ? 2 : 1, zJ1);
        BB0 bb0 = this.u1;
        if (bb0.e != 1) {
            return;
        }
        BB0 bb0E = bb0.e(null);
        BB0 bb0G = bb0E.g(bb0E.a.p() ? 4 : 2);
        this.H++;
        R71 r71 = this.l.h;
        r71.getClass();
        Q71 q71B = R71.b();
        q71B.a = r71.a.obtainMessage(29);
        q71B.b();
        e2(bb0G, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void R1(GB0 gb0) {
        g2();
        gb0.getClass();
        this.m.e(gb0);
    }

    public final void S1(int i) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            this.p.remove(i2);
        }
        C8280z01 c8280z01 = this.L;
        int[] iArr = c8280z01.b;
        int[] iArr2 = new int[iArr.length - i];
        int i3 = 0;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 < 0 || i5 >= i) {
                int i6 = i4 - i3;
                if (i5 >= 0) {
                    i5 -= i;
                }
                iArr2[i6] = i5;
            } else {
                i3++;
            }
        }
        this.L = new C8280z01(iArr2, new Random(c8280z01.a.nextLong()));
    }

    public final void T1() {
        C5813m31 c5813m31 = this.U;
        UQ uq = this.y;
        if (c5813m31 != null) {
            QB0 qb0Y1 = y1(this.z);
            YN1.f(!qb0Y1.g);
            qb0Y1.d = 10000;
            YN1.f(!qb0Y1.g);
            qb0Y1.e = null;
            qb0Y1.c();
            this.U.a.remove(uq);
            this.U = null;
        }
        TextureView textureView = this.W;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != uq) {
                AbstractC6789rA1.h("SurfaceTextureListener already unset or replaced.");
            } else {
                this.W.setSurfaceTextureListener(null);
            }
            this.W = null;
        }
        SurfaceHolder surfaceHolder = this.T;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(uq);
            this.T = null;
        }
    }

    public final void U1(int i, int i2, Object obj) {
        for (AbstractC0038Ag abstractC0038Ag : this.h) {
            if (i == -1 || abstractC0038Ag.b == i) {
                QB0 qb0Y1 = y1(abstractC0038Ag);
                YN1.f(!qb0Y1.g);
                qb0Y1.d = i2;
                YN1.f(!qb0Y1.g);
                qb0Y1.e = obj;
                qb0Y1.c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V1(java.util.List r17, int r18, long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.XQ.V1(java.util.List, int, long, boolean):void");
    }

    public final void W1(boolean z) {
        g2();
        int iD = this.B.d(K1(), z);
        d2(iD, iD == -1 ? 2 : 1, z);
    }

    public final void X1(CB0 cb0) {
        g2();
        if (this.u1.o.equals(cb0)) {
            return;
        }
        BB0 bb0F = this.u1.f(cb0);
        this.H++;
        this.l.h.a(4, cb0).b();
        e2(bb0F, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void Y1(final int i) {
        g2();
        if (this.F != i) {
            this.F = i;
            R71 r71 = this.l.h;
            r71.getClass();
            Q71 q71B = R71.b();
            q71B.a = r71.a.obtainMessage(11, i, 0);
            q71B.b();
            InterfaceC1373Rj0 interfaceC1373Rj0 = new InterfaceC1373Rj0() { // from class: PQ
                @Override // defpackage.InterfaceC1373Rj0
                public final void invoke(Object obj) {
                    ((GB0) obj).w(i);
                }
            };
            C1607Uj0 c1607Uj0 = this.m;
            c1607Uj0.c(8, interfaceC1373Rj0);
            c2();
            c1607Uj0.b();
        }
    }

    public final void Z1(Surface surface) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (AbstractC0038Ag abstractC0038Ag : this.h) {
            if (abstractC0038Ag.b == 2) {
                QB0 qb0Y1 = y1(abstractC0038Ag);
                YN1.f(!qb0Y1.g);
                qb0Y1.d = 1;
                YN1.f(true ^ qb0Y1.g);
                qb0Y1.e = surface;
                qb0Y1.c();
                arrayList.add(qb0Y1);
            }
        }
        Surface surface2 = this.R;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((QB0) it.next()).a(this.E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Surface surface3 = this.R;
            Surface surface4 = this.S;
            if (surface3 == surface4) {
                surface4.release();
                this.S = null;
            }
        }
        this.R = surface;
        if (z) {
            b2(new IQ(2, new C7074sg("Detaching surface timed out."), 1003));
        }
    }

    public final void a2(float f) {
        g2();
        final float fI = AbstractC0277Dh1.i(f, 0.0f, 1.0f);
        if (this.b0 == fI) {
            return;
        }
        this.b0 = fI;
        U1(1, 2, Float.valueOf(this.B.g * fI));
        this.m.f(22, new InterfaceC1373Rj0() { // from class: NQ
            @Override // defpackage.InterfaceC1373Rj0
            public final void invoke(Object obj) {
                ((GB0) obj).i(fI);
            }
        });
    }

    public final void b2(IQ iq) {
        BB0 bb0 = this.u1;
        BB0 bb0B = bb0.b(bb0.b);
        bb0B.q = bb0B.s;
        bb0B.r = 0L;
        BB0 bb0G = bb0B.g(1);
        if (iq != null) {
            bb0G = bb0G.e(iq);
        }
        BB0 bb02 = bb0G;
        this.H++;
        R71 r71 = this.l.h;
        r71.getClass();
        Q71 q71B = R71.b();
        q71B.a = r71.a.obtainMessage(6);
        q71B.b();
        e2(bb02, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void c2() {
        int iK;
        int iE;
        EB0 eb0 = this.N;
        int i = AbstractC0277Dh1.a;
        XQ xq = (XQ) this.g;
        boolean zM1 = xq.M1();
        boolean zL1 = xq.l1();
        AbstractC0178Ca1 abstractC0178Ca1G1 = xq.G1();
        if (abstractC0178Ca1G1.p()) {
            iK = -1;
        } else {
            int iD1 = xq.D1();
            xq.g2();
            int i2 = xq.F;
            if (i2 == 1) {
                i2 = 0;
            }
            xq.g2();
            iK = abstractC0178Ca1G1.k(iD1, i2, xq.G);
        }
        boolean z = iK != -1;
        AbstractC0178Ca1 abstractC0178Ca1G12 = xq.G1();
        if (abstractC0178Ca1G12.p()) {
            iE = -1;
        } else {
            int iD12 = xq.D1();
            xq.g2();
            int i3 = xq.F;
            if (i3 == 1) {
                i3 = 0;
            }
            xq.g2();
            iE = abstractC0178Ca1G12.e(iD12, i3, xq.G);
        }
        boolean z2 = iE != -1;
        boolean zK1 = xq.k1();
        boolean zJ1 = xq.j1();
        boolean zP = xq.G1().p();
        C0136Bm1 c0136Bm1 = new C0136Bm1(26);
        VV vv = this.d.a;
        C1135Oi c1135Oi = (C1135Oi) c0136Bm1.b;
        c1135Oi.getClass();
        for (int i4 = 0; i4 < vv.a.size(); i4++) {
            c1135Oi.e(vv.a(i4));
        }
        boolean z3 = !zM1;
        c0136Bm1.o(4, z3);
        c0136Bm1.o(5, zL1 && !zM1);
        c0136Bm1.o(6, z && !zM1);
        c0136Bm1.o(7, !zP && (z || !zK1 || zL1) && !zM1);
        c0136Bm1.o(8, z2 && !zM1);
        c0136Bm1.o(9, !zP && (z2 || (zK1 && zJ1)) && !zM1);
        c0136Bm1.o(10, z3);
        c0136Bm1.o(11, zL1 && !zM1);
        c0136Bm1.o(12, zL1 && !zM1);
        EB0 eb02 = new EB0(c1135Oi.g());
        this.N = eb02;
        if (eb02.equals(eb0)) {
            return;
        }
        this.m.c(13, new QQ(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    public final void d2(int i, int i2, boolean z) {
        ?? r14 = (!z || i == -1) ? 0 : 1;
        int i3 = i == 0 ? 1 : 0;
        BB0 bb0 = this.u1;
        if (bb0.l == r14 && bb0.n == i3 && bb0.m == i2) {
            return;
        }
        this.H++;
        BB0 bb02 = this.u1;
        boolean z2 = bb02.p;
        BB0 bb0A = bb02;
        if (z2) {
            bb0A = bb02.a();
        }
        BB0 bb0D = bb0A.d(i2, i3, r14);
        int i4 = (i3 << 4) | i2;
        R71 r71 = this.l.h;
        r71.getClass();
        Q71 q71B = R71.b();
        q71B.a = r71.a.obtainMessage(1, r14, i4);
        q71B.b();
        e2(bb0D, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void e2(final BB0 bb0, int i, boolean z, int i2, long j, int i3, boolean z2) {
        Pair pair;
        int i4;
        C6721qp0 c6721qp0;
        boolean z3;
        boolean z4;
        int i5;
        Object obj;
        C6721qp0 c6721qp02;
        Object obj2;
        int i6;
        long j2;
        long j3;
        long jL1;
        long jL12;
        Object obj3;
        C6721qp0 c6721qp03;
        Object obj4;
        int i7;
        BB0 bb02 = this.u1;
        this.u1 = bb0;
        boolean zEquals = bb02.a.equals(bb0.a);
        AbstractC0178Ca1 abstractC0178Ca1 = bb02.a;
        AbstractC0178Ca1 abstractC0178Ca12 = bb0.a;
        if (abstractC0178Ca12.p() && abstractC0178Ca1.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (abstractC0178Ca12.p() != abstractC0178Ca1.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            C0456Fp0 c0456Fp0 = bb02.b;
            Object obj5 = c0456Fp0.a;
            C0022Aa1 c0022Aa1 = this.o;
            int i8 = abstractC0178Ca1.g(obj5, c0022Aa1).c;
            C0100Ba1 c0100Ba1 = (C0100Ba1) this.b;
            Object obj6 = abstractC0178Ca1.m(i8, c0100Ba1, 0L).a;
            C0456Fp0 c0456Fp02 = bb0.b;
            if (obj6.equals(abstractC0178Ca12.m(abstractC0178Ca12.g(c0456Fp02.a, c0022Aa1).c, c0100Ba1, 0L).a)) {
                pair = (z && i2 == 0 && c0456Fp0.d < c0456Fp02.d) ? new Pair(Boolean.TRUE, 0) : (z && i2 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
            } else {
                if (z && i2 == 0) {
                    i4 = 1;
                } else if (z && i2 == 1) {
                    i4 = 2;
                } else {
                    if (zEquals) {
                        throw new IllegalStateException();
                    }
                    i4 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
            }
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            c6721qp0 = !bb0.a.p() ? bb0.a.m(bb0.a.g(bb0.b.a, this.o).c, (C0100Ba1) this.b, 0L).c : null;
            this.t1 = C7484up0.A;
        } else {
            c6721qp0 = null;
        }
        if (zBooleanValue || !bb02.j.equals(bb0.j)) {
            C7293tp0 c7293tp0A = this.t1.a();
            List list = bb0.j;
            for (int i9 = 0; i9 < list.size(); i9++) {
                C0540Gr0 c0540Gr0 = (C0540Gr0) list.get(i9);
                int i10 = 0;
                while (true) {
                    InterfaceC0384Er0[] interfaceC0384Er0Arr = c0540Gr0.a;
                    if (i10 < interfaceC0384Er0Arr.length) {
                        interfaceC0384Er0Arr[i10].d0(c7293tp0A);
                        i10++;
                    }
                }
            }
            this.t1 = new C7484up0(c7293tp0A);
        }
        C7484up0 c7484up0W1 = w1();
        boolean zEquals2 = c7484up0W1.equals(this.O);
        this.O = c7484up0W1;
        boolean z5 = bb02.l != bb0.l;
        boolean z6 = bb02.e != bb0.e;
        if (z6 || z5) {
            f2();
        }
        boolean z7 = bb02.g != bb0.g;
        if (!zEquals) {
            this.m.c(0, new C0991Mm(bb0, i, 2));
        }
        if (z) {
            C0022Aa1 c0022Aa12 = new C0022Aa1();
            if (bb02.a.p()) {
                z3 = z6;
                z4 = z7;
                i5 = i3;
                obj = null;
                c6721qp02 = null;
                obj2 = null;
                i6 = -1;
            } else {
                Object obj7 = bb02.b.a;
                bb02.a.g(obj7, c0022Aa12);
                int i11 = c0022Aa12.c;
                int iB = bb02.a.b(obj7);
                z3 = z6;
                z4 = z7;
                obj = bb02.a.m(i11, (C0100Ba1) this.b, 0L).a;
                c6721qp02 = ((C0100Ba1) this.b).c;
                i5 = i11;
                i6 = iB;
                obj2 = obj7;
            }
            if (i2 == 0) {
                if (bb02.b.b()) {
                    C0456Fp0 c0456Fp03 = bb02.b;
                    jL1 = c0022Aa12.a(c0456Fp03.b, c0456Fp03.c);
                    jL12 = L1(bb02);
                } else if (bb02.b.e != -1) {
                    jL1 = L1(this.u1);
                    jL12 = jL1;
                } else {
                    j2 = c0022Aa12.e;
                    j3 = c0022Aa12.d;
                    jL1 = j2 + j3;
                    jL12 = jL1;
                }
            } else if (bb02.b.b()) {
                jL1 = bb02.s;
                jL12 = L1(bb02);
            } else {
                j2 = c0022Aa12.e;
                j3 = bb02.s;
                jL1 = j2 + j3;
                jL12 = jL1;
            }
            long jD0 = AbstractC0277Dh1.d0(jL1);
            long jD02 = AbstractC0277Dh1.d0(jL12);
            C0456Fp0 c0456Fp04 = bb02.b;
            HB0 hb0 = new HB0(obj, i5, c6721qp02, obj2, i6, jD0, jD02, c0456Fp04.b, c0456Fp04.c);
            int iD1 = D1();
            if (this.u1.a.p()) {
                obj3 = null;
                c6721qp03 = null;
                obj4 = null;
                i7 = -1;
            } else {
                BB0 bb03 = this.u1;
                Object obj8 = bb03.b.a;
                bb03.a.g(obj8, this.o);
                int iB2 = this.u1.a.b(obj8);
                AbstractC0178Ca1 abstractC0178Ca13 = this.u1.a;
                C0100Ba1 c0100Ba12 = (C0100Ba1) this.b;
                i7 = iB2;
                obj3 = abstractC0178Ca13.m(iD1, c0100Ba12, 0L).a;
                c6721qp03 = c0100Ba12.c;
                obj4 = obj8;
            }
            long jD03 = AbstractC0277Dh1.d0(j);
            long jD04 = this.u1.b.b() ? AbstractC0277Dh1.d0(L1(this.u1)) : jD03;
            C0456Fp0 c0456Fp05 = this.u1.b;
            this.m.c(11, new C1069Nm(i2, hb0, new HB0(obj3, iD1, c6721qp03, obj4, i7, jD03, jD04, c0456Fp05.b, c0456Fp05.c)));
        } else {
            z3 = z6;
            z4 = z7;
        }
        if (zBooleanValue) {
            this.m.c(1, new C0991Mm(c6721qp0, iIntValue, 3));
        }
        if (bb02.f != bb0.f) {
            final int i12 = 7;
            this.m.c(10, new InterfaceC1373Rj0() { // from class: MQ
                @Override // defpackage.InterfaceC1373Rj0
                public final void invoke(Object obj9) {
                    GB0 gb0 = (GB0) obj9;
                    switch (i12) {
                        case 0:
                            BB0 bb04 = bb0;
                            boolean z8 = bb04.g;
                            gb0.getClass();
                            gb0.g(bb04.g);
                            break;
                        case 1:
                            BB0 bb05 = bb0;
                            gb0.B(bb05.e, bb05.l);
                            break;
                        case 2:
                            gb0.j(bb0.e);
                            break;
                        case 3:
                            BB0 bb06 = bb0;
                            gb0.h(bb06.m, bb06.l);
                            break;
                        case 4:
                            gb0.a(bb0.n);
                            break;
                        case 5:
                            gb0.I(bb0.k());
                            break;
                        case 6:
                            gb0.C(bb0.o);
                            break;
                        case 7:
                            gb0.u(bb0.f);
                            break;
                        case 8:
                            gb0.x(bb0.f);
                            break;
                        default:
                            gb0.p((C3615ec1) bb0.i.d);
                            break;
                    }
                }
            });
            if (bb0.f != null) {
                final int i13 = 8;
                this.m.c(10, new InterfaceC1373Rj0() { // from class: MQ
                    @Override // defpackage.InterfaceC1373Rj0
                    public final void invoke(Object obj9) {
                        GB0 gb0 = (GB0) obj9;
                        switch (i13) {
                            case 0:
                                BB0 bb04 = bb0;
                                boolean z8 = bb04.g;
                                gb0.getClass();
                                gb0.g(bb04.g);
                                break;
                            case 1:
                                BB0 bb05 = bb0;
                                gb0.B(bb05.e, bb05.l);
                                break;
                            case 2:
                                gb0.j(bb0.e);
                                break;
                            case 3:
                                BB0 bb06 = bb0;
                                gb0.h(bb06.m, bb06.l);
                                break;
                            case 4:
                                gb0.a(bb0.n);
                                break;
                            case 5:
                                gb0.I(bb0.k());
                                break;
                            case 6:
                                gb0.C(bb0.o);
                                break;
                            case 7:
                                gb0.u(bb0.f);
                                break;
                            case 8:
                                gb0.x(bb0.f);
                                break;
                            default:
                                gb0.p((C3615ec1) bb0.i.d);
                                break;
                        }
                    }
                });
            }
        }
        C2359bc1 c2359bc1 = bb02.i;
        C2359bc1 c2359bc12 = bb0.i;
        if (c2359bc1 != c2359bc12) {
            AbstractC6715qn0 abstractC6715qn0 = this.i;
            C4271i3 c4271i3 = (C4271i3) c2359bc12.e;
            abstractC6715qn0.getClass();
            abstractC6715qn0.c = c4271i3;
            final int i14 = 9;
            this.m.c(2, new InterfaceC1373Rj0() { // from class: MQ
                @Override // defpackage.InterfaceC1373Rj0
                public final void invoke(Object obj9) {
                    GB0 gb0 = (GB0) obj9;
                    switch (i14) {
                        case 0:
                            BB0 bb04 = bb0;
                            boolean z8 = bb04.g;
                            gb0.getClass();
                            gb0.g(bb04.g);
                            break;
                        case 1:
                            BB0 bb05 = bb0;
                            gb0.B(bb05.e, bb05.l);
                            break;
                        case 2:
                            gb0.j(bb0.e);
                            break;
                        case 3:
                            BB0 bb06 = bb0;
                            gb0.h(bb06.m, bb06.l);
                            break;
                        case 4:
                            gb0.a(bb0.n);
                            break;
                        case 5:
                            gb0.I(bb0.k());
                            break;
                        case 6:
                            gb0.C(bb0.o);
                            break;
                        case 7:
                            gb0.u(bb0.f);
                            break;
                        case 8:
                            gb0.x(bb0.f);
                            break;
                        default:
                            gb0.p((C3615ec1) bb0.i.d);
                            break;
                    }
                }
            });
        }
        if (!zEquals2) {
            this.m.c(14, new EE(5, this.O));
        }
        if (z4) {
            final int i15 = 0;
            this.m.c(3, new InterfaceC1373Rj0() { // from class: MQ
                @Override // defpackage.InterfaceC1373Rj0
                public final void invoke(Object obj9) {
                    GB0 gb0 = (GB0) obj9;
                    switch (i15) {
                        case 0:
                            BB0 bb04 = bb0;
                            boolean z8 = bb04.g;
                            gb0.getClass();
                            gb0.g(bb04.g);
                            break;
                        case 1:
                            BB0 bb05 = bb0;
                            gb0.B(bb05.e, bb05.l);
                            break;
                        case 2:
                            gb0.j(bb0.e);
                            break;
                        case 3:
                            BB0 bb06 = bb0;
                            gb0.h(bb06.m, bb06.l);
                            break;
                        case 4:
                            gb0.a(bb0.n);
                            break;
                        case 5:
                            gb0.I(bb0.k());
                            break;
                        case 6:
                            gb0.C(bb0.o);
                            break;
                        case 7:
                            gb0.u(bb0.f);
                            break;
                        case 8:
                            gb0.x(bb0.f);
                            break;
                        default:
                            gb0.p((C3615ec1) bb0.i.d);
                            break;
                    }
                }
            });
        }
        if (z3 || z5) {
            final int i16 = 1;
            this.m.c(-1, new InterfaceC1373Rj0() { // from class: MQ
                @Override // defpackage.InterfaceC1373Rj0
                public final void invoke(Object obj9) {
                    GB0 gb0 = (GB0) obj9;
                    switch (i16) {
                        case 0:
                            BB0 bb04 = bb0;
                            boolean z8 = bb04.g;
                            gb0.getClass();
                            gb0.g(bb04.g);
                            break;
                        case 1:
                            BB0 bb05 = bb0;
                            gb0.B(bb05.e, bb05.l);
                            break;
                        case 2:
                            gb0.j(bb0.e);
                            break;
                        case 3:
                            BB0 bb06 = bb0;
                            gb0.h(bb06.m, bb06.l);
                            break;
                        case 4:
                            gb0.a(bb0.n);
                            break;
                        case 5:
                            gb0.I(bb0.k());
                            break;
                        case 6:
                            gb0.C(bb0.o);
                            break;
                        case 7:
                            gb0.u(bb0.f);
                            break;
                        case 8:
                            gb0.x(bb0.f);
                            break;
                        default:
                            gb0.p((C3615ec1) bb0.i.d);
                            break;
                    }
                }
            });
        }
        if (z3) {
            final int i17 = 2;
            this.m.c(4, new InterfaceC1373Rj0() { // from class: MQ
                @Override // defpackage.InterfaceC1373Rj0
                public final void invoke(Object obj9) {
                    GB0 gb0 = (GB0) obj9;
                    switch (i17) {
                        case 0:
                            BB0 bb04 = bb0;
                            boolean z8 = bb04.g;
                            gb0.getClass();
                            gb0.g(bb04.g);
                            break;
                        case 1:
                            BB0 bb05 = bb0;
                            gb0.B(bb05.e, bb05.l);
                            break;
                        case 2:
                            gb0.j(bb0.e);
                            break;
                        case 3:
                            BB0 bb06 = bb0;
                            gb0.h(bb06.m, bb06.l);
                            break;
                        case 4:
                            gb0.a(bb0.n);
                            break;
                        case 5:
                            gb0.I(bb0.k());
                            break;
                        case 6:
                            gb0.C(bb0.o);
                            break;
                        case 7:
                            gb0.u(bb0.f);
                            break;
                        case 8:
                            gb0.x(bb0.f);
                            break;
                        default:
                            gb0.p((C3615ec1) bb0.i.d);
                            break;
                    }
                }
            });
        }
        if (z5 || bb02.m != bb0.m) {
            final int i18 = 3;
            this.m.c(5, new InterfaceC1373Rj0() { // from class: MQ
                @Override // defpackage.InterfaceC1373Rj0
                public final void invoke(Object obj9) {
                    GB0 gb0 = (GB0) obj9;
                    switch (i18) {
                        case 0:
                            BB0 bb04 = bb0;
                            boolean z8 = bb04.g;
                            gb0.getClass();
                            gb0.g(bb04.g);
                            break;
                        case 1:
                            BB0 bb05 = bb0;
                            gb0.B(bb05.e, bb05.l);
                            break;
                        case 2:
                            gb0.j(bb0.e);
                            break;
                        case 3:
                            BB0 bb06 = bb0;
                            gb0.h(bb06.m, bb06.l);
                            break;
                        case 4:
                            gb0.a(bb0.n);
                            break;
                        case 5:
                            gb0.I(bb0.k());
                            break;
                        case 6:
                            gb0.C(bb0.o);
                            break;
                        case 7:
                            gb0.u(bb0.f);
                            break;
                        case 8:
                            gb0.x(bb0.f);
                            break;
                        default:
                            gb0.p((C3615ec1) bb0.i.d);
                            break;
                    }
                }
            });
        }
        if (bb02.n != bb0.n) {
            final int i19 = 4;
            this.m.c(6, new InterfaceC1373Rj0() { // from class: MQ
                @Override // defpackage.InterfaceC1373Rj0
                public final void invoke(Object obj9) {
                    GB0 gb0 = (GB0) obj9;
                    switch (i19) {
                        case 0:
                            BB0 bb04 = bb0;
                            boolean z8 = bb04.g;
                            gb0.getClass();
                            gb0.g(bb04.g);
                            break;
                        case 1:
                            BB0 bb05 = bb0;
                            gb0.B(bb05.e, bb05.l);
                            break;
                        case 2:
                            gb0.j(bb0.e);
                            break;
                        case 3:
                            BB0 bb06 = bb0;
                            gb0.h(bb06.m, bb06.l);
                            break;
                        case 4:
                            gb0.a(bb0.n);
                            break;
                        case 5:
                            gb0.I(bb0.k());
                            break;
                        case 6:
                            gb0.C(bb0.o);
                            break;
                        case 7:
                            gb0.u(bb0.f);
                            break;
                        case 8:
                            gb0.x(bb0.f);
                            break;
                        default:
                            gb0.p((C3615ec1) bb0.i.d);
                            break;
                    }
                }
            });
        }
        if (bb02.k() != bb0.k()) {
            final int i20 = 5;
            this.m.c(7, new InterfaceC1373Rj0() { // from class: MQ
                @Override // defpackage.InterfaceC1373Rj0
                public final void invoke(Object obj9) {
                    GB0 gb0 = (GB0) obj9;
                    switch (i20) {
                        case 0:
                            BB0 bb04 = bb0;
                            boolean z8 = bb04.g;
                            gb0.getClass();
                            gb0.g(bb04.g);
                            break;
                        case 1:
                            BB0 bb05 = bb0;
                            gb0.B(bb05.e, bb05.l);
                            break;
                        case 2:
                            gb0.j(bb0.e);
                            break;
                        case 3:
                            BB0 bb06 = bb0;
                            gb0.h(bb06.m, bb06.l);
                            break;
                        case 4:
                            gb0.a(bb0.n);
                            break;
                        case 5:
                            gb0.I(bb0.k());
                            break;
                        case 6:
                            gb0.C(bb0.o);
                            break;
                        case 7:
                            gb0.u(bb0.f);
                            break;
                        case 8:
                            gb0.x(bb0.f);
                            break;
                        default:
                            gb0.p((C3615ec1) bb0.i.d);
                            break;
                    }
                }
            });
        }
        if (!bb02.o.equals(bb0.o)) {
            final int i21 = 6;
            this.m.c(12, new InterfaceC1373Rj0() { // from class: MQ
                @Override // defpackage.InterfaceC1373Rj0
                public final void invoke(Object obj9) {
                    GB0 gb0 = (GB0) obj9;
                    switch (i21) {
                        case 0:
                            BB0 bb04 = bb0;
                            boolean z8 = bb04.g;
                            gb0.getClass();
                            gb0.g(bb04.g);
                            break;
                        case 1:
                            BB0 bb05 = bb0;
                            gb0.B(bb05.e, bb05.l);
                            break;
                        case 2:
                            gb0.j(bb0.e);
                            break;
                        case 3:
                            BB0 bb06 = bb0;
                            gb0.h(bb06.m, bb06.l);
                            break;
                        case 4:
                            gb0.a(bb0.n);
                            break;
                        case 5:
                            gb0.I(bb0.k());
                            break;
                        case 6:
                            gb0.C(bb0.o);
                            break;
                        case 7:
                            gb0.u(bb0.f);
                            break;
                        case 8:
                            gb0.x(bb0.f);
                            break;
                        default:
                            gb0.p((C3615ec1) bb0.i.d);
                            break;
                    }
                }
            });
        }
        c2();
        this.m.b();
        if (bb02.p != bb0.p) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                ((UQ) it.next()).a.f2();
            }
        }
    }

    public final void f2() {
        int iK1 = K1();
        C0162Bv0 c0162Bv0 = this.D;
        C6518pl0 c6518pl0 = this.C;
        if (iK1 != 1) {
            if (iK1 == 2 || iK1 == 3) {
                g2();
                boolean z = this.u1.p;
                J1();
                c6518pl0.getClass();
                J1();
                c0162Bv0.getClass();
                return;
            }
            if (iK1 != 4) {
                throw new IllegalStateException();
            }
        }
        c6518pl0.getClass();
        c0162Bv0.getClass();
    }

    public final void g2() {
        FC fc = this.e;
        synchronized (fc) {
            boolean z = false;
            while (!fc.a) {
                try {
                    fc.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.s.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.s.getThread().getName();
            int i = AbstractC0277Dh1.a;
            Locale locale = Locale.US;
            String strX = AbstractC7209tN0.x("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.d0) {
                throw new IllegalStateException(strX);
            }
            AbstractC6789rA1.i(strX, this.e0 ? null : new IllegalStateException());
            this.e0 = true;
        }
    }

    @Override // defpackage.U0
    public final void o1(int i, long j, boolean z) {
        g2();
        if (i == -1) {
            return;
        }
        YN1.c(i >= 0);
        AbstractC0178Ca1 abstractC0178Ca1 = this.u1.a;
        if (abstractC0178Ca1.p() || i < abstractC0178Ca1.o()) {
            C8323zE c8323zE = this.r;
            if (!c8323zE.i) {
                Y3 y3J = c8323zE.J();
                c8323zE.i = true;
                c8323zE.Q(y3J, -1, new C6799rE(y3J, 1));
            }
            this.H++;
            if (M1()) {
                AbstractC6789rA1.h("seekTo ignored because an ad is playing");
                C2133aR c2133aR = new C2133aR(this.u1);
                c2133aR.f(1);
                XQ xq = this.k.a;
                xq.j.c(new RQ(xq, 0, c2133aR));
                return;
            }
            BB0 bb0G = this.u1;
            int i2 = bb0G.e;
            if (i2 == 3 || (i2 == 4 && !abstractC0178Ca1.p())) {
                bb0G = this.u1.g(2);
            }
            int iD1 = D1();
            BB0 bb0N1 = N1(bb0G, abstractC0178Ca1, O1(abstractC0178Ca1, i, j));
            this.l.h.a(3, new C2514cR(abstractC0178Ca1, i, AbstractC0277Dh1.Q(j))).b();
            e2(bb0N1, 0, true, 1, F1(bb0N1), iD1, z);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        g2();
        U1(4, 15, imageOutput);
    }

    public final C7484up0 w1() {
        AbstractC0178Ca1 abstractC0178Ca1G1 = G1();
        if (abstractC0178Ca1G1.p()) {
            return this.t1;
        }
        C6721qp0 c6721qp0 = abstractC0178Ca1G1.m(D1(), (C0100Ba1) this.b, 0L).c;
        C7293tp0 c7293tp0A = this.t1.a();
        C7484up0 c7484up0 = c6721qp0.d;
        if (c7484up0 != null) {
            CharSequence charSequence = c7484up0.a;
            if (charSequence != null) {
                c7293tp0A.a = charSequence;
            }
            CharSequence charSequence2 = c7484up0.b;
            if (charSequence2 != null) {
                c7293tp0A.b = charSequence2;
            }
            CharSequence charSequence3 = c7484up0.c;
            if (charSequence3 != null) {
                c7293tp0A.c = charSequence3;
            }
            CharSequence charSequence4 = c7484up0.d;
            if (charSequence4 != null) {
                c7293tp0A.d = charSequence4;
            }
            CharSequence charSequence5 = c7484up0.e;
            if (charSequence5 != null) {
                c7293tp0A.e = charSequence5;
            }
            CharSequence charSequence6 = c7484up0.f;
            if (charSequence6 != null) {
                c7293tp0A.f = charSequence6;
            }
            byte[] bArr = c7484up0.g;
            Uri uri = c7484up0.i;
            if (uri != null || bArr != null) {
                c7293tp0A.i = uri;
                c7293tp0A.g = bArr == null ? null : (byte[]) bArr.clone();
                c7293tp0A.h = c7484up0.h;
            }
            Integer num = c7484up0.j;
            if (num != null) {
                c7293tp0A.j = num;
            }
            Integer num2 = c7484up0.k;
            if (num2 != null) {
                c7293tp0A.k = num2;
            }
            Integer num3 = c7484up0.l;
            if (num3 != null) {
                c7293tp0A.l = num3;
            }
            Boolean bool = c7484up0.m;
            if (bool != null) {
                c7293tp0A.m = bool;
            }
            Integer num4 = c7484up0.n;
            if (num4 != null) {
                c7293tp0A.n = num4;
            }
            Integer num5 = c7484up0.o;
            if (num5 != null) {
                c7293tp0A.n = num5;
            }
            Integer num6 = c7484up0.p;
            if (num6 != null) {
                c7293tp0A.o = num6;
            }
            Integer num7 = c7484up0.q;
            if (num7 != null) {
                c7293tp0A.p = num7;
            }
            Integer num8 = c7484up0.r;
            if (num8 != null) {
                c7293tp0A.q = num8;
            }
            Integer num9 = c7484up0.s;
            if (num9 != null) {
                c7293tp0A.r = num9;
            }
            Integer num10 = c7484up0.t;
            if (num10 != null) {
                c7293tp0A.s = num10;
            }
            CharSequence charSequence7 = c7484up0.u;
            if (charSequence7 != null) {
                c7293tp0A.t = charSequence7;
            }
            CharSequence charSequence8 = c7484up0.v;
            if (charSequence8 != null) {
                c7293tp0A.u = charSequence8;
            }
            CharSequence charSequence9 = c7484up0.w;
            if (charSequence9 != null) {
                c7293tp0A.v = charSequence9;
            }
            CharSequence charSequence10 = c7484up0.x;
            if (charSequence10 != null) {
                c7293tp0A.w = charSequence10;
            }
            CharSequence charSequence11 = c7484up0.y;
            if (charSequence11 != null) {
                c7293tp0A.x = charSequence11;
            }
            Integer num11 = c7484up0.z;
            if (num11 != null) {
                c7293tp0A.y = num11;
            }
        }
        return new C7484up0(c7293tp0A);
    }

    public final void x1() {
        g2();
        T1();
        Z1(null);
        P1(0, 0);
    }

    public final QB0 y1(PB0 pb0) {
        int iH1 = H1(this.u1);
        AbstractC0178Ca1 abstractC0178Ca1 = this.u1.a;
        if (iH1 == -1) {
            iH1 = 0;
        }
        C3390dR c3390dR = this.l;
        return new QB0(c3390dR, pb0, abstractC0178Ca1, iH1, this.x, c3390dR.j);
    }

    public final long z1() {
        g2();
        if (this.u1.a.p()) {
            return this.w1;
        }
        BB0 bb0 = this.u1;
        long j = 0;
        if (bb0.k.d != bb0.b.d) {
            return AbstractC0277Dh1.d0(bb0.a.m(D1(), (C0100Ba1) this.b, 0L).m);
        }
        long j2 = bb0.q;
        if (this.u1.k.b()) {
            BB0 bb02 = this.u1;
            bb02.a.g(bb02.k.a, this.o).d(this.u1.k.b);
        } else {
            j = j2;
        }
        BB0 bb03 = this.u1;
        AbstractC0178Ca1 abstractC0178Ca1 = bb03.a;
        Object obj = bb03.k.a;
        C0022Aa1 c0022Aa1 = this.o;
        abstractC0178Ca1.g(obj, c0022Aa1);
        return AbstractC0277Dh1.d0(j + c0022Aa1.e);
    }
}
