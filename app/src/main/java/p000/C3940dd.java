package p000;

/* renamed from: dd */
/* loaded from: classes.dex */
public final class C3940dd extends AbstractC0263EA {

    /* renamed from: a */
    public final String f26166a;

    /* renamed from: b */
    public final String f26167b;

    /* renamed from: c */
    public final long f26168c;

    public C3940dd(String str, String str2, long j) {
        this.f26166a = str;
        this.f26167b = str2;
        this.f26168c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0263EA)) {
            return false;
        }
        AbstractC0263EA abstractC0263EA = (AbstractC0263EA) obj;
        if (this.f26166a.equals(((C3940dd) abstractC0263EA).f26166a)) {
            C3940dd c3940dd = (C3940dd) abstractC0263EA;
            if (this.f26167b.equals(c3940dd.f26167b) && this.f26168c == c3940dd.f26168c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f26166a.hashCode() ^ 1000003) * 1000003) ^ this.f26167b.hashCode()) * 1000003;
        long j = this.f26168c;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.f26166a);
        sb.append(", code=");
        sb.append(this.f26167b);
        sb.append(", address=");
        return AbstractC0852NX.m5760i(sb, this.f26168c, "}");
    }
}
