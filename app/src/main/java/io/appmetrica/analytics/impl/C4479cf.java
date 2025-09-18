package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.cf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4479cf implements pn {
    @Override // io.appmetrica.analytics.impl.pn
    public final byte[] a(J8 j8, Eg eg) {
        if (!TextUtils.isEmpty(j8.b)) {
            try {
                byte[] bArrDecode = Base64.decode(j8.b, 0);
                Ef ef = (bArrDecode == null || bArrDecode.length == 0) ? null : new Ef(bArrDecode);
                C4672kf c4672kf = new C4672kf();
                String str = ef.a;
                c4672kf.a = str == null ? new byte[0] : str.getBytes();
                c4672kf.c = ef.b;
                c4672kf.b = ef.c;
                int iOrdinal = ef.d.ordinal();
                int i = 1;
                if (iOrdinal != 1) {
                    i = 2;
                    if (iOrdinal != 2) {
                        i = 0;
                    }
                }
                c4672kf.d = i;
                return MessageNano.toByteArray(c4672kf);
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }
}
