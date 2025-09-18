package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes2.dex */
public abstract class Zc {
    public static C4881t9 a;

    public static final synchronized C4881t9 a(Context context) {
        C4881t9 c4881t9;
        c4881t9 = a;
        if (c4881t9 == null) {
            c4881t9 = new C4881t9(context, "uuid.dat");
            a = c4881t9;
        }
        return c4881t9;
    }
}
