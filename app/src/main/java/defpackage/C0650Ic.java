package defpackage;

/* renamed from: Ic */
/* loaded from: classes.dex */
public final class C0650Ic {
    public String a;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public C1429Sc j;
    public C1195Pc k;
    public AbstractC7551vA l;
    public byte m;

    public final C0728Jc a() {
        if (this.m == 1 && this.a != null && this.b != null && this.d != null && this.h != null && this.i != null) {
            return new C0728Jc(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" sdkVersion");
        }
        if (this.b == null) {
            sb.append(" gmpAppId");
        }
        if ((1 & this.m) == 0) {
            sb.append(" platform");
        }
        if (this.d == null) {
            sb.append(" installationUuid");
        }
        if (this.h == null) {
            sb.append(" buildVersion");
        }
        if (this.i == null) {
            sb.append(" displayVersion");
        }
        throw new IllegalStateException(AbstractC1705Vq.k(sb, "Missing required properties:"));
    }
}
