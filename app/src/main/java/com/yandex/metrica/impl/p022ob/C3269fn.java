package com.yandex.metrica.impl.p022ob;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* renamed from: com.yandex.metrica.impl.ob.fn */
/* loaded from: classes2.dex */
public class C3269fn implements InterfaceC3399kn {

    /* renamed from: a */
    private final C3243en f23455a;

    public C3269fn() {
        this(new C3217dn(C2842P0.m14728i().m14736f()));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3399kn
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.yandex.metrica.impl.p022ob.C3373jn mo15949a(com.yandex.metrica.impl.p022ob.C3376k0 r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.m16246p()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L1e
            java.lang.String r1 = "UTF-8"
            byte[] r0 = r0.getBytes(r1)     // Catch: java.lang.Throwable -> L1e
            com.yandex.metrica.impl.ob.en r1 = r2.f23455a     // Catch: java.lang.Throwable -> L1e
            byte[] r0 = r1.m15862a(r0)     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L1e
            r1 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)     // Catch: java.lang.Throwable -> L1e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            com.yandex.metrica.impl.ob.jn r1 = new com.yandex.metrica.impl.ob.jn
            com.yandex.metrica.impl.ob.k0 r3 = r3.mo15103f(r0)
            com.yandex.metrica.impl.ob.mn r0 = com.yandex.metrica.impl.p022ob.EnumC3451mn.AES_VALUE_ENCRYPTION
            r1.<init>(r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C3269fn.mo15949a(com.yandex.metrica.impl.ob.k0):com.yandex.metrica.impl.ob.jn");
    }

    public C3269fn(C3217dn c3217dn) {
        this(new C3243en(AESEncrypter.DEFAULT_ALGORITHM, c3217dn.m15807b(), c3217dn.m15806a()));
    }

    public C3269fn(C3243en c3243en) {
        this.f23455a = c3243en;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3399kn
    /* renamed from: a */
    public byte[] mo15950a(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null || bArr.length <= 0) {
            return bArr2;
        }
        try {
            byte[] bArrDecode = Base64.decode(bArr, 0);
            C3243en c3243en = this.f23455a;
            c3243en.getClass();
            return c3243en.m15863a(bArrDecode, 0, bArrDecode.length);
        } catch (Throwable unused) {
            return bArr2;
        }
    }
}
