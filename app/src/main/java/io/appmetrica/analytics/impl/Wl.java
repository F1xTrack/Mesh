package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes2.dex */
public final class Wl extends Sh {
    public Wl(Context context, String str) {
        super(context, str, "string");
    }

    @Override // io.appmetrica.analytics.impl.Sh
    public final Object a(int i) {
        return this.a.getString(i);
    }

    public final String b(int i) {
        return this.a.getString(i);
    }
}
