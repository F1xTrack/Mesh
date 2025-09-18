package defpackage;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public final class AC0 implements InterfaceC8318zC0, Serializable {
    public final List a;

    public AC0(List list) {
        this.a = list;
    }

    @Override // defpackage.InterfaceC8318zC0
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return true;
            }
            if (!((InterfaceC8318zC0) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AC0) {
            return this.a.equals(((AC0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.a) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
