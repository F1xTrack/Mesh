package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.Oe */
/* loaded from: classes2.dex */
public final class C4711Oe extends C5319na {
    public C4711Oe(int i) {
        super(i);
    }

    @Override // io.appmetrica.analytics.impl.C5319na
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int mo19686b(C4887W c4887w) {
        if (c4887w == null) {
            return 0;
        }
        return StringUtils.getUtf8BytesLength(c4887w.f30878b) + 12;
    }
}
