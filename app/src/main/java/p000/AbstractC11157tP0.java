package p000;

import java.lang.reflect.Type;
import java.util.Iterator;

/* renamed from: tP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC11157tP0 implements InterfaceC11564wb0 {
    @Override // p000.InterfaceC8302Ta0
    /* renamed from: a */
    public WO0 mo7705a(C0664KX c0664kx) {
        Object next;
        O90.m5968f(c0664kx, "fqName");
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (VO0.m8433a(P22.m6213b(P22.m6212a(((WO0) next).f13158a))).m359b().equals(c0664kx)) {
                break;
            }
        }
        return (WO0) next;
    }

    /* renamed from: b */
    public abstract Type mo9728b();

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC11157tP0) && O90.m5963a(mo9728b(), ((AbstractC11157tP0) obj).mo9728b());
    }

    public final int hashCode() {
        return mo9728b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + mo9728b();
    }
}
