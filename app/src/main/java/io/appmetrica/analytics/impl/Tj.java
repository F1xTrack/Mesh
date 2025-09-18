package io.appmetrica.analytics.impl;

/* loaded from: classes2.dex */
public final class Tj {
    public final tn a;

    public Tj(tn tnVar) {
        this.a = tnVar;
    }

    public final long a() {
        long jOptLong;
        tn tnVar = this.a;
        synchronized (tnVar) {
            jOptLong = tnVar.a.a().optLong("session_id", -1L);
        }
        long j = jOptLong >= 10000000000L ? 1 + jOptLong : 10000000000L;
        this.a.c(j);
        return j;
    }
}
