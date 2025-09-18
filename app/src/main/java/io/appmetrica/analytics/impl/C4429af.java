package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;

/* renamed from: io.appmetrica.analytics.impl.af, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4429af implements pn, InterfaceC4928v8 {
    @Override // io.appmetrica.analytics.impl.InterfaceC4928v8
    public final int a(E8 e8) {
        return 2;
    }

    @Override // io.appmetrica.analytics.impl.pn
    public final byte[] a(J8 j8, Eg eg) {
        return TextUtils.isEmpty(j8.b) ? new byte[0] : Base64.decode(j8.b, 0);
    }
}
