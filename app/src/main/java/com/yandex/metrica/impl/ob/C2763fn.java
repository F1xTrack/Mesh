package com.yandex.metrica.impl.ob;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* renamed from: com.yandex.metrica.impl.ob.fn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2763fn implements InterfaceC2887kn {
    private final C2738en a;

    public C2763fn() {
        this(new C2713dn(P0.i().f()));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // com.yandex.metrica.impl.ob.InterfaceC2887kn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.yandex.metrica.impl.ob.C2862jn a(com.yandex.metrica.impl.ob.C2864k0 r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.p()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L1e
            java.lang.String r1 = "UTF-8"
            byte[] r0 = r0.getBytes(r1)     // Catch: java.lang.Throwable -> L1e
            com.yandex.metrica.impl.ob.en r1 = r2.a     // Catch: java.lang.Throwable -> L1e
            byte[] r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L1e
            r1 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)     // Catch: java.lang.Throwable -> L1e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            com.yandex.metrica.impl.ob.jn r1 = new com.yandex.metrica.impl.ob.jn
            com.yandex.metrica.impl.ob.k0 r3 = r3.f(r0)
            com.yandex.metrica.impl.ob.mn r0 = com.yandex.metrica.impl.ob.EnumC2937mn.AES_VALUE_ENCRYPTION
            r1.<init>(r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C2763fn.a(com.yandex.metrica.impl.ob.k0):com.yandex.metrica.impl.ob.jn");
    }

    public C2763fn(C2713dn c2713dn) {
        this(new C2738en(AESEncrypter.DEFAULT_ALGORITHM, c2713dn.b(), c2713dn.a()));
    }

    public C2763fn(C2738en c2738en) {
        this.a = c2738en;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2887kn
    public byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null || bArr.length <= 0) {
            return bArr2;
        }
        try {
            byte[] bArrDecode = Base64.decode(bArr, 0);
            C2738en c2738en = this.a;
            c2738en.getClass();
            return c2738en.a(bArrDecode, 0, bArrDecode.length);
        } catch (Throwable unused) {
            return bArr2;
        }
    }
}
