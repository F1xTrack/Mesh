package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.oa */
/* loaded from: classes2.dex */
public final class C5344oa extends C5319na {
    public C5344oa(int i, int i2) {
        this(i, new C5369pa(i2));
    }

    /* renamed from: a */
    public final int m20861a(String str) {
        return StringUtils.getUTF8Bytes(str).length;
    }

    @Override // io.appmetrica.analytics.impl.C5319na
    /* renamed from: b */
    public final int mo19686b(Object obj) {
        return StringUtils.getUTF8Bytes((String) obj).length;
    }

    public C5344oa(int i, C5369pa c5369pa) {
        super(i, c5369pa);
    }
}
