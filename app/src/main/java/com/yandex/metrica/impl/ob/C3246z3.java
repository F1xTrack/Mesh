package com.yandex.metrica.impl.ob;

import defpackage.D51;
import defpackage.EnumC3282cs1;
import java.lang.reflect.Field;

/* renamed from: com.yandex.metrica.impl.ob.z3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3246z3 {
    public static final EnumC3282cs1 a() {
        Field field;
        String str = null;
        try {
            Class clsB = B2.b("com.android.billingclient.BuildConfig");
            str = (String) ((clsB == null || (field = clsB.getField("VERSION_NAME")) == null) ? null : field.get(null));
        } catch (Throwable unused) {
        }
        if (str == null) {
            return EnumC3282cs1.c;
        }
        boolean zO = D51.o(str, "2.", false);
        EnumC3282cs1 enumC3282cs1 = EnumC3282cs1.a;
        if (zO || D51.o(str, "3.", false)) {
            return enumC3282cs1;
        }
        D51.o(str, "4.", false);
        return EnumC3282cs1.b;
    }
}
