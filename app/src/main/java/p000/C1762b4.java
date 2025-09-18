package p000;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: b4 */
/* loaded from: classes2.dex */
public final class C1762b4 implements I21 {
    @Override // p000.I21
    /* renamed from: a */
    public final boolean mo1524a() {
        C10745qB0 c10745qB0 = C10745qB0.f40658a;
        return NV1.m5739u() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // p000.I21
    /* renamed from: b */
    public final boolean mo1525b(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // p000.I21
    /* renamed from: c */
    public final String mo1526c(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p000.I21
    /* renamed from: d */
    public final void mo1527d(SSLSocket sSLSocket, String str, List list) throws IOException {
        O90.m5968f(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            C10745qB0 c10745qB0 = C10745qB0.f40658a;
            sSLParameters.setApplicationProtocols((String[]) NV1.m5735q(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
