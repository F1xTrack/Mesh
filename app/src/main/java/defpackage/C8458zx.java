package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* renamed from: zx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8458zx implements I21 {
    public static final C8268yx a = new C8268yx();

    @Override // defpackage.I21
    public final boolean a() {
        boolean z = C8078xx.d;
        return C8078xx.d;
    }

    @Override // defpackage.I21
    public final boolean b(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.I21
    public final String c(SSLSocket sSLSocket) {
        if (b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.I21
    public final void d(SSLSocket sSLSocket, String str, List list) {
        O90.f(list, "protocols");
        if (b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            C6601qB0 c6601qB0 = C6601qB0.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) NV1.q(list).toArray(new String[0]));
        }
    }
}
