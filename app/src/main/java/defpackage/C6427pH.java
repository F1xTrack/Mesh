package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: pH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6427pH implements I21 {
    public final InterfaceC6236oH a;
    public I21 b;

    public C6427pH(InterfaceC6236oH interfaceC6236oH) {
        this.a = interfaceC6236oH;
    }

    @Override // defpackage.I21
    public final boolean a() {
        return true;
    }

    @Override // defpackage.I21
    public final boolean b(SSLSocket sSLSocket) {
        return this.a.b(sSLSocket);
    }

    @Override // defpackage.I21
    public final String c(SSLSocket sSLSocket) {
        I21 i21E = e(sSLSocket);
        if (i21E != null) {
            return i21E.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.I21
    public final void d(SSLSocket sSLSocket, String str, List list) {
        O90.f(list, "protocols");
        I21 i21E = e(sSLSocket);
        if (i21E != null) {
            i21E.d(sSLSocket, str, list);
        }
    }

    public final synchronized I21 e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.b(sSLSocket)) {
                this.b = this.a.e(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
