package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.p028io.Base64Utils;

/* renamed from: io.appmetrica.analytics.impl.Lm */
/* loaded from: classes2.dex */
public final class C4647Lm implements InterfaceC5382pn {

    /* renamed from: a */
    public final C4440D8 f30453a;

    public C4647Lm() {
        this(new C4440D8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5382pn
    /* renamed from: a */
    public final byte[] mo19606a(C4585J8 c4585j8, C4473Eg c4473Eg) {
        byte[] bArrDecompressBase64GzipAsBytes = new byte[0];
        try {
            bArrDecompressBase64GzipAsBytes = Base64Utils.decompressBase64GzipAsBytes(c4585j8.f30338b);
        } catch (Throwable unused) {
        }
        byte[] bArrMo19266a = ((InterfaceC4415C8) this.f30453a.f30009a.m20862a(c4585j8.f30351o)).mo19266a(bArrDecompressBase64GzipAsBytes);
        return bArrMo19266a == null ? new byte[0] : bArrMo19266a;
    }

    public C4647Lm(C4440D8 c4440d8) {
        this.f30453a = c4440d8;
    }

    /* renamed from: a */
    public final C4440D8 m19605a() {
        return this.f30453a;
    }
}
