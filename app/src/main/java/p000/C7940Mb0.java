package p000;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: Mb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7940Mb0 extends C10745qB0 {

    /* renamed from: c */
    public final Method f7246c;

    /* renamed from: d */
    public final Method f7247d;

    /* renamed from: e */
    public final Method f7248e;

    /* renamed from: f */
    public final Class f7249f;

    /* renamed from: g */
    public final Class f7250g;

    public C7940Mb0(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f7246c = method;
        this.f7247d = method2;
        this.f7248e = method3;
        this.f7249f = cls;
        this.f7250g = cls2;
    }

    @Override // p000.C10745qB0
    /* renamed from: a */
    public final void mo5407a(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f7248e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // p000.C10745qB0
    /* renamed from: d */
    public final void mo5408d(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        O90.m5968f(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC9219eG0) obj) != EnumC9219eG0.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC9219eG0) it.next()).f26631a);
        }
        try {
            this.f7246c.invoke(null, sSLSocket, Proxy.newProxyInstance(C10745qB0.class.getClassLoader(), new Class[]{this.f7249f, this.f7250g}, new C7888Lb0(arrayList2)));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // p000.C10745qB0
    /* renamed from: f */
    public final String mo5409f(SSLSocket sSLSocket) throws IllegalArgumentException {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f7247d.invoke(null, sSLSocket));
            O90.m5966d(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            C7888Lb0 c7888Lb0 = (C7888Lb0) invocationHandler;
            boolean z = c7888Lb0.f6747b;
            if (!z && c7888Lb0.f6748c == null) {
                C10745qB0.m23947j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6);
                return null;
            }
            if (z) {
                return null;
            }
            return c7888Lb0.f6748c;
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
