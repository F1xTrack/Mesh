package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes2.dex */
public final class J9 {
    public final Wl a;
    public final C4732n3 b;

    public J9(Context context) {
        this(new Wl(context, "io.appmetrica.analytics.build_id"), new C4732n3(context, "io.appmetrica.analytics.is_offline"));
    }

    public J9(Wl wl, C4732n3 c4732n3) {
        this.a = wl;
        this.b = c4732n3;
    }
}
