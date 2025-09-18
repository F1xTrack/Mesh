package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.oa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4763oa extends C4739na {
    public C4763oa(int i, int i2) {
        this(i, new C4787pa(i2));
    }

    public final int a(String str) {
        return StringUtils.getUTF8Bytes(str).length;
    }

    @Override // io.appmetrica.analytics.impl.C4739na
    public final int b(Object obj) {
        return StringUtils.getUTF8Bytes((String) obj).length;
    }

    public C4763oa(int i, C4787pa c4787pa) {
        super(i, c4787pa);
    }
}
