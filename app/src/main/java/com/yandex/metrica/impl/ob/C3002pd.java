package com.yandex.metrica.impl.ob;

import android.location.Location;
import com.yandex.metrica.impl.ob.M;
import com.yandex.metrica.impl.ob.Wc;

/* renamed from: com.yandex.metrica.impl.ob.pd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3002pd {
    public final Wc.a a;
    private Long b;
    private long c;
    private long d;
    private Location e;
    private M.b.a f;

    public C3002pd(Wc.a aVar, long j, long j2, Location location, M.b.a aVar2, Long l) {
        this.a = aVar;
        this.b = l;
        this.c = j;
        this.d = j2;
        this.e = location;
        this.f = aVar2;
    }

    public M.b.a a() {
        return this.f;
    }

    public Long b() {
        return this.b;
    }

    public Location c() {
        return this.e;
    }

    public long d() {
        return this.d;
    }

    public long e() {
        return this.c;
    }

    public String toString() {
        return "LocationWrapper{collectionMode=" + this.a + ", mIncrementalId=" + this.b + ", mReceiveTimestamp=" + this.c + ", mReceiveElapsedRealtime=" + this.d + ", mLocation=" + this.e + ", mChargeType=" + this.f + '}';
    }
}
