package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import java.util.UUID;

/* renamed from: com.yandex.metrica.impl.ob.vo */
/* loaded from: classes2.dex */
public class C3686vo implements InterfaceC3660uo<String> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3660uo
    /* renamed from: a */
    public C3608so mo14391a(String str) {
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return C3608so.m16803a(this, "ApiKey is empty. Please, read official documentation how to obtain one: https://yandex.com/dev/appmetrica/doc/mobile-sdk-dg/concepts/android-initialize.html");
        }
        try {
            UUID.fromString(str2);
            return C3608so.m16802a(this);
        } catch (Throwable unused) {
            return C3608so.m16803a(this, "Invalid ApiKey=" + str2 + ". Please, read official documentation how to obtain one: https://yandex.com/dev/appmetrica/doc/mobile-sdk-dg/concepts/android-initialize.html");
        }
    }
}
