package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;

/* loaded from: classes2.dex */
public class O<T> {
    public static final C2880kg.c e = new C2880kg.c();
    private volatile long a;
    private volatile long b;
    private long c = 0;
    private T d = null;

    public O(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public T a() {
        return this.d;
    }

    public final boolean b() {
        return this.d == null;
    }

    public final boolean c() {
        if (this.c == 0) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.c;
        return jCurrentTimeMillis > this.b || jCurrentTimeMillis < 0;
    }

    public final boolean d() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.c;
        return jCurrentTimeMillis > this.a || jCurrentTimeMillis < 0;
    }

    public String toString() {
        return "CachedData{refreshTime=" + this.a + ", mCachedTime=" + this.c + ", expiryTime=" + this.b + ", mCachedData=" + this.d + '}';
    }

    public void a(T t) {
        this.d = t;
        this.c = System.currentTimeMillis();
    }

    public void a(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
