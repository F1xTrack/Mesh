package defpackage;

/* renamed from: Vc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1663Vc {
    public int a;
    public String b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public int g;
    public String h;
    public String i;
    public byte j;

    public final C1741Wc a() {
        String str;
        String str2;
        String str3;
        if (this.j == 63 && (str = this.b) != null && (str2 = this.h) != null && (str3 = this.i) != null) {
            return new C1741Wc(this.a, str, this.c, this.d, this.e, this.f, this.g, str2, str3);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" arch");
        }
        if (this.b == null) {
            sb.append(" model");
        }
        if ((this.j & 2) == 0) {
            sb.append(" cores");
        }
        if ((this.j & 4) == 0) {
            sb.append(" ram");
        }
        if ((this.j & 8) == 0) {
            sb.append(" diskSpace");
        }
        if ((this.j & 16) == 0) {
            sb.append(" simulator");
        }
        if ((this.j & 32) == 0) {
            sb.append(" state");
        }
        if (this.h == null) {
            sb.append(" manufacturer");
        }
        if (this.i == null) {
            sb.append(" modelClass");
        }
        throw new IllegalStateException(AbstractC1705Vq.k(sb, "Missing required properties:"));
    }
}
