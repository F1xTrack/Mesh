package p000;

/* renamed from: Ee */
/* loaded from: classes.dex */
public final class C0293Ee {

    /* renamed from: a */
    public final String f2815a;

    /* renamed from: b */
    public final String f2816b;

    /* renamed from: c */
    public final boolean f2817c;

    public C0293Ee(String str, String str2, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f2815a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f2816b = str2;
        this.f2817c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0293Ee)) {
            return false;
        }
        C0293Ee c0293Ee = (C0293Ee) obj;
        return this.f2815a.equals(c0293Ee.f2815a) && this.f2816b.equals(c0293Ee.f2816b) && this.f2817c == c0293Ee.f2817c;
    }

    public final int hashCode() {
        return ((((this.f2815a.hashCode() ^ 1000003) * 1000003) ^ this.f2816b.hashCode()) * 1000003) ^ (this.f2817c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OsData{osRelease=");
        sb.append(this.f2815a);
        sb.append(", osCodeName=");
        sb.append(this.f2816b);
        sb.append(", isRooted=");
        return AbstractC7222ym.m26236m(sb, this.f2817c, "}");
    }
}
