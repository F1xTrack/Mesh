package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* renamed from: Wi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1759Wi implements I21 {
    public static final C1681Vi a = new C1681Vi();

    @Override // defpackage.I21
    public final boolean a() {
        boolean z = C1603Ui.d;
        return C1603Ui.d;
    }

    @Override // defpackage.I21
    public final boolean b(SSLSocket sSLSocket) {
        return false;
    }

    @Override // defpackage.I21
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : O90.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.I21
    public final void d(SSLSocket sSLSocket, String str, List list) {
        O90.f(list, "protocols");
        if (b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            C6601qB0 c6601qB0 = C6601qB0.a;
            parameters.setApplicationProtocols((String[]) NV1.q(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
