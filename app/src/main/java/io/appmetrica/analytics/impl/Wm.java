package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class Wm extends AbstractC4625ig {
    public Wm(C4567g5 c4567g5) {
        super(c4567g5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4625ig
    public final boolean a(T5 t5) {
        String strI = this.a.c.i();
        String str = t5.h;
        this.a.c.j(str).b();
        if (TextUtils.equals(strI, str)) {
            return false;
        }
        this.a.a(C4443b4.o());
        return false;
    }
}
