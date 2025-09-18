package p000;

import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class DB1 {
    protected int zza;

    /* renamed from: a */
    public abstract int mo1586a(PH1 ph1);

    /* renamed from: b */
    public final byte[] m1587b() {
        try {
            int iMo1588c = mo1588c();
            byte[] bArr = new byte[iMo1588c];
            C9854jD1 c9854jD1 = new C9854jD1(bArr, iMo1588c);
            EE1 ee1 = (EE1) this;
            PH1 ph1M3806a = IH1.f4877c.m3806a(ee1.getClass());
            C10525oT0 c10525oT0 = c9854jD1.f34985a;
            if (c10525oT0 == null) {
                c10525oT0 = new C10525oT0();
                Charset charset = AbstractC9090dF1.f25904a;
                c10525oT0.f39025a = c9854jD1;
                c9854jD1.f34985a = c10525oT0;
            }
            ph1M3806a.mo6293h(ee1, c10525oT0);
            if (iMo1588c - c9854jD1.f34988d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(AbstractC7222ym.m26234k("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    /* renamed from: c */
    public abstract int mo1588c();
}
