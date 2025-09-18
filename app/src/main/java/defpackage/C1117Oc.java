package defpackage;

/* renamed from: Oc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1117Oc extends AbstractC7741wA {
    public final String a;
    public final String b;

    public C1117Oc(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7741wA)) {
            return false;
        }
        AbstractC7741wA abstractC7741wA = (AbstractC7741wA) obj;
        return this.a.equals(((C1117Oc) abstractC7741wA).a) && this.b.equals(((C1117Oc) abstractC7741wA).b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.a);
        sb.append(", value=");
        return AbstractC1705Vq.l(sb, this.b, "}");
    }
}
