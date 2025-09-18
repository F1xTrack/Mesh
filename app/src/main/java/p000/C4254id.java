package p000;

/* renamed from: id */
/* loaded from: classes.dex */
public final class C4254id extends AbstractC0515IA {

    /* renamed from: a */
    public final String f29372a;

    /* renamed from: b */
    public final int f29373b;

    /* renamed from: c */
    public final int f29374c;

    /* renamed from: d */
    public final boolean f29375d;

    public C4254id(boolean z, int i, int i2, String str) {
        this.f29372a = str;
        this.f29373b = i;
        this.f29374c = i2;
        this.f29375d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0515IA)) {
            return false;
        }
        AbstractC0515IA abstractC0515IA = (AbstractC0515IA) obj;
        if (this.f29372a.equals(((C4254id) abstractC0515IA).f29372a)) {
            C4254id c4254id = (C4254id) abstractC0515IA;
            if (this.f29373b == c4254id.f29373b && this.f29374c == c4254id.f29374c && this.f29375d == c4254id.f29375d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f29372a.hashCode() ^ 1000003) * 1000003) ^ this.f29373b) * 1000003) ^ this.f29374c) * 1000003) ^ (this.f29375d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails{processName=");
        sb.append(this.f29372a);
        sb.append(", pid=");
        sb.append(this.f29373b);
        sb.append(", importance=");
        sb.append(this.f29374c);
        sb.append(", defaultProcess=");
        return AbstractC7222ym.m26236m(sb, this.f29375d, "}");
    }
}
