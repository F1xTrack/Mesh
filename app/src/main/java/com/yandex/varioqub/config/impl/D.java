package com.yandex.varioqub.config.impl;

import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class D {
    public static String a;

    public static String a(String str) {
        String str2 = a;
        if (str2 == null) {
            str2 = "https://app.uaas.yandex.ru/v1/app?client_id=%s";
        }
        return String.format(str2, Arrays.copyOf(new Object[]{str}, 1));
    }
}
