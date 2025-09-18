package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider;

/* renamed from: io.appmetrica.analytics.impl.ta, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4882ta implements HostRetryInfoProvider {
    public final C4815qe a;
    public final EnumC4766od b;

    public C4882ta(C4815qe c4815qe, EnumC4766od enumC4766od) {
        this.a = c4815qe;
        this.b = enumC4766od;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final long getLastAttemptTimeSeconds() {
        return this.a.a(this.b, 0L);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final int getNextSendAttemptNumber() {
        return this.a.a(this.b, 1);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveLastAttemptTimeSeconds(long j) {
        this.a.b(this.b, j).b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveNextSendAttemptNumber(int i) {
        this.a.b(this.b, i).b();
    }
}
