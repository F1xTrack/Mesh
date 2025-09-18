package p000;

/* renamed from: Ic */
/* loaded from: classes.dex */
public final class C0543Ic {

    /* renamed from: a */
    public String f5029a;

    /* renamed from: b */
    public String f5030b;

    /* renamed from: c */
    public int f5031c;

    /* renamed from: d */
    public String f5032d;

    /* renamed from: e */
    public String f5033e;

    /* renamed from: f */
    public String f5034f;

    /* renamed from: g */
    public String f5035g;

    /* renamed from: h */
    public String f5036h;

    /* renamed from: i */
    public String f5037i;

    /* renamed from: j */
    public C1171Sc f5038j;

    /* renamed from: k */
    public C0983Pc f5039k;

    /* renamed from: l */
    public AbstractC6995vA f5040l;

    /* renamed from: m */
    public byte f5041m;

    /* renamed from: a */
    public final C0606Jc m3953a() {
        if (this.f5041m == 1 && this.f5029a != null && this.f5030b != null && this.f5032d != null && this.f5036h != null && this.f5037i != null) {
            return new C0606Jc(this.f5029a, this.f5030b, this.f5031c, this.f5032d, this.f5033e, this.f5034f, this.f5035g, this.f5036h, this.f5037i, this.f5038j, this.f5039k, this.f5040l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f5029a == null) {
            sb.append(" sdkVersion");
        }
        if (this.f5030b == null) {
            sb.append(" gmpAppId");
        }
        if ((1 & this.f5041m) == 0) {
            sb.append(" platform");
        }
        if (this.f5032d == null) {
            sb.append(" installationUuid");
        }
        if (this.f5036h == null) {
            sb.append(" buildVersion");
        }
        if (this.f5037i == null) {
            sb.append(" displayVersion");
        }
        throw new IllegalStateException(AbstractC1374Vq.m8592k(sb, "Missing required properties:"));
    }
}
