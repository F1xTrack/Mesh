package io.appmetrica.analytics.impl;

import android.util.Base64;

/* renamed from: io.appmetrica.analytics.impl.t3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4875t3 implements pn {
    public final D8 a;

    public C4875t3() {
        this(new D8());
    }

    @Override // io.appmetrica.analytics.impl.pn
    public final byte[] a(J8 j8, Eg eg) {
        byte[] bArrDecode = new byte[0];
        String str = j8.b;
        if (str != null) {
            try {
                bArrDecode = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        D8 d8 = this.a;
        return ((C8) d8.a.a(j8.o)).a(bArrDecode);
    }

    public C4875t3(D8 d8) {
        this.a = d8;
    }
}
