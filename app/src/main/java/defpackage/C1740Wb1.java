package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: Wb1 */
/* loaded from: classes.dex */
public final class C1740Wb1 {
    public final C1272Qb1 a;
    public final P70 b;

    static {
        AbstractC0277Dh1.L(0);
        AbstractC0277Dh1.L(1);
    }

    public C1740Wb1(C1272Qb1 c1272Qb1, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= c1272Qb1.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = c1272Qb1;
        this.b = P70.u(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1740Wb1.class != obj.getClass()) {
            return false;
        }
        C1740Wb1 c1740Wb1 = (C1740Wb1) obj;
        return this.a.equals(c1740Wb1.a) && this.b.equals(c1740Wb1.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
