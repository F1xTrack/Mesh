package defpackage;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: b4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2255b4 implements I21 {
    @Override // defpackage.I21
    public final boolean a() {
        C6601qB0 c6601qB0 = C6601qB0.a;
        return NV1.u() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // defpackage.I21
    public final boolean b(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // defpackage.I21
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.I21
    public final void d(SSLSocket sSLSocket, String str, List list) throws IOException {
        O90.f(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            C6601qB0 c6601qB0 = C6601qB0.a;
            sSLParameters.setApplicationProtocols((String[]) NV1.q(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
