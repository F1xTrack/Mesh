package p000;

/* renamed from: fd */
/* loaded from: classes.dex */
public final class C4065fd {

    /* renamed from: a */
    public long f27265a;

    /* renamed from: b */
    public String f27266b;

    /* renamed from: c */
    public String f27267c;

    /* renamed from: d */
    public long f27268d;

    /* renamed from: e */
    public int f27269e;

    /* renamed from: f */
    public byte f27270f;

    /* renamed from: a */
    public final C4128gd m18262a() {
        String str;
        if (this.f27270f == 7 && (str = this.f27266b) != null) {
            return new C4128gd(this.f27265a, str, this.f27267c, this.f27268d, this.f27269e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f27270f & 1) == 0) {
            sb.append(" pc");
        }
        if (this.f27266b == null) {
            sb.append(" symbol");
        }
        if ((this.f27270f & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f27270f & 4) == 0) {
            sb.append(" importance");
        }
        throw new IllegalStateException(AbstractC1374Vq.m8592k(sb, "Missing required properties:"));
    }
}
