package defpackage;

/* renamed from: qd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6684qd {
    public int a;
    public String b;
    public String c;
    public boolean d;
    public byte e;

    public final C6874rd a() {
        String str;
        String str2;
        if (this.e == 3 && (str = this.b) != null && (str2 = this.c) != null) {
            return new C6874rd(str, str2, this.a, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" platform");
        }
        if (this.b == null) {
            sb.append(" version");
        }
        if (this.c == null) {
            sb.append(" buildVersion");
        }
        if ((this.e & 2) == 0) {
            sb.append(" jailbroken");
        }
        throw new IllegalStateException(AbstractC1705Vq.k(sb, "Missing required properties:"));
    }
}
