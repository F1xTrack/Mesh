package defpackage;

import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* renamed from: eB0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3533eB0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C6685qd0 b;

    public /* synthetic */ RunnableC3533eB0(C6685qd0 c6685qd0, int i) {
        this.a = i;
        this.b = c6685qd0;
    }

    @Override // java.lang.Runnable
    public final void run() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        switch (this.a) {
            case 0:
                this.b.invoke();
                break;
            default:
                this.b.invoke();
                break;
        }
    }
}
