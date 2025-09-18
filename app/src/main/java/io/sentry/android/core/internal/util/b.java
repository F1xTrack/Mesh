package io.sentry.android.core.internal.util;

import android.os.Looper;

/* loaded from: classes2.dex */
public final class b implements io.sentry.util.thread.a {
    public static final b a = new b();
    public static final b b = new b();

    @Override // io.sentry.util.thread.a
    public boolean a() {
        return Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId();
    }
}
