package p000;

/* renamed from: Xc */
/* loaded from: classes.dex */
public final class C1486Xc {

    /* renamed from: a */
    public long f13868a;

    /* renamed from: b */
    public String f13869b;

    /* renamed from: c */
    public C1612Zc f13870c;

    /* renamed from: d */
    public C6312kd f13871d;

    /* renamed from: e */
    public C6375ld f13872e;

    /* renamed from: f */
    public C6629pd f13873f;

    /* renamed from: g */
    public byte f13874g;

    /* renamed from: a */
    public final C1549Yc m9098a() {
        String str;
        C1612Zc c1612Zc;
        C6312kd c6312kd;
        if (this.f13874g == 1 && (str = this.f13869b) != null && (c1612Zc = this.f13870c) != null && (c6312kd = this.f13871d) != null) {
            return new C1549Yc(this.f13868a, str, c1612Zc, c6312kd, this.f13872e, this.f13873f);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.f13874g) == 0) {
            sb.append(" timestamp");
        }
        if (this.f13869b == null) {
            sb.append(" type");
        }
        if (this.f13870c == null) {
            sb.append(" app");
        }
        if (this.f13871d == null) {
            sb.append(" device");
        }
        throw new IllegalStateException(AbstractC1374Vq.m8592k(sb, "Missing required properties:"));
    }
}
