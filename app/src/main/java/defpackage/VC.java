package defpackage;

import android.net.Uri;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class VC extends AbstractC1750Wf {
    public C3538eD e;
    public byte[] f;
    public int g;
    public int h;

    @Override // defpackage.ZC
    public final long c(C3538eD c3538eD) throws C2091aD, C5643lA0 {
        g();
        this.e = c3538eD;
        Uri uriNormalizeScheme = c3538eD.a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        YN1.b("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i = AbstractC0277Dh1.a;
        String[] strArrSplit = schemeSpecificPart.split(StringUtils.COMMA, -1);
        if (strArrSplit.length != 2) {
            throw new C5643lA0(AbstractC7209tN0.w("Unexpected URI format: ", uriNormalizeScheme), null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new C5643lA0(AbstractC8235ym.v("Error while parsing Base64 encoded string: ", str), e, true, 0);
            }
        } else {
            this.f = URLDecoder.decode(str, AbstractC8250yr.a.name()).getBytes(AbstractC8250yr.c);
        }
        byte[] bArr = this.f;
        long length = bArr.length;
        long j = c3538eD.f;
        if (j > length) {
            this.f = null;
            throw new C2091aD(2008);
        }
        int i2 = (int) j;
        this.g = i2;
        int length2 = bArr.length - i2;
        this.h = length2;
        long j2 = c3538eD.g;
        if (j2 != -1) {
            this.h = (int) Math.min(length2, j2);
        }
        h(c3538eD);
        return j2 != -1 ? j2 : this.h;
    }

    @Override // defpackage.ZC
    public final void close() {
        if (this.f != null) {
            this.f = null;
            e();
        }
        this.e = null;
    }

    @Override // defpackage.ZC
    public final Uri o() {
        C3538eD c3538eD = this.e;
        if (c3538eD != null) {
            return c3538eD.a;
        }
        return null;
    }

    @Override // defpackage.RC
    public final int r(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        int i4 = AbstractC0277Dh1.a;
        System.arraycopy(bArr2, this.g, bArr, i, iMin);
        this.g += iMin;
        this.h -= iMin;
        a(iMin);
        return iMin;
    }
}
