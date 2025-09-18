package p000;

/* renamed from: bd */
/* loaded from: classes.dex */
public final class C1797bd extends AbstractC0137CA {

    /* renamed from: a */
    public final long f17093a;

    /* renamed from: b */
    public final long f17094b;

    /* renamed from: c */
    public final String f17095c;

    /* renamed from: d */
    public final String f17096d;

    public C1797bd(String str, String str2, long j, long j2) {
        this.f17093a = j;
        this.f17094b = j2;
        this.f17095c = str;
        this.f17096d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0137CA)) {
            return false;
        }
        AbstractC0137CA abstractC0137CA = (AbstractC0137CA) obj;
        if (this.f17093a == ((C1797bd) abstractC0137CA).f17093a) {
            C1797bd c1797bd = (C1797bd) abstractC0137CA;
            if (this.f17094b == c1797bd.f17094b && this.f17095c.equals(c1797bd.f17095c)) {
                String str = c1797bd.f17096d;
                String str2 = this.f17096d;
                if (str2 == null) {
                    if (str == null) {
                        return true;
                    }
                } else if (str2.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f17093a;
        long j2 = this.f17094b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f17095c.hashCode()) * 1000003;
        String str = this.f17096d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.f17093a);
        sb.append(", size=");
        sb.append(this.f17094b);
        sb.append(", name=");
        sb.append(this.f17095c);
        sb.append(", uuid=");
        return AbstractC1374Vq.m8593l(sb, this.f17096d, "}");
    }
}
