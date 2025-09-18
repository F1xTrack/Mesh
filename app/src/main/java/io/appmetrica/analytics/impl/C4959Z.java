package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.UUID;
import p000.AbstractC7222ym;

/* renamed from: io.appmetrica.analytics.impl.Z */
/* loaded from: classes2.dex */
public final class C4959Z implements InterfaceC5357on {
    @Override // io.appmetrica.analytics.impl.InterfaceC5357on
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5307mn mo19211a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new C5307mn(this, false, "ApiKey is empty. Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
        try {
            UUID.fromString(str);
            return new C5307mn(this, true, "");
        } catch (Throwable unused) {
            return new C5307mn(this, false, AbstractC7222ym.m26234k("Invalid ApiKey=", str, ". Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html"));
        }
    }
}
