package com.yandex.metrica.impl.ob;

import defpackage.D51;
import defpackage.O90;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class Rm {
    public final String a() {
        String string = UUID.randomUUID().toString();
        O90.e(string, "UUID.randomUUID().toString()");
        String strM = D51.m(string, "-", "");
        Locale locale = Locale.US;
        O90.e(locale, "Locale.US");
        String lowerCase = strM.toLowerCase(locale);
        O90.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
