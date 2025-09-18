package p000;

/* renamed from: gd */
/* loaded from: classes.dex */
public final class C4128gd extends AbstractC0326FA {

    /* renamed from: a */
    public final long f27884a;

    /* renamed from: b */
    public final String f27885b;

    /* renamed from: c */
    public final String f27886c;

    /* renamed from: d */
    public final long f27887d;

    /* renamed from: e */
    public final int f27888e;

    public C4128gd(long j, String str, String str2, long j2, int i) {
        this.f27884a = j;
        this.f27885b = str;
        this.f27886c = str2;
        this.f27887d = j2;
        this.f27888e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0326FA)) {
            return false;
        }
        AbstractC0326FA abstractC0326FA = (AbstractC0326FA) obj;
        if (this.f27884a == ((C4128gd) abstractC0326FA).f27884a) {
            C4128gd c4128gd = (C4128gd) abstractC0326FA;
            if (this.f27885b.equals(c4128gd.f27885b)) {
                String str = c4128gd.f27886c;
                String str2 = this.f27886c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f27887d == c4128gd.f27887d && this.f27888e == c4128gd.f27888e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f27884a;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f27885b.hashCode()) * 1000003;
        String str = this.f27886c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.f27887d;
        return ((iHashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f27888e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.f27884a);
        sb.append(", symbol=");
        sb.append(this.f27885b);
        sb.append(", file=");
        sb.append(this.f27886c);
        sb.append(", offset=");
        sb.append(this.f27887d);
        sb.append(", importance=");
        return AbstractC1374Vq.m8591j(sb, this.f27888e, "}");
    }
}
