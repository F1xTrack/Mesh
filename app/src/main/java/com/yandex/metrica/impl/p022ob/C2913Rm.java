package com.yandex.metrica.impl.p022ob;

import java.util.Locale;
import java.util.UUID;
import p000.D51;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.Rm */
/* loaded from: classes2.dex */
public final class C2913Rm {
    /* renamed from: a */
    public final String m15088a() {
        String string = UUID.randomUUID().toString();
        O90.m5967e(string, "UUID.randomUUID().toString()");
        String strM1554m = D51.m1554m(string, "-", "");
        Locale locale = Locale.US;
        O90.m5967e(locale, "Locale.US");
        String lowerCase = strM1554m.toLowerCase(locale);
        O90.m5967e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
