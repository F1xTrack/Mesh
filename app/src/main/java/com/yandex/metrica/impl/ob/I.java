package com.yandex.metrica.impl.ob;

import android.content.Context;

/* loaded from: classes2.dex */
public class I {
    private final Context a;
    private final D b;

    public I(Context context) {
        this(context, new D());
    }

    public H a() {
        if (U2.a(28)) {
            return G.a(this.a, this.b);
        }
        return null;
    }

    public I(Context context, D d) {
        this.a = context;
        this.b = d;
    }
}
