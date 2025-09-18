package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: y4 */
/* loaded from: classes2.dex */
public final class C7178y4 implements InterfaceC9650hd1 {

    /* renamed from: a */
    public final X509TrustManager f46074a;

    /* renamed from: b */
    public final Method f46075b;

    public C7178y4(X509TrustManager x509TrustManager, Method method) {
        O90.m5968f(x509TrustManager, "trustManager");
        this.f46074a = x509TrustManager;
        this.f46075b = method;
    }

    @Override // p000.InterfaceC9650hd1
    /* renamed from: a */
    public final X509Certificate mo7085a(X509Certificate x509Certificate) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = this.f46075b.invoke(this.f46074a, x509Certificate);
            O90.m5966d(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7178y4)) {
            return false;
        }
        C7178y4 c7178y4 = (C7178y4) obj;
        return O90.m5963a(this.f46074a, c7178y4.f46074a) && O90.m5963a(this.f46075b, c7178y4.f46075b);
    }

    public final int hashCode() {
        return this.f46075b.hashCode() + (this.f46074a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f46074a + ", findByIssuerAndSignatureMethod=" + this.f46075b + ')';
    }
}
