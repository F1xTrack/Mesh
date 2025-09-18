package p000;

/* renamed from: br1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8905br1 {

    /* renamed from: a */
    public final EnumC7717Ht1 f17190a;

    /* renamed from: b */
    public final String f17191b;

    /* renamed from: c */
    public final String f17192c;

    /* renamed from: d */
    public final long f17193d;

    /* renamed from: e */
    public long f17194e;

    public C8905br1(EnumC7717Ht1 enumC7717Ht1, String str, String str2, long j, long j2) {
        this.f17190a = enumC7717Ht1;
        this.f17191b = str;
        this.f17192c = str2;
        this.f17193d = j;
        this.f17194e = j2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BillingInfo{type=");
        sb.append(this.f17190a);
        sb.append("sku='");
        sb.append(this.f17191b);
        sb.append("'purchaseToken='");
        sb.append(this.f17192c);
        sb.append("'purchaseTime=");
        sb.append(this.f17193d);
        sb.append("sendTime=");
        return AbstractC0852NX.m5760i(sb, this.f17194e, "}");
    }
}
