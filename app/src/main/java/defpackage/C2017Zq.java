package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: Zq */
/* loaded from: classes2.dex */
public final class C2017Zq {
    public static final C2017Zq c = new C2017Zq(AbstractC8069xu.g0(new ArrayList()), null);
    public final Set a;
    public final AbstractC7225tS1 b;

    public C2017Zq(Set set, AbstractC7225tS1 abstractC7225tS1) {
        this.a = set;
        this.b = abstractC7225tS1;
    }

    public final void a(String str, InterfaceC5908mZ interfaceC5908mZ) {
        O90.f(str, "hostname");
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            throw AbstractC8235ym.d(it);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2017Zq) {
            C2017Zq c2017Zq = (C2017Zq) obj;
            if (O90.a(c2017Zq.a, this.a) && O90.a(c2017Zq.b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 1517) * 41;
        AbstractC7225tS1 abstractC7225tS1 = this.b;
        return iHashCode + (abstractC7225tS1 != null ? abstractC7225tS1.hashCode() : 0);
    }
}
