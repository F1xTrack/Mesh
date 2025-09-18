package defpackage;

import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class DB1 {
    protected int zza;

    public abstract int a(PH1 ph1);

    public final byte[] b() {
        try {
            int iC = c();
            byte[] bArr = new byte[iC];
            C5271jD1 c5271jD1 = new C5271jD1(bArr, iC);
            EE1 ee1 = (EE1) this;
            PH1 ph1A = IH1.c.a(ee1.getClass());
            C6273oT0 c6273oT0 = c5271jD1.a;
            if (c6273oT0 == null) {
                c6273oT0 = new C6273oT0();
                Charset charset = AbstractC3356dF1.a;
                c6273oT0.a = c5271jD1;
                c5271jD1.a = c6273oT0;
            }
            ph1A.h(ee1, c6273oT0);
            if (iC - c5271jD1.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(AbstractC8235ym.k("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    public abstract int c();
}
