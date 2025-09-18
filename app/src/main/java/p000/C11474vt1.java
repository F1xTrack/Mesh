package p000;

/* renamed from: vt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11474vt1 {

    /* renamed from: a */
    public final EnumC7717Ht1 f44581a;

    /* renamed from: b */
    public final String f44582b;

    /* renamed from: c */
    public final int f44583c;

    /* renamed from: d */
    public final long f44584d;

    /* renamed from: e */
    public final String f44585e;

    /* renamed from: f */
    public final long f44586f;

    /* renamed from: g */
    public final C8235Rs1 f44587g;

    /* renamed from: h */
    public final int f44588h;

    /* renamed from: i */
    public final C8235Rs1 f44589i;

    /* renamed from: j */
    public final String f44590j;

    /* renamed from: k */
    public final String f44591k;

    /* renamed from: l */
    public final long f44592l;

    /* renamed from: m */
    public final boolean f44593m;

    /* renamed from: n */
    public final String f44594n;

    public C11474vt1(EnumC7717Ht1 enumC7717Ht1, String str, int i, long j, String str2, long j2, C8235Rs1 c8235Rs1, int i2, C8235Rs1 c8235Rs12, String str3, String str4, long j3, boolean z, String str5) {
        this.f44581a = enumC7717Ht1;
        this.f44582b = str;
        this.f44583c = i;
        this.f44584d = j;
        this.f44585e = str2;
        this.f44586f = j2;
        this.f44587g = c8235Rs1;
        this.f44588h = i2;
        this.f44589i = c8235Rs12;
        this.f44590j = str3;
        this.f44591k = str4;
        this.f44592l = j3;
        this.f44593m = z;
        this.f44594n = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11474vt1.class != obj.getClass()) {
            return false;
        }
        C11474vt1 c11474vt1 = (C11474vt1) obj;
        if (this.f44583c != c11474vt1.f44583c || this.f44584d != c11474vt1.f44584d || this.f44586f != c11474vt1.f44586f || this.f44588h != c11474vt1.f44588h || this.f44592l != c11474vt1.f44592l || this.f44593m != c11474vt1.f44593m || this.f44581a != c11474vt1.f44581a || !this.f44582b.equals(c11474vt1.f44582b) || !this.f44585e.equals(c11474vt1.f44585e)) {
            return false;
        }
        C8235Rs1 c8235Rs1 = c11474vt1.f44587g;
        C8235Rs1 c8235Rs12 = this.f44587g;
        if (c8235Rs12 == null ? c8235Rs1 != null : !c8235Rs12.equals(c8235Rs1)) {
            return false;
        }
        C8235Rs1 c8235Rs13 = c11474vt1.f44589i;
        C8235Rs1 c8235Rs14 = this.f44589i;
        if (c8235Rs14 == null ? c8235Rs13 != null : !c8235Rs14.equals(c8235Rs13)) {
            return false;
        }
        if (this.f44590j.equals(c11474vt1.f44590j) && this.f44591k.equals(c11474vt1.f44591k)) {
            return this.f44594n.equals(c11474vt1.f44594n);
        }
        return false;
    }

    public final int hashCode() {
        int iM8586e = (AbstractC1374Vq.m8586e(this.f44581a.hashCode() * 31, 31, this.f44582b) + this.f44583c) * 31;
        long j = this.f44584d;
        int iM8586e2 = AbstractC1374Vq.m8586e((iM8586e + ((int) (j ^ (j >>> 32)))) * 31, 31, this.f44585e);
        long j2 = this.f44586f;
        int i = (iM8586e2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        C8235Rs1 c8235Rs1 = this.f44587g;
        int iHashCode = (((i + (c8235Rs1 != null ? c8235Rs1.hashCode() : 0)) * 31) + this.f44588h) * 31;
        C8235Rs1 c8235Rs12 = this.f44589i;
        int iM8586e3 = AbstractC1374Vq.m8586e(AbstractC1374Vq.m8586e((iHashCode + (c8235Rs12 != null ? c8235Rs12.hashCode() : 0)) * 31, 31, this.f44590j), 31, this.f44591k);
        long j3 = this.f44592l;
        return this.f44594n.hashCode() + ((((iM8586e3 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f44593m ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductInfo{type=");
        sb.append(this.f44581a);
        sb.append(", sku='");
        sb.append(this.f44582b);
        sb.append("', quantity=");
        sb.append(this.f44583c);
        sb.append(", priceMicros=");
        sb.append(this.f44584d);
        sb.append(", priceCurrency='");
        sb.append(this.f44585e);
        sb.append("', introductoryPriceMicros=");
        sb.append(this.f44586f);
        sb.append(", introductoryPricePeriod=");
        sb.append(this.f44587g);
        sb.append(", introductoryPriceCycles=");
        sb.append(this.f44588h);
        sb.append(", subscriptionPeriod=");
        sb.append(this.f44589i);
        sb.append(", signature='");
        sb.append(this.f44590j);
        sb.append("', purchaseToken='");
        sb.append(this.f44591k);
        sb.append("', purchaseTime=");
        sb.append(this.f44592l);
        sb.append(", autoRenewing=");
        sb.append(this.f44593m);
        sb.append(", purchaseOriginalJson='");
        return AbstractC1374Vq.m8593l(sb, this.f44594n, "'}");
    }
}
