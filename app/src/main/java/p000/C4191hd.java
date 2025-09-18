package p000;

/* renamed from: hd */
/* loaded from: classes.dex */
public final class C4191hd {

    /* renamed from: a */
    public String f28482a;

    /* renamed from: b */
    public int f28483b;

    /* renamed from: c */
    public int f28484c;

    /* renamed from: d */
    public boolean f28485d;

    /* renamed from: e */
    public byte f28486e;

    /* renamed from: a */
    public final C4254id m18842a() {
        String str;
        if (this.f28486e == 7 && (str = this.f28482a) != null) {
            return new C4254id(this.f28485d, this.f28483b, this.f28484c, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f28482a == null) {
            sb.append(" processName");
        }
        if ((this.f28486e & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.f28486e & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.f28486e & 4) == 0) {
            sb.append(" defaultProcess");
        }
        throw new IllegalStateException(AbstractC1374Vq.m8592k(sb, "Missing required properties:"));
    }
}
