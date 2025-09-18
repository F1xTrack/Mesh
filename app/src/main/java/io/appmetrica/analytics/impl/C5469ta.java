package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider;

/* renamed from: io.appmetrica.analytics.impl.ta */
/* loaded from: classes2.dex */
public final class C5469ta implements HostRetryInfoProvider {

    /* renamed from: a */
    public final C5398qe f32627a;

    /* renamed from: b */
    public final EnumC5347od f32628b;

    public C5469ta(C5398qe c5398qe, EnumC5347od enumC5347od) {
        this.f32627a = c5398qe;
        this.f32628b = enumC5347od;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final long getLastAttemptTimeSeconds() {
        return this.f32627a.m20961a(this.f32628b, 0L);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final int getNextSendAttemptNumber() {
        return this.f32627a.m20958a(this.f32628b, 1);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveLastAttemptTimeSeconds(long j) {
        this.f32627a.m20965b(this.f32628b, j).m20875b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveNextSendAttemptNumber(int i) {
        this.f32627a.m20964b(this.f32628b, i).m20875b();
    }
}
