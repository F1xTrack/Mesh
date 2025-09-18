package io.sentry;

import io.sentry.config.AbstractC6003a;
import java.util.Date;

/* renamed from: io.sentry.q1 */
/* loaded from: classes2.dex */
public final class C6113q1 extends AbstractC5827a1 {

    /* renamed from: a */
    public final Date f34506a;

    /* renamed from: b */
    public final long f34507b;

    public C6113q1(Date date, long j) {
        this.f34506a = date;
        this.f34507b = j;
    }

    @Override // io.sentry.AbstractC5827a1, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(AbstractC5827a1 abstractC5827a1) {
        if (!(abstractC5827a1 instanceof C6113q1)) {
            return super.compareTo(abstractC5827a1);
        }
        C6113q1 c6113q1 = (C6113q1) abstractC5827a1;
        long time = this.f34506a.getTime();
        long time2 = c6113q1.f34506a.getTime();
        return time == time2 ? Long.valueOf(this.f34507b).compareTo(Long.valueOf(c6113q1.f34507b)) : Long.valueOf(time).compareTo(Long.valueOf(time2));
    }

    @Override // io.sentry.AbstractC5827a1
    /* renamed from: b */
    public final long mo21495b(AbstractC5827a1 abstractC5827a1) {
        return abstractC5827a1 instanceof C6113q1 ? this.f34507b - ((C6113q1) abstractC5827a1).f34507b : super.mo21495b(abstractC5827a1);
    }

    @Override // io.sentry.AbstractC5827a1
    /* renamed from: c */
    public final long mo21496c(AbstractC5827a1 abstractC5827a1) {
        if (abstractC5827a1 == null || !(abstractC5827a1 instanceof C6113q1)) {
            return super.mo21496c(abstractC5827a1);
        }
        C6113q1 c6113q1 = (C6113q1) abstractC5827a1;
        int iCompareTo = compareTo(abstractC5827a1);
        long j = this.f34507b;
        long j2 = c6113q1.f34507b;
        if (iCompareTo < 0) {
            return mo21497d() + (j2 - j);
        }
        return c6113q1.mo21497d() + (j - j2);
    }

    @Override // io.sentry.AbstractC5827a1
    /* renamed from: d */
    public final long mo21497d() {
        return this.f34506a.getTime() * 1000000;
    }

    public C6113q1() {
        this(AbstractC6003a.m21752k(), System.nanoTime());
    }
}
