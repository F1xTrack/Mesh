package p000;

/* renamed from: Md */
/* loaded from: classes.dex */
public final class C0795Md {

    /* renamed from: a */
    public final C4192he f7274a;

    /* renamed from: b */
    public final int f7275b;

    public C0795Md(C4192he c4192he, int i) {
        if (c4192he == null) {
            throw new NullPointerException("Null packet");
        }
        this.f7274a = c4192he;
        this.f7275b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0795Md)) {
            return false;
        }
        C0795Md c0795Md = (C0795Md) obj;
        return this.f7274a.equals(c0795Md.f7274a) && this.f7275b == c0795Md.f7275b;
    }

    public final int hashCode() {
        return ((this.f7274a.hashCode() ^ 1000003) * 1000003) ^ this.f7275b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.f7274a);
        sb.append(", jpegQuality=");
        return AbstractC1374Vq.m8591j(sb, this.f7275b, "}");
    }
}
