package p000;

/* renamed from: qd */
/* loaded from: classes.dex */
public final class C6692qd {

    /* renamed from: a */
    public int f41063a;

    /* renamed from: b */
    public String f41064b;

    /* renamed from: c */
    public String f41065c;

    /* renamed from: d */
    public boolean f41066d;

    /* renamed from: e */
    public byte f41067e;

    /* renamed from: a */
    public final C6755rd m24028a() {
        String str;
        String str2;
        if (this.f41067e == 3 && (str = this.f41064b) != null && (str2 = this.f41065c) != null) {
            return new C6755rd(str, str2, this.f41063a, this.f41066d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f41067e & 1) == 0) {
            sb.append(" platform");
        }
        if (this.f41064b == null) {
            sb.append(" version");
        }
        if (this.f41065c == null) {
            sb.append(" buildVersion");
        }
        if ((this.f41067e & 2) == 0) {
            sb.append(" jailbroken");
        }
        throw new IllegalStateException(AbstractC1374Vq.m8592k(sb, "Missing required properties:"));
    }
}
