package defpackage;

import java.lang.reflect.Type;
import java.util.Iterator;

/* renamed from: tP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7215tP0 implements InterfaceC7823wb0 {
    @Override // defpackage.InterfaceC1502Ta0
    public WO0 a(KX kx) {
        Object next;
        O90.f(kx, "fqName");
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (VO0.a(P22.b(P22.a(((WO0) next).a))).b().equals(kx)) {
                break;
            }
        }
        return (WO0) next;
    }

    public abstract Type b();

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC7215tP0) && O90.a(b(), ((AbstractC7215tP0) obj).b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
