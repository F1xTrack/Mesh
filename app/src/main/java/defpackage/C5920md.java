package defpackage;

/* renamed from: md, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5920md {
    public C6302od a;
    public String b;
    public String c;
    public long d;
    public byte e;

    public final C6111nd a() {
        C6302od c6302od;
        String str;
        String str2;
        if (this.e == 1 && (c6302od = this.a) != null && (str = this.b) != null && (str2 = this.c) != null) {
            return new C6111nd(c6302od, str, str2, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.b == null) {
            sb.append(" parameterKey");
        }
        if (this.c == null) {
            sb.append(" parameterValue");
        }
        if ((1 & this.e) == 0) {
            sb.append(" templateVersion");
        }
        throw new IllegalStateException(AbstractC1705Vq.k(sb, "Missing required properties:"));
    }
}
