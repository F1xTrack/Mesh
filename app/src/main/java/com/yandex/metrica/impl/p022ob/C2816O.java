package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;

/* renamed from: com.yandex.metrica.impl.ob.O */
/* loaded from: classes2.dex */
public class C2816O<T> {

    /* renamed from: e */
    public static final C3392kg.c f21831e = new C3392kg.c();

    /* renamed from: a */
    private volatile long f21832a;

    /* renamed from: b */
    private volatile long f21833b;

    /* renamed from: c */
    private long f21834c = 0;

    /* renamed from: d */
    private T f21835d = null;

    public C2816O(long j, long j2) {
        this.f21832a = j;
        this.f21833b = j2;
    }

    /* renamed from: a */
    public T m14678a() {
        return this.f21835d;
    }

    /* renamed from: b */
    public final boolean m14681b() {
        return this.f21835d == null;
    }

    /* renamed from: c */
    public final boolean m14682c() {
        if (this.f21834c == 0) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f21834c;
        return jCurrentTimeMillis > this.f21833b || jCurrentTimeMillis < 0;
    }

    /* renamed from: d */
    public final boolean m14683d() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f21834c;
        return jCurrentTimeMillis > this.f21832a || jCurrentTimeMillis < 0;
    }

    public String toString() {
        return "CachedData{refreshTime=" + this.f21832a + ", mCachedTime=" + this.f21834c + ", expiryTime=" + this.f21833b + ", mCachedData=" + this.f21835d + '}';
    }

    /* renamed from: a */
    public void m14680a(T t) {
        this.f21835d = t;
        this.f21834c = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void m14679a(long j, long j2) {
        this.f21832a = j;
        this.f21833b = j2;
    }
}
