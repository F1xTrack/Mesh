package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4413a {
    public final Context a;

    public C4413a(Context context) {
        this.a = context;
    }

    public final byte[] a() {
        try {
            return AbstractC4962wi.a(new StringBuilder(this.a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    public final byte[] b() {
        try {
            return AbstractC4962wi.a(this.a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
