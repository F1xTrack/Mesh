package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes2.dex */
public final class Oe extends C4739na {
    public Oe(int i) {
        super(i);
    }

    @Override // io.appmetrica.analytics.impl.C4739na
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int b(W w) {
        if (w == null) {
            return 0;
        }
        return StringUtils.getUtf8BytesLength(w.b) + 12;
    }
}
