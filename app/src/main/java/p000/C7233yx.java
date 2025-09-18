package p000;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* renamed from: yx */
/* loaded from: classes2.dex */
public final class C7233yx implements InterfaceC6542oH {
    @Override // p000.InterfaceC6542oH
    /* renamed from: b */
    public final boolean mo5743b(SSLSocket sSLSocket) {
        boolean z = C7170xx.f45912d;
        return AbstractC7044vx.m25532b() && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p000.InterfaceC6542oH
    /* renamed from: e */
    public final I21 mo5745e(SSLSocket sSLSocket) {
        return new C7296zx();
    }
}
