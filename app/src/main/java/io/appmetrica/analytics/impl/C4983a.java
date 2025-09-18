package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.a */
/* loaded from: classes2.dex */
public final class C4983a {

    /* renamed from: a */
    public final Context f31231a;

    public C4983a(Context context) {
        this.f31231a = context;
    }

    /* renamed from: a */
    public final byte[] m20095a() {
        try {
            return AbstractC5552wi.m21182a(new StringBuilder(this.f31231a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    /* renamed from: b */
    public final byte[] m20096b() {
        try {
            return AbstractC5552wi.m21182a(this.f31231a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
