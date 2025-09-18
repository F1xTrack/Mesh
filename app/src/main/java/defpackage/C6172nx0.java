package defpackage;

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
public final class C6172nx0 {
    public int A;
    public long B;
    public G10 C;
    public C6860rY0 a = new C6860rY0(8);
    public C1016Mu0 b = new C1016Mu0(8);
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public C2199an e = new C2199an();
    public boolean f = true;
    public C5396jt0 g;
    public boolean h;
    public boolean i;
    public InterfaceC4255hz j;
    public C1921Yk k;
    public C7532v32 l;
    public Proxy m;
    public ProxySelector n;
    public C5396jt0 o;
    public SocketFactory p;
    public SSLSocketFactory q;
    public X509TrustManager r;
    public List s;
    public List t;
    public HostnameVerifier u;
    public C2017Zq v;
    public AbstractC7225tS1 w;
    public int x;
    public int y;
    public int z;

    public C6172nx0() {
        C5396jt0 c5396jt0 = C5396jt0.b;
        this.g = c5396jt0;
        this.h = true;
        this.i = true;
        this.j = InterfaceC4255hz.o0;
        this.l = C7532v32.c;
        this.o = c5396jt0;
        SocketFactory socketFactory = SocketFactory.getDefault();
        O90.e(socketFactory, "getDefault()");
        this.p = socketFactory;
        this.s = C6363ox0.E;
        this.t = C6363ox0.D;
        this.u = C5981mx0.b;
        this.v = C2017Zq.c;
        this.y = 10000;
        this.z = 10000;
        this.A = 10000;
        this.B = 1024L;
    }

    public final void a(long j, TimeUnit timeUnit) {
        O90.f(timeUnit, "unit");
        this.y = AbstractC0199Ch1.b(j, timeUnit);
    }

    public final void b(long j, TimeUnit timeUnit) {
        O90.f(timeUnit, "unit");
        this.z = AbstractC0199Ch1.b(j, timeUnit);
    }

    public final void c(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        O90.f(sSLSocketFactory, "sslSocketFactory");
        O90.f(x509TrustManager, "trustManager");
        if (!sSLSocketFactory.equals(this.q) || !x509TrustManager.equals(this.r)) {
            this.C = null;
        }
        this.q = sSLSocketFactory;
        C6601qB0 c6601qB0 = C6601qB0.a;
        this.w = C6601qB0.a.b(x509TrustManager);
        this.r = x509TrustManager;
    }

    public final void d(long j, TimeUnit timeUnit) {
        O90.f(timeUnit, "unit");
        this.A = AbstractC0199Ch1.b(j, timeUnit);
    }
}
