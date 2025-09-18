package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class wn {
    public final Context a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final sn c;
    public final sn d;

    public wn(Context context) {
        this.a = context;
        Y9 y9 = new Y9(context, "appmetrica_vital.dat");
        this.c = new sn(C4667ka.h().w(), y9);
        this.d = new sn(new C4815qe(Z6.a(context).d()), y9);
    }

    public final sn a() {
        return this.c;
    }

    public final sn b() {
        return this.d;
    }
}
