package defpackage;

import java.util.List;

/* renamed from: Rc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1351Rc {
    public String a;
    public String b;
    public String c;
    public long d;
    public Long e;
    public boolean f;
    public C1507Tc g;
    public C7065sd h;
    public C6874rd i;
    public C1741Wc j;
    public List k;
    public int l;
    public byte m;

    public final C1429Sc a() {
        String str;
        String str2;
        C1507Tc c1507Tc;
        if (this.m == 7 && (str = this.a) != null && (str2 = this.b) != null && (c1507Tc = this.g) != null) {
            return new C1429Sc(str, str2, this.c, this.d, this.e, this.f, c1507Tc, this.h, this.i, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" generator");
        }
        if (this.b == null) {
            sb.append(" identifier");
        }
        if ((this.m & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.m & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.g == null) {
            sb.append(" app");
        }
        if ((this.m & 4) == 0) {
            sb.append(" generatorType");
        }
        throw new IllegalStateException(AbstractC1705Vq.k(sb, "Missing required properties:"));
    }
}
