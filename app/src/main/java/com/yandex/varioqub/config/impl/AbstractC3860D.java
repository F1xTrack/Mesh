package com.yandex.varioqub.config.impl;

import java.util.Arrays;

/* renamed from: com.yandex.varioqub.config.impl.D */
/* loaded from: classes2.dex */
public abstract class AbstractC3860D {

    /* renamed from: a */
    public static String f25591a;

    /* renamed from: a */
    public static String m17390a(String str) {
        String str2 = f25591a;
        if (str2 == null) {
            str2 = "https://app.uaas.yandex.ru/v1/app?client_id=%s";
        }
        return String.format(str2, Arrays.copyOf(new Object[]{str}, 1));
    }
}
