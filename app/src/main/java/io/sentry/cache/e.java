package io.sentry.cache;

import io.sentry.L;
import io.sentry.android.core.SentryAndroidOptions;

/* loaded from: classes2.dex */
public final class e implements L {
    public final SentryAndroidOptions a;

    public e(SentryAndroidOptions sentryAndroidOptions) {
        this.a = sentryAndroidOptions;
    }

    public final void a(String str) {
        a.a(this.a, ".options-cache", str);
    }

    public final void b(Object obj, String str) {
        a.c(this.a, obj, ".options-cache", str);
    }
}
