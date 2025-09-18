package io.sentry.android.core;

import android.os.Debug;
import io.sentry.C5755C0;
import io.sentry.C6074p0;
import io.sentry.InterfaceC5790O;

/* renamed from: io.sentry.android.core.l */
/* loaded from: classes2.dex */
public final class C5896l implements InterfaceC5790O {
    @Override // io.sentry.InterfaceC5790O
    /* renamed from: a */
    public final void mo21450a(C5755C0 c5755c0) {
        c5755c0.f33224a = new C6074p0(System.currentTimeMillis(), Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory(), Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize());
    }

    @Override // io.sentry.InterfaceC5790O
    /* renamed from: c */
    public final void mo21451c() {
    }
}
