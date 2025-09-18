package io.sentry.android.core.performance;

/* renamed from: io.sentry.android.core.performance.b */
/* loaded from: classes2.dex */
public final class C5902b implements Comparable {

    /* renamed from: a */
    public final C5906f f33812a = new C5906f();

    /* renamed from: b */
    public final C5906f f33813b = new C5906f();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C5902b c5902b = (C5902b) obj;
        int iCompare = Long.compare(this.f33812a.f33834c, c5902b.f33812a.f33834c);
        return iCompare == 0 ? Long.compare(this.f33813b.f33834c, c5902b.f33813b.f33834c) : iCompare;
    }
}
