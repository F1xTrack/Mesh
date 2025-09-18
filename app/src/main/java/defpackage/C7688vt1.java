package defpackage;

/* renamed from: vt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7688vt1 {
    public final EnumC0625Ht1 a;
    public final String b;
    public final int c;
    public final long d;
    public final String e;
    public final long f;
    public final C1401Rs1 g;
    public final int h;
    public final C1401Rs1 i;
    public final String j;
    public final String k;
    public final long l;
    public final boolean m;
    public final String n;

    public C7688vt1(EnumC0625Ht1 enumC0625Ht1, String str, int i, long j, String str2, long j2, C1401Rs1 c1401Rs1, int i2, C1401Rs1 c1401Rs12, String str3, String str4, long j3, boolean z, String str5) {
        this.a = enumC0625Ht1;
        this.b = str;
        this.c = i;
        this.d = j;
        this.e = str2;
        this.f = j2;
        this.g = c1401Rs1;
        this.h = i2;
        this.i = c1401Rs12;
        this.j = str3;
        this.k = str4;
        this.l = j3;
        this.m = z;
        this.n = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7688vt1.class != obj.getClass()) {
            return false;
        }
        C7688vt1 c7688vt1 = (C7688vt1) obj;
        if (this.c != c7688vt1.c || this.d != c7688vt1.d || this.f != c7688vt1.f || this.h != c7688vt1.h || this.l != c7688vt1.l || this.m != c7688vt1.m || this.a != c7688vt1.a || !this.b.equals(c7688vt1.b) || !this.e.equals(c7688vt1.e)) {
            return false;
        }
        C1401Rs1 c1401Rs1 = c7688vt1.g;
        C1401Rs1 c1401Rs12 = this.g;
        if (c1401Rs12 == null ? c1401Rs1 != null : !c1401Rs12.equals(c1401Rs1)) {
            return false;
        }
        C1401Rs1 c1401Rs13 = c7688vt1.i;
        C1401Rs1 c1401Rs14 = this.i;
        if (c1401Rs14 == null ? c1401Rs13 != null : !c1401Rs14.equals(c1401Rs13)) {
            return false;
        }
        if (this.j.equals(c7688vt1.j) && this.k.equals(c7688vt1.k)) {
            return this.n.equals(c7688vt1.n);
        }
        return false;
    }

    public final int hashCode() {
        int iE = (AbstractC1705Vq.e(this.a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long j = this.d;
        int iE2 = AbstractC1705Vq.e((iE + ((int) (j ^ (j >>> 32)))) * 31, 31, this.e);
        long j2 = this.f;
        int i = (iE2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        C1401Rs1 c1401Rs1 = this.g;
        int iHashCode = (((i + (c1401Rs1 != null ? c1401Rs1.hashCode() : 0)) * 31) + this.h) * 31;
        C1401Rs1 c1401Rs12 = this.i;
        int iE3 = AbstractC1705Vq.e(AbstractC1705Vq.e((iHashCode + (c1401Rs12 != null ? c1401Rs12.hashCode() : 0)) * 31, 31, this.j), 31, this.k);
        long j3 = this.l;
        return this.n.hashCode() + ((((iE3 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.m ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductInfo{type=");
        sb.append(this.a);
        sb.append(", sku='");
        sb.append(this.b);
        sb.append("', quantity=");
        sb.append(this.c);
        sb.append(", priceMicros=");
        sb.append(this.d);
        sb.append(", priceCurrency='");
        sb.append(this.e);
        sb.append("', introductoryPriceMicros=");
        sb.append(this.f);
        sb.append(", introductoryPricePeriod=");
        sb.append(this.g);
        sb.append(", introductoryPriceCycles=");
        sb.append(this.h);
        sb.append(", subscriptionPeriod=");
        sb.append(this.i);
        sb.append(", signature='");
        sb.append(this.j);
        sb.append("', purchaseToken='");
        sb.append(this.k);
        sb.append("', purchaseTime=");
        sb.append(this.l);
        sb.append(", autoRenewing=");
        sb.append(this.m);
        sb.append(", purchaseOriginalJson='");
        return AbstractC1705Vq.l(sb, this.n, "'}");
    }
}
