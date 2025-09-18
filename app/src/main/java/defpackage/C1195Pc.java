package defpackage;

import java.util.List;

/* renamed from: Pc */
/* loaded from: classes.dex */
public final class C1195Pc extends AbstractC8121yA {
    public final List a;
    public final String b;

    public C1195Pc(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8121yA)) {
            return false;
        }
        AbstractC8121yA abstractC8121yA = (AbstractC8121yA) obj;
        if (this.a.equals(((C1195Pc) abstractC8121yA).a)) {
            String str = this.b;
            if (str == null) {
                if (((C1195Pc) abstractC8121yA).b == null) {
                    return true;
                }
            } else if (str.equals(((C1195Pc) abstractC8121yA).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.a);
        sb.append(", orgId=");
        return AbstractC1705Vq.l(sb, this.b, "}");
    }
}
