package p000;

/* renamed from: Yc */
/* loaded from: classes.dex */
public final class C1549Yc extends AbstractC0955PA {

    /* renamed from: a */
    public final long f14385a;

    /* renamed from: b */
    public final String f14386b;

    /* renamed from: c */
    public final C1612Zc f14387c;

    /* renamed from: d */
    public final C6312kd f14388d;

    /* renamed from: e */
    public final C6375ld f14389e;

    /* renamed from: f */
    public final C6629pd f14390f;

    public C1549Yc(long j, String str, C1612Zc c1612Zc, C6312kd c6312kd, C6375ld c6375ld, C6629pd c6629pd) {
        this.f14385a = j;
        this.f14386b = str;
        this.f14387c = c1612Zc;
        this.f14388d = c6312kd;
        this.f14389e = c6375ld;
        this.f14390f = c6629pd;
    }

    /* renamed from: a */
    public final C1486Xc m9323a() {
        C1486Xc c1486Xc = new C1486Xc();
        c1486Xc.f13868a = this.f14385a;
        c1486Xc.f13869b = this.f14386b;
        c1486Xc.f13870c = this.f14387c;
        c1486Xc.f13871d = this.f14388d;
        c1486Xc.f13872e = this.f14389e;
        c1486Xc.f13873f = this.f14390f;
        c1486Xc.f13874g = (byte) 1;
        return c1486Xc;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0955PA)) {
            return false;
        }
        C1549Yc c1549Yc = (C1549Yc) ((AbstractC0955PA) obj);
        if (this.f14385a == c1549Yc.f14385a) {
            if (this.f14386b.equals(c1549Yc.f14386b) && this.f14387c.equals(c1549Yc.f14387c) && this.f14388d.equals(c1549Yc.f14388d)) {
                C6375ld c6375ld = c1549Yc.f14389e;
                C6375ld c6375ld2 = this.f14389e;
                if (c6375ld2 != null ? c6375ld2.equals(c6375ld) : c6375ld == null) {
                    C6629pd c6629pd = c1549Yc.f14390f;
                    C6629pd c6629pd2 = this.f14390f;
                    if (c6629pd2 == null) {
                        if (c6629pd == null) {
                            return true;
                        }
                    } else if (c6629pd2.equals(c6629pd)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f14385a;
        int iHashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f14386b.hashCode()) * 1000003) ^ this.f14387c.hashCode()) * 1000003) ^ this.f14388d.hashCode()) * 1000003;
        C6375ld c6375ld = this.f14389e;
        int iHashCode2 = (iHashCode ^ (c6375ld == null ? 0 : c6375ld.hashCode())) * 1000003;
        C6629pd c6629pd = this.f14390f;
        return iHashCode2 ^ (c6629pd != null ? c6629pd.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f14385a + ", type=" + this.f14386b + ", app=" + this.f14387c + ", device=" + this.f14388d + ", log=" + this.f14389e + ", rollouts=" + this.f14390f + "}";
    }
}
