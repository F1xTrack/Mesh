package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.atomic.AtomicLong;
import p000.AbstractC11153tN0;

/* renamed from: io.appmetrica.analytics.impl.Gj */
/* loaded from: classes2.dex */
public final class C4524Gj {

    /* renamed from: a */
    public final C5139g5 f30189a;

    /* renamed from: b */
    public final C4931Xj f30190b;

    /* renamed from: c */
    public final C4596Jj f30191c;

    /* renamed from: d */
    public long f30192d;

    /* renamed from: e */
    public long f30193e;

    /* renamed from: f */
    public AtomicLong f30194f;

    /* renamed from: g */
    public boolean f30195g;

    /* renamed from: h */
    public volatile C4883Vj f30196h;

    /* renamed from: i */
    public long f30197i;

    /* renamed from: j */
    public long f30198j;

    /* renamed from: k */
    public final SystemTimeProvider f30199k;

    public C4524Gj(C5139g5 c5139g5, C4931Xj c4931Xj, C4596Jj c4596Jj, SystemTimeProvider systemTimeProvider) {
        this.f30189a = c5139g5;
        this.f30190b = c4931Xj;
        this.f30191c = c4596Jj;
        this.f30199k = systemTimeProvider;
        m19452a();
    }

    /* renamed from: a */
    public final void m19452a() {
        C4596Jj c4596Jj = this.f30191c;
        long jElapsedRealtime = this.f30199k.elapsedRealtime();
        Long l = c4596Jj.f30369c;
        if (l != null) {
            jElapsedRealtime = l.longValue();
        }
        this.f30193e = jElapsedRealtime;
        Long l2 = this.f30191c.f30368b;
        this.f30192d = l2 == null ? -1L : l2.longValue();
        Long l3 = this.f30191c.f30371e;
        this.f30194f = new AtomicLong(l3 == null ? 0L : l3.longValue());
        Boolean bool = this.f30191c.f30372f;
        this.f30195g = bool == null ? true : bool.booleanValue();
        Long l4 = this.f30191c.f30373g;
        long jLongValue = l4 != null ? l4.longValue() : 0L;
        this.f30197i = jLongValue;
        C4596Jj c4596Jj2 = this.f30191c;
        long jLongValue2 = jLongValue - this.f30193e;
        Long l5 = c4596Jj2.f30374h;
        if (l5 != null) {
            jLongValue2 = l5.longValue();
        }
        this.f30198j = jLongValue2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{id=");
        sb.append(this.f30192d);
        sb.append(", creationTime=");
        sb.append(this.f30193e);
        sb.append(", currentReportId=");
        sb.append(this.f30194f);
        sb.append(", sessionRequestParams=");
        sb.append(this.f30196h);
        sb.append(", sleepStart=");
        return AbstractC11153tN0.m24913y(sb, this.f30197i, '}');
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0134  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m19453a(long r13) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4524Gj.m19453a(long):boolean");
    }
}
