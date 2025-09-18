package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: D4 */
/* loaded from: classes2.dex */
public class C0194D4 implements I21 {

    /* renamed from: f */
    public static final NV1 f1821f = new NV1(7);

    /* renamed from: a */
    public final Class f1822a;

    /* renamed from: b */
    public final Method f1823b;

    /* renamed from: c */
    public final Method f1824c;

    /* renamed from: d */
    public final Method f1825d;

    /* renamed from: e */
    public final Method f1826e;

    public C0194D4(Class cls) throws NoSuchMethodException, SecurityException {
        this.f1822a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        O90.m5967e(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f1823b = declaredMethod;
        this.f1824c = cls.getMethod("setHostname", String.class);
        this.f1825d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f1826e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p000.I21
    /* renamed from: a */
    public final boolean mo1524a() {
        boolean z = C7241z4.f46624e;
        return C7241z4.f46624e;
    }

    @Override // p000.I21
    /* renamed from: b */
    public final boolean mo1525b(SSLSocket sSLSocket) {
        return this.f1822a.isInstance(sSLSocket);
    }

    @Override // p000.I21
    /* renamed from: c */
    public final String mo1526c(SSLSocket sSLSocket) {
        if (!this.f1822a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f1825d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, AbstractC7038vr.f44561a);
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && O90.m5963a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    @Override // p000.I21
    /* renamed from: d */
    public final void mo1527d(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        O90.m5968f(list, "protocols");
        if (this.f1822a.isInstance(sSLSocket)) {
            try {
                this.f1823b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f1824c.invoke(sSLSocket, str);
                }
                Method method = this.f1826e;
                C10745qB0 c10745qB0 = C10745qB0.f40658a;
                method.invoke(sSLSocket, NV1.m5737s(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
