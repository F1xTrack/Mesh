package p000;

import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* renamed from: eB0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC9209eB0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f26586a;

    /* renamed from: b */
    public final /* synthetic */ C10801qd0 f26587b;

    public /* synthetic */ RunnableC9209eB0(C10801qd0 c10801qd0, int i) {
        this.f26586a = i;
        this.f26587b = c10801qd0;
    }

    @Override // java.lang.Runnable
    public final void run() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        switch (this.f26586a) {
            case 0:
                this.f26587b.invoke();
                break;
            default:
                this.f26587b.invoke();
                break;
        }
    }
}
