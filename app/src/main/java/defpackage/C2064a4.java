package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* renamed from: a4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2064a4 extends C6601qB0 {
    public static final boolean d;
    public final ArrayList c;

    static {
        d = NV1.u() && Build.VERSION.SDK_INT >= 29;
    }

    public C2064a4() {
        ArrayList arrayListM = J8.m(new I21[]{(!NV1.u() || Build.VERSION.SDK_INT < 29) ? null : new C2255b4(), new C6427pH(D4.f), new C6427pH(C8458zx.a), new C6427pH(C1759Wi.a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListM.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((I21) next).a()) {
                arrayList.add(next);
            }
        }
        this.c = arrayList;
    }

    @Override // defpackage.C6601qB0
    public final AbstractC7225tS1 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        O90.f(x509TrustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C4084h4 c4084h4 = x509TrustManagerExtensions != null ? new C4084h4(x509TrustManager, x509TrustManagerExtensions) : null;
        return c4084h4 != null ? c4084h4 : super.b(x509TrustManager);
    }

    @Override // defpackage.C6601qB0
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        O90.f(list, "protocols");
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((I21) next).b(sSLSocket)) {
                    break;
                }
            }
        }
        I21 i21 = (I21) next;
        if (i21 != null) {
            i21.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.C6601qB0
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((I21) next).b(sSLSocket)) {
                break;
            }
        }
        I21 i21 = (I21) next;
        if (i21 != null) {
            return i21.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.C6601qB0
    public final boolean h(String str) {
        O90.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
