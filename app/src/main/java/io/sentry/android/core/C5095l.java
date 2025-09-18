package io.sentry.android.core;

import android.os.Debug;
import io.sentry.C0;
import io.sentry.C5153p0;

/* renamed from: io.sentry.android.core.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5095l implements io.sentry.O {
    @Override // io.sentry.O
    public final void a(C0 c0) {
        c0.a = new C5153p0(System.currentTimeMillis(), Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory(), Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize());
    }

    @Override // io.sentry.O
    public final void c() {
    }
}
