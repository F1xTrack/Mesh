package defpackage;

/* loaded from: classes.dex */
public final class ZC1 {
    public String a;
    public int b;
    public int c;
    public byte d;

    public final C2474cD1 a() {
        if (this.d == 1 && this.a != null && this.b != 0 && this.c != 0) {
            return new C2474cD1(this.a, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" fileOwner");
        }
        if ((1 & this.d) == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.b == 0) {
            sb.append(" fileChecks");
        }
        if (this.c == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
    }
}
