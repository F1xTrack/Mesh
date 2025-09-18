package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class Uc {
    public final long a;
    public final float b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final Ec m;
    public final Ec n;
    public final Ec o;
    public final Ec p;
    public final Jc q;

    public Uc(long j, float f, int i, int i2, long j2, int i3, boolean z, long j3, boolean z2, boolean z3, boolean z4, boolean z5, Ec ec, Ec ec2, Ec ec3, Ec ec4, Jc jc) {
        this.a = j;
        this.b = f;
        this.c = i;
        this.d = i2;
        this.e = j2;
        this.f = i3;
        this.g = z;
        this.h = j3;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = ec;
        this.n = ec2;
        this.o = ec3;
        this.p = ec4;
        this.q = jc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Uc.class != obj.getClass()) {
            return false;
        }
        Uc uc = (Uc) obj;
        if (this.a != uc.a || Float.compare(uc.b, this.b) != 0 || this.c != uc.c || this.d != uc.d || this.e != uc.e || this.f != uc.f || this.g != uc.g || this.h != uc.h || this.i != uc.i || this.j != uc.j || this.k != uc.k || this.l != uc.l) {
            return false;
        }
        Ec ec = this.m;
        if (ec == null ? uc.m != null : !ec.equals(uc.m)) {
            return false;
        }
        Ec ec2 = this.n;
        if (ec2 == null ? uc.n != null : !ec2.equals(uc.n)) {
            return false;
        }
        Ec ec3 = this.o;
        if (ec3 == null ? uc.o != null : !ec3.equals(uc.o)) {
            return false;
        }
        Ec ec4 = this.p;
        if (ec4 == null ? uc.p != null : !ec4.equals(uc.p)) {
            return false;
        }
        Jc jc = this.q;
        Jc jc2 = uc.q;
        return jc != null ? jc.equals(jc2) : jc2 == null;
    }

    public int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        float f = this.b;
        int iFloatToIntBits = (((((i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.c) * 31) + this.d) * 31;
        long j2 = this.e;
        int i2 = (((((iFloatToIntBits + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f) * 31) + (this.g ? 1 : 0)) * 31;
        long j3 = this.h;
        int i3 = (((((((((i2 + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31) + (this.l ? 1 : 0)) * 31;
        Ec ec = this.m;
        int iHashCode = (i3 + (ec != null ? ec.hashCode() : 0)) * 31;
        Ec ec2 = this.n;
        int iHashCode2 = (iHashCode + (ec2 != null ? ec2.hashCode() : 0)) * 31;
        Ec ec3 = this.o;
        int iHashCode3 = (iHashCode2 + (ec3 != null ? ec3.hashCode() : 0)) * 31;
        Ec ec4 = this.p;
        int iHashCode4 = (iHashCode3 + (ec4 != null ? ec4.hashCode() : 0)) * 31;
        Jc jc = this.q;
        return iHashCode4 + (jc != null ? jc.hashCode() : 0);
    }

    public String toString() {
        return "LocationArguments{updateTimeInterval=" + this.a + ", updateDistanceInterval=" + this.b + ", recordsCountToForceFlush=" + this.c + ", maxBatchSize=" + this.d + ", maxAgeToForceFlush=" + this.e + ", maxRecordsToStoreLocally=" + this.f + ", collectionEnabled=" + this.g + ", lbsUpdateTimeInterval=" + this.h + ", lbsCollectionEnabled=" + this.i + ", passiveCollectionEnabled=" + this.j + ", allCellsCollectingEnabled=" + this.k + ", connectedCellCollectingEnabled=" + this.l + ", wifiAccessConfig=" + this.m + ", lbsAccessConfig=" + this.n + ", gpsAccessConfig=" + this.o + ", passiveAccessConfig=" + this.p + ", gplConfig=" + this.q + '}';
    }
}
