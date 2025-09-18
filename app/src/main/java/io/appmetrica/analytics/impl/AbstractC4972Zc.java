package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.Zc */
/* loaded from: classes2.dex */
public abstract class AbstractC4972Zc {

    /* renamed from: a */
    public static C5468t9 f31196a;

    /* renamed from: a */
    public static final synchronized C5468t9 m20081a(Context context) {
        C5468t9 c5468t9;
        c5468t9 = f31196a;
        if (c5468t9 == null) {
            c5468t9 = new C5468t9(context, "uuid.dat");
            f31196a = c5468t9;
        }
        return c5468t9;
    }
}
