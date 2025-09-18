package io.appmetrica.analytics.impl;

import defpackage.AbstractC1705Vq;
import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.td, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4885td implements on {
    public final String a;

    public C4885td(String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.impl.on
    public final mn a(Collection<Object> collection) {
        return hn.a((Collection) collection) ? new mn(this, false, AbstractC1705Vq.l(new StringBuilder(), this.a, " is null or empty.")) : new mn(this, true, "");
    }
}
