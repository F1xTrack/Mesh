package p000;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: nx0 */
/* loaded from: classes2.dex */
public final class C10457nx0 {

    /* renamed from: A */
    public int f38619A;

    /* renamed from: B */
    public long f38620B;

    /* renamed from: C */
    public G10 f38621C;

    /* renamed from: a */
    public C10919rY0 f38622a = new C10919rY0(8);

    /* renamed from: b */
    public C7978Mu0 f38623b = new C7978Mu0(8);

    /* renamed from: c */
    public final ArrayList f38624c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f38625d = new ArrayList();

    /* renamed from: e */
    public C1686an f38626e = new C1686an();

    /* renamed from: f */
    public boolean f38627f = true;

    /* renamed from: g */
    public C9937jt0 f38628g;

    /* renamed from: h */
    public boolean f38629h;

    /* renamed from: i */
    public boolean f38630i;

    /* renamed from: j */
    public InterfaceC4213hz f38631j;

    /* renamed from: k */
    public C1557Yk f38632k;

    /* renamed from: l */
    public C11370v32 f38633l;

    /* renamed from: m */
    public Proxy f38634m;

    /* renamed from: n */
    public ProxySelector f38635n;

    /* renamed from: o */
    public C9937jt0 f38636o;

    /* renamed from: p */
    public SocketFactory f38637p;

    /* renamed from: q */
    public SSLSocketFactory f38638q;

    /* renamed from: r */
    public X509TrustManager f38639r;

    /* renamed from: s */
    public List f38640s;

    /* renamed from: t */
    public List f38641t;

    /* renamed from: u */
    public HostnameVerifier f38642u;

    /* renamed from: v */
    public C1626Zq f38643v;

    /* renamed from: w */
    public AbstractC11164tS1 f38644w;

    /* renamed from: x */
    public int f38645x;

    /* renamed from: y */
    public int f38646y;

    /* renamed from: z */
    public int f38647z;

    public C10457nx0() {
        C9937jt0 c9937jt0 = C9937jt0.f35437b;
        this.f38628g = c9937jt0;
        this.f38629h = true;
        this.f38630i = true;
        this.f38631j = InterfaceC4213hz.f28704o0;
        this.f38633l = C11370v32.f44124c;
        this.f38636o = c9937jt0;
        SocketFactory socketFactory = SocketFactory.getDefault();
        O90.m5967e(socketFactory, "getDefault()");
        this.f38637p = socketFactory;
        this.f38640s = C10585ox0.f39367E;
        this.f38641t = C10585ox0.f39366D;
        this.f38642u = C10329mx0.f38001b;
        this.f38643v = C1626Zq.f15146c;
        this.f38646y = 10000;
        this.f38647z = 10000;
        this.f38619A = 10000;
        this.f38620B = 1024L;
    }

    /* renamed from: a */
    public final void m23286a(long j, TimeUnit timeUnit) {
        O90.m5968f(timeUnit, "unit");
        this.f38646y = AbstractC7433Ch1.m1273b(j, timeUnit);
    }

    /* renamed from: b */
    public final void m23287b(long j, TimeUnit timeUnit) {
        O90.m5968f(timeUnit, "unit");
        this.f38647z = AbstractC7433Ch1.m1273b(j, timeUnit);
    }

    /* renamed from: c */
    public final void m23288c(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        O90.m5968f(sSLSocketFactory, "sslSocketFactory");
        O90.m5968f(x509TrustManager, "trustManager");
        if (!sSLSocketFactory.equals(this.f38638q) || !x509TrustManager.equals(this.f38639r)) {
            this.f38621C = null;
        }
        this.f38638q = sSLSocketFactory;
        C10745qB0 c10745qB0 = C10745qB0.f40658a;
        this.f38644w = C10745qB0.f40658a.mo9669b(x509TrustManager);
        this.f38639r = x509TrustManager;
    }

    /* renamed from: d */
    public final void m23289d(long j, TimeUnit timeUnit) {
        O90.m5968f(timeUnit, "unit");
        this.f38619A = AbstractC7433Ch1.m1273b(j, timeUnit);
    }
}
