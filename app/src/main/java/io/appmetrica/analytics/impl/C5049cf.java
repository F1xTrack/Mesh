package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.cf */
/* loaded from: classes2.dex */
public final class C5049cf implements InterfaceC5382pn {
    @Override // io.appmetrica.analytics.impl.InterfaceC5382pn
    /* renamed from: a */
    public final byte[] mo19606a(C4585J8 c4585j8, C4473Eg c4473Eg) {
        if (!TextUtils.isEmpty(c4585j8.f30338b)) {
            try {
                byte[] bArrDecode = Base64.decode(c4585j8.f30338b, 0);
                C4472Ef c4472Ef = (bArrDecode == null || bArrDecode.length == 0) ? null : new C4472Ef(bArrDecode);
                C5249kf c5249kf = new C5249kf();
                String str = c4472Ef.f30076a;
                c5249kf.f32073a = str == null ? new byte[0] : str.getBytes();
                c5249kf.f32075c = c4472Ef.f30077b;
                c5249kf.f32074b = c4472Ef.f30078c;
                int iOrdinal = c4472Ef.f30079d.ordinal();
                int i = 1;
                if (iOrdinal != 1) {
                    i = 2;
                    if (iOrdinal != 2) {
                        i = 0;
                    }
                }
                c5249kf.f32076d = i;
                return MessageNano.toByteArray(c5249kf);
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }
}
