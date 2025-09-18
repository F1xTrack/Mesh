package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.m5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4710m5 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final Context c;

    public C4710m5(Context context) {
        this.c = context.getApplicationContext();
    }

    public final Da a(Z4 z4, D4 d4, L7 l7, HashMap map) {
        Da da = (Da) map.get(z4.toString());
        if (da != null) {
            da.a(d4);
            return da;
        }
        Da daA = l7.a(this.c, z4, d4);
        map.put(z4.toString(), daA);
        return daA;
    }
}
