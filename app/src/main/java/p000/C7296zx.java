package p000;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* renamed from: zx */
/* loaded from: classes2.dex */
public final class C7296zx implements I21 {

    /* renamed from: a */
    public static final C7233yx f47109a = new C7233yx();

    @Override // p000.I21
    /* renamed from: a */
    public final boolean mo1524a() {
        boolean z = C7170xx.f45912d;
        return C7170xx.f45912d;
    }

    @Override // p000.I21
    /* renamed from: b */
    public final boolean mo1525b(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p000.I21
    /* renamed from: c */
    public final String mo1526c(SSLSocket sSLSocket) {
        if (mo1525b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p000.I21
    /* renamed from: d */
    public final void mo1527d(SSLSocket sSLSocket, String str, List list) {
        O90.m5968f(list, "protocols");
        if (mo1525b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            C10745qB0 c10745qB0 = C10745qB0.f40658a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) NV1.m5735q(list).toArray(new String[0]));
        }
    }
}
