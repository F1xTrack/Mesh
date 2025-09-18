package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import defpackage.AbstractC1705Vq;

/* renamed from: io.appmetrica.analytics.impl.ud, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4909ud implements on {
    public final String a;

    public C4909ud(String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.impl.on
    public final mn a(String str) {
        return TextUtils.isEmpty(str) ? new mn(this, false, AbstractC1705Vq.l(new StringBuilder(), this.a, " is empty.")) : new mn(this, true, "");
    }
}
