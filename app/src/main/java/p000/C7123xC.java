package p000;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* renamed from: xC */
/* loaded from: classes.dex */
public final class C7123xC extends AbstractC6758rg {

    /* renamed from: A */
    public InterfaceC1586ZC f45438A;

    /* renamed from: B */
    public C8539Xo1 f45439B;

    /* renamed from: C */
    public InterfaceC9648hc1 f45440C;

    /* renamed from: D */
    public C6583ou f45441D;

    /* renamed from: E */
    public Handler f45442E;

    /* renamed from: F */
    public C10185lp0 f45443F;

    /* renamed from: G */
    public Uri f45444G;

    /* renamed from: H */
    public final Uri f45445H;

    /* renamed from: I */
    public C6602pC f45446I;

    /* renamed from: J */
    public boolean f45447J;

    /* renamed from: K */
    public long f45448K;

    /* renamed from: L */
    public long f45449L;

    /* renamed from: M */
    public long f45450M;

    /* renamed from: N */
    public int f45451N;

    /* renamed from: O */
    public long f45452O;

    /* renamed from: P */
    public int f45453P;

    /* renamed from: Q */
    public C10825qp0 f45454Q;

    /* renamed from: h */
    public final boolean f45455h;

    /* renamed from: i */
    public final InterfaceC1397WC f45456i;

    /* renamed from: j */
    public final C1356VY f45457j;

    /* renamed from: k */
    public final C6914tt f45458k;

    /* renamed from: l */
    public final C22 f45459l;

    /* renamed from: m */
    public final InterfaceC1091RL f45460m;

    /* renamed from: n */
    public final C3979eG f45461n;

    /* renamed from: o */
    public final T71 f45462o;

    /* renamed from: p */
    public final long f45463p;

    /* renamed from: q */
    public final long f45464q;

    /* renamed from: r */
    public final C1356VY f45465r;

    /* renamed from: s */
    public final InterfaceC10231mA0 f45466s;

    /* renamed from: t */
    public final C9196e41 f45467t;

    /* renamed from: u */
    public final Object f45468u;

    /* renamed from: v */
    public final SparseArray f45469v;

    /* renamed from: w */
    public final RunnableC6934uC f45470w;

    /* renamed from: x */
    public final RunnableC6934uC f45471x;

    /* renamed from: y */
    public final QQ0 f45472y;

    /* renamed from: z */
    public final InterfaceC10687pk0 f45473z;

    static {
        AbstractC10953rp0.m24489a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [uC] */
    /* JADX WARN: Type inference failed for: r2v12, types: [uC] */
    public C7123xC(C10825qp0 c10825qp0, InterfaceC1397WC interfaceC1397WC, InterfaceC10231mA0 interfaceC10231mA0, C1356VY c1356vy, C6914tt c6914tt, C22 c22, InterfaceC1091RL interfaceC1091RL, C3979eG c3979eG, long j, long j2) {
        this.f45454Q = c10825qp0;
        this.f45443F = c10825qp0.f41187c;
        C10313mp0 c10313mp0 = c10825qp0.f41186b;
        c10313mp0.getClass();
        Uri uri = c10313mp0.f37951a;
        this.f45444G = uri;
        this.f45445H = uri;
        this.f45446I = null;
        this.f45456i = interfaceC1397WC;
        this.f45466s = interfaceC10231mA0;
        this.f45457j = c1356vy;
        this.f45459l = c22;
        this.f45460m = interfaceC1091RL;
        this.f45461n = c3979eG;
        this.f45463p = j;
        this.f45464q = j2;
        this.f45458k = c6914tt;
        this.f45462o = new T71(3);
        this.f45455h = false;
        this.f45465r = m24438a(null);
        this.f45468u = new Object();
        this.f45469v = new SparseArray();
        this.f45472y = new QQ0(this);
        this.f45452O = -9223372036854775807L;
        this.f45450M = -9223372036854775807L;
        this.f45467t = new C9196e41(11, this);
        this.f45473z = new C7391Bm1(12, this);
        final int i = 0;
        this.f45470w = new Runnable(this) { // from class: uC

            /* renamed from: b */
            public final /* synthetic */ C7123xC f43588b;

            {
                this.f43588b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f43588b.m25809A();
                        break;
                    default:
                        this.f43588b.m25813z(false);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f45471x = new Runnable(this) { // from class: uC

            /* renamed from: b */
            public final /* synthetic */ C7123xC f43588b;

            {
                this.f43588b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f43588b.m25809A();
                        break;
                    default:
                        this.f43588b.m25813z(false);
                        break;
                }
            }
        };
    }

    /* renamed from: u */
    public static boolean m25808u(MA0 ma0) {
        int i = 0;
        while (true) {
            List list = ma0.f7015c;
            if (i >= list.size()) {
                return false;
            }
            int i2 = ((C4092g3) list.get(i)).f27534b;
            if (i2 == 1 || i2 == 2) {
                break;
            }
            i++;
        }
        return true;
    }

    /* renamed from: A */
    public final void m25809A() {
        Uri uri;
        this.f45442E.removeCallbacks(this.f45470w);
        if (this.f45439B.m9125G()) {
            return;
        }
        if (this.f45439B.m9127I()) {
            this.f45447J = true;
            return;
        }
        synchronized (this.f45468u) {
            uri = this.f45444G;
        }
        this.f45447J = false;
        C10359nA0 c10359nA0 = new C10359nA0(this.f45438A, uri, 4, this.f45466s);
        this.f45465r.m8481S(new C9535gk0(c10359nA0.f38158a, c10359nA0.f38159b, this.f45439B.m9136S(c10359nA0, this.f45467t, this.f45461n.mo17891d(4))), c10359nA0.f38160c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: b */
    public final InterfaceC11973zp0 mo3162b(C7604Fp0 c7604Fp0, C6224jE c6224jE, long j) {
        int iIntValue = ((Integer) c7604Fp0.f3430a).intValue() - this.f45453P;
        C1356VY c1356vyM24438a = m24438a(c7604Fp0);
        C0903OL c0903ol = new C0903OL(this.f41800d.f8366c, 0, c7604Fp0);
        int i = this.f45453P + iIntValue;
        C6602pC c6602pC = this.f45446I;
        InterfaceC9648hc1 interfaceC9648hc1 = this.f45440C;
        long j2 = this.f45450M;
        NB0 nb0 = this.f41803g;
        YN1.m9283h(nb0);
        C6871tC c6871tC = new C6871tC(i, c6602pC, this.f45462o, iIntValue, this.f45457j, interfaceC9648hc1, this.f45459l, this.f45460m, c0903ol, this.f45461n, c1356vyM24438a, j2, this.f45473z, c6224jE, this.f45458k, this.f45472y, nb0);
        this.f45469v.put(i, c6871tC);
        return c6871tC;
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: h */
    public final synchronized C10825qp0 mo6202h() {
        return this.f45454Q;
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: j */
    public final void mo3163j() {
        this.f45473z.mo858a();
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: l */
    public final void mo6203l(InterfaceC9648hc1 interfaceC9648hc1) {
        this.f45440C = interfaceC9648hc1;
        Looper looperMyLooper = Looper.myLooper();
        NB0 nb0 = this.f41803g;
        YN1.m9283h(nb0);
        InterfaceC1091RL interfaceC1091RL = this.f45460m;
        interfaceC1091RL.mo6998i(looperMyLooper, nb0);
        interfaceC1091RL.mo6997e();
        if (this.f45455h) {
            m25813z(false);
            return;
        }
        this.f45438A = this.f45456i.mo506s0();
        this.f45439B = new C8539Xo1("DashMediaSource", 2);
        this.f45442E = AbstractC7485Dh1.m1829n(null);
        m25809A();
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: o */
    public final void mo3164o(InterfaceC11973zp0 interfaceC11973zp0) {
        C6871tC c6871tC = (C6871tC) interfaceC11973zp0;
        LB0 lb0 = c6871tC.f42934n;
        lb0.f6543i = true;
        lb0.f6538d.removeCallbacksAndMessages(null);
        for (C1375Vr c1375Vr : c6871tC.f42939s) {
            c1375Vr.m8603A(c6871tC);
        }
        c6871tC.f42938r = null;
        this.f45469v.remove(c6871tC.f42921a);
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: q */
    public final void mo3165q() {
        this.f45447J = false;
        this.f45438A = null;
        C8539Xo1 c8539Xo1 = this.f45439B;
        if (c8539Xo1 != null) {
            c8539Xo1.m9133P(null);
            this.f45439B = null;
        }
        this.f45448K = 0L;
        this.f45449L = 0L;
        this.f45444G = this.f45445H;
        this.f45441D = null;
        Handler handler = this.f45442E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f45442E = null;
        }
        this.f45450M = -9223372036854775807L;
        this.f45451N = 0;
        this.f45452O = -9223372036854775807L;
        this.f45469v.clear();
        T71 t71 = this.f45462o;
        ((HashMap) t71.f11173a).clear();
        ((HashMap) t71.f11174b).clear();
        ((HashMap) t71.f11175c).clear();
        this.f45460m.release();
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: t */
    public final synchronized void mo3166t(C10825qp0 c10825qp0) {
        this.f45454Q = c10825qp0;
    }

    /* renamed from: w */
    public final void m25810w() {
        boolean z;
        C8539Xo1 c8539Xo1 = this.f45439B;
        C8170Qm0 c8170Qm0 = new C8170Qm0(12, this);
        synchronized (II1.f4885b) {
            z = II1.f4886c;
        }
        if (z) {
            c8170Qm0.m6780w();
            return;
        }
        if (c8539Xo1 == null) {
            c8539Xo1 = new C8539Xo1("SntpClient", 2);
        }
        c8539Xo1.m9136S(new C7356Av0(21), new C10909rT0(c8170Qm0), 1);
    }

    /* renamed from: x */
    public final void m25811x(C10359nA0 c10359nA0, long j, long j2) {
        long j3 = c10359nA0.f38158a;
        Uri uri = c10359nA0.f38161d.f6987c;
        C9535gk0 c9535gk0 = new C9535gk0(j2);
        this.f45461n.getClass();
        this.f45465r.m8472J(c9535gk0, c10359nA0.f38160c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    /* renamed from: y */
    public final void m25812y(IOException iOException) {
        AbstractC10872rA1.m24172e("Failed to resolve time offset.", iOException);
        this.f45450M = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        m25813z(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:357:0x01c6, code lost:
    
        r2 = r40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:396:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x03a4  */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28, types: [int] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [int] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r2v20, types: [jR] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m25813z(boolean r41) {
        /*
            Method dump skipped, instructions count: 1202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7123xC.m25813z(boolean):void");
    }
}
