package defpackage;

/* renamed from: hd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4189hd {
    public String a;
    public int b;
    public int c;
    public boolean d;
    public byte e;

    public final C4380id a() {
        String str;
        if (this.e == 7 && (str = this.a) != null) {
            return new C4380id(this.d, this.b, this.c, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" processName");
        }
        if ((this.e & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.e & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.e & 4) == 0) {
            sb.append(" defaultProcess");
        }
        throw new IllegalStateException(AbstractC1705Vq.k(sb, "Missing required properties:"));
    }
}
