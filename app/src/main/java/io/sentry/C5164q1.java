package io.sentry;

import java.util.Date;

/* renamed from: io.sentry.q1 */
/* loaded from: classes2.dex */
public final class C5164q1 extends AbstractC5083a1 {
    public final Date a;
    public final long b;

    public C5164q1(Date date, long j) {
        this.a = date;
        this.b = j;
    }

    @Override // io.sentry.AbstractC5083a1, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(AbstractC5083a1 abstractC5083a1) {
        if (!(abstractC5083a1 instanceof C5164q1)) {
            return super.compareTo(abstractC5083a1);
        }
        C5164q1 c5164q1 = (C5164q1) abstractC5083a1;
        long time = this.a.getTime();
        long time2 = c5164q1.a.getTime();
        return time == time2 ? Long.valueOf(this.b).compareTo(Long.valueOf(c5164q1.b)) : Long.valueOf(time).compareTo(Long.valueOf(time2));
    }

    @Override // io.sentry.AbstractC5083a1
    public final long b(AbstractC5083a1 abstractC5083a1) {
        return abstractC5083a1 instanceof C5164q1 ? this.b - ((C5164q1) abstractC5083a1).b : super.b(abstractC5083a1);
    }

    @Override // io.sentry.AbstractC5083a1
    public final long c(AbstractC5083a1 abstractC5083a1) {
        if (abstractC5083a1 == null || !(abstractC5083a1 instanceof C5164q1)) {
            return super.c(abstractC5083a1);
        }
        C5164q1 c5164q1 = (C5164q1) abstractC5083a1;
        int iCompareTo = compareTo(abstractC5083a1);
        long j = this.b;
        long j2 = c5164q1.b;
        if (iCompareTo < 0) {
            return d() + (j2 - j);
        }
        return c5164q1.d() + (j - j2);
    }

    @Override // io.sentry.AbstractC5083a1
    public final long d() {
        return this.a.getTime() * 1000000;
    }

    public C5164q1() {
        this(io.sentry.config.a.k(), System.nanoTime());
    }
}
