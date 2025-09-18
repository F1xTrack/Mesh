package p000;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* renamed from: Wi */
/* loaded from: classes2.dex */
public final class C1429Wi implements I21 {

    /* renamed from: a */
    public static final C1366Vi f13329a = new C1366Vi();

    @Override // p000.I21
    /* renamed from: a */
    public final boolean mo1524a() {
        boolean z = C1303Ui.f11981d;
        return C1303Ui.f11981d;
    }

    @Override // p000.I21
    /* renamed from: b */
    public final boolean mo1525b(SSLSocket sSLSocket) {
        return false;
    }

    @Override // p000.I21
    /* renamed from: c */
    public final String mo1526c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : O90.m5963a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p000.I21
    /* renamed from: d */
    public final void mo1527d(SSLSocket sSLSocket, String str, List list) {
        O90.m5968f(list, "protocols");
        if (mo1525b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            C10745qB0 c10745qB0 = C10745qB0.f40658a;
            parameters.setApplicationProtocols((String[]) NV1.m5735q(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
