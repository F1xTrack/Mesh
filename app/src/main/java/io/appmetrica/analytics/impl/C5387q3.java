package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.q3 */
/* loaded from: classes2.dex */
public final class C5387q3 extends AbstractC4842U2 {
    public C5387q3(int i, String str, PublicLogger publicLogger) {
        super(i, str, publicLogger);
    }

    /* renamed from: b */
    public final int m20927b() {
        return this.f30802a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4551Hm
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] mo19479a(byte[] bArr) {
        if (bArr == null) {
            return bArr;
        }
        int length = bArr.length;
        int i = this.f30802a;
        if (length <= i) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        this.f30804c.warning("\"%s\" %s exceeded limit of %d bytes", this.f30803b, bArr, Integer.valueOf(this.f30802a));
        return bArr2;
    }

    /* renamed from: a */
    public final String m20925a() {
        return this.f30803b;
    }
}
