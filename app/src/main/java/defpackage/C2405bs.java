package defpackage;

import java.io.Closeable;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.KeyStoreException;

/* renamed from: bs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2405bs implements Closeable {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public C2405bs(AbstractC3280cs abstractC3280cs) {
        Key keyM = abstractC3280cs.m(abstractC3280cs.r("AndroidKeyStore#supportsSecureHardware", true).build());
        this.d = abstractC3280cs;
        this.b = "AndroidKeyStore#supportsSecureHardware";
        this.c = keyM;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws KeyStoreException {
        Object obj = this.d;
        switch (this.a) {
            case 0:
                try {
                    ((AbstractC3280cs) obj).f((String) this.b);
                    break;
                } catch (C1205Pf0 e) {
                    Charset charset = AbstractC3280cs.g;
                    e.getMessage();
                    return;
                }
            default:
                ((C4210hk) obj).j(true, true, null);
                break;
        }
    }

    public C2405bs(C8351zN0 c8351zN0, C8161yN0 c8161yN0, C4210hk c4210hk) {
        this.d = c4210hk;
        O90.f(c8351zN0, "source");
        O90.f(c8161yN0, "sink");
        this.b = c8351zN0;
        this.c = c8161yN0;
    }
}
