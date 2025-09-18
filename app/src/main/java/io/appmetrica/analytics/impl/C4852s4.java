package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.s4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4852s4 {
    public final SystemTimeProvider a;

    public C4852s4() {
        this(new SystemTimeProvider());
    }

    public final void a() {
        this.a.elapsedRealtime();
    }

    public C4852s4(SystemTimeProvider systemTimeProvider) {
        this.a = systemTimeProvider;
    }
}
