package p000;

/* renamed from: md */
/* loaded from: classes.dex */
public final class C6438md {

    /* renamed from: a */
    public C6564od f37793a;

    /* renamed from: b */
    public String f37794b;

    /* renamed from: c */
    public String f37795c;

    /* renamed from: d */
    public long f37796d;

    /* renamed from: e */
    public byte f37797e;

    /* renamed from: a */
    public final C6501nd m22906a() {
        C6564od c6564od;
        String str;
        String str2;
        if (this.f37797e == 1 && (c6564od = this.f37793a) != null && (str = this.f37794b) != null && (str2 = this.f37795c) != null) {
            return new C6501nd(c6564od, str, str2, this.f37796d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f37793a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.f37794b == null) {
            sb.append(" parameterKey");
        }
        if (this.f37795c == null) {
            sb.append(" parameterValue");
        }
        if ((1 & this.f37797e) == 0) {
            sb.append(" templateVersion");
        }
        throw new IllegalStateException(AbstractC1374Vq.m8592k(sb, "Missing required properties:"));
    }
}
