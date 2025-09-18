package p000;

/* renamed from: Zd */
/* loaded from: classes.dex */
public final class C1613Zd {

    /* renamed from: a */
    public final C1551Ye f15046a;

    /* renamed from: b */
    public final C6897tc f15047b;

    /* renamed from: c */
    public final int f15048c;

    public C1613Zd(C1551Ye c1551Ye, C6897tc c6897tc, int i) {
        this.f15046a = c1551Ye;
        this.f15047b = c6897tc;
        this.f15048c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1613Zd)) {
            return false;
        }
        C1613Zd c1613Zd = (C1613Zd) obj;
        return this.f15046a.equals(c1613Zd.f15046a) && this.f15047b.equals(c1613Zd.f15047b) && this.f15048c == c1613Zd.f15048c;
    }

    public final int hashCode() {
        return ((((this.f15046a.hashCode() ^ 1000003) * 1000003) ^ this.f15047b.hashCode()) * 1000003) ^ this.f15048c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSpec{videoSpec=");
        sb.append(this.f15046a);
        sb.append(", audioSpec=");
        sb.append(this.f15047b);
        sb.append(", outputFormat=");
        return AbstractC1374Vq.m8591j(sb, this.f15048c, "}");
    }
}
