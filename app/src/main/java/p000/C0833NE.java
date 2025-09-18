package p000;

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

/* renamed from: NE */
/* loaded from: classes.dex */
public final class C0833NE implements InterfaceC0352Fa {

    /* renamed from: m0 */
    public static final Object f7585m0 = new Object();

    /* renamed from: n0 */
    public static ExecutorService f7586n0;

    /* renamed from: o0 */
    public static int f7587o0;

    /* renamed from: A */
    public C1017Q9 f7588A;

    /* renamed from: B */
    public C0519IE f7589B;

    /* renamed from: C */
    public C0519IE f7590C;

    /* renamed from: D */
    public CB0 f7591D;

    /* renamed from: E */
    public boolean f7592E;

    /* renamed from: F */
    public ByteBuffer f7593F;

    /* renamed from: G */
    public int f7594G;

    /* renamed from: H */
    public long f7595H;

    /* renamed from: I */
    public long f7596I;

    /* renamed from: J */
    public long f7597J;

    /* renamed from: K */
    public long f7598K;

    /* renamed from: L */
    public int f7599L;

    /* renamed from: M */
    public boolean f7600M;

    /* renamed from: N */
    public boolean f7601N;

    /* renamed from: O */
    public long f7602O;

    /* renamed from: P */
    public float f7603P;

    /* renamed from: Q */
    public ByteBuffer f7604Q;

    /* renamed from: R */
    public int f7605R;

    /* renamed from: S */
    public ByteBuffer f7606S;

    /* renamed from: T */
    public byte[] f7607T;

    /* renamed from: U */
    public int f7608U;

    /* renamed from: V */
    public boolean f7609V;

    /* renamed from: W */
    public boolean f7610W;

    /* renamed from: X */
    public boolean f7611X;

    /* renamed from: Y */
    public boolean f7612Y;

    /* renamed from: Z */
    public boolean f7613Z;

    /* renamed from: a */
    public final Context f7614a;

    /* renamed from: a0 */
    public int f7615a0;

    /* renamed from: b */
    public final C10189lr0 f7616b;

    /* renamed from: b0 */
    public C1799bf f7617b0;

    /* renamed from: c */
    public final boolean f7618c;

    /* renamed from: c0 */
    public C3999ea f7619c0;

    /* renamed from: d */
    public final C6389lr f7620d;

    /* renamed from: d0 */
    public boolean f7621d0;

    /* renamed from: e */
    public final C9266ed1 f7622e;

    /* renamed from: e0 */
    public long f7623e0;

    /* renamed from: f */
    public final C9367fQ0 f7624f;

    /* renamed from: f0 */
    public long f7625f0;

    /* renamed from: g */
    public final C9367fQ0 f7626g;

    /* renamed from: g0 */
    public boolean f7627g0;

    /* renamed from: h */
    public final C0328FC f7628h;

    /* renamed from: h0 */
    public boolean f7629h0;

    /* renamed from: i */
    public final C1106Ra f7630i;

    /* renamed from: i0 */
    public Looper f7631i0;

    /* renamed from: j */
    public final ArrayDeque f7632j;

    /* renamed from: j0 */
    public long f7633j0;

    /* renamed from: k */
    public final boolean f7634k;

    /* renamed from: k0 */
    public long f7635k0;

    /* renamed from: l */
    public int f7636l;

    /* renamed from: l0 */
    public Handler f7637l0;

    /* renamed from: m */
    public C0770ME f7638m;

    /* renamed from: n */
    public final C0495Hr f7639n;

    /* renamed from: o */
    public final C0495Hr f7640o;

    /* renamed from: p */
    public final C7564Ev0 f7641p;

    /* renamed from: q */
    public final C0827N8 f7642q;

    /* renamed from: r */
    public NB0 f7643r;

    /* renamed from: s */
    public G10 f7644s;

    /* renamed from: t */
    public C0456HE f7645t;

    /* renamed from: u */
    public C0456HE f7646u;

    /* renamed from: v */
    public C6626pa f7647v;

    /* renamed from: w */
    public AudioTrack f7648w;

    /* renamed from: x */
    public C1520Y9 f7649x;

    /* renamed from: y */
    public C1856ca f7650y;

    /* renamed from: z */
    public C0645KE f7651z;

    public C0833NE(C1753aw c1753aw) {
        C1520Y9 c1520y9M9223b;
        Context context = (Context) c1753aw.f16682b;
        this.f7614a = context;
        C1017Q9 c1017q9 = C1017Q9.f9497d;
        this.f7588A = c1017q9;
        if (context != null) {
            C1520Y9 c1520y9 = C1520Y9.f14173c;
            int i = AbstractC7485Dh1.f2166a;
            c1520y9M9223b = C1520Y9.m9223b(context, c1017q9, null);
        } else {
            c1520y9M9223b = (C1520Y9) c1753aw.f16684d;
        }
        this.f7649x = c1520y9M9223b;
        this.f7616b = (C10189lr0) c1753aw.f16685e;
        int i2 = AbstractC7485Dh1.f2166a;
        this.f7618c = false;
        this.f7634k = false;
        this.f7636l = 0;
        this.f7641p = (C7564Ev0) c1753aw.f16686f;
        C0827N8 c0827n8 = (C0827N8) c1753aw.f16687g;
        c0827n8.getClass();
        this.f7642q = c0827n8;
        C0328FC c0328fc = new C0328FC();
        this.f7628h = c0328fc;
        c0328fc.m2551g();
        this.f7630i = new C1106Ra(new C7978Mu0(11, this));
        C6389lr c6389lr = new C6389lr();
        this.f7620d = c6389lr;
        C9266ed1 c9266ed1 = new C9266ed1();
        c9266ed1.f26788m = AbstractC7485Dh1.f2171f;
        this.f7622e = c9266ed1;
        C8147Qa1 c8147Qa1 = new C8147Qa1();
        N70 n70 = P70.f8867b;
        Object[] objArr = {c8147Qa1, c6389lr, c9266ed1};
        AbstractC9088dE1.m17509a(3, objArr);
        this.f7624f = P70.m6232s(3, objArr);
        this.f7626g = P70.m6229B(new C8095Pa1());
        this.f7603P = 1.0f;
        this.f7615a0 = 0;
        this.f7617b0 = new C1799bf();
        CB0 cb0 = CB0.f1238d;
        this.f7590C = new C0519IE(cb0, 0L, 0L);
        this.f7591D = cb0;
        this.f7592E = false;
        this.f7632j = new ArrayDeque();
        this.f7639n = new C0495Hr(2);
        this.f7640o = new C0495Hr(2);
    }

    /* renamed from: m */
    public static boolean m5591m(AudioTrack audioTrack) {
        return AbstractC7485Dh1.f2166a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5592a(long r17) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0833NE.m5592a(long):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0164  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5593b(p000.C6686qX r26, int[] r27) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0833NE.m5593b(qX, int[]):void");
    }

    /* renamed from: c */
    public final boolean m5594c() throws Exception {
        if (!this.f7647v.m23819e()) {
            ByteBuffer byteBuffer = this.f7606S;
            if (byteBuffer == null) {
                return true;
            }
            m5611u(byteBuffer, Long.MIN_VALUE);
            return this.f7606S == null;
        }
        C6626pa c6626pa = this.f7647v;
        if (c6626pa.m23819e() && !c6626pa.f40218d) {
            c6626pa.f40218d = true;
            ((InterfaceC6832sa) c6626pa.f40216b.get(0)).mo7057h();
        }
        m5607q(Long.MIN_VALUE);
        if (!this.f7647v.m23818d()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.f7606S;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    /* renamed from: d */
    public final void m5595d() {
        C0645KE c0645ke;
        if (m5603l()) {
            this.f7595H = 0L;
            this.f7596I = 0L;
            this.f7597J = 0L;
            this.f7598K = 0L;
            this.f7629h0 = false;
            this.f7599L = 0;
            this.f7590C = new C0519IE(this.f7591D, 0L, 0L);
            this.f7602O = 0L;
            this.f7589B = null;
            this.f7632j.clear();
            this.f7604Q = null;
            this.f7605R = 0;
            this.f7606S = null;
            this.f7610W = false;
            this.f7609V = false;
            this.f7611X = false;
            this.f7593F = null;
            this.f7594G = 0;
            this.f7622e.f26790o = 0L;
            C6626pa c6626pa = this.f7646u.f4187i;
            this.f7647v = c6626pa;
            c6626pa.m23816b();
            AudioTrack audioTrack = this.f7630i.f10288c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f7648w.pause();
            }
            if (m5591m(this.f7648w)) {
                C0770ME c0770me = this.f7638m;
                c0770me.getClass();
                c0770me.m5286b(this.f7648w);
            }
            int i = AbstractC7485Dh1.f2166a;
            if (i < 21 && !this.f7613Z) {
                this.f7615a0 = 0;
            }
            C0456HE c0456he = this.f7646u;
            C0037Aa c0037Aa = new C0037Aa(c0456he.f4185g, c0456he.f4183e, c0456he.f4184f, c0456he.f4190l, c0456he.f4181c == 1, c0456he.f4186h);
            C0456HE c0456he2 = this.f7645t;
            if (c0456he2 != null) {
                this.f7646u = c0456he2;
                this.f7645t = null;
            }
            C1106Ra c1106Ra = this.f7630i;
            c1106Ra.m7043d();
            c1106Ra.f10288c = null;
            c1106Ra.f10291f = null;
            if (i >= 24 && (c0645ke = this.f7651z) != null) {
                c0645ke.m4586c();
                this.f7651z = null;
            }
            AudioTrack audioTrack2 = this.f7648w;
            C0328FC c0328fc = this.f7628h;
            G10 g10 = this.f7644s;
            c0328fc.m2549d();
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f7585m0) {
                try {
                    if (f7586n0 == null) {
                        f7586n0 = Executors.newSingleThreadExecutor(new ThreadFactoryC11704xh1("ExoPlayer:AudioTrackReleaseThread"));
                    }
                    f7587o0++;
                    f7586n0.execute(new RunnableC0141CE(audioTrack2, g10, handler, c0037Aa, c0328fc, 0));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f7648w = null;
        }
        this.f7640o.f4554c = null;
        this.f7639n.f4554c = null;
        this.f7633j0 = 0L;
        this.f7635k0 = 0L;
        Handler handler2 = this.f7637l0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: e */
    public final C6498na m5596e(C6686qX c6686qX) {
        int i;
        boolean zBooleanValue;
        AudioManager audioManager;
        if (this.f7627g0) {
            return C6498na.f38376d;
        }
        C1017Q9 c1017q9 = this.f7588A;
        C0827N8 c0827n8 = this.f7642q;
        c0827n8.getClass();
        c6686qX.getClass();
        c1017q9.getClass();
        int i2 = AbstractC7485Dh1.f2166a;
        if (i2 < 29 || (i = c6686qX.f40952B) == -1) {
            return C6498na.f38376d;
        }
        Boolean bool = (Boolean) c0827n8.f7524c;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = (Context) c0827n8.f7523b;
            if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
                c0827n8.f7524c = Boolean.FALSE;
            } else {
                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                c0827n8.f7524c = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            }
            zBooleanValue = ((Boolean) c0827n8.f7524c).booleanValue();
        }
        String str = c6686qX.f40974m;
        str.getClass();
        int iM9160c = AbstractC8544Xr0.m9160c(str, c6686qX.f40971j);
        if (iM9160c == 0 || i2 < AbstractC7485Dh1.m1831p(iM9160c)) {
            return C6498na.f38376d;
        }
        int iM1833r = AbstractC7485Dh1.m1833r(c6686qX.f40951A);
        if (iM1833r == 0) {
            return C6498na.f38376d;
        }
        try {
            AudioFormat audioFormatM1832q = AbstractC7485Dh1.m1832q(i, iM1833r, iM9160c);
            return i2 >= 31 ? AbstractC0078BE.m561a(audioFormatM1832q, (AudioAttributes) c1017q9.m6587a().f3494a, zBooleanValue) : AbstractC0015AE.m105a(audioFormatM1832q, (AudioAttributes) c1017q9.m6587a().f3494a, zBooleanValue);
        } catch (IllegalArgumentException unused) {
            return C6498na.f38376d;
        }
    }

    /* renamed from: f */
    public final int m5597f(C6686qX c6686qX) {
        m5604n();
        if (!"audio/raw".equals(c6686qX.f40974m)) {
            return this.f7649x.m9225d(this.f7588A, c6686qX) != null ? 2 : 0;
        }
        int i = c6686qX.f40953C;
        if (AbstractC7485Dh1.m1798M(i)) {
            return (i == 2 || (this.f7618c && i == 4)) ? 2 : 1;
        }
        AbstractC0852NX.m5767p("Invalid PCM encoding: ", i);
        return 0;
    }

    /* renamed from: g */
    public final long m5598g() {
        return this.f7646u.f4181c == 0 ? this.f7595H / r0.f4180b : this.f7596I;
    }

    /* renamed from: h */
    public final long m5599h() {
        C0456HE c0456he = this.f7646u;
        if (c0456he.f4181c != 0) {
            return this.f7598K;
        }
        long j = this.f7597J;
        long j2 = c0456he.f4182d;
        int i = AbstractC7485Dh1.f2166a;
        return ((j + j2) - 1) / j2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0104, code lost:
    
        if (r9.m7041b() == 0) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0272  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m5600i(java.nio.ByteBuffer r25, long r26, int r28) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1166
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0833NE.m5600i(java.nio.ByteBuffer, long, int):boolean");
    }

    /* renamed from: j */
    public final boolean m5601j() {
        return m5603l() && !(AbstractC7485Dh1.f2166a >= 29 && this.f7648w.isOffloadedPlayback() && this.f7611X) && this.f7630i.m7042c(m5599h());
    }

    /* JADX WARN: Removed duplicated region for block: B:106:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a2  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m5602k() throws p000.C0163Ca {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0833NE.m5602k():boolean");
    }

    /* renamed from: l */
    public final boolean m5603l() {
        return this.f7648w != null;
    }

    /* renamed from: n */
    public final void m5604n() {
        Context context;
        C1520Y9 c1520y9M9224c;
        C1673aa c1673aa;
        if (this.f7650y != null || (context = this.f7614a) == null) {
            return;
        }
        this.f7631i0 = Looper.myLooper();
        C1856ca c1856ca = new C1856ca(context, new C0267EE(0, this), this.f7588A, this.f7619c0);
        this.f7650y = c1856ca;
        if (c1856ca.f17604a) {
            c1520y9M9224c = (C1520Y9) c1856ca.f17611h;
            c1520y9M9224c.getClass();
        } else {
            c1856ca.f17604a = true;
            C1794ba c1794ba = (C1794ba) c1856ca.f17610g;
            if (c1794ba != null) {
                c1794ba.f17074a.registerContentObserver(c1794ba.f17075b, false, c1794ba);
            }
            int i = AbstractC7485Dh1.f2166a;
            Handler handler = (Handler) c1856ca.f17607d;
            Context context2 = (Context) c1856ca.f17605b;
            if (i >= 23 && (c1673aa = (C1673aa) c1856ca.f17608e) != null) {
                AbstractC1583Z9.m9494a(context2, c1673aa, handler);
            }
            C0196D6 c0196d6 = (C0196D6) c1856ca.f17609f;
            c1520y9M9224c = C1520Y9.m9224c(context2, c0196d6 != null ? context2.registerReceiver(c0196d6, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler) : null, (C1017Q9) c1856ca.f17613j, (C3999ea) c1856ca.f17612i);
            c1856ca.f17611h = c1520y9M9224c;
        }
        this.f7649x = c1520y9M9224c;
    }

    /* renamed from: o */
    public final void m5605o() {
        this.f7612Y = true;
        if (m5603l()) {
            C1106Ra c1106Ra = this.f7630i;
            if (c1106Ra.f10310y != -9223372036854775807L) {
                c1106Ra.f10285J.getClass();
                c1106Ra.f10310y = AbstractC7485Dh1.m1802Q(SystemClock.elapsedRealtime());
            }
            C1044Qa c1044Qa = c1106Ra.f10291f;
            c1044Qa.getClass();
            c1044Qa.m6730a();
            this.f7648w.play();
        }
    }

    /* renamed from: p */
    public final void m5606p() {
        if (this.f7610W) {
            return;
        }
        this.f7610W = true;
        long jM5599h = m5599h();
        C1106Ra c1106Ra = this.f7630i;
        c1106Ra.f10276A = c1106Ra.m7041b();
        c1106Ra.f10285J.getClass();
        c1106Ra.f10310y = AbstractC7485Dh1.m1802Q(SystemClock.elapsedRealtime());
        c1106Ra.f10277B = jM5599h;
        if (m5591m(this.f7648w)) {
            this.f7611X = false;
        }
        this.f7648w.stop();
        this.f7594G = 0;
    }

    /* renamed from: q */
    public final void m5607q(long j) throws Exception {
        ByteBuffer byteBuffer;
        if (!this.f7647v.m23819e()) {
            ByteBuffer byteBuffer2 = this.f7604Q;
            if (byteBuffer2 == null) {
                byteBuffer2 = InterfaceC6832sa.f42484a;
            }
            m5611u(byteBuffer2, j);
            return;
        }
        while (!this.f7647v.m23818d()) {
            do {
                C6626pa c6626pa = this.f7647v;
                if (c6626pa.m23819e()) {
                    ByteBuffer byteBuffer3 = c6626pa.f40217c[c6626pa.m23817c()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        c6626pa.m23820f(InterfaceC6832sa.f42484a);
                        byteBuffer = c6626pa.f40217c[c6626pa.m23817c()];
                    }
                } else {
                    byteBuffer = InterfaceC6832sa.f42484a;
                }
                if (byteBuffer.hasRemaining()) {
                    m5611u(byteBuffer, j);
                } else {
                    ByteBuffer byteBuffer4 = this.f7604Q;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    C6626pa c6626pa2 = this.f7647v;
                    ByteBuffer byteBuffer5 = this.f7604Q;
                    if (c6626pa2.m23819e() && !c6626pa2.f40218d) {
                        c6626pa2.m23820f(byteBuffer5);
                    }
                }
            } while (!byteBuffer.hasRemaining());
            return;
        }
    }

    /* renamed from: r */
    public final void m5608r() {
        m5595d();
        N70 n70ListIterator = this.f7624f.listIterator(0);
        while (n70ListIterator.hasNext()) {
            ((InterfaceC6832sa) n70ListIterator.next()).mo7054d();
        }
        N70 n70ListIterator2 = this.f7626g.listIterator(0);
        while (n70ListIterator2.hasNext()) {
            ((InterfaceC6832sa) n70ListIterator2.next()).mo7054d();
        }
        C6626pa c6626pa = this.f7647v;
        if (c6626pa != null) {
            int i = 0;
            while (true) {
                C9367fQ0 c9367fQ0 = c6626pa.f40215a;
                if (i >= c9367fQ0.size()) {
                    break;
                }
                InterfaceC6832sa interfaceC6832sa = (InterfaceC6832sa) c9367fQ0.get(i);
                interfaceC6832sa.flush();
                interfaceC6832sa.mo7054d();
                i++;
            }
            c6626pa.f40217c = new ByteBuffer[0];
            C6689qa c6689qa = C6689qa.f41025e;
            c6626pa.f40218d = false;
        }
        this.f7612Y = false;
        this.f7627g0 = false;
    }

    /* renamed from: s */
    public final void m5609s() {
        if (m5603l()) {
            try {
                this.f7648w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f7591D.f1239a).setPitch(this.f7591D.f1240b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                AbstractC10872rA1.m24176i("Failed to set playback params", e);
            }
            CB0 cb0 = new CB0(this.f7648w.getPlaybackParams().getSpeed(), this.f7648w.getPlaybackParams().getPitch());
            this.f7591D = cb0;
            float f = cb0.f1239a;
            C1106Ra c1106Ra = this.f7630i;
            c1106Ra.f10295j = f;
            C1044Qa c1044Qa = c1106Ra.f10291f;
            if (c1044Qa != null) {
                c1044Qa.m6730a();
            }
            c1106Ra.m7043d();
        }
    }

    /* renamed from: t */
    public final boolean m5610t() {
        C0456HE c0456he = this.f7646u;
        return c0456he != null && c0456he.f4188j && AbstractC7485Dh1.f2166a >= 23;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0137  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5611u(java.nio.ByteBuffer r13, long r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0833NE.m5611u(java.nio.ByteBuffer, long):void");
    }
}
