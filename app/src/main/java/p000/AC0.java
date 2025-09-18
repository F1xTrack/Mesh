package p000;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public final class AC0 implements InterfaceC11895zC0, Serializable {

    /* renamed from: a */
    public final List f108a;

    public AC0(List list) {
        this.f108a = list;
    }

    @Override // p000.InterfaceC11895zC0
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f108a;
            if (i >= list.size()) {
                return true;
            }
            if (!((InterfaceC11895zC0) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AC0) {
            return this.f108a.equals(((AC0) obj).f108a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f108a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.f108a) {
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
