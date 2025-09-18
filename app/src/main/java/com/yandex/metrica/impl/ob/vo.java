package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.UUID;

/* loaded from: classes2.dex */
public class vo implements uo<String> {
    @Override // com.yandex.metrica.impl.ob.uo
    public so a(String str) {
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return so.a(this, "ApiKey is empty. Please, read official documentation how to obtain one: https://yandex.com/dev/appmetrica/doc/mobile-sdk-dg/concepts/android-initialize.html");
        }
        try {
            UUID.fromString(str2);
            return so.a(this);
        } catch (Throwable unused) {
            return so.a(this, "Invalid ApiKey=" + str2 + ". Please, read official documentation how to obtain one: https://yandex.com/dev/appmetrica/doc/mobile-sdk-dg/concepts/android-initialize.html");
        }
    }
}
