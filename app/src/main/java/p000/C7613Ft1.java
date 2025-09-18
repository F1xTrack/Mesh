package p000;

import android.net.http.X509TrustManagerExtensions;
import javax.net.ssl.X509TrustManager;

/* renamed from: Ft1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7613Ft1 {

    /* renamed from: a */
    public final X509TrustManager f3461a;

    /* renamed from: b */
    public final X509TrustManagerExtensions f3462b;

    public C7613Ft1(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        O90.m5968f(x509TrustManager, "trustManager");
        this.f3461a = x509TrustManager;
        this.f3462b = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7613Ft1)) {
            return false;
        }
        C7613Ft1 c7613Ft1 = (C7613Ft1) obj;
        return O90.m5963a(this.f3461a, c7613Ft1.f3461a) && O90.m5963a(this.f3462b, c7613Ft1.f3462b);
    }

    public final int hashCode() {
        return this.f3462b.hashCode() + (this.f3461a.hashCode() * 31);
    }

    public final String toString() {
        return "X509TrustPair(trustManager=" + this.f3461a + ", trustExtensions=" + this.f3462b + ')';
    }
}
