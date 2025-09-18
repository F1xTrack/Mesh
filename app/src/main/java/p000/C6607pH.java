package p000;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: pH */
/* loaded from: classes2.dex */
public final class C6607pH implements I21 {

    /* renamed from: a */
    public final InterfaceC6542oH f39994a;

    /* renamed from: b */
    public I21 f39995b;

    public C6607pH(InterfaceC6542oH interfaceC6542oH) {
        this.f39994a = interfaceC6542oH;
    }

    @Override // p000.I21
    /* renamed from: a */
    public final boolean mo1524a() {
        return true;
    }

    @Override // p000.I21
    /* renamed from: b */
    public final boolean mo1525b(SSLSocket sSLSocket) {
        return this.f39994a.mo5743b(sSLSocket);
    }

    @Override // p000.I21
    /* renamed from: c */
    public final String mo1526c(SSLSocket sSLSocket) {
        I21 i21M23698e = m23698e(sSLSocket);
        if (i21M23698e != null) {
            return i21M23698e.mo1526c(sSLSocket);
        }
        return null;
    }

    @Override // p000.I21
    /* renamed from: d */
    public final void mo1527d(SSLSocket sSLSocket, String str, List list) {
        O90.m5968f(list, "protocols");
        I21 i21M23698e = m23698e(sSLSocket);
        if (i21M23698e != null) {
            i21M23698e.mo1527d(sSLSocket, str, list);
        }
    }

    /* renamed from: e */
    public final synchronized I21 m23698e(SSLSocket sSLSocket) {
        try {
            if (this.f39995b == null && this.f39994a.mo5743b(sSLSocket)) {
                this.f39995b = this.f39994a.mo5745e(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f39995b;
    }
}
