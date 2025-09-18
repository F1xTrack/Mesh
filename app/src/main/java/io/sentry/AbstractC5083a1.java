package io.sentry;

/* renamed from: io.sentry.a1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5083a1 implements Comparable {
    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC5083a1 abstractC5083a1) {
        return Long.valueOf(d()).compareTo(Long.valueOf(abstractC5083a1.d()));
    }

    public long b(AbstractC5083a1 abstractC5083a1) {
        return d() - abstractC5083a1.d();
    }

    public long c(AbstractC5083a1 abstractC5083a1) {
        return (abstractC5083a1 == null || compareTo(abstractC5083a1) >= 0) ? d() : abstractC5083a1.d();
    }

    public abstract long d();
}
