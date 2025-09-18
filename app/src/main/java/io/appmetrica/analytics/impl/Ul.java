package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes2.dex */
public final class Ul extends Sh {
    public Ul(Context context, String str) {
        super(context, str, "array");
    }

    @Override // io.appmetrica.analytics.impl.Sh
    public final Object a(int i) {
        return this.a.getResources().getStringArray(i);
    }

    public final String[] b(int i) {
        return this.a.getResources().getStringArray(i);
    }
}
