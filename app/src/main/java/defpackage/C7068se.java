package defpackage;

/* renamed from: se, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7068se {
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;
    public byte f;

    public final C7259te a() {
        if (this.f == 1 && this.a != null && this.b != null && this.c != null && this.d != null) {
            return new C7259te(this.a, this.b, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rolloutId");
        }
        if (this.b == null) {
            sb.append(" variantId");
        }
        if (this.c == null) {
            sb.append(" parameterKey");
        }
        if (this.d == null) {
            sb.append(" parameterValue");
        }
        if ((1 & this.f) == 0) {
            sb.append(" templateVersion");
        }
        throw new IllegalStateException(AbstractC1705Vq.k(sb, "Missing required properties:"));
    }
}
