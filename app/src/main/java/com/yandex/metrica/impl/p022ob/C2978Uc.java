package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.Uc */
/* loaded from: classes2.dex */
public class C2978Uc {

    /* renamed from: a */
    public final long f22439a;

    /* renamed from: b */
    public final float f22440b;

    /* renamed from: c */
    public final int f22441c;

    /* renamed from: d */
    public final int f22442d;

    /* renamed from: e */
    public final long f22443e;

    /* renamed from: f */
    public final int f22444f;

    /* renamed from: g */
    public final boolean f22445g;

    /* renamed from: h */
    public final long f22446h;

    /* renamed from: i */
    public final boolean f22447i;

    /* renamed from: j */
    public final boolean f22448j;

    /* renamed from: k */
    public final boolean f22449k;

    /* renamed from: l */
    public final boolean f22450l;

    /* renamed from: m */
    public final C2579Ec f22451m;

    /* renamed from: n */
    public final C2579Ec f22452n;

    /* renamed from: o */
    public final C2579Ec f22453o;

    /* renamed from: p */
    public final C2579Ec f22454p;

    /* renamed from: q */
    public final C2704Jc f22455q;

    public C2978Uc(long j, float f, int i, int i2, long j2, int i3, boolean z, long j3, boolean z2, boolean z3, boolean z4, boolean z5, C2579Ec c2579Ec, C2579Ec c2579Ec2, C2579Ec c2579Ec3, C2579Ec c2579Ec4, C2704Jc c2704Jc) {
        this.f22439a = j;
        this.f22440b = f;
        this.f22441c = i;
        this.f22442d = i2;
        this.f22443e = j2;
        this.f22444f = i3;
        this.f22445g = z;
        this.f22446h = j3;
        this.f22447i = z2;
        this.f22448j = z3;
        this.f22449k = z4;
        this.f22450l = z5;
        this.f22451m = c2579Ec;
        this.f22452n = c2579Ec2;
        this.f22453o = c2579Ec3;
        this.f22454p = c2579Ec4;
        this.f22455q = c2704Jc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2978Uc.class != obj.getClass()) {
            return false;
        }
        C2978Uc c2978Uc = (C2978Uc) obj;
        if (this.f22439a != c2978Uc.f22439a || Float.compare(c2978Uc.f22440b, this.f22440b) != 0 || this.f22441c != c2978Uc.f22441c || this.f22442d != c2978Uc.f22442d || this.f22443e != c2978Uc.f22443e || this.f22444f != c2978Uc.f22444f || this.f22445g != c2978Uc.f22445g || this.f22446h != c2978Uc.f22446h || this.f22447i != c2978Uc.f22447i || this.f22448j != c2978Uc.f22448j || this.f22449k != c2978Uc.f22449k || this.f22450l != c2978Uc.f22450l) {
            return false;
        }
        C2579Ec c2579Ec = this.f22451m;
        if (c2579Ec == null ? c2978Uc.f22451m != null : !c2579Ec.equals(c2978Uc.f22451m)) {
            return false;
        }
        C2579Ec c2579Ec2 = this.f22452n;
        if (c2579Ec2 == null ? c2978Uc.f22452n != null : !c2579Ec2.equals(c2978Uc.f22452n)) {
            return false;
        }
        C2579Ec c2579Ec3 = this.f22453o;
        if (c2579Ec3 == null ? c2978Uc.f22453o != null : !c2579Ec3.equals(c2978Uc.f22453o)) {
            return false;
        }
        C2579Ec c2579Ec4 = this.f22454p;
        if (c2579Ec4 == null ? c2978Uc.f22454p != null : !c2579Ec4.equals(c2978Uc.f22454p)) {
            return false;
        }
        C2704Jc c2704Jc = this.f22455q;
        C2704Jc c2704Jc2 = c2978Uc.f22455q;
        return c2704Jc != null ? c2704Jc.equals(c2704Jc2) : c2704Jc2 == null;
    }

    public int hashCode() {
        long j = this.f22439a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        float f = this.f22440b;
        int iFloatToIntBits = (((((i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.f22441c) * 31) + this.f22442d) * 31;
        long j2 = this.f22443e;
        int i2 = (((((iFloatToIntBits + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f22444f) * 31) + (this.f22445g ? 1 : 0)) * 31;
        long j3 = this.f22446h;
        int i3 = (((((((((i2 + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.f22447i ? 1 : 0)) * 31) + (this.f22448j ? 1 : 0)) * 31) + (this.f22449k ? 1 : 0)) * 31) + (this.f22450l ? 1 : 0)) * 31;
        C2579Ec c2579Ec = this.f22451m;
        int iHashCode = (i3 + (c2579Ec != null ? c2579Ec.hashCode() : 0)) * 31;
        C2579Ec c2579Ec2 = this.f22452n;
        int iHashCode2 = (iHashCode + (c2579Ec2 != null ? c2579Ec2.hashCode() : 0)) * 31;
        C2579Ec c2579Ec3 = this.f22453o;
        int iHashCode3 = (iHashCode2 + (c2579Ec3 != null ? c2579Ec3.hashCode() : 0)) * 31;
        C2579Ec c2579Ec4 = this.f22454p;
        int iHashCode4 = (iHashCode3 + (c2579Ec4 != null ? c2579Ec4.hashCode() : 0)) * 31;
        C2704Jc c2704Jc = this.f22455q;
        return iHashCode4 + (c2704Jc != null ? c2704Jc.hashCode() : 0);
    }

    public String toString() {
        return "LocationArguments{updateTimeInterval=" + this.f22439a + ", updateDistanceInterval=" + this.f22440b + ", recordsCountToForceFlush=" + this.f22441c + ", maxBatchSize=" + this.f22442d + ", maxAgeToForceFlush=" + this.f22443e + ", maxRecordsToStoreLocally=" + this.f22444f + ", collectionEnabled=" + this.f22445g + ", lbsUpdateTimeInterval=" + this.f22446h + ", lbsCollectionEnabled=" + this.f22447i + ", passiveCollectionEnabled=" + this.f22448j + ", allCellsCollectingEnabled=" + this.f22449k + ", connectedCellCollectingEnabled=" + this.f22450l + ", wifiAccessConfig=" + this.f22451m + ", lbsAccessConfig=" + this.f22452n + ", gpsAccessConfig=" + this.f22453o + ", passiveAccessConfig=" + this.f22454p + ", gplConfig=" + this.f22455q + '}';
    }
}
