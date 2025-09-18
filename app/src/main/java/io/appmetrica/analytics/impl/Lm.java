package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;

/* loaded from: classes2.dex */
public final class Lm implements pn {
    public final D8 a;

    public Lm() {
        this(new D8());
    }

    @Override // io.appmetrica.analytics.impl.pn
    public final byte[] a(J8 j8, Eg eg) {
        byte[] bArrDecompressBase64GzipAsBytes = new byte[0];
        try {
            bArrDecompressBase64GzipAsBytes = Base64Utils.decompressBase64GzipAsBytes(j8.b);
        } catch (Throwable unused) {
        }
        byte[] bArrA = ((C8) this.a.a.a(j8.o)).a(bArrDecompressBase64GzipAsBytes);
        return bArrA == null ? new byte[0] : bArrA;
    }

    public Lm(D8 d8) {
        this.a = d8;
    }

    public final D8 a() {
        return this.a;
    }
}
