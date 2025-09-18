package p000;

/* renamed from: jd */
/* loaded from: classes.dex */
public final class C6249jd {

    /* renamed from: a */
    public Double f35285a;

    /* renamed from: b */
    public int f35286b;

    /* renamed from: c */
    public boolean f35287c;

    /* renamed from: d */
    public int f35288d;

    /* renamed from: e */
    public long f35289e;

    /* renamed from: f */
    public long f35290f;

    /* renamed from: g */
    public byte f35291g;

    /* renamed from: a */
    public final C6312kd m22078a() {
        if (this.f35291g == 31) {
            return new C6312kd(this.f35285a, this.f35286b, this.f35287c, this.f35288d, this.f35289e, this.f35290f);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f35291g & 1) == 0) {
            sb.append(" batteryVelocity");
        }
        if ((this.f35291g & 2) == 0) {
            sb.append(" proximityOn");
        }
        if ((this.f35291g & 4) == 0) {
            sb.append(" orientation");
        }
        if ((this.f35291g & 8) == 0) {
            sb.append(" ramUsed");
        }
        if ((this.f35291g & 16) == 0) {
            sb.append(" diskUsed");
        }
        throw new IllegalStateException(AbstractC1374Vq.m8592k(sb, "Missing required properties:"));
    }
}
