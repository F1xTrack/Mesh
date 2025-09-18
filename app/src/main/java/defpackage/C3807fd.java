package defpackage;

/* renamed from: fd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3807fd {
    public long a;
    public String b;
    public String c;
    public long d;
    public int e;
    public byte f;

    public final C3998gd a() {
        String str;
        if (this.f == 7 && (str = this.b) != null) {
            return new C3998gd(this.a, str, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" pc");
        }
        if (this.b == null) {
            sb.append(" symbol");
        }
        if ((this.f & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f & 4) == 0) {
            sb.append(" importance");
        }
        throw new IllegalStateException(AbstractC1705Vq.k(sb, "Missing required properties:"));
    }
}
