package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.dn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2713dn {
    private final Context a;

    public C2713dn(Context context) {
        this.a = context;
    }

    public byte[] a() {
        try {
            return C3240ym.b(new StringBuilder(this.a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    public byte[] b() {
        try {
            return C3240ym.b(this.a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
