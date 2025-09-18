package io.sentry.cache;

import io.sentry.InterfaceC5781L;
import io.sentry.android.core.SentryAndroidOptions;

/* renamed from: io.sentry.cache.e */
/* loaded from: classes2.dex */
public final class C5993e implements InterfaceC5781L {

    /* renamed from: a */
    public final SentryAndroidOptions f34104a;

    public C5993e(SentryAndroidOptions sentryAndroidOptions) {
        this.f34104a = sentryAndroidOptions;
    }

    /* renamed from: a */
    public final void m21714a(String str) {
        AbstractC5989a.m21704a(this.f34104a, ".options-cache", str);
    }

    /* renamed from: b */
    public final void m21715b(Object obj, String str) {
        AbstractC5989a.m21706c(this.f34104a, obj, ".options-cache", str);
    }
}
