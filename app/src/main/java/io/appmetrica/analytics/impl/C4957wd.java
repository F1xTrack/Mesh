package io.appmetrica.analytics.impl;

import defpackage.AbstractC1705Vq;

/* renamed from: io.appmetrica.analytics.impl.wd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4957wd implements on {
    public final String a;

    public C4957wd(String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.impl.on
    public final mn a(Object obj) {
        return obj == null ? new mn(this, false, AbstractC1705Vq.l(new StringBuilder(), this.a, " is null.")) : new mn(this, true, "");
    }

    public final String a() {
        return this.a;
    }
}
