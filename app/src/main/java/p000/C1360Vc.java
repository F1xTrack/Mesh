package p000;

/* renamed from: Vc */
/* loaded from: classes.dex */
public final class C1360Vc {

    /* renamed from: a */
    public int f12639a;

    /* renamed from: b */
    public String f12640b;

    /* renamed from: c */
    public int f12641c;

    /* renamed from: d */
    public long f12642d;

    /* renamed from: e */
    public long f12643e;

    /* renamed from: f */
    public boolean f12644f;

    /* renamed from: g */
    public int f12645g;

    /* renamed from: h */
    public String f12646h;

    /* renamed from: i */
    public String f12647i;

    /* renamed from: j */
    public byte f12648j;

    /* renamed from: a */
    public final C1423Wc m8513a() {
        String str;
        String str2;
        String str3;
        if (this.f12648j == 63 && (str = this.f12640b) != null && (str2 = this.f12646h) != null && (str3 = this.f12647i) != null) {
            return new C1423Wc(this.f12639a, str, this.f12641c, this.f12642d, this.f12643e, this.f12644f, this.f12645g, str2, str3);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f12648j & 1) == 0) {
            sb.append(" arch");
        }
        if (this.f12640b == null) {
            sb.append(" model");
        }
        if ((this.f12648j & 2) == 0) {
            sb.append(" cores");
        }
        if ((this.f12648j & 4) == 0) {
            sb.append(" ram");
        }
        if ((this.f12648j & 8) == 0) {
            sb.append(" diskSpace");
        }
        if ((this.f12648j & 16) == 0) {
            sb.append(" simulator");
        }
        if ((this.f12648j & 32) == 0) {
            sb.append(" state");
        }
        if (this.f12646h == null) {
            sb.append(" manufacturer");
        }
        if (this.f12647i == null) {
            sb.append(" modelClass");
        }
        throw new IllegalStateException(AbstractC1374Vq.m8592k(sb, "Missing required properties:"));
    }
}
