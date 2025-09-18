package defpackage;

/* renamed from: br1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2404br1 {
    public final EnumC0625Ht1 a;
    public final String b;
    public final String c;
    public final long d;
    public long e;

    public C2404br1(EnumC0625Ht1 enumC0625Ht1, String str, String str2, long j, long j2) {
        this.a = enumC0625Ht1;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BillingInfo{type=");
        sb.append(this.a);
        sb.append("sku='");
        sb.append(this.b);
        sb.append("'purchaseToken='");
        sb.append(this.c);
        sb.append("'purchaseTime=");
        sb.append(this.d);
        sb.append("sendTime=");
        return NX.i(sb, this.e, "}");
    }
}
