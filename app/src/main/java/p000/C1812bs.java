package p000;

import java.io.Closeable;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.KeyStoreException;

/* renamed from: bs */
/* loaded from: classes2.dex */
public final class C1812bs implements Closeable {

    /* renamed from: a */
    public final /* synthetic */ int f17195a = 0;

    /* renamed from: b */
    public final Object f17196b;

    /* renamed from: c */
    public final Object f17197c;

    /* renamed from: d */
    public final /* synthetic */ Object f17198d;

    public C1812bs(AbstractC3892cs abstractC3892cs) {
        Key keyMo17426m = abstractC3892cs.mo17426m(abstractC3892cs.mo17431r("AndroidKeyStore#supportsSecureHardware", true).build());
        this.f17198d = abstractC3892cs;
        this.f17196b = "AndroidKeyStore#supportsSecureHardware";
        this.f17197c = keyMo17426m;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws KeyStoreException {
        Object obj = this.f17198d;
        switch (this.f17195a) {
            case 0:
                try {
                    ((AbstractC3892cs) obj).mo9620f((String) this.f17196b);
                    break;
                } catch (C8104Pf0 e) {
                    Charset charset = AbstractC3892cs.f25682g;
                    e.getMessage();
                    return;
                }
            default:
                ((C4198hk) obj).m18862j(true, true, null);
                break;
        }
    }

    public C1812bs(C11917zN0 c11917zN0, C11790yN0 c11790yN0, C4198hk c4198hk) {
        this.f17198d = c4198hk;
        O90.m5968f(c11917zN0, "source");
        O90.m5968f(c11790yN0, "sink");
        this.f17196b = c11917zN0;
        this.f17197c = c11790yN0;
    }
}
