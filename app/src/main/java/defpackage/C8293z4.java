package defpackage;

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
public final class C8293z4 extends C6601qB0 {
    public static final boolean e;
    public final ArrayList c;
    public final C1857Xo1 d;

    static {
        boolean z = false;
        if (NV1.u() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        e = z;
    }

    public C8293z4() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        C5244j41 c5244j41;
        Method method;
        Method method2;
        Method method3;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            c5244j41 = new C5244j41(cls);
        } catch (Exception e2) {
            C6601qB0.a.getClass();
            C6601qB0.i(5, "unable to load android socket classes", e2);
            c5244j41 = null;
        }
        ArrayList arrayListM = J8.m(new I21[]{c5244j41, new C6427pH(D4.f), new C6427pH(C8458zx.a), new C6427pH(C1759Wi.a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListM.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((I21) next).a()) {
                arrayList.add(next);
            }
        }
        this.c = arrayList;
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
        this.d = new C1857Xo1(method, method2, method3, 8, false);
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
    public final InterfaceC4191hd1 c(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        O90.f(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C8103y4(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
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
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        O90.f(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
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
    public final Object g() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C1857Xo1 c1857Xo1 = this.d;
        c1857Xo1.getClass();
        Method method = (Method) c1857Xo1.b;
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, null);
            Method method2 = (Method) c1857Xo1.c;
            O90.c(method2);
            method2.invoke(objInvoke, "response.body().close()");
            return objInvoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.C6601qB0
    public final boolean h(String str) {
        O90.f(str, "hostname");
        return Build.VERSION.SDK_INT >= 24 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str) : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override // defpackage.C6601qB0
    public final void k(Object obj, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        O90.f(str, "message");
        C1857Xo1 c1857Xo1 = this.d;
        c1857Xo1.getClass();
        if (obj != null) {
            try {
                Method method = (Method) c1857Xo1.d;
                O90.c(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        C6601qB0.j(this, str, 5, 4);
    }
}
