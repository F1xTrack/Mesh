package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.z8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5024z8 implements pn {
    public final D8 a;

    public C5024z8() {
        this(new D8());
    }

    @Override // io.appmetrica.analytics.impl.pn
    public final byte[] a(J8 j8, Eg eg) {
        String str = j8.b;
        return ((C8) this.a.a.a(j8.o)).a(str != null ? StringUtils.getUTF8Bytes(str) : new byte[0]);
    }

    public C5024z8(D8 d8) {
        this.a = d8;
    }
}
