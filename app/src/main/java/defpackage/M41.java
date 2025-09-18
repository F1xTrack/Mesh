package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class M41 implements ZC {
    public final ZC a;
    public long b;
    public Uri c;

    public M41(ZC zc) {
        zc.getClass();
        this.a = zc;
        this.c = Uri.EMPTY;
        Collections.emptyMap();
    }

    @Override // defpackage.ZC
    public final long c(C3538eD c3538eD) {
        this.c = c3538eD.a;
        Collections.emptyMap();
        ZC zc = this.a;
        long jC = zc.c(c3538eD);
        Uri uriO = zc.o();
        uriO.getClass();
        this.c = uriO;
        zc.l();
        return jC;
    }

    @Override // defpackage.ZC
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.ZC
    public final void d(InterfaceC4188hc1 interfaceC4188hc1) {
        interfaceC4188hc1.getClass();
        this.a.d(interfaceC4188hc1);
    }

    @Override // defpackage.ZC
    public final Map l() {
        return this.a.l();
    }

    @Override // defpackage.ZC
    public final Uri o() {
        return this.a.o();
    }

    @Override // defpackage.RC
    public final int r(byte[] bArr, int i, int i2) {
        int iR = this.a.r(bArr, i, i2);
        if (iR != -1) {
            this.b += iR;
        }
        return iR;
    }
}
