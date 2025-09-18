package com.yandex.metrica.impl.p022ob;

import java.lang.reflect.Field;
import p000.D51;
import p000.EnumC9040cs1;

/* renamed from: com.yandex.metrica.impl.ob.z3 */
/* loaded from: classes2.dex */
public final class C3769z3 {
    /* renamed from: a */
    public static final EnumC9040cs1 m17320a() {
        Field field;
        String str = null;
        try {
            Class clsM13910b = C2494B2.m13910b("com.android.billingclient.BuildConfig");
            str = (String) ((clsM13910b == null || (field = clsM13910b.getField("VERSION_NAME")) == null) ? null : field.get(null));
        } catch (Throwable unused) {
        }
        if (str == null) {
            return EnumC9040cs1.f25692c;
        }
        boolean zM1556o = D51.m1556o(str, "2.", false);
        EnumC9040cs1 enumC9040cs1 = EnumC9040cs1.f25690a;
        if (zM1556o || D51.m1556o(str, "3.", false)) {
            return enumC9040cs1;
        }
        D51.m1556o(str, "4.", false);
        return EnumC9040cs1.f25691b;
    }
}
