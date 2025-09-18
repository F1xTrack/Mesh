package p000;

import java.util.List;

/* renamed from: Pc */
/* loaded from: classes.dex */
public final class C0983Pc extends AbstractC7184yA {

    /* renamed from: a */
    public final List f9179a;

    /* renamed from: b */
    public final String f9180b;

    public C0983Pc(List list, String str) {
        this.f9179a = list;
        this.f9180b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7184yA)) {
            return false;
        }
        AbstractC7184yA abstractC7184yA = (AbstractC7184yA) obj;
        if (this.f9179a.equals(((C0983Pc) abstractC7184yA).f9179a)) {
            String str = this.f9180b;
            if (str == null) {
                if (((C0983Pc) abstractC7184yA).f9180b == null) {
                    return true;
                }
            } else if (str.equals(((C0983Pc) abstractC7184yA).f9180b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f9179a.hashCode() ^ 1000003) * 1000003;
        String str = this.f9180b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.f9179a);
        sb.append(", orgId=");
        return AbstractC1374Vq.m8593l(sb, this.f9180b, "}");
    }
}
