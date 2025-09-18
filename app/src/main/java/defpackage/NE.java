package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class NE implements InterfaceC0410Fa {
    public static final Object m0 = new Object();
    public static ExecutorService n0;
    public static int o0;
    public Q9 A;
    public IE B;
    public IE C;
    public CB0 D;
    public boolean E;
    public ByteBuffer F;
    public int G;
    public long H;
    public long I;
    public long J;
    public long K;
    public int L;
    public boolean M;
    public boolean N;
    public long O;
    public float P;
    public ByteBuffer Q;
    public int R;
    public ByteBuffer S;
    public byte[] T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final Context a;
    public int a0;
    public final C5772lr0 b;
    public C2366bf b0;
    public final boolean c;
    public C3607ea c0;
    public final C5771lr d;
    public boolean d0;
    public final C3618ed1 e;
    public long e0;
    public final C3769fQ0 f;
    public long f0;
    public final C3769fQ0 g;
    public boolean g0;
    public final FC h;
    public boolean h0;
    public final C1345Ra i;
    public Looper i0;
    public final ArrayDeque j;
    public long j0;
    public final boolean k;
    public long k0;
    public int l;
    public Handler l0;
    public ME m;
    public final C0617Hr n;
    public final C0617Hr o;
    public final C0396Ev0 p;
    public final N8 q;
    public NB0 r;
    public G10 s;
    public HE t;
    public HE u;
    public C6484pa v;
    public AudioTrack w;
    public Y9 x;
    public C2541ca y;
    public KE z;

    public NE(C2226aw c2226aw) {
        Y9 y9B;
        Context context = (Context) c2226aw.b;
        this.a = context;
        Q9 q9 = Q9.d;
        this.A = q9;
        if (context != null) {
            Y9 y9 = Y9.c;
            int i = AbstractC0277Dh1.a;
            y9B = Y9.b(context, q9, null);
        } else {
            y9B = (Y9) c2226aw.d;
        }
        this.x = y9B;
        this.b = (C5772lr0) c2226aw.e;
        int i2 = AbstractC0277Dh1.a;
        this.c = false;
        this.k = false;
        this.l = 0;
        this.p = (C0396Ev0) c2226aw.f;
        N8 n8 = (N8) c2226aw.g;
        n8.getClass();
        this.q = n8;
        FC fc = new FC();
        this.h = fc;
        fc.g();
        this.i = new C1345Ra(new C1016Mu0(11, this));
        C5771lr c5771lr = new C5771lr();
        this.d = c5771lr;
        C3618ed1 c3618ed1 = new C3618ed1();
        c3618ed1.m = AbstractC0277Dh1.f;
        this.e = c3618ed1;
        C1269Qa1 c1269Qa1 = new C1269Qa1();
        N70 n70 = P70.b;
        Object[] objArr = {c1269Qa1, c5771lr, c3618ed1};
        AbstractC3353dE1.a(3, objArr);
        this.f = P70.s(3, objArr);
        this.g = P70.B(new C1191Pa1());
        this.P = 1.0f;
        this.a0 = 0;
        this.b0 = new C2366bf();
        CB0 cb0 = CB0.d;
        this.C = new IE(cb0, 0L, 0L);
        this.D = cb0;
        this.E = false;
        this.j = new ArrayDeque();
        this.n = new C0617Hr(2);
        this.o = new C0617Hr(2);
    }

    public static boolean m(AudioTrack audioTrack) {
        return AbstractC0277Dh1.a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r17) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.NE.a(long):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.C6666qX r26, int[] r27) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.NE.b(qX, int[]):void");
    }

    public final boolean c() throws Exception {
        if (!this.v.e()) {
            ByteBuffer byteBuffer = this.S;
            if (byteBuffer == null) {
                return true;
            }
            u(byteBuffer, Long.MIN_VALUE);
            return this.S == null;
        }
        C6484pa c6484pa = this.v;
        if (c6484pa.e() && !c6484pa.d) {
            c6484pa.d = true;
            ((InterfaceC7056sa) c6484pa.b.get(0)).h();
        }
        q(Long.MIN_VALUE);
        if (!this.v.d()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.S;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    public final void d() {
        KE ke;
        if (l()) {
            this.H = 0L;
            this.I = 0L;
            this.J = 0L;
            this.K = 0L;
            this.h0 = false;
            this.L = 0;
            this.C = new IE(this.D, 0L, 0L);
            this.O = 0L;
            this.B = null;
            this.j.clear();
            this.Q = null;
            this.R = 0;
            this.S = null;
            this.W = false;
            this.V = false;
            this.X = false;
            this.F = null;
            this.G = 0;
            this.e.o = 0L;
            C6484pa c6484pa = this.u.i;
            this.v = c6484pa;
            c6484pa.b();
            AudioTrack audioTrack = this.i.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.w.pause();
            }
            if (m(this.w)) {
                ME me2 = this.m;
                me2.getClass();
                me2.b(this.w);
            }
            int i = AbstractC0277Dh1.a;
            if (i < 21 && !this.Z) {
                this.a0 = 0;
            }
            HE he = this.u;
            C0020Aa c0020Aa = new C0020Aa(he.g, he.e, he.f, he.l, he.c == 1, he.h);
            HE he2 = this.t;
            if (he2 != null) {
                this.u = he2;
                this.t = null;
            }
            C1345Ra c1345Ra = this.i;
            c1345Ra.d();
            c1345Ra.c = null;
            c1345Ra.f = null;
            if (i >= 24 && (ke = this.z) != null) {
                ke.c();
                this.z = null;
            }
            AudioTrack audioTrack2 = this.w;
            FC fc = this.h;
            G10 g10 = this.s;
            fc.d();
            Handler handler = new Handler(Looper.myLooper());
            synchronized (m0) {
                try {
                    if (n0 == null) {
                        n0 = Executors.newSingleThreadExecutor(new ThreadFactoryC8032xh1("ExoPlayer:AudioTrackReleaseThread"));
                    }
                    o0++;
                    n0.execute(new CE(audioTrack2, g10, handler, c0020Aa, fc, 0));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.w = null;
        }
        this.o.c = null;
        this.n.c = null;
        this.j0 = 0L;
        this.k0 = 0L;
        Handler handler2 = this.l0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final C6102na e(C6666qX c6666qX) {
        int i;
        boolean zBooleanValue;
        AudioManager audioManager;
        if (this.g0) {
            return C6102na.d;
        }
        Q9 q9 = this.A;
        N8 n8 = this.q;
        n8.getClass();
        c6666qX.getClass();
        q9.getClass();
        int i2 = AbstractC0277Dh1.a;
        if (i2 < 29 || (i = c6666qX.B) == -1) {
            return C6102na.d;
        }
        Boolean bool = (Boolean) n8.c;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = (Context) n8.b;
            if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
                n8.c = Boolean.FALSE;
            } else {
                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                n8.c = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            }
            zBooleanValue = ((Boolean) n8.c).booleanValue();
        }
        String str = c6666qX.m;
        str.getClass();
        int iC = AbstractC1865Xr0.c(str, c6666qX.j);
        if (iC == 0 || i2 < AbstractC0277Dh1.p(iC)) {
            return C6102na.d;
        }
        int iR = AbstractC0277Dh1.r(c6666qX.A);
        if (iR == 0) {
            return C6102na.d;
        }
        try {
            AudioFormat audioFormatQ = AbstractC0277Dh1.q(i, iR, iC);
            return i2 >= 31 ? BE.a(audioFormatQ, (AudioAttributes) q9.a().a, zBooleanValue) : AE.a(audioFormatQ, (AudioAttributes) q9.a().a, zBooleanValue);
        } catch (IllegalArgumentException unused) {
            return C6102na.d;
        }
    }

    public final int f(C6666qX c6666qX) {
        n();
        if (!"audio/raw".equals(c6666qX.m)) {
            return this.x.d(this.A, c6666qX) != null ? 2 : 0;
        }
        int i = c6666qX.C;
        if (AbstractC0277Dh1.M(i)) {
            return (i == 2 || (this.c && i == 4)) ? 2 : 1;
        }
        NX.p("Invalid PCM encoding: ", i);
        return 0;
    }

    public final long g() {
        return this.u.c == 0 ? this.H / r0.b : this.I;
    }

    public final long h() {
        HE he = this.u;
        if (he.c != 0) {
            return this.K;
        }
        long j = this.J;
        long j2 = he.d;
        int i = AbstractC0277Dh1.a;
        return ((j + j2) - 1) / j2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0104, code lost:
    
        if (r9.b() == 0) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(java.nio.ByteBuffer r25, long r26, int r28) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1166
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.NE.i(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean j() {
        return l() && !(AbstractC0277Dh1.a >= 29 && this.w.isOffloadedPlayback() && this.X) && this.i.c(h());
    }

    /* JADX WARN: Removed duplicated region for block: B:106:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k() throws defpackage.C0176Ca {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.NE.k():boolean");
    }

    public final boolean l() {
        return this.w != null;
    }

    public final void n() {
        Context context;
        Y9 y9C;
        C2160aa c2160aa;
        if (this.y != null || (context = this.a) == null) {
            return;
        }
        this.i0 = Looper.myLooper();
        C2541ca c2541ca = new C2541ca(context, new EE(0, this), this.A, this.c0);
        this.y = c2541ca;
        if (c2541ca.a) {
            y9C = (Y9) c2541ca.h;
            y9C.getClass();
        } else {
            c2541ca.a = true;
            C2351ba c2351ba = (C2351ba) c2541ca.g;
            if (c2351ba != null) {
                c2351ba.a.registerContentObserver(c2351ba.b, false, c2351ba);
            }
            int i = AbstractC0277Dh1.a;
            Handler handler = (Handler) c2541ca.d;
            Context context2 = (Context) c2541ca.b;
            if (i >= 23 && (c2160aa = (C2160aa) c2541ca.e) != null) {
                Z9.a(context2, c2160aa, handler);
            }
            D6 d6 = (D6) c2541ca.f;
            y9C = Y9.c(context2, d6 != null ? context2.registerReceiver(d6, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler) : null, (Q9) c2541ca.j, (C3607ea) c2541ca.i);
            c2541ca.h = y9C;
        }
        this.x = y9C;
    }

    public final void o() {
        this.Y = true;
        if (l()) {
            C1345Ra c1345Ra = this.i;
            if (c1345Ra.y != -9223372036854775807L) {
                c1345Ra.J.getClass();
                c1345Ra.y = AbstractC0277Dh1.Q(SystemClock.elapsedRealtime());
            }
            C1267Qa c1267Qa = c1345Ra.f;
            c1267Qa.getClass();
            c1267Qa.a();
            this.w.play();
        }
    }

    public final void p() {
        if (this.W) {
            return;
        }
        this.W = true;
        long jH = h();
        C1345Ra c1345Ra = this.i;
        c1345Ra.A = c1345Ra.b();
        c1345Ra.J.getClass();
        c1345Ra.y = AbstractC0277Dh1.Q(SystemClock.elapsedRealtime());
        c1345Ra.B = jH;
        if (m(this.w)) {
            this.X = false;
        }
        this.w.stop();
        this.G = 0;
    }

    public final void q(long j) throws Exception {
        ByteBuffer byteBuffer;
        if (!this.v.e()) {
            ByteBuffer byteBuffer2 = this.Q;
            if (byteBuffer2 == null) {
                byteBuffer2 = InterfaceC7056sa.a;
            }
            u(byteBuffer2, j);
            return;
        }
        while (!this.v.d()) {
            do {
                C6484pa c6484pa = this.v;
                if (c6484pa.e()) {
                    ByteBuffer byteBuffer3 = c6484pa.c[c6484pa.c()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        c6484pa.f(InterfaceC7056sa.a);
                        byteBuffer = c6484pa.c[c6484pa.c()];
                    }
                } else {
                    byteBuffer = InterfaceC7056sa.a;
                }
                if (byteBuffer.hasRemaining()) {
                    u(byteBuffer, j);
                } else {
                    ByteBuffer byteBuffer4 = this.Q;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    C6484pa c6484pa2 = this.v;
                    ByteBuffer byteBuffer5 = this.Q;
                    if (c6484pa2.e() && !c6484pa2.d) {
                        c6484pa2.f(byteBuffer5);
                    }
                }
            } while (!byteBuffer.hasRemaining());
            return;
        }
    }

    public final void r() {
        d();
        N70 n70ListIterator = this.f.listIterator(0);
        while (n70ListIterator.hasNext()) {
            ((InterfaceC7056sa) n70ListIterator.next()).d();
        }
        N70 n70ListIterator2 = this.g.listIterator(0);
        while (n70ListIterator2.hasNext()) {
            ((InterfaceC7056sa) n70ListIterator2.next()).d();
        }
        C6484pa c6484pa = this.v;
        if (c6484pa != null) {
            int i = 0;
            while (true) {
                C3769fQ0 c3769fQ0 = c6484pa.a;
                if (i >= c3769fQ0.size()) {
                    break;
                }
                InterfaceC7056sa interfaceC7056sa = (InterfaceC7056sa) c3769fQ0.get(i);
                interfaceC7056sa.flush();
                interfaceC7056sa.d();
                i++;
            }
            c6484pa.c = new ByteBuffer[0];
            C6675qa c6675qa = C6675qa.e;
            c6484pa.d = false;
        }
        this.Y = false;
        this.g0 = false;
    }

    public final void s() {
        if (l()) {
            try {
                this.w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.D.a).setPitch(this.D.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                AbstractC6789rA1.i("Failed to set playback params", e);
            }
            CB0 cb0 = new CB0(this.w.getPlaybackParams().getSpeed(), this.w.getPlaybackParams().getPitch());
            this.D = cb0;
            float f = cb0.a;
            C1345Ra c1345Ra = this.i;
            c1345Ra.j = f;
            C1267Qa c1267Qa = c1345Ra.f;
            if (c1267Qa != null) {
                c1267Qa.a();
            }
            c1345Ra.d();
        }
    }

    public final boolean t() {
        HE he = this.u;
        return he != null && he.j && AbstractC0277Dh1.a >= 23;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(java.nio.ByteBuffer r13, long r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.NE.u(java.nio.ByteBuffer, long):void");
    }
}
