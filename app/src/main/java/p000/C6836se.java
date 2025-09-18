package p000;

/* renamed from: se */
/* loaded from: classes.dex */
public final class C6836se {

    /* renamed from: a */
    public String f42534a;

    /* renamed from: b */
    public String f42535b;

    /* renamed from: c */
    public String f42536c;

    /* renamed from: d */
    public String f42537d;

    /* renamed from: e */
    public long f42538e;

    /* renamed from: f */
    public byte f42539f;

    /* renamed from: a */
    public final C6899te m24761a() {
        if (this.f42539f == 1 && this.f42534a != null && this.f42535b != null && this.f42536c != null && this.f42537d != null) {
            return new C6899te(this.f42534a, this.f42535b, this.f42536c, this.f42537d, this.f42538e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f42534a == null) {
            sb.append(" rolloutId");
        }
        if (this.f42535b == null) {
            sb.append(" variantId");
        }
        if (this.f42536c == null) {
            sb.append(" parameterKey");
        }
        if (this.f42537d == null) {
            sb.append(" parameterValue");
        }
        if ((1 & this.f42539f) == 0) {
            sb.append(" templateVersion");
        }
        throw new IllegalStateException(AbstractC1374Vq.m8592k(sb, "Missing required properties:"));
    }
}
