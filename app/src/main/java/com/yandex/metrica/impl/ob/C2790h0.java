package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2790h0<T> {
    private final InterfaceC2715e0<T> a;
    private final InterfaceC2740f0<T> b;
    private final O0 c;
    private final String d;

    public C2790h0(InterfaceC2715e0<T> interfaceC2715e0, InterfaceC2740f0<T> interfaceC2740f0, O0 o0, String str) {
        this.a = interfaceC2715e0;
        this.b = interfaceC2740f0;
        this.c = o0;
        this.d = str;
    }

    public final void a(Context context, ContentValues contentValues) {
        try {
            Object objInvoke = this.a.invoke(contentValues);
            if (objInvoke != null) {
                this.c.a(context);
                if (((Boolean) this.b.invoke(objInvoke)).booleanValue()) {
                    B2.a("Successfully saved " + this.d, new Object[0]);
                } else {
                    B2.b("Did not save " + this.d + " because data is already present", new Object[0]);
                }
            }
        } catch (Throwable th) {
            B2.a(th, "Unexpected error occurred", new Object[0]);
        }
    }
}
