package defpackage;

/* renamed from: Xc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1819Xc {
    public long a;
    public String b;
    public C1975Zc c;
    public C5538kd d;
    public C5729ld e;
    public C6493pd f;
    public byte g;

    public final C1897Yc a() {
        String str;
        C1975Zc c1975Zc;
        C5538kd c5538kd;
        if (this.g == 1 && (str = this.b) != null && (c1975Zc = this.c) != null && (c5538kd = this.d) != null) {
            return new C1897Yc(this.a, str, c1975Zc, c5538kd, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.g) == 0) {
            sb.append(" timestamp");
        }
        if (this.b == null) {
            sb.append(" type");
        }
        if (this.c == null) {
            sb.append(" app");
        }
        if (this.d == null) {
            sb.append(" device");
        }
        throw new IllegalStateException(AbstractC1705Vq.k(sb, "Missing required properties:"));
    }
}
