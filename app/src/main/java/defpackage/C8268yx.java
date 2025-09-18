package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* renamed from: yx */
/* loaded from: classes2.dex */
public final class C8268yx implements InterfaceC6236oH {
    @Override // defpackage.InterfaceC6236oH
    public final boolean b(SSLSocket sSLSocket) {
        boolean z = C8078xx.d;
        return AbstractC7698vx.b() && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.InterfaceC6236oH
    public final I21 e(SSLSocket sSLSocket) {
        return new C8458zx();
    }
}
