package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes2.dex */
public final class Zl implements pn {
    @Override // io.appmetrica.analytics.impl.pn
    public final byte[] a(J8 j8, Eg eg) {
        return !TextUtils.isEmpty(j8.b) ? StringUtils.getUTF8Bytes(j8.b) : new byte[0];
    }
}
