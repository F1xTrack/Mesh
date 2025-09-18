package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* renamed from: io.appmetrica.analytics.impl.b */
/* loaded from: classes2.dex */
public final class C5008b implements InterfaceC4415C8 {

    /* renamed from: a */
    public final AESEncrypter f31271a;

    public C5008b() {
        this(new C4983a(C5244ka.m20614h().m20621e()));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // io.appmetrica.analytics.impl.InterfaceC4415C8
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C5542w8 mo19265a(io.appmetrica.analytics.impl.C4821T5 r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.getValue()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L1e
            java.lang.String r1 = "UTF-8"
            byte[] r0 = r0.getBytes(r1)     // Catch: java.lang.Throwable -> L1e
            io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter r1 = r2.f31271a     // Catch: java.lang.Throwable -> L1e
            byte[] r0 = r1.encrypt(r0)     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L1e
            r1 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)     // Catch: java.lang.Throwable -> L1e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            r3.setValue(r0)
            io.appmetrica.analytics.impl.w8 r0 = new io.appmetrica.analytics.impl.w8
            io.appmetrica.analytics.impl.E8 r1 = io.appmetrica.analytics.impl.EnumC4465E8.AES_VALUE_ENCRYPTION
            r0.<init>(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5008b.mo19265a(io.appmetrica.analytics.impl.T5):io.appmetrica.analytics.impl.w8");
    }

    public C5008b(C4983a c4983a) {
        this(new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c4983a.m20096b(), c4983a.m20095a()));
    }

    public C5008b(AESEncrypter aESEncrypter) {
        this.f31271a = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4415C8
    /* renamed from: a */
    public final byte[] mo19266a(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null || bArr.length <= 0) {
            return bArr2;
        }
        try {
            return this.f31271a.decrypt(Base64.decode(bArr, 0));
        } catch (Throwable unused) {
            return bArr2;
        }
    }

    /* renamed from: a */
    public final EnumC4465E8 m20131a() {
        return EnumC4465E8.AES_VALUE_ENCRYPTION;
    }
}
