package p000;

/* renamed from: Oc */
/* loaded from: classes.dex */
public final class C0920Oc extends AbstractC7058wA {

    /* renamed from: a */
    public final String f8517a;

    /* renamed from: b */
    public final String f8518b;

    public C0920Oc(String str, String str2) {
        this.f8517a = str;
        this.f8518b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7058wA)) {
            return false;
        }
        AbstractC7058wA abstractC7058wA = (AbstractC7058wA) obj;
        return this.f8517a.equals(((C0920Oc) abstractC7058wA).f8517a) && this.f8518b.equals(((C0920Oc) abstractC7058wA).f8518b);
    }

    public final int hashCode() {
        return ((this.f8517a.hashCode() ^ 1000003) * 1000003) ^ this.f8518b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.f8517a);
        sb.append(", value=");
        return AbstractC1374Vq.m8593l(sb, this.f8518b, "}");
    }
}
