package p000;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* renamed from: z4 */
/* loaded from: classes2.dex */
public final class C7241z4 extends C10745qB0 {

    /* renamed from: e */
    public static final boolean f46624e;

    /* renamed from: c */
    public final ArrayList f46625c;

    /* renamed from: d */
    public final C8539Xo1 f46626d;

    static {
        boolean z = false;
        if (NV1.m5739u() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f46624e = z;
    }

    public C7241z4() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        C9836j41 c9836j41;
        Method method;
        Method method2;
        Method method3;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            c9836j41 = new C9836j41(cls);
        } catch (Exception e) {
            C10745qB0.f40658a.getClass();
            C10745qB0.m23946i(5, "unable to load android socket classes", e);
            c9836j41 = null;
        }
        ArrayList arrayListM4186m = AbstractC0576J8.m4186m(new I21[]{c9836j41, new C6607pH(C0194D4.f1821f), new C6607pH(C7296zx.f47109a), new C6607pH(C1429Wi.f13329a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListM4186m.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((I21) next).mo1524a()) {
                arrayList.add(next);
            }
        }
        this.f46625c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = method4;
            method3 = cls2.getMethod("warnIfOpen", null);
        } catch (Exception unused) {
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f46626d = new C8539Xo1(method, method2, method3, 8, false);
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
    /* renamed from: c */
    public final InterfaceC9650hd1 mo23948c(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        O90.m5968f(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C7178y4(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo23948c(x509TrustManager);
        }
    }

    @Override // p000.C10745qB0
    /* renamed from: d */
    public final void mo5408d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        O90.m5968f(list, "protocols");
        Iterator it = this.f46625c.iterator();
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
    /* renamed from: e */
    public final void mo23949e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        O90.m5968f(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            throw new IOException("Exception in connect", e);
        }
    }

    @Override // p000.C10745qB0
    /* renamed from: f */
    public final String mo5409f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f46625c.iterator();
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
    /* renamed from: g */
    public final Object mo23950g() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C8539Xo1 c8539Xo1 = this.f46626d;
        c8539Xo1.getClass();
        Method method = (Method) c8539Xo1.f13981b;
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, null);
            Method method2 = (Method) c8539Xo1.f13982c;
            O90.m5965c(method2);
            method2.invoke(objInvoke, "response.body().close()");
            return objInvoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p000.C10745qB0
    /* renamed from: h */
    public final boolean mo9670h(String str) {
        O90.m5968f(str, "hostname");
        return Build.VERSION.SDK_INT >= 24 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str) : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override // p000.C10745qB0
    /* renamed from: k */
    public final void mo23951k(Object obj, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        O90.m5968f(str, "message");
        C8539Xo1 c8539Xo1 = this.f46626d;
        c8539Xo1.getClass();
        if (obj != null) {
            try {
                Method method = (Method) c8539Xo1.f13983d;
                O90.m5965c(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        C10745qB0.m23947j(this, str, 5, 4);
    }
}
