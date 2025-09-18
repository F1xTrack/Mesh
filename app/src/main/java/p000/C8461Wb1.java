package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: Wb1 */
/* loaded from: classes.dex */
public final class C8461Wb1 {

    /* renamed from: a */
    public final C8149Qb1 f13276a;

    /* renamed from: b */
    public final P70 f13277b;

    static {
        AbstractC7485Dh1.m1797L(0);
        AbstractC7485Dh1.m1797L(1);
    }

    public C8461Wb1(C8149Qb1 c8149Qb1, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= c8149Qb1.f9687a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f13276a = c8149Qb1;
        this.f13277b = P70.m6234u(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8461Wb1.class != obj.getClass()) {
            return false;
        }
        C8461Wb1 c8461Wb1 = (C8461Wb1) obj;
        return this.f13276a.equals(c8461Wb1.f13276a) && this.f13277b.equals(c8461Wb1.f13277b);
    }

    public final int hashCode() {
        return (this.f13277b.hashCode() * 31) + this.f13276a.hashCode();
    }
}
