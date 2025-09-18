package defpackage;

import android.net.http.X509TrustManagerExtensions;
import javax.net.ssl.X509TrustManager;

/* renamed from: Ft1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0469Ft1 {
    public final X509TrustManager a;
    public final X509TrustManagerExtensions b;

    public C0469Ft1(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        O90.f(x509TrustManager, "trustManager");
        this.a = x509TrustManager;
        this.b = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0469Ft1)) {
            return false;
        }
        C0469Ft1 c0469Ft1 = (C0469Ft1) obj;
        return O90.a(this.a, c0469Ft1.a) && O90.a(this.b, c0469Ft1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "X509TrustPair(trustManager=" + this.a + ", trustExtensions=" + this.b + ')';
    }
}
