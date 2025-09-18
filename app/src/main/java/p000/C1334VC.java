package p000;

import android.net.Uri;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URLDecoder;

/* renamed from: VC */
/* loaded from: classes.dex */
public final class C1334VC extends AbstractC1426Wf {

    /* renamed from: e */
    public C3976eD f12409e;

    /* renamed from: f */
    public byte[] f12410f;

    /* renamed from: g */
    public int f12411g;

    /* renamed from: h */
    public int f12412h;

    @Override // p000.InterfaceC1586ZC
    /* renamed from: c */
    public final long mo2365c(C3976eD c3976eD) throws C1650aD, C10103lA0 {
        m8827g();
        this.f12409e = c3976eD;
        Uri uriNormalizeScheme = c3976eD.f26595a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        YN1.m9277b("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i = AbstractC7485Dh1.f2166a;
        String[] strArrSplit = schemeSpecificPart.split(StringUtils.COMMA, -1);
        if (strArrSplit.length != 2) {
            throw new C10103lA0(AbstractC11153tN0.m24911w("Unexpected URI format: ", uriNormalizeScheme), null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f12410f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new C10103lA0(AbstractC7222ym.m26245v("Error while parsing Base64 encoded string: ", str), e, true, 0);
            }
        } else {
            this.f12410f = URLDecoder.decode(str, AbstractC7227yr.f46509a.name()).getBytes(AbstractC7227yr.f46511c);
        }
        byte[] bArr = this.f12410f;
        long length = bArr.length;
        long j = c3976eD.f26600f;
        if (j > length) {
            this.f12410f = null;
            throw new C1650aD(2008);
        }
        int i2 = (int) j;
        this.f12411g = i2;
        int length2 = bArr.length - i2;
        this.f12412h = length2;
        long j2 = c3976eD.f26601g;
        if (j2 != -1) {
            this.f12412h = (int) Math.min(length2, j2);
        }
        m8828h(c3976eD);
        return j2 != -1 ? j2 : this.f12412h;
    }

    @Override // p000.InterfaceC1586ZC
    public final void close() {
        if (this.f12410f != null) {
            this.f12410f = null;
            m8826e();
        }
        this.f12409e = null;
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: o */
    public final Uri mo2366o() {
        C3976eD c3976eD = this.f12409e;
        if (c3976eD != null) {
            return c3976eD.f26595a;
        }
        return null;
    }

    @Override // p000.InterfaceC1082RC
    /* renamed from: r */
    public final int mo2367r(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f12412h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f12410f;
        int i4 = AbstractC7485Dh1.f2166a;
        System.arraycopy(bArr2, this.f12411g, bArr, i, iMin);
        this.f12411g += iMin;
        this.f12412h -= iMin;
        m8825a(iMin);
        return iMin;
    }
}
