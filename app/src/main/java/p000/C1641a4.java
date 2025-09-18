package p000;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* renamed from: a4 */
/* loaded from: classes2.dex */
public final class C1641a4 extends C10745qB0 {

    /* renamed from: d */
    public static final boolean f15300d;

    /* renamed from: c */
    public final ArrayList f15301c;

    static {
        f15300d = NV1.m5739u() && Build.VERSION.SDK_INT >= 29;
    }

    public C1641a4() {
        ArrayList arrayListM4186m = AbstractC0576J8.m4186m(new I21[]{(!NV1.m5739u() || Build.VERSION.SDK_INT < 29) ? null : new C1762b4(), new C6607pH(C0194D4.f1821f), new C6607pH(C7296zx.f47109a), new C6607pH(C1429Wi.f13329a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListM4186m.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((I21) next).mo1524a()) {
                arrayList.add(next);
            }
        }
        this.f15301c = arrayList;
    }

    @Override // p000.C10745qB0
    /* renamed from: b */
    public final AbstractC11164tS1 mo9669b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        O90.m5968f(x509TrustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C4156h4 c4156h4 = x509TrustManagerExtensions != null ? new C4156h4(x509TrustManager, x509TrustManagerExtensions) : null;
        return c4156h4 != null ? c4156h4 : super.mo9669b(x509TrustManager);
    }

    @Override // p000.C10745qB0
    /* renamed from: d */
    public final void mo5408d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        O90.m5968f(list, "protocols");
        Iterator it = this.f15301c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((I21) next).mo1525b(sSLSocket)) {
                    break;
                }
            }
        }
        I21 i21 = (I21) next;
        if (i21 != null) {
            i21.mo1527d(sSLSocket, str, list);
        }
    }

    @Override // p000.C10745qB0
    /* renamed from: f */
    public final String mo5409f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f15301c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((I21) next).mo1525b(sSLSocket)) {
                break;
            }
        }
        I21 i21 = (I21) next;
        if (i21 != null) {
            return i21.mo1526c(sSLSocket);
        }
        return null;
    }

    @Override // p000.C10745qB0
    /* renamed from: h */
    public final boolean mo9670h(String str) {
        O90.m5968f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
