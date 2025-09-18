package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Tj */
/* loaded from: classes2.dex */
public final class C4835Tj {

    /* renamed from: a */
    public final C5482tn f30793a;

    public C4835Tj(C5482tn c5482tn) {
        this.f30793a = c5482tn;
    }

    /* renamed from: a */
    public final long m19879a() {
        long jOptLong;
        C5482tn c5482tn = this.f30793a;
        synchronized (c5482tn) {
            jOptLong = c5482tn.f32656a.m21151a().optLong("session_id", -1L);
        }
        long j = jOptLong >= 10000000000L ? 1 + jOptLong : 10000000000L;
        this.f30793a.m21103c(j);
        return j;
    }
}
