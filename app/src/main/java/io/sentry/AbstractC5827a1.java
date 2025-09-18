package io.sentry;

/* renamed from: io.sentry.a1 */
/* loaded from: classes2.dex */
public abstract class AbstractC5827a1 implements Comparable {
    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC5827a1 abstractC5827a1) {
        return Long.valueOf(mo21497d()).compareTo(Long.valueOf(abstractC5827a1.mo21497d()));
    }

    /* renamed from: b */
    public long mo21495b(AbstractC5827a1 abstractC5827a1) {
        return mo21497d() - abstractC5827a1.mo21497d();
    }

    /* renamed from: c */
    public long mo21496c(AbstractC5827a1 abstractC5827a1) {
        return (abstractC5827a1 == null || compareTo(abstractC5827a1) >= 0) ? mo21497d() : abstractC5827a1.mo21497d();
    }

    /* renamed from: d */
    public abstract long mo21497d();
}
