package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.s4 */
/* loaded from: classes2.dex */
public final class C5438s4 {

    /* renamed from: a */
    public final SystemTimeProvider f32532a;

    public C5438s4() {
        this(new SystemTimeProvider());
    }

    /* renamed from: a */
    public final void m21039a() {
        this.f32532a.elapsedRealtime();
    }

    public C5438s4(SystemTimeProvider systemTimeProvider) {
        this.f32532a = systemTimeProvider;
    }
}
