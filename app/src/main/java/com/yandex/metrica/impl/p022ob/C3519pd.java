package com.yandex.metrica.impl.p022ob;

import android.location.Location;
import com.yandex.metrica.impl.p022ob.C2766M;
import com.yandex.metrica.impl.p022ob.C3028Wc;

/* renamed from: com.yandex.metrica.impl.ob.pd */
/* loaded from: classes2.dex */
public class C3519pd {

    /* renamed from: a */
    public final C3028Wc.a f24442a;

    /* renamed from: b */
    private Long f24443b;

    /* renamed from: c */
    private long f24444c;

    /* renamed from: d */
    private long f24445d;

    /* renamed from: e */
    private Location f24446e;

    /* renamed from: f */
    private C2766M.b.a f24447f;

    public C3519pd(C3028Wc.a aVar, long j, long j2, Location location, C2766M.b.a aVar2, Long l) {
        this.f24442a = aVar;
        this.f24443b = l;
        this.f24444c = j;
        this.f24445d = j2;
        this.f24446e = location;
        this.f24447f = aVar2;
    }

    /* renamed from: a */
    public C2766M.b.a m16575a() {
        return this.f24447f;
    }

    /* renamed from: b */
    public Long m16576b() {
        return this.f24443b;
    }

    /* renamed from: c */
    public Location m16577c() {
        return this.f24446e;
    }

    /* renamed from: d */
    public long m16578d() {
        return this.f24445d;
    }

    /* renamed from: e */
    public long m16579e() {
        return this.f24444c;
    }

    public String toString() {
        return "LocationWrapper{collectionMode=" + this.f24442a + ", mIncrementalId=" + this.f24443b + ", mReceiveTimestamp=" + this.f24444c + ", mReceiveElapsedRealtime=" + this.f24445d + ", mLocation=" + this.f24446e + ", mChargeType=" + this.f24447f + '}';
    }
}
