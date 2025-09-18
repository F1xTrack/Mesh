package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: y4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8103y4 implements InterfaceC4191hd1 {
    public final X509TrustManager a;
    public final Method b;

    public C8103y4(X509TrustManager x509TrustManager, Method method) {
        O90.f(x509TrustManager, "trustManager");
        this.a = x509TrustManager;
        this.b = method;
    }

    @Override // defpackage.InterfaceC4191hd1
    public final X509Certificate a(X509Certificate x509Certificate) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = this.b.invoke(this.a, x509Certificate);
            O90.d(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
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
        if (!(obj instanceof C8103y4)) {
            return false;
        }
        C8103y4 c8103y4 = (C8103y4) obj;
        return O90.a(this.a, c8103y4.a) && O90.a(this.b, c8103y4.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.b + ')';
    }
}
