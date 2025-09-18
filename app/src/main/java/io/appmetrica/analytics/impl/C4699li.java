package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* renamed from: io.appmetrica.analytics.impl.li */
/* loaded from: classes2.dex */
public final class C4699li extends AbstractC4625ig {
    public C4699li(C4567g5 c4567g5) {
        super(c4567g5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4625ig
    public final boolean a(T5 t5) {
        String str = t5.h;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.a.c.j(str).b();
        return false;
    }
}
