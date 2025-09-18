package io.appmetrica.analytics.impl;

import defpackage.AbstractC7209tN0;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class Gj {
    public final C4567g5 a;
    public final Xj b;
    public final Jj c;
    public long d;
    public long e;
    public AtomicLong f;
    public boolean g;
    public volatile Vj h;
    public long i;
    public long j;
    public final SystemTimeProvider k;

    public Gj(C4567g5 c4567g5, Xj xj, Jj jj, SystemTimeProvider systemTimeProvider) {
        this.a = c4567g5;
        this.b = xj;
        this.c = jj;
        this.k = systemTimeProvider;
        a();
    }

    public final void a() {
        Jj jj = this.c;
        long jElapsedRealtime = this.k.elapsedRealtime();
        Long l = jj.c;
        if (l != null) {
            jElapsedRealtime = l.longValue();
        }
        this.e = jElapsedRealtime;
        Long l2 = this.c.b;
        this.d = l2 == null ? -1L : l2.longValue();
        Long l3 = this.c.e;
        this.f = new AtomicLong(l3 == null ? 0L : l3.longValue());
        Boolean bool = this.c.f;
        this.g = bool == null ? true : bool.booleanValue();
        Long l4 = this.c.g;
        long jLongValue = l4 != null ? l4.longValue() : 0L;
        this.i = jLongValue;
        Jj jj2 = this.c;
        long jLongValue2 = jLongValue - this.e;
        Long l5 = jj2.h;
        if (l5 != null) {
            jLongValue2 = l5.longValue();
        }
        this.j = jLongValue2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{id=");
        sb.append(this.d);
        sb.append(", creationTime=");
        sb.append(this.e);
        sb.append(", currentReportId=");
        sb.append(this.f);
        sb.append(", sessionRequestParams=");
        sb.append(this.h);
        sb.append(", sleepStart=");
        return AbstractC7209tN0.y(sb, this.i, '}');
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(long r13) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Gj.a(long):boolean");
    }
}
