package io.sentry.android.core;

/* renamed from: io.sentry.android.core.d0 */
/* loaded from: classes2.dex */
public final class C5862d0 implements Comparable {

    /* renamed from: a */
    public final long f33663a;

    /* renamed from: b */
    public final long f33664b;

    /* renamed from: c */
    public final long f33665c;

    /* renamed from: d */
    public final long f33666d;

    /* renamed from: e */
    public final boolean f33667e;

    /* renamed from: f */
    public final boolean f33668f;

    /* renamed from: g */
    public final long f33669g;

    public C5862d0(long j) {
        this(j, j, 0L, 0L, false, false, 0L);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f33664b, ((C5862d0) obj).f33664b);
    }

    public C5862d0(long j, long j2, long j3, long j4, boolean z, boolean z2, long j5) {
        this.f33663a = j;
        this.f33664b = j2;
        this.f33665c = j3;
        this.f33666d = j4;
        this.f33667e = z;
        this.f33668f = z2;
        this.f33669g = j5;
    }
}
